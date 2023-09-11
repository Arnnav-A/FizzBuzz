public class Multiples {
    public static void main(String[] args) {
        int result = 0;
        int i = 1;
        while (i <= 1000) {
            boolean divBy3 = i % 3 == 0;
            boolean divBy5 = i % 5 == 0;
            if (divBy3 | divBy5) {
                result++;
            }
            i++;
        }
        System.out.println(result);
    }
}
