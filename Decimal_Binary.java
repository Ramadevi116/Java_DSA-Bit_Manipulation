import java.util.*;
class main{
    static String decimalTObinary(int n){
        int x;
        String res="";
        while(n>=1){
        x=n%2;
        n=n/2;
        res=x+res;
        }
        return res;
    }
    static int binaryTOdecimal(String a){
        int res=0;
        int powof2=1;
        for(int i=a.length()-1;i>=0;i--){
            if(a.charAt(i)=='1'){
                res=res+powof2;
            }
            powof2=powof2*2;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number : ");
        int num=in.nextInt();
        System.out.println(decimalTObinary(num));
        System.out.println("Enter Binary Number : ");
        String n=in.next();
        System.out.println(binaryTOdecimal(n));
        
    }
}
