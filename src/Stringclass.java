public class Stringclass {

    public static void main (String [] args) {

        //CharAt method
        String s = "Hello my friend";
        char c = s.charAt(0);
        System.out.println(c);

        //Concat method
        String greeting = "Hello ";
        String sentence = greeting + "my friend";
        String result = greeting.concat(sentence);
        System.out.println(result);

        //equals method
        String myString1 = "  Hello  ";
        String myString2 = "my friend";
        System.out.println(myString1.equals(myString2));
        //equalsIgnorecase
        System.out.println(myString1.equalsIgnoreCase(myString2));
        //indexof
        System.out.println(myString1.indexOf("l"));
        //lastindexOf
        System.out.println(myString1.lastIndexOf("l"));

        //toLowercase
        System.out.println(myString1.toLowerCase());
        //toUppercase
        System.out.println(myString2.toUpperCase());
        //substring(start)
        System.out.println(myString1.substring(2));
        //substring(end)
        System.out.println(myString1.substring(1,3));
        //replace
        System.out.println(myString1.replace('l','a'));
        //trim
        System.out.println(myString1.trim());

        //Stringbuilder capacity

        StringBuilder sb = new StringBuilder();
        //default 16
        System.out.println(sb.capacity());
          sb.append("Hello");
          //now 16
        System.out.println(sb.capacity());
          sb.append("Hello my friend,good morning");
          //now (16*2)+2 = 34
        System.out.println(sb.capacity());

        //length
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Hello my friend");
        System.out.println("sb1 = " + sb1);
        System.out.println("length =" + sb1.length());
        //replace
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Hello my friend");
        System.out.println("Hello my friend");
        sb3 = sb3.replace(6,8,"peter");
        System.out.println(sb3);

        //StringBufflar
        StringBuffer sb4 = new StringBuffer();
        //default 16
        System.out.println(sb.capacity());
        sb.append("Hello");
        //now 16
        System.out.println(sb.capacity());
        sb.append("Hello my friend,good morning");
        //now (16*2)+2 = 34
        System.out.println(sb.capacity());

        //length
        StringBuffer sb5 = new StringBuffer();
        sb1.append("Hello my friend");
        System.out.println("sb1 = " + sb1);
        System.out.println("length =" + sb1.length());
        //replace
        StringBuffer sb6 = new StringBuffer();
        sb3.append("Hello my friend");
        System.out.println("Hello my friend");
        sb3 = sb3.replace(6,8,"peter");
        System.out.println(sb3);







    }
}
