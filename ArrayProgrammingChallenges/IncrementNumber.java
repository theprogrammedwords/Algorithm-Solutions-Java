/*Increment a number represented by an arrays A and return the resulting sum in Array.

First line will contain a single integer N .
Next line will contain N space separated integers for Array A.

Output format
Single integer which will be the incremented number.

Sample Input 1
3
1 1 1

Sample Output 1
112

Explanation
111 + 1 = 112

Constraints
0<=Ai<10

Most significant value will be non-zero in the array.

1<=N<=5000
*/

import java.util.*;


class IncrementNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(sc.next());
        }

        int incArr[] = incrementNumber(n, arr);

        for(int i=0;i<incArr.length;i++) {
            System.out.print(incArr[i]);
        }
        
    }

    static int[] incrementNumber(int n, int arr[]){
        int i =arr.length -1;

            int carry =0;
        
            if(arr[i]+1 != 10){
                carry = 0;
                arr[i] = arr[i]+1+ carry;
            }else if(arr[i] +1 ==10){
                arr[i] = (arr[i]+1+ carry)%10;
                carry = 1;
            }

            --i;
            if(carry==1){

                while(carry !=0){
                    if(i==0 && arr[i]+carry == 10){
                        arr[i] =arr[i]+carry;
                        break;
                    }else if((arr[i]+carry) ==10){
                        arr[i] = (arr[i]+ carry)%10;
                        carry = 1;
                    }else if(arr[i]+ carry < 10) {
                        arr[i] = arr[i]+ carry;
                        carry=0;
                    }
                i--;
                }

            }

        return arr;
        }
    }
