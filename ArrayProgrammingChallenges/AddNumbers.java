//Add two numbers represented by two arrays A & B and return the resulting sum in Array.
import java.util.*;


class AddNumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            A.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            B.add(sc.nextInt());
        }
        List<Integer> result = addNumbers(n, m, A, B);
        for (Integer x : result) {
            System.out.print(x);
        }
    }

    static List<Integer> addNumbers(int n, int m, List<Integer> A, 
List<Integer> B){
    
    List<Integer> ans = new ArrayList<Integer>();
    
/*  String Astr="";
    String Bstr="";
    for(int i =0 ; i<A.size(); i++){
        Astr = Astr + ""+A.get(i);
    }
    for(int i =0 ; i<B.size(); i++){
        Bstr = Bstr + ""+B.get(i);
    }
    
    int result = Integer.parseInt(Astr) + Integer.parseInt(Bstr);
    ans.add(result); */

    if(A.size() > B.size()){
        fillZeros(A, B);
    }else if(B.size() > A.size()){
        fillZeros(B,A);
    }

    int max = A.size();
    int carry=0;
    for(int i=A.size()-1; i>=0; i--){
        int sum = (A.get(i) + B.get(i) + carry ) % 10;
        ans.add(sum);

        if((A.get(i) + B.get(i) + carry) >= 10){
            carry = 1;
        }else{
            carry = 0;
        }
    }
    if(carry == 1) ans.add(carry);
    Collections.reverse(ans);
    return ans;
    }

    public static List<Integer> fillZeros(List<Integer> mylist1,List<Integer> mylist2){
        int diff = mylist1.size() - mylist2.size();
        int i = 0;
        while(i!=diff){
            mylist2.add(i,0);
            i++;
        } 
    return mylist2;
    }
}
