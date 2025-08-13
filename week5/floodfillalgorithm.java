public class floodfillalgorithm {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int originalColor = image[sr][sc];
        if (originalColor == newColor) {
            return image;
        }
        dfs(image, sr, sc, originalColor, newColor);
        return image;
    }

    private void dfs(int[][] image, int r, int c, int originalColor, int newColor) {
        // Base cases
        if (r < 0 || r >= image.length || c < 0 || c >= image[0].length || image[r][c] != originalColor) {
            return;
        }

        // Change color
        image[r][c] = newColor;

        // Recursively call for neighbors
        dfs(image, r + 1, c, originalColor, newColor); // Down
        dfs(image, r - 1, c, originalColor, newColor); // Up
        dfs(image, r, c + 1, originalColor, newColor); // Right
        dfs(image, r, c - 1, originalColor, newColor); // Left
    }

    public static void main(String[] args) {
        floodfillalgorithm solution = new floodfillalgorithm();

        // Example 1:
        int[][] image1 = {{1,1,1},{1,1,0},{1,0,1}};
        int sr1 = 1, sc1 = 1, newColor1 = 2;
        int[][] result1 = solution.floodFill(image1, sr1, sc1, newColor1);
        System.out.println("Example 1 Result:");
        printImage(result1);

        // Example 2:
        int[][] image2 = {{0,0,0},{0,0,0}};
        int sr2 = 0, sc2 = 0, newColor2 = 2;
        int[][] result2 = solution.floodFill(image2, sr2, sc2, newColor2);
        System.out.println("\nExample 2 Result:");
        printImage(result2);
    }

    public static void printImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }
}