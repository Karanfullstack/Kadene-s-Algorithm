// Kdns Algorithm...
public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] array = {1,2,-7,2,-3,4};
        int current = 0;
        int max = 0;

        for (int j : array) {
            current = current + j;
            max = Math.max(max, current);
            if (current < 0)
                current = 0;
        }
        System.out.println(max);
    }
}

