import java.util.*;
public class Week4_Problem3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int one=input.nextInt();
        int two=input.nextInt();
        int three=input.nextInt();
        int four=input.nextInt();
        int five=input.nextInt();
        int count=0;

        if(one>90){
            count++;
        }
        if(two>90){
            count++;
        }
        if(three>90){
            count++;
        }
        if(four>90){
            count++;
        }
        if(five>90){
            count++;
        }

        if(count>=4){
            int maxi=max(one,two,three,four,five);
            System.out.println(maxi);
            if (maxi==one){
                one=0;
            }else if(maxi==two){
                two=0;
            }else if(maxi==three){
                three=0;
            }else if(maxi==four){
                four=0;
            }else if(maxi==five){
                five=0;
            }
            maxi=max(one,two,three,four,five);
            System.out.println(maxi);
            if (maxi==one){
                one=0;
            }else if(maxi==two){
                two=0;
            }else if(maxi==three){
                three=0;
            }else if(maxi==four){
                four=0;
            }else if(maxi==five){
                five=0;
            }
            maxi=max(one,two,three,four,five);
            System.out.println(maxi);
            if (maxi==one){
                one=0;
            }else if(maxi==two){
                two=0;
            }else if(maxi==three){
                three=0;
            }else if(maxi==four){
                four=0;
            }else if(maxi==five){
                five=0;
            }
            maxi=max(one,two,three,four,five);
            System.out.println(maxi);
            if (maxi==one){
                one=0;
            }else if(maxi==two){
                two=0;
            }else if(maxi==three){
                three=0;
            }else if(maxi==four){
                four=0;
            }else if(maxi==five){
                five=0;
            }
            maxi=max(one,two,three,four,five);
            System.out.println(maxi);
            System.out.println("Congratulations, your class is one of the best this year!");
        }else{
            System.out.println("Thank you for your submission.");
        }










    }

    static int max(int a, int b, int c, int d, int e){
        if (a>b && a>c && a>d && a>e)
            return a;
        if (b>c && b>d && b>e)
            return b;
        if (c>d && c>e)
            return c;
        if (d>e)
            return d;
        return e;
    }
}
