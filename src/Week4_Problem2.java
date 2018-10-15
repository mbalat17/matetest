import java.util.*;
import java.time.*;
public class Week4_Problem2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int m=input.nextInt();
        int y=input.nextInt();

        YearMonth yearMonthObject = YearMonth.of(y, m);
        int daysInMonth = yearMonthObject.lengthOfMonth();
        System.out.println(daysInMonth);
    }
}
