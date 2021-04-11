import java.util.*;

class ReverseNum {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int reverse = reverseNum(num);

        System.out.println(reverse);

    }

    static int reverseNum(int num) {
        int revnum =0;
        int rem=0;
        while(num >0 ){
            rem = num%10;
            revnum = revnum*10+rem;
            num= num/10;
        }
    return revnum;
    }
}
