import java.util.*;

import static java.util.Collections.max;

public class Week4_Problem5 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int aux;
        int count=1;
        int n=input.nextInt();


        List<Integer> listOfInt = new ArrayList<Integer>();


        while(n!=-1){
            aux=n;
            n=input.nextInt();
        if(n>aux){
                count++;
            }else{
                listOfInt.add(count);
                count=1;
            }
        }

        int maxi=max(listOfInt);
        System.out.println(maxi);
   }
}
