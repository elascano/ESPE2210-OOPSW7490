package ec.edu.espe.Strategy.model;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 * modified by Leonardo Yaranga
 */
public class BubbleSort implements SortingStrategy {

    @Override
    public int[] sort(int data[]) {
        
        System.out.println("BubbleSort");

        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        
        return data;
    }
}