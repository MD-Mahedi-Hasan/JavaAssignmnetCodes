//9. Write a program that will give following
// output:
//        1
//        12
//        123
//        1234
//        12345
public class NumbrPattern{
        public static void main(String[] args) {
            int rows = 5;

            for (int i = 1; i <= rows; i++) {
                for (int j = i; j <= rows; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
}
