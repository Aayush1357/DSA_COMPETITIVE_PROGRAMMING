/* CODE --> Below Question


                                                          B. Fireworks

                                                    time limit per test 1 second
                                                memory limit per test 256 megabytes
                                                       input standard input
                                                       output standard output


One of the days of the hike coincided with a holiday, so in the evening at the camp, it was decided to arrange a festive fireworks display.
For this purpose, the organizers of the hike bought two installations for launching fireworks and a huge number of shells for launching.

Both installations are turned on simultaneously.
The first installation launches fireworks every a minutes (i.e., after a,2⋅a,3⋅a,… minutes after launch).
The second installation launches fireworks every b minutes (i.e., after b,2⋅b,3⋅b,… minutes after launch).

Each firework is visible in the sky for m+1 minutes after launch, i.e.,
if a firework was launched after x minutes after the installations were turned on, it will be visible every minute from x to x+m, inclusive.
If one firework was launched m minutes after another, both fireworks will be visible for one minute.

What is the maximum number of fireworks that could be seen in the sky at the same time?

Input
Each test consists of several test cases. The first line contains a single integer t (1≤t≤104) —
the number of test cases. Then follow the descriptions of the test cases.

The first and only line of each test case contains integers a, b, m (1≤a,b,m≤1018) —
the frequency of launching for the first installation, the second installation, and the time the firework is visible in the sky.


Output
For each set of input data, output a single number — the maximum number of fireworks that can be seen simultaneously.


Example:
input
6
6 7 4
3 4 10
7 8 56
5 6 78123459896
1 1 1
1 1 1000000000000000000


output
2
7
17
28645268630
4
2000000000000000002

*/

package CodeForces_Round_935_Div3;

import java.util.Scanner;

public class ProblemB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long m = sc.nextLong();

            long ans = m/a + m/b + 2;

            System.out.println(ans);
        }
    }
}
