import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for (int row = 1; row <= numRows; row++) {

            List<Integer> current = new ArrayList<>();
            long ans = 1;

            current.add(1);

            for (int i = 1; i < row; i++) {
                ans = ans * (row - i);
                ans = ans / i;
                current.add((int) ans);
            }

            result.add(current);
        }

        return result;
    }
}