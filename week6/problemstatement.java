package week6;
class Solution {
    public boolean nimGame(int[] heaps) {
        // Misere Nim strategy:
        // If all heaps are of size 1, the first player loses if the number of heaps is odd.
        // Otherwise, if at least one heap is greater than 1, the game is normal Nim.
        // In normal Nim, the first player wins if the XOR sum of all heaps is non-zero.

        int xorSum = 0;
        int countOnes = 0;
        for (int heap : heaps) {
            xorSum ^= heap;
            if (heap == 1) {
                countOnes++;
            }
        }

        // If all heaps are of size 1
        if (countOnes == heaps.length) {
            // First player wins if the number of heaps is even (they force the opponent to take the last stone)
            return heaps.length % 2 == 0;
        } else {
            // Otherwise, it's normal Nim, first player wins if XOR sum is non-zero
            return xorSum != 0;
        }
    }

    public boolean nimMisere(int a, int b, int c) {
        int[] heaps = {a, b, c};
        return nimGame(heaps);
    }
}