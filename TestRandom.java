public class TestRandom {
    public static void main(String[] args) {
        int nonNegative = Integer.parseInt(args[0]);
        int bigger = 0;
        int smallerOrEqual = 0;
        for (int i = 0; i < nonNegative; i++) { // הלולאה רצה n פעמים
            double random = Math.random();
            if (random > 0.5) {
                bigger++;
            } else {
                smallerOrEqual++;
            }
        }
        System.out.println("> 0.5: " + bigger + " times");
        System.out.println("<= 0.5: " + smallerOrEqual + " times");
    }
}