import java.util.*;
class Arrabhik
{
    int arr[];
    
    public void setval()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int i = sc.nextInt();
        arr= new int[i];
        int n=0;
        while(n<i)
        {
            System.out.println("Enter integer for index "+n+": ");
            arr[n]=sc.nextInt();
            n++;
        }
    }
    public void getval()
    {
        System.out.println("Outputting the array: ");
        for(int i =0; i<arr.length;i++)
           {System.out.println(arr[i]);}
    }
}

