
class Pattern {
    public static void main(String[] args) {
        // Pattern 1
        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < 5; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Output
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *

        // Pattern 2

        // for(int i=0;i<5;i++){
        // for(int j=0;j<i;j++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Output
        // *
        // * *
        // * * *
        // * * * *

        // Pattern 3
        // for (int i = 1; i < 6; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // Output
        // 1
        // 12
        // 123
        // 1234
        // 12345

        // Pattern 4
        // for (int i = 1; i < 6; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i);
        // }
        // System.out.println();
        // }

        // Output
        // 1
        // 22
        // 333
        // 4444
        // 55555

        // Pattern 5
        // for(int i=5;i>0;i--){
        // for(int j=0;j<i;j++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Output
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *

        // Pattern 6

        // for(int i=6;i>0;i--){
        // for(int j=1;j<i;j++){
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // Ouptut
        // 12345
        // 1234
        // 123
        // 12
        // 1

        // Pattern 7

        // for (int i = 0; i < 5; i++) {
        // for (int j = 5; j >= i; j--) {
        // System.out.print(" ");
        // }
        // for (int j = 0; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Output
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *

        // Pattern 8

        // for (int i = 0; i < 5; i++) {
        // for (int j = i; j > 0; j--) {
        // System.out.print(" ");
        // }
        // for (int j = 5; j > i; j--) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Output

        // * * * * *
        // * * * *
        // * * *
        // * *
        // *

        // Pattern 9
        // for (int i = 0; i < 6; i++) {
        // for (int j = 6; j > i; j--) {
        // System.out.print(" ");
        // }

        // for (int j = i; j > 0; j--) {
        // System.out.print("* ");
        // }

        // System.out.println();
        // }
        // for (int i = 6; i > 0; i--) {
        // for (int j = 6; j > i; j--) {
        // System.out.print(" ");
        // }

        // for (int k = 0; k < i; k++) {
        // System.out.print("* ");
        // }

        // System.out.println();
        // }

        // Output
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        // * * * * * *
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *

        // Pattern 10

        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // for (int i = 4; i > 0; i--) {
        // for (int j = i; j > 0; j--) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Output
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *

        // Pattern 11

        // for (int i = 1; i < 6; i++) {
        // for (int j = 1; j <= i; j++) {
        // if ((i + j) % 2 == 0) {
        // System.out.print("1 ");
        // } else {
        // System.out.print("0 ");
        // }
        // }
        // System.out.println();
        // }

        // Output

        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1

        // Pattern 12

        // for (int i = 1; i < 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // for (int k = 5; k > i; k--) {
        // System.out.print("* ");
        // }
        // for (int j = i; j >= 1; j--) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // Output
        // 1* * * * 1
        // 12* * * 21
        // 123* * 321
        // 1234* 4321

        // Pattern 13

        // int num = 1;
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(num + " ");
        // num++;
        // }
        // System.out.println();
        // }

        // Output
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15

        // Pattern 14
        // for (int i = 1; i <= 5; i++) {
        // char ch = 'A';
        // for (int j = 1; j <= i; j++) {
        // System.out.print(ch + " ");
        // ch++;
        // }
        // System.out.println();
        // }

        // Output

        // A
        // A B
        // A B C
        // A B C D
        // A B C D E

        // Pattern 15

        // for (int i = 1; i <= 5; i++) {
        // char ch = 'A';
        // for (int j = 5; j >= i; j--) {
        // System.out.print(ch + " ");
        // ch++;
        // }
        // System.out.println();
        // }

        // Output

        // A B C D E
        // A B C D
        // A B C
        // A B
        // A

        // Pattern 16
        // char ch = 'A';
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(ch + " ");
        // }
        // ch++;
        // System.out.println();
        // }

        // Output

        // A
        // B B
        // C C C
        // D D D D
        // E E E E E

        // Pattern 17

        // for (int i = 1; i <= 4; i++) {
        // char ch = 'A';
        // for (int j = 4; j >= i; j--) {
        // System.out.print(" ");
        // }
        // for (int k = 1; k <= i; k++) {
        // System.out.print(ch + " ");
        // ch++;
        // }
        // ch--;
        // ch--;
        // for (int k = 2; k <= i; k++) {
        // System.out.print(ch + " ");
        // --ch;
        // }
        // System.out.println();
        // }

        // Output

        // A
        // A B A
        // A B C B A
        // A B C D C B A

        // Pattern 19

        // for (int i = 0; i < 5; i++) {
        // for (int j = 5; j >= i; j--) {
        // System.out.print("* ");
        // }
        // for (int k = 1; k <= i; k++) {
        // System.out.print(" ");
        // }
        // for (int j = 5; j >= i; j--) {
        // System.out.print("* ");
        // }
        // System.out.println();

        // }

        // for (int i = 5; i > 0; i--) {
        // for (int j = 5; j >= i; j--) {
        // System.out.print("* ");
        // }
        // for (int k = 1; k <= i; k++) {
        // System.out.print(" ");
        // }
        // for (int j = 5; j >= i; j--) {
        // System.out.print("* ");
        // }
        // System.out.println();

        // }

        // * * * * * * * * * * * *
        // * * * * * * * * * *
        // * * * * * * * *
        // * * * * * *
        // * * * *
        // * *
        // * * * *
        // * * * * * *
        // * * * * * * * *
        // * * * * * * * * * *

        // Pattern 20

        // for (int i = 0; i < 6; i++) {
        // for (int j = 0; j < i; j++) {
        // System.out.print("*");
        // }
        // for (int k = 6; k > i; k--) {
        // System.out.print(" ");
        // }
        // for (int j = 0; j < i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < 6; i++) {
        // for (int j = 6; j > i; j--) {
        // System.out.print("*");
        // }
        // for (int k = 0; k < i; k++) {
        // System.out.print(" ");
        // }
        // for (int j = 6; j > i; j--) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Output

        // * *
        // ** **
        // *** ***
        // **** ****
        // ***** *****
        // ************
        // ***** *****
        // **** ****
        // *** ***
        // ** **
        // * *

        // Pattern 21

        // for (int i = 0; i < 4; i++) {
        // for (int j = 0; j < 4; j++) {
        // if ((i == 1 || i == 2) && (j == 1 || j == 2)) {
        // System.out.print(" ");
        // } else {
        // System.out.print("* ");
        // }
        // }
        // System.out.println();
        // }

        // Output
        // * * * *
        // * *
        // * *
        // * * * *

        // Pattern 22

        // int n = 4;
        // int size = 2 * n - 1;

        // for (int i = 0; i < size; i++) {
        // for (int j = 0; j < size; j++) {
        // int value = n - Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 -
        // j));
        // System.out.print(value + " ");
        // }
        // System.out.println();
        // }

        // Output
        // 4 4 4 4 4 4 4
        // 4 3 3 3 3 3 4
        // 4 3 2 2 2 3 4
        // 4 3 2 1 2 3 4
        // 4 3 2 2 2 3 4
        // 4 3 3 3 3 3 4
        // 4 4 4 4 4 4 4
    }
}