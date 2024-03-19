/* CODE --> Below Question

                                                A. Short Sort
                                          time limit per test1 second
                                       memory limit per test256 megabytes
                                             input:standard input
                                             output:standard output

There are three cards with letters a, b, c placed in a row in some order. You can do the following operation at most once:
Pick two cards, and swap them. Is it possible that the row becomes abc after the operation? Output "YES" if it is possible, and "NO" otherwise.

Input
The first line contains a single integer t (1≤t≤6) — the number of test cases.
The only line of each test case contains a single string consisting of each of the three characters a, b, and c exactly once, representing the cards.

Output
For each test case, output "YES" if you can make the row abc with at most one operation, or "NO" otherwise.
You can output the answer in any case (for example, the strings "yEs", "yes", "Yes" and "YES" will be recognized as a positive answer).

Example:
input
6
abc
acb
bac
bca
cab
cba

output
YES
YES
YES
NO
NO
YES


 */
package CodeForces_Round_898_Div4;

import java.util.Scanner;

public class ProblemA {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            String s = sc.next();
            StringBuilder ab = new StringBuilder(s);
            StringBuilder ac = new StringBuilder(s);
            StringBuilder bc = new StringBuilder(s);
            if(s.equals("abc")){
                System.out.println("YES");
            }else{
                int a = s.indexOf('a');
                int b = s.indexOf('b');
                int c = s.indexOf('c');
                ab.setCharAt(a, s.charAt(b));
                ab.setCharAt(b, s.charAt(a));
                String abr = ab.toString();
                ac.setCharAt(a, s.charAt(c));
                ac.setCharAt(c, s.charAt(a));
                String acr = ac.toString();
                bc.setCharAt(b, s.charAt(c));
                bc.setCharAt(c, s.charAt(b));
                String bcr = bc.toString();
                if(abr.equals("abc") || acr.equals("abc") || bcr.equals("abc")){
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }
        }
    }
}