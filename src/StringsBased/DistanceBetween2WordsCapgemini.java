package StringsBased;

public class DistanceBetween2WordsCapgemini {
    public static void main(String[] args) {
        String str="Java Online sessions by t&p cell griet cell";
        String s1="Online";
        String s2="cell";
        System.out.println(distance(str,s1,s2));
    }

    public static int distance(String s, String s1, String s2) {
        if (s1.equals(s2)) {
            return 0;
        }
        String[] words = s.split(" ");
        int minDist = words.length + 1;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(s1)) {
                for (int j = 0; j < words.length; j++) {
                    if (words[j].equals(s2)) {
                        int cur = Math.abs(i - j) - 1;

                        if (cur < minDist) {
                            minDist = cur;
                        }
                    }
                }
            }
        }
        return minDist;
    }

}