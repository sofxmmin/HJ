package ch02;

public class TextBlockExample {
    public static void main(String[] args) {
        String str1 = "" +
                "{\n" +
                "\t\"id\":\"winter\",\n" +
                "\t\"name\":\"snow\"\n" +
                "}";
        String str2 = """
                
                {
                "id":"winter"
                "name":"snow"
                {
                """;

        System.out.println(str1);
        System.out.println("----------------------");
        System.out.println(str2);
        System.out.println("----------------------");
        String str = """
                i learn \
                java
                i will be a programer.
                """;
        System.out.println(str);
    }
}
