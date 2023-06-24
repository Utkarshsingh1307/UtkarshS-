import java.util.*;
public class largest 
{
    public static void main(String args[]) 
    {
        int pos=1;
        Scanner sc =new Scanner (System.in);
        System.out.println ("Enter the size of aray");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter values of array elements");
            for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    
    System.out.println ("Print array elements ");
    
            for(int i=0;i<n;i++)
    {
        System.out.println(a[i]);
    }
    
    int max=a[0];
        for(int i=1;i<n;i++)
    {
    if (a[i]>max)
    {
        max=a[i];
        pos=pos+1;
            }
    }
    System.out.println ("Maximum number:"+max);
    System.out.println ("First occurrance of number:"+pos);
    }
}
    
      
