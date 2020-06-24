package adrianromanski.challanges.classics;

public class SieveOfEratosthenes {

    public void print(int upperBound) {
        int upperBoundSquareRoot = (int) Math.sqrt(upperBound);

        // isComposite means not prime
        boolean[] isComposite = new boolean[upperBound + 1];

        // going from prime 2 up to sqrt n
        for(int m = 2; m <= upperBoundSquareRoot; m++) {

            // if prime
            if(!isComposite[m]) {
                System.out.println(m + " ");

                // Then mark all the others multiples as no prime
                for(int k = m * m; k <= upperBound; k +=m) {
                    isComposite[k] = true;
                }
            }
        }
        System.out.println("Everything left over is prime...");

        for(int m = upperBoundSquareRoot; m <= upperBound; m++) {
            if(!isComposite[m]) {
                System.out.println(m + " ");
            }
        }
    }
}
