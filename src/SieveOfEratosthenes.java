import java.util.ArrayList;
import java.util.List;

public class SieveOfEratosthenes {
    public static List<Integer> calcPrimeNumbers(int n) {
        boolean[] isPrimeNumber = new boolean[n + 1];
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            isPrimeNumber[i] = true;
        }
        for (int i = 2; i < n; i++) {
            if (isPrimeNumber[i]) {
                primes.add(i);
                for (int j = i; j * i <= n; j++) {
                    isPrimeNumber[i * j] = false;
                }
            }

        }

        return primes;
    }

    public static void main(String[] args) {
        List<Integer> calcPrimeNumbers = calcPrimeNumbers(21);
        for (Integer integer : calcPrimeNumbers) {
            System.out.println(integer);
        }
        System.out.println("Prime counting function (Pie(N)) : "
                + calcPrimeNumbers.size());
    }
}

