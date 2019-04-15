package ch2;

public class StringEx { // 2-3 p.35
    public static void main(String[] args) {
        String name = "Ja" + "va";
        String str = name + 8.0;

        System.out.println(name);       // Java
        System.out.println(str);        //
        System.out.println(7 + " ");    // '7 '
        System.out.println(" " + 7);    // ' 7'
        System.out.println(7 + "");     //
        System.out.println("" + 7);
        System.out.println("" + "");
        System.out.println(7 + 7 + "");
        System.out.println("" + "" + 7);

    }

}
