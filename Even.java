import java.util.*;
class Even
{
    public static void main(String arge[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int l=sc.nextInt();
        System.out.println("Even numbers from 1 to "+l+" is:");
        for(int i=1;i<=l;i++)
        {
            if(i%2==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}