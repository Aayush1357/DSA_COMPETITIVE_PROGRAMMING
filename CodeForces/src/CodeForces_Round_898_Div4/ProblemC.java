/* CODE - Below Question

                                                    C. Target Practice
                                               time limit per test1 second
                                            memory limit per test256 megabytes
                                                    input:standard input
                                                   output:standard output

A 10×10 target is made out of five "rings" as shown.
Each ring has a different point value: the outermost ring — 1 point, the next ring — 2 points, ..., the center ring — 5 points.

Vlad fired several arrows at the target. Help him determine how many points he got.

Input:
The input consists of multiple test cases. The first line of the input contains a single integer t (1≤t≤1000) — the number of test cases.
Each test case consists of 10 lines, each containing 10 characters. Each character in the grid is either X (representing an arrow) or (representing no arrow).

Output:
For each test case, output a single integer — the total number of points of the arrows.

Example
input:
4
X.........
..........
.......X..
.....X....
......X...
..........
.........X
..X.......
..........
.........X

..........
..........
..........
..........
..........
..........
..........
..........
..........
..........

..........
..........
..........
..........
....X.....
..........
..........
..........
..........
..........

XXXXXXXXXX
XXXXXXXXXX
XXXXXXXXXX
XXXXXXXXXX
XXXXXXXXXX
XXXXXXXXXX
XXXXXXXXXX
XXXXXXXXXX
XXXXXXXXXX
XXXXXXXXXX


output:
17
0
5
220

*/

package CodeForces_Round_898_Div4;

import java.util.Scanner;

public class ProblemC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            String a1 = sc.next();
            String a2 = sc.next();
            String a3 = sc.next();
            String a4 = sc.next();
            String a5 = sc.next();
            String a6 = sc.next();
            String a7 = sc.next();
            String a8 = sc.next();
            String a9 = sc.next();
            String a10 = sc.next();

            int point = 0;

            char[][] a = {
                    a1.toCharArray() , a2.toCharArray() , a3.toCharArray() , a4.toCharArray() , a5.toCharArray() ,
                    a6.toCharArray() , a7.toCharArray() , a8.toCharArray() , a9.toCharArray() , a10.toCharArray()
            };

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (a[i][j] == 'X'){
                        if ((i == 0 || i==9) || (j == 0 || j==9)){
                            point += 1;
                        }else if ((i==1 || i==8) || (j==1 || j==8)){
                            point += 2;
                        }else if ((i==2 || i==7) || (j==2 || j==7)){
                            point += 3;
                        }else if ((i==3 || i==6) || (j==3 || j==6)){
                            point += 4;
                        }else{
                            point += 5;
                        }
                    }
                }

            }
            System.out.println(point);
        }
    }
}
