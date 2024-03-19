/* CODE --> Below Question

                                        A. Rudolf and the Ticket

                                       time limit per test1 second
                                    memory limit per test256 megabytes
                                           input:standard input
                                          output:standard output

Rudolf is going to visit Bernard, and he decided to take the metro to get to him.
The ticket can be purchased at a machine that accepts exactly two coins, the sum of which does not exceed k.

Rudolf has two pockets with coins. In the left pocket, there are n coins with denominations b1,b2,…,bn.
In the right pocket, there are m coins with denominations c1,c2,…,cm.
He wants to choose exactly one coin from the left pocket and exactly one coin from the right pocket (two coins in total).

Help Rudolf determine how many ways there are to select indices f and s such that bf+cs≤k.

Input
The first line contains an integer t (1≤t≤100) — the number of test cases. Then follows the description of each test case.

The first line of each test case contains three natural numbers n, m, and k (1≤n,m≤100,1≤k≤2000) —
the number of coins in the left and right pockets, and the maximum sum of two coins for the ticket payment at the counter, respectively.

The second line of each test case contains n integers bi (1 ≤ bi ≤ 1000) — the denominations of coins in the left pocket.
The third line of each test case contains m integers ci (1 ≤ ci ≤ 1000) — the denominations of coins in the right pocket.

Output
For each testcase, output a single integer — the number of ways Rudolf can select two coins,
taking one from each pocket, so that the sum of the coins does not exceed k.

Example:
input
4
4 4 8
1 5 10 14
2 1 8 1
2 3 4
4 8
1 2 3
4 2 7
1 1 1 1
2 7
3 4 2000
1 1 1
1 1 1 1


output
6
0
4
12

 */

package CodeForces_Round_933_Div3;

import java.util.*;
import java.lang.*;
public class ProblemA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[m];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }

            int c =0;
            for(int i=0;i<n;i++){
                int ai = a[i];
                for (int j = 0; j < m; j++) {
                    int bi = b[j];
                    if(ai+bi <= k){
                        c++;
                    }
                }
            }

            System.out.println(c);
        }
    }
}
