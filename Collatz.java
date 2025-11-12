public class Collatz {
    public static void main(String args[]) {
        int seed = Integer.parseInt(args[0]);
        String mode = args[1];

        for (int n = 1; n <= seed; n++) {
            int currentNumber = n;
            int steps = 1;
        	if (mode.equals("v")) {
                System.out.print(currentNumber);
       		 }
        	while (currentNumber != 1) {
                if (currentNumber % 2 == 0) {
                    currentNumber = currentNumber / 2;
                } else {
                    currentNumber = currentNumber * 3 + 1;
                }

                if (mode.equals("v")) {
                    System.out.print(" " + currentNumber);
                }
                steps++;
            }
            if (mode.equals("v")) {
                System.out.println(" (" + steps + ")");
            }
        }
        System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
    }
}