import java.util.*;

public class Week4_Problem6 {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int number;
        number = input.nextInt();
        int count=0;
        int aux=number;

        for(int i = 2; i<= number; i++) {
            while(number%i == 0) {

                number = number/i;
                count++;
            }
        }


        if(count==1){
            System.out.printf("%d is a prime number.",aux);
        }else {
            for (int i = 2; i <= aux; i++) {
                while (aux % i == 0) {
                    System.out.print(i + " ");
                    aux = aux / i;
                    count++;
                }
            }
            if (aux > 2) {
                System.out.println(number);
            }
        }
    }
}