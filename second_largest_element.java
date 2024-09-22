
// complexity ---> O(n)

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int arr[] = {8, 8, 8, 1, 2, 5, 2, 7};
        int n = arr.length;
        int large1 = arr[0];
        int large2 = -1;

        if (n < 2) {
            System.out.println(-1);
            return;  
        }
        
        for(int i=0; i<n; i++){
            if(arr[i]>large1){
                large2 = large1;
                large1 = arr[i];
            }else if(arr[i]>large2 && arr[i]!=large1){
                large2 = arr[i];
            }
        }
        System.out.println(large2);
    }
}






// complexity ---> O(nlogn)+O(n)
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int arr[] = {8,8,8,1,2,5,2,7};
        int n = arr.length;
        if(n<2){
            System.out.println(-1);
            return;
        }
        Arrays.sort(arr);
        for(int i=n-2; i>=0; i--){
            if(arr[i+1]==arr[i]){
                continue;
            }else{
                System.out.println(arr[i]);
                // break;
                return;
            }
        }
        System.out.println(-1);
    }
}
