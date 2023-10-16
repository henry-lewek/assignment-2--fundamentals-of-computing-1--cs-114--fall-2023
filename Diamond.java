import java.util.Scanner;

public class Diamond {
public static void main(String[] args) {
    int rows;
    int columns;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an integer for the diamond: ");
    int size = scanner.nextInt();

    int odduserInput = (size + 1) / 2;
    int evenuserInput = size / 2 ;

// ------------------
// Code for even input
// ------------------
    if (size % 2 == 0) {
      for (int i = 0 ; i < size / 2 ; i++) {
        System.out.print("  ");
      }
      System.out.println("*");
      for (rows = 1; rows <= evenuserInput; rows++) {
        for (columns = 1; columns <= evenuserInput - rows; columns++) {
          System.out.print("  ");
        }
        for (columns = 1; columns <= 2 * rows ; columns++) {
          System.out.print(" *");
        }
          System.out.println();

      }

      for (rows = evenuserInput - 1; rows >= 1; rows--) {
        for (columns = 1; columns <= evenuserInput - rows; columns++) {
          System.out.print("  ");
        }
        for (columns = 2; columns <= 2 * rows + 1 ; columns++) {
          System.out.print(" *");
        }
          System.out.println();
      }
        for (int i = 0 ; i < size / 2 ; i++) {
        System.out.print("  ");
      }
      System.out.println("*");
    }

//--------------------
// Code for odd input
//--------------------
    else {
      for (rows = 1; rows <= odduserInput; rows++) {
        for (columns = 1; columns <= odduserInput - rows; columns++) {
          System.out.print(" ");
        }
        for (columns = 1; columns <= 2 * rows - 1; columns++) {
          System.out.print("*");
        }
          System.out.println();
      }

      for (rows = odduserInput - 1; rows >= 1; rows--) {
        for (columns = 1; columns <= odduserInput - rows; columns++) {
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
}
