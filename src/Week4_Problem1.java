import java.util.*;
public class Week4_Problem1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int sum=0;
        while(n>0){
            sum=sum+n%10;
            n=n/10;
        }
        System.out.println(sum);
    }
}
