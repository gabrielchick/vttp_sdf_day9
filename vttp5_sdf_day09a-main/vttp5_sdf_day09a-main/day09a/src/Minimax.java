package day09a.src;

public class Minimax {

    public int calculateDepth(int n) {
        if (n == 1) {
            return 0;
        } else {
            return 1 + calculateDepth(n / 2);
        }
    }

    public int minimax(int currentDepth, boolean isMax, int values[], int currentNodeIndex, int depth) {
        // write your logic here...
        // if current depth equals depth == 1
        // break out of the recursive function, return the final result
        if (currentDepth == depth) {
            return values[currentNodeIndex];
        }

        // boolean isMax : determine if you are processing max or min
        if (isMax) {
            // call minimax function ....
            return Math.max(minimax(currentDepth + 1, false, values, currentNodeIndex * 2, depth),
                    minimax(currentDepth + 1, false, values, currentNodeIndex * 2 + 1, depth));
        } else {
            // call minimax function ....
            return Math.min(minimax(currentDepth + 1, true, values, currentNodeIndex * 2, depth),
            minimax(currentDepth + 1, true, values, currentNodeIndex * 2 + 1, depth));
        }

    }

}
