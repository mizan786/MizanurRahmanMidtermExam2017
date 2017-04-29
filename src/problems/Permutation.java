package problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {
    public static void main(String[] args) {
        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         */
        String st = "ABC";
        Permutation permut = new Permutation();
        System.out.println("Permatations of the string are :");
        permut.permutation(st, 0, st.length()-1);
    }
    public void permutation(String st, int l, int r) {
        if (l == r) {
         System.out.println(st);
        } else {
            for (int i = l; i <= r; i++) {
                st = swap(st, l, i);
                permutation(st, l + 1, r);
                st = swap(st, l, i);
            }
        }
    }
    public String swap(String a, int i, int j) {
        char temp;
        char[] crArray = a.toCharArray();
        temp = crArray[i];
        crArray[i] = crArray[j];
        crArray[j] = temp;
        return String.valueOf(crArray);
    }
}


