
// question number 1: Write a function that prints "Hello World" n times recursively.
public class Main {
    public static void printHelloWorld(int n) {

        if (n <=0) { //base case: stop when n is less than or equal to 0
            return;
        }
        System.out.println("Hello World");
        printHelloWorld(n - 1);
    }
}

//question 2: Write a function that returns the sum of all numbers between n1 and n2 that are multiples of 7 using recursion.
public class Main {
    public static int sumRecursive(int n1, int n2) {
        if (n1 > n2) { //base case: means the range is empty, so it returns 0 (no multiples of 7 exist).
            return 0;
        } else if (n1 % 7 == 0) { // adds the current number (n1) to the sum returned by the recursive call sumRecursive(n1 + 7, n2). This call searches for multiples of 7 starting from n1 + 7 until n2
            return n1 + sumRecursive(n1 + 7, n2);
        } else { //calls the recursive function with n1 + 1 to move to the next number in the range and checks if it's a multiple of 7.
            return sumRecursive(n1 + 1, n2);
        }
    }
    }

    // question 3: Write a function that implements the binary search algorithm recursively.
    public class Main {
        public static int binarySearch(int[] arr, int searchInt, int start, int end) {
            if (start > end) {
                return -1;  // base case: if the search range is empty, the searchInt is not found.
            }
            int mid = (start + end) / 2; //calc the middle index of search range
            if (arr[mid] == searchInt) {
                return mid;
            } else if (arr[mid] > searchInt) { // if the searchInt element is less than the middle element search the left half of the array.
                return binarySearch(arr, searchInt, start, mid - 1);
            } else {
                return binarySearch(arr, searchInt, mid + 1, end);
            }
        }
    }


