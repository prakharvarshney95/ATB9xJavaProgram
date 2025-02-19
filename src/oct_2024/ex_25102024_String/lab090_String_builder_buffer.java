package oct_2024.ex_25102024_String;

public class lab090_String_builder_buffer {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Prakhar");
        stringBuffer.append("Varshney");
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);


        StringBuilder stringBuilder = new StringBuilder("Prakhar");
        stringBuilder.append("Goel");
        System.out.println(stringBuilder);

        StringBuilder Sb = new StringBuilder("hello");
        Sb.append(" world !");
        System.out.println(Sb);

    }
}
