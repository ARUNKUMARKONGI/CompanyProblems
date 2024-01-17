package StringsBased;
import java.util.Arrays;
import java.util.Comparator;
import java.util.*;
public class LargestNumberCognizant {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
          //  System.out.println("Enter the number of elements in the array:");
            int n = scanner.nextInt();
           // System.out.println("Enter the array elements:");
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.next();
            }
            Arrays.sort(arr, new LargestNumberComparator());

            StringBuilder result = new StringBuilder();
            for (String num : arr) {
                result.append(num);
            }
            System.out.println("Largest Number: " + result.toString());
        }
    }
    class LargestNumberComparator implements Comparator<String> {
        public int compare(String a, String b) {
            String order1 = a + b;
            String order2 = b + a;
            return order2.compareTo(order1);
        }
    }

