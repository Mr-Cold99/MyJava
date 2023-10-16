package reflextion.anotationValidation;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Objects;

public class CheckFoeAgeInterceptor {
    public void checkForAgeValidation(Object object){
        checkISerializable(object);
        validateAge(object);

    }
    private void checkISerializable(Object object){
        if (Objects.isNull(object)){
            throw new CheckForAgeExeption("Cant Validate a Null Object");
        }
        Class<?>clazz=object.getClass();
        if (!clazz.isAnnotationPresent(ShouldbeValidated.class)){
            throw new CheckForAgeExeption("This Class "+clazz.getSimpleName()+" is not Anotated With ShouldBeValidated");
        }
    }
    private void validateAge(Object object){
        Class<?>clazz=object.getClass();
        Arrays.stream(clazz.getDeclaredFields()).forEach(
                field -> {
                    field.setAccessible(true);
                    if (field.isAnnotationPresent(CheckForAge.class) && field.getAnnotation(CheckForAge.class).validate()) {
                        try {


                            int age = (Integer) field.get(object);
                            validateHumanAge(age, field);
                        } catch (IllegalAccessException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        );
    }
    private void validateHumanAge(int age, Field field){
        if (age<1||age>100){
        throw new CheckForAgeExeption("age is not to Human "+ field.getDeclaringClass().getTypeName()+" "+ age);
        }
    }

}
