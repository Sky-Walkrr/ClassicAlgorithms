public class Main {

    public boolean Find(int target,int[][] arrays) {
        if (arrays == null) return false;
        int i = arrays.length;
        int j = 0;
        while (i > 0 && j < arrays[0].length) {
            if (target == arrays[i][j]) {
                return true;
            } else if (target > arrays[i][j]) {
                j++;
            } else if (target < arrays[i][j]) {
                i--;
            }
        }
        return false;
    }
}
