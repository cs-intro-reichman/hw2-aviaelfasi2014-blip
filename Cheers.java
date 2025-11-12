public class Cheers {
        public static void main(String[] args) {
        String cheerString = args[0]; 
        int nonNegative = Integer.parseInt(args[1]);
        String special = "AEFHILMNORSX";
        for(int i = 0; i<cheerString.length(); i++) {
            char letter = cheerString.charAt(i);
            if (special.indexOf(letter) != -1) {
                System.out.println("Give me an "  + letter + ": " + letter + "!");
            } else {
                System.out.println("Give me a "  + letter + ": " + letter + "!");
            } 
        } 
        System.out.println("What does that spell?");
        for (int i = 0; i<nonNegative; i++){
                System.out.println(cheerString + "!");
         }
        }
}
