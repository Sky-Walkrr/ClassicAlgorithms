/**
 * Created by Walker on 2017/3/13.
 */
public class ReplaceSpace {

    public static void main(String[] args) {
//        String result = replaceSpace(new StringBuffer().append(" hello world "));
//        System.out.println(result);
        int index = 3;
        System.out.println(mySetChar(new StringBuffer().append("hello world"),index,'X'));
    }

    private static String mySetChar(StringBuffer str,int index,char newChar) {
        if (str == null) return "";
        str.setCharAt(index--,newChar);
        str.setCharAt(index,'A');
        return str.toString();
    }

    public static String replaceSpace(StringBuffer str) {
        if (str == null) return "";
        if (str.length() == 0) return "";
        int oldIndex = str.length() - 1;
        int spaceCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaceCount ++;
            }
        }
        int newLength = str.length() + spaceCount *2;
        int indexNew = newLength - 1;
        str.setLength(newLength);
        for (int i = oldIndex;i >= 0;i--) {
            if (str.charAt(i) == ' ') {
                str.setCharAt(indexNew--,'0');
                str.setCharAt(indexNew--,'2');
                str.setCharAt(indexNew--,'%');
            } else {
                str.setCharAt(indexNew--,str.charAt(i));

            }
        }
        return str.toString();
    }

}
