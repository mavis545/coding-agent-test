public class MainTest {
    private static void assertEquals(int expected, int actual, String message) {
        if (expected != actual) {
            throw new AssertionError(message + " Expected: " + expected + ", but was: " + actual);
        }
    }

    public static void main(String[] args) {
        assertEquals(0, Main.binarySearch(new int[]{1, 2, 3, 4, 5}, 1), "Should find first element.");
        assertEquals(2, Main.binarySearch(new int[]{1, 2, 3, 4, 5}, 3), "Should find middle element.");
        assertEquals(4, Main.binarySearch(new int[]{1, 2, 3, 4, 5}, 5), "Should find last element.");
        assertEquals(-1, Main.binarySearch(new int[]{1, 2, 3, 4, 5}, 6), "Should return -1 when target is absent.");
        assertEquals(-1, Main.binarySearch(new int[]{}, 1), "Should return -1 for an empty array.");
    }
}
