package fileoperation.homework;
import java.io.*;
public class FileMainHome {
    public static void main(String[] args) {

        File file=new File("test1.txt");
        if (file.exists()){
            readFile(file);

        }else {
            writeFile(file,"AbraCadabra" );
        }
        String output=readFile(file);
        System.out.println(output);



    }
    private static void writeFile(File file,String text){
        try (FileWriter fileWriter=new FileWriter(file)){
            fileWriter.write(text);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private static String readFile(File file){
        StringBuilder stringBuilder=new StringBuilder();
        try (FileReader fileReader=new FileReader(file)){
            int bit;
            while ((bit=fileReader.read()) !=-1){
                stringBuilder.append((char) bit);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }


}
