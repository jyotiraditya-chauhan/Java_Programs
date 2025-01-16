public class Solution {

    public static void main(String[] args) {
        int[] A = { -650, 950, -912, -329, 412, 835, 608, 546, -451, -233, -400, -918, -257, 189, -975, -695, -780, 530, 102, 856, -247, -729, 656, -237, 815, 336, 217, -688, 874, -62, -401, -354, 5, 806, -567, -257, 525, 998, 12, -602, -632, 1, -898, -131, -282, -251, 609, -223, -200, -376, 906, -418, 899, 302, 251, 1000, 174, -496, 336, -873, -669, -492, 847, 90, -417, -53, 464, -342, -92, -327, -93, 514, 182, 986, 807, -584, -924, 85, 787, -423, 406, -655, 946, 693 };
        System.out.println(solve(A));
    }
    // public static int linearSearch(int[] A, int B) {
    //     int re = 0;
    //     int i = 0;
    //     while(i< A.length){
    //         System.out.println(A[i] + " Value Found ");
    //         if(A[i] == B){
    //             re = 1;
    //             return 1;
    //         }
    //         i++;

    //     }
    //     return re;
    // }
    public static int solve(int[] A) {
        int max = A[0];
        int min = A[0];
        for(int i = 1; i < A.length ; i++){
            if( A[i] < min){
                min = A[i];
            }
        }
        //    for(int i = 0; i < A.length ; i++){
        //     if(max >  A[i]){
        //         max = A[i];
        //     }
        // }
        return min ;
    }
}