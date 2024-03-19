/* CODE - Below Question

                                                    B. Good Kid
                                             time limit per test1 second
                                          memory limit per test256 megabytes
                                                 input:standard input
                                                 output:standard output
Slavic is preparing a present for a friend's birthday. He has an array a of n digits and the present will be the product of all these digits.
Because Slavic is a good kid who wants to make the biggest product possible, he wants to add 1 to exactly one of his digits.
What is the maximum product Slavic can make?

Input:
The first line contains a single integer t (1≤t≤104) — the number of test cases.
The first line of each test case contains a single integer n (1≤n≤9) — the number of digits.
The second line of each test case contains n space-separated integers ai (0≤ai≤9) — the digits in the array.

Output:
For each test case, output a single integer — the maximum product Slavic can make, by adding 1 to exactly one of his digits.

Example:

input
4
4
2 2 1 2
3
0 1 2
5
4 3 2 3 4
9
9 9 9 9 9 9 9 9 9


output
16
2
432
430467210


 */
package CodeForces_Round_898_Div4;

import java.util.Scanner;

public class ProblemB {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int smallest = a[0];
            int index = 0;
            for (int i = 0; i < n; i++) {
                if(a[i] < smallest){
                    smallest = a[i];
                    index = i;
                }
            }
            a[index] = smallest + 1;
            int productl = 1;
            for (int i = 0; i < n; i++) {
                productl *= a[i];
            }
            System.out.println(productl);

        }
    }
}
