package StringsBased;

import java.util.Arrays;
import java.util.Scanner;

public class LargestnumberusingLambda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        // System.out.println("Enter the array elements:");
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next();
        }
        Arrays.sort(arr, (num1,num2)->(num2+num1).compareTo(num1+num2));
       /* String str="";
        for(String s: arr)
        {
            str=str+s;
        }*/
        StringBuilder result = new StringBuilder();
        for (String num : arr) {
            result.append(num);
        }
        System.out.println("Largest Number: " + result.toString());
      /*  System.out.println("Largest Number: "+str);*/
    }
}
