package taskexamples;

import java.util.Scanner;

public class GitHub {
    public static void main(String[] args) {



                Integer[] arr={1,1,2,3,2,5,6};
        for(int i=0;i<arr.length;i++) {
            boolean isDuplicate=false;
            for(int j=0;j<i;j++) {
                if (arr[i].equals(arr[j])) {
                    isDuplicate=true;
                    break;
                }
                }
            if(!isDuplicate) {
                System.out.println(arr[i]);
            }
        }
    }
}
