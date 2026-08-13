public class MainTest {
    private static void assertEquals(int expected, int actual, String message) {
        if (expected != actual) {
            throw new AssertionError(message + " Expected: " + expected + ", Actual: " + actual);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};

        assertEquals(0, Main.binarySearch(arr, 1), "Should find first element.");
        assertEquals(2, Main.binarySearch(arr, 5), "Should find middle element.");
        assertEquals(4, Main.binarySearch(arr, 9), "Should find last element.");
        assertEquals(-1, Main.binarySearch(arr, 4), "Should return -1 when target is absent.");
    }
}
