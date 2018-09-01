package stringClass;

public class StringClass {public static void main(String[] args) {
    String s = "My name is Uzzal";
    System.out.println(s); // will show s value
    System.out.println(s.charAt(8)); // Returns the char value at the specified index.
    System.out.println(s.length()); // will show length of s value
    System.out.println(s.concat(" Palma")); // will add after s value
    System.out.println(s.trim());
    System.out.println(s.substring(0, 10)); // will show between 0-10 all character
    System.out.println(s.codePointAt(6));
    System.out.println(s.codePointBefore(7));
    System.out.println(s.compareToIgnoreCase(s));
    System.out.println(s.toLowerCase());
    System.out.println(s.toUpperCase());
    System.out.println(" ");

    String str = "Learning Team";
    String str1 = new String ("learning team");
    String str2 = new String ("Java Team");
    System.out.println(str.compareToIgnoreCase(str1));
    System.out.println(str1.compareTo(str2)); //
    System.out.println(s.endsWith(str2));
    System.out.println(str.indexOf(2, 5));
    }

    }
