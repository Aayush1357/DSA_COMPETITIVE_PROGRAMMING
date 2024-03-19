/* CODE --> Below Question

                                                A. Setting up Camp
time limit per test 1 second
memory limit per test 256 megabytes
input standard input
output standard output


The organizing committee plans to take the participants of the Olympiad on a hike after the tour.
Currently, the number of tents needed to be taken is being calculated.
It is known that each tent can accommodate up to 3 people.

Among the participants, there are a introverts, b extroverts, and c universals:

* Each introvert wants to live in a tent alone. Thus, a tent with an introvert must contain exactly one person — only the introvert himself.
* Each extrovert wants to live in a tent with two others. Thus, the tent with an extrovert must contain exactly three people.
* Each universal is fine with any option (living alone, with one other person, or with two others).

The organizing committee respects the wishes of each participant very much, so they want to fulfill all of them.

Tell us the minimum number of tents needed to be taken so that all participants can be accommodated according to their preferences.
If it is impossible to accommodate the participants in a way that fulfills all the wishes, output −1.

Input
Each test consists of multiple test cases. The first line contains a single integer t (1≤t≤104 ) — the number of test cases.
This is followed by the descriptions of the test cases.

Each test case is described by a single line containing three integers a, b, c (0≤a,b,c≤109) —
the number of introverts, extroverts, and universals, respectively.

Output
For each test case, output a single integer — the minimum number of tents, or −1 if it is impossible to accommodate the participants.

Example:
input
10
1 2 3
1 4 1
1 4 2
1 1 1
1 3 2
19 7 18
0 0 0
7 0 0
0 24 0
1000000000 1000000000 1000000000

output
3
-1
3
-1
3
28
0
7
8
1666666667

*/

package CodeForces_Round_935_Div3;
import java.util.Scanner;

public class ProblemA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            long i = sc.nextLong();
            long x = sc.nextLong();
            long u = sc.nextLong();

            long ans = i;

            long h = x%3;

            if(h == 0){
                System.out.println((int)(ans + Math.ceil((x+u)/3.0)));
            }else if((h == 1 ||h==2) && h+u>=3){
                System.out.println((int)(ans + Math.ceil((x+u)/3.0) ));
            }else{
                System.out.println(-1);
            }

        }


    }
}
