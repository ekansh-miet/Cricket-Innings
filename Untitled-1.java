import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong(), k=sc.nextLong();
        long a[]=new long[(int)n];
        for(int i=0;i<n;i++){
        a[i]=sc.nextLong();
        }
        Arrays.sort(a);
        boolean ans=false;
        if(n==1)
        ans=(a[0]==k);
        long l=0, r=1;
        while(l<n && r<n){
            if(a[(int)l]+Math.abs(k)==a[(int)r])
            {
                ans=true;
                break;
            }
            else if(a[(int)l]+Math.abs(k)<a[(int)r]) 
            ++l;
            else
            ++r;
        }
            if(ans) System.out.println("YES");
            else System.out.println("NO");
        
    }
}