public class StringMathDemo {
    public static void main(String[] args) {

        //String class example
        String strt1 ="Rohit";
        String strt2 = "Lokesh";

        String strt3 = strt1.concat(" "+ strt2);

        System.out.println("Concentation: "+ strt3);
        System.out.println("Length of strt2: "+ strt2.length());
        System.out.println("Character at index 1: "+ strt1.charAt(1));
        System.out.println("Substring of str2: " +strt2.substring(0,3));
        System.out.println("Equals ? str1 and str2: "+ strt1.equals(strt2));
        System.out.println("Uppercase str1: "+ strt1.toUpperCase());
        System.out.println("Lowercase for str1 :"+ strt1.toLowerCase());
        System.out.println("         ");

        //math class example
        double a = 13.0;
        double b = 1.4;
        System.out.println("a: "+a);
        System.out.println("b: "+ b);

        System.out.println("Square root of a: "+ Math.sqrt(a));
        System.out.println("A raised to b: "+ Math.pow(a, b));
        System.out.println("Max of a and b: "+ Math.max(a, b));
        System.out.println("Min of a and b : "+Math.min(a,b));
        System.out.println("Random number (0-1) : "+ Math.random());
        System.out.println("Random number (10-20) : "+ (10 + Math.random()*(20-10)));
        System.out.println("Random number (1-100) :"+(1 + Math.random()*(1-100)));
        System.out.println("Ceil of b: "+Math.ceil(a));
        System.out.println("Floor of b: "+ Math.floor(b));
        System.out.println("Round of b: "+ Math.round(b));
    }

    
}