/**
 * @Author: xArthur
 * @Date: 2020-04-14 21:31
 * @File 斐波那契数列
 */
public class FibStudy {
    // 0 1 2 3 4 5 6
    // 0 1 1 2 3 5 8

    public static int fibstudy1(int number){
        if (number<=1){
            return number;
        }
        System.out.println("--------------");
        int sum=0;
        int after1=0;
        int after2=1;
        // 1+5n
        for (int i = 2; i <= number; i++) {
            sum=after1+after2;
            after1=after2;
            after2=sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(fibstudy1(6));

    }
}
