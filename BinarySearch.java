public class BinarySearch
{

        int binarySearch(char array[], char x, int low, int high) {

            // Repeat until the pointers low and high meet each other
            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (array[mid] == x)
                    return mid;

                if (array[mid] < x)
                    low = mid + 1;

                else
                    high = mid - 1;
            }

            return -1;
        }

        public static void main(String args[]) {
            BinarySearch ob = new BinarySearch();
            char array[] = { 'c', 'd', 'e', 'f', 'g', 'h', 'i' };
            int n = array.length;
            char x = 'h';
            int result = ob.binarySearch(array, x, 0, n - 1);
            if (result == -1)
                System.out.println("Not found");
            else
                System.out.println("Element found at index " + result);
        }

}
