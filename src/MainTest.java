public class MainTest {
    private static void assertEquals(int expected, int actual, String message) {
        if (expected != actual) {
            throw new AssertionError(message + " Expected: " + expected + ", Actual: " + actual);
        }
    }

    private static void testFindMiddleElement() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(2, Main.binarySearch(arr, 5), "Should find middle element.");
    }

    private static void testFindFirstElement() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(0, Main.binarySearch(arr, 1), "Should find first element.");
    }

    private static void testFindLastElement() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(4, Main.binarySearch(arr, 9), "Should find last element.");
    }

    private static void testElementNotFound() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(-1, Main.binarySearch(arr, 6), "Should return -1 when element is absent.");
    }

    private static void testSingleElementArray() {
        int[] arr = {42};
        assertEquals(0, Main.binarySearch(arr, 42), "Should find element in single-element array.");
        assertEquals(-1, Main.binarySearch(arr, 7), "Should return -1 for absent target in single-element array.");
    }

    private static void testEmptyArray() {
        int[] arr = {};
        assertEquals(-1, Main.binarySearch(arr, 1), "Should return -1 for empty array.");
    }

    public static void main(String[] args) {
        testFindMiddleElement();
        testFindFirstElement();
        testFindLastElement();
        testElementNotFound();
        testSingleElementArray();
        testEmptyArray();
        System.out.println("✅ All Main.binarySearch unit tests passed.");
    }
}
