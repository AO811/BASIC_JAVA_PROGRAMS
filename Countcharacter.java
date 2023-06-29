public class Countcharacter
{
    public static void main(String args[])
    {
    String str="The best of both worlds";
    int count=0;
    for(int i=0;i<str.length();i++)
    {
        if(str.charAt(i)!=32)
        {
        count++;
        }
    }
    System.out.println("Total number of letters in a string:" +count);
}
}