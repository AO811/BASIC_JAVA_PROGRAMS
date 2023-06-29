import java.util.Scanner;
class Sum_Natural
{
    public static void main(String arge[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int l=sc.nextInt();
        int sum=0;
        for(int i=1;i<=l;i++)
        {
            sum=sum+i;
        }
        System.out.println("The sum of "+l+" natural numbers is "+sum);
    }
}