import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int rows;
    int columns;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an integer for the width and height of the diamond: ");
    int size = scanner.nextInt();

    int userImput = (size % 2 == 0) ? size / 2 : (size + 1) / 2;

    for (rows = 1; rows <= userImput; rows++) {
      for (columns = 1; columns <= userImput - rows; columns++) {
        System.out.print(" ");
      }
      for (columns = 1; columns <= 2 * rows - 1; columns++) {
        System.out.print("*");
      }
        System.out.println();
      }

    for (rows = userImput - 1; rows >= 1; rows--) {
      for (columns = 1; columns <= userImput - rows; columns++) {
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
