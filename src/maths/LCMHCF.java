package maths;

public class LCMHCF {

//    {Note : LCM*HCF = a*b }
    public static void main(String[] args){
        int a = 12, b=18;
        int gcd = hcf2(a,b);
        System.out.println("GCD : "+gcd);
        int LCM = (a*b)/gcd;
        System.out.println("LCM : "+LCM);
    }

//    {Note : HCF(a, b) = HCF(b,a%b }
    public static int hcf(int a, int b){
        while(b>0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        System.out.println("HCF : "+a);
        return a;
    }

//    or{Recursion}
    public static int hcf2(int a, int b){
        if(a == 0){
            return b;
        }
        if(b == 0){
            return a;
        }
        if(a==b){
            return a;
        }
        if(a>b){
            return hcf2(a-b,b);
        }
        return hcf2(a,b-a);
    }
}
