import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn=new Scanner(System.in);
        int m = scn.nextInt(), n = scn.nextInt();
        System.out.println(gcd(m,n));
    }
    public static int gcd(int x,int y){
        if (y==0)
            return x;
        else
            return gcd(y,x%y);
    }
}
