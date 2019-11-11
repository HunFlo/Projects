/*
 *  Janis Tejero
 *  janis.tejero@stud.bbbaden.ch
 */
package ch.bbbaden.zahlenpuzzle;

/**
 *
 * @author Janis Tejero
 */
public class MainApp {

    public static void main(String[] args) {
        int array[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15}};
        int i, j, k = 1;

        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                array[i][j] = k;
                k++;
            }
        }

        for (int[] row : array) {
            printRow(row);
        }
    }

    public static void printRow(int[] row) {
        for (int i : row) {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
    }
    
    public void test(){
        System.out.println("das set worke");
    }

}
