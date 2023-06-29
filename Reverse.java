import java.util.*;
class Reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        long a= sc.nextLong();
        long n=a;
        long rev=0;
        while(n>0)
        {
            long r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println("The reverse of the number "+a+" is "+rev);
    }
    
}