public class CalcPi {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double sum = 0.0;

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                sum += 1.0 / (2 * i + 1);
            } else {
                sum -= 1.0 / (2 * i + 1);
            }
        }

        double valueOfPi = sum * 4;
        System.out.println("Pi according to Java: " + Math.PI);
        System.out.println("Pi, approximated:     " + valueOfPi);
      }
}