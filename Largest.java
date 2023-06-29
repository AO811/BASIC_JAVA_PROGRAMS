import java.util.Scanner;
class Largest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        long a= sc.nextLong();
        System.out.println("Enter 2nd number: ");
        long b= sc.nextLong();
        System.out.println("Enter 3rd number: ");
        long c=sc.nextLong();
        long max=0;
        long temp=a>b?a:b;
        long largest=c>temp?c:temp;
        System.out.println("The largest number is "+largest);
    }
}