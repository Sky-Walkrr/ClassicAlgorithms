/* 思路
* 矩阵是有序的，从左下角来看，向上数字递减，向右数字递增，
* 因此从左下角开始查找，当要查找数字比左下角数字大时。右移
* 要查找数字比左下角数字小时，上移
*/
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
