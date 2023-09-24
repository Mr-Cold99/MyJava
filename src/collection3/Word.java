package collection3;

import java.util.Objects;

public class Word {
    private String Japan;
    private String English;
    private String German;

    public Word(String japan, String english, String german) {
        Japan = japan;
        English = english;
        German = german;
    }

    public String getJapan() {
        return Japan;
    }

    public void setJapan(String japan) {
        Japan = japan;
    }

    public String getEnglish() {
        return English;
    }

    public void setEnglish(String english) {
        English = english;
    }

    public String getGerman() {
        return German;
    }

    public void setGerman(String german) {
        German = german;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return Objects.equals(Japan, word.Japan) && Objects.equals(English, word.English) && Objects.equals(German, word.German);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Japan, English, German);
    }

    @Override
    public String toString() {
        return "Word{" +
                "Japan='" + Japan + '\'' +
                ", English='" + English + '\'' +
                ", German='" + German + '\'' +
                '}';
    }
}
