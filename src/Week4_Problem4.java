import java.util.*;
public class Week4_Problem4 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String sen=input.nextLine();
        sen=sen.replace(" ","");
        sen=sen.toLowerCase();

        if(isPalindrom(sen)==true){
            System.out.println("The sentence is a palindrome.");
        }else{
            System.out.println("The sentence is NOT a palindrome.");
        }
    }

    public static boolean isPalindrom(String word){
        int i1 = 0;
        int i2 = word.length() - 2;
        while (i2 > i1) {
            if (word.charAt(i1)!= word.charAt(i2)) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }
}
