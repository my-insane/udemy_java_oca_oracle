package Lesson17;

public class EqualsOfStringBuilder {
    boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        boolean equal;
        String s1 = new String(sb1);
        String s2 = new String(sb2);
        equal = s1.equals(s2);
        return equal;
    }
}

class EqualsOfStringBuilderTest {
    public static void main(String[] args) {
        EqualsOfStringBuilder e = new EqualsOfStringBuilder();
        StringBuilder sb1 = new StringBuilder("Dobriy Vecher");
        StringBuilder sb2 = new StringBuilder("Dobriy Vecher");
        StringBuilder sb3 = new StringBuilder("Nedobriy Vecher");

        System.out.println(e.ravenstvo(sb1, sb2));
        System.out.println(e.ravenstvo(sb1, sb3));
    }
}