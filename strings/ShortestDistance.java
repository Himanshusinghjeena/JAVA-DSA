public class ShortestDistance {
    public static float getShortestDistance(String str) {

        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'E') {
                x++;
            } else if (str.charAt(i) == 'W') {
                x--;
            } else if (str.charAt(i) == 'N') {
                y++;
            } else {
                y--;
            }
        }
        int a = x * x;
        int b = y * y;

        return (float) Math.sqrt(a + b);
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(getShortestDistance(str));
    }
}
