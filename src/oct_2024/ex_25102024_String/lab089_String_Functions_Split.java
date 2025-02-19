package oct_2024.ex_25102024_String;

import java.lang.String;

public class lab089_String_Functions_Split {
    public static void main(String[] args) {

        String fruits = "Apple,Banana,Cherry";
        String[] split_sfruits = fruits.split(",");
        System.out.println(split_sfruits[0]);
        System.out.println(split_sfruits[1]);
        System.out.println(split_sfruits[2]);

        String fruits2 = "ABC-XYZ-QWE";
        String[] split_sfruits2 = fruits2.split("-");
        System.out.println(split_sfruits2[0]);
        System.out.println(split_sfruits2[1]);
        System.out.println(split_sfruits2[2]);

        String s4 = "Prakhar";
        System.out.println(s4.charAt(5));
//        System.out.println(s4.charAt(10));

        String s5 = " Prak har ";
        System.out.println(s5.trim());

        String s6 = "Prakhar";
        System.out.println(s6.indexOf("r"));
        System.out.println(s6.indexOf("a"));
        System.out.println(s6.indexOf("h"));
        System.out.println(s6.lastIndexOf("r"));

        String s7 = "Prakhar";
        System.out.println(s7.contains("ra"));
        System.out.println(s7.contains("kh"));
        System.out.println(s7.contains("ar"));
        System.out.println(s7.contains("ka"));

        String s8 = "Prakhar";
        System.out.println(s8.lastIndexOf("a"));

        String s9 = "Prakhar";
        System.out.println(s9.replace("r", "a"));
        System.out.println(s9.replace("a", "A"));
        System.out.println(s9.replace("p", "t"));
        System.out.println(s9.replace("P", "t"));

        String s10 = "PrakharVarshneyJi";
        System.out.println(s10.startsWith("Pra"));
        System.out.println(s10.startsWith("Var"));
        System.out.println(s10.endsWith("yJi"));

        String s11 = "PrakharVarshneyJi";
        System.out.println(s11.replaceAll("Pra", "dhh"));

        String original = "banana";
        String result1 = original.replace('a', 'o');
        System.out.println(result1);

        String original1 = "Hello123 World456!";
        String result2 = original1.replaceAll("\\d+", "-");
        System.out.println(result2);

        String result3 = original1.replaceAll("o", "O");
        System.out.println(result3);



    }
}
