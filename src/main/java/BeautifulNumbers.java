//10. Write a program that will give following output:
//        12345
//        2345
//        345
//        45
//        5
public class BeautifulNumbers {
        public static void main(String[] args) {
            int rows = 5;

            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
}
