import day09a.src.Minimax;

public class App {

    public static void main(String[] args) {
        

        // recursiveReverseFunction(10);

        // recursiveAscendingFunction(0);
        
        int values[] = {2, 5, 18, 9, 73, 15, 4, 24};
        int arraySize = values.length;

        Minimax mm = new Minimax();

        // e.g. 8 represents the size of the array, that means there are 8 numbers
        int level = mm.calculateDepth(arraySize); 
        System.out.println("Depth of recursing into the fibbonaci sequence: " + level);

        int result = mm.minimax(0, true, values, 0, level);
        System.out.println("Result of minimax for an array of integers: " + result);

    }

    public static void recursiveReverseFunction(int n) {
        System.out.println(n);

        if (n > 5) {
            recursiveReverseFunction(n - 1);
        }
    }

    public static void recursiveAscendingFunction(int n) {
        System.out.println(n);

        if (n < 5) {
            recursiveAscendingFunction(n + 1);
        }
    }
}