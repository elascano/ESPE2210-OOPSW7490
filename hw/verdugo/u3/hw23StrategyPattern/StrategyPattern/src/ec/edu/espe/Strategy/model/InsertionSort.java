
package ec.edu.espe.Strategy.model;

/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class InsertionSort implements SortingStrategy{

    @Override
    public void sort(int[] data) {
        int j, temp, size;

        System.out.println("InsertionSort");

        size = data.length;
        for (int i = 1; i < size; i++) {
            temp = data[i];
            j = i - 1;
            while (j >= 0 && temp <= data[j]){
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = temp;
        }
    }
}
    
