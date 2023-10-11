import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int rows;
    int columns;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an integer for the width and height of the diamond: ");
    int userInput = scanner.nextInt();

    int n = (userInput % 2 == 0) ? userInput / 2 : (userInput + 1) / 2;

    for (rows = 1; rows <= n; rows++) {
      for (columns = 1; columns <= n - rows; columns++) {
        System.out.print(" ");
      }
      for (columns = 1; columns <= 2 * rows - 1; columns++) {
        System.out.print("*");
      }
        System.out.println();
      }

    for (rows = n - 1; rows >= 1; rows--) {
      for (columns = 1; columns <= n - rows; columns++) {
        System.out.print(" ");
      }
      for (columns = 1; columns <= 2 * rows - 1; columns++) {
        System.out.print("*");
      }
        System.out.println();

        scanner.close();
      }
  }
}
