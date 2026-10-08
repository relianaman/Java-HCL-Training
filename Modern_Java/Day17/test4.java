public class test4 {
    public static void main(String[] args) {

        String str = "  Hello Java World ";
        String text = "Java Programming";
        String empty = "";
        String blank = "  ";

        // length()
        System.out.println("1. lenght(): " + text.length());

        // isEmpty()
        System.out.println("2. isEmpty(): " + empty.isEmpty());

        // isBlank()
        System.out.println("3. isBlank(): " + blank.isBlank());

        // charAt()
        System.out.println("4. charAt(): " + text.charAt(5));

        // codePointAt()
        System.out.println("5. codePointAt(): " + text.codePointAt(7));

        // substring()
        System.out.println("6. substring(): " + text.substring(5));
        System.out.println("6. substring(0, 4): " + text.substring(0,4));

        // equals()
        System.out.println("7. equals(): " + text.equals("Hello"));

        // equalsIgnoreCase()
        System.out.println("8. equalsIgnoreCase(): " + text.equalsIgnoreCase("JAVA PROGRAMMING"));

        // compareTo()
        System.out.println("9. compareTo(): " + "Apple".compareTo("Banana"));

        // compareToIgnoreCase()
        System.out.println("10. compareToIgnoreCase(): " + "java".compareToIgnoreCase("JAVA"));

        // contains()
        System.out.println("11. contains(): " + text.contains("Java"));

        // startsWith()
        System.out.println("12. startsWith(): " + str.startsWith("Hello"));

        // endsWith()
        System.out.println("13. endsWith(): " + text.endsWith("ing"));

        // indexOf()
        System.out.println("14. indexOf(): " + text.indexOf("a"));

        // lastIndexOf()
        System.out.println("15. lastIndexOf(): " + text.lastIndexOf("a"));

    }
}
