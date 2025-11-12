public class Cheers {
    public static void main(String[] args) {
        String var1 = args[0].toUpperCase();
        int var2 = Integer.parseInt(args[1]);
        String var3 = "AEFHILMNORSX";

        for (int var4 = 0; var4 < var1.length(); ++var4) {
            char var5 = var1.charAt(var4);
            if (var3.indexOf(var5) != -1) {
                System.out.println("Give me an " + var5 + ": " + var5 + "!");
            } else {
                System.out.println("Give me a  " + var5 + ": " + var5 + "!"); 
            }
        }

        System.out.println("What does that spell?");

        for (int var4 = 0; var4 < var2; ++var4) {
            System.out.println(var1 + "!!!");
        }
    }
}
