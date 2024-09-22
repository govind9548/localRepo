
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int n = 32;
        int sum = 0;
        
        while(n>0){
            sum += n%2;
            n=n/2;
        }
        System.out.println(sum);
    }
}
