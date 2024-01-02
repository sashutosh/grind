package twilio.asolanki.recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    //A permutation is list of all possible combination of given elements where order matters
    public static void main(String[] args) {
        Permutations permutations = new Permutations();
        List<List<Integer>> result = permutations.permutations(new int[]{1, 2, 3});
        System.out.println(result);
    }

    public List<List<Integer>> permutations(int[] args) {
        return permutations(0, args);
    }

    private List<List<Integer>> permutations(int index, int[] args) {
        //The base case for an empty set return a List with Empty list
        if (index > args.length - 1) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>());
            return result;
        }
        int current = args[index];
        List<List<Integer>> permutations = permutations(index + 1, args);
        List<List<Integer>> result = new ArrayList<>();
        //Add the current element to all possible positions in all the result arrays
        for (List<Integer> perm : permutations) {
            for (int i = 0; i <= perm.size(); i++) {
                List<Integer> currentPerm = new ArrayList<>(perm);
                currentPerm.add(i, current);
                result.add(currentPerm);
            }
        }
        return result;
    }
}

