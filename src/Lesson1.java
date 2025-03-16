public class Lesson1 {
    public static void main(String[] args) {
        byte b = 127; // 1 byte
        System.out.println("byte: " + b);

        short sh = 10000; // 2 byte
        System.out.println("short: " + sh);

        int integer = 999999; // 4 byte
        System.out.println("int: " + integer);

        long l = 99999999999999L; // 8 byte
        System.out.println("long: " + l);

        float f = 24.45F;
        System.out.println("float: " + f);

        double d = 88888.888888;
        System.out.println("double " + d);

        boolean bool = true;
        System.out.println("boolean: " + bool);

        char ch = 'c';
        System.out.println("char: " + ch);

        integer = (int)f;
        System.out.println("float to int: " + integer);

        d = (double)f;
        System.out.println(d);

        int phakagic = 41;
        char chhh = (char) phakagic;
        System.out.println(chhh);

        chhh = 29;

        String str = "string";
        System.out.println(str);

        sh = (short)l;
        System.out.println(sh);

    }
}
