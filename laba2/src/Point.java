public class Point {
    private int maxStep;
    private int maxDiff;
    private static int maxValue = 1;

    public static int getMaxValue() {
        return maxValue;
    }

    public int getPoint(int element1, int element2) {


        int max = Math.max(element1,element2);
        if (max > maxValue) {
            maxValue = max;
        }

        int min = (element1+element2) - max;

        int diff = max - min;


        int a = negative(min,diff);
        int b = positive(max,diff);

        return Math.round((float)Math.random() * (b - a) + a);
    }

    public Point(int maxStep, int maxDiff){
        this.maxStep = maxStep;
        this.maxDiff = maxDiff;
    }


    private int positive (int max_f, int diff) {
        if (max_f+(maxDiff-diff) > maxStep) {
            return maxStep;
        }
        else
            return max_f+(maxDiff-diff);
    }

    private int negative (int min_f,int diff) {
        if (min_f-(maxStep-diff) < 0) {
            return 0;
        }
        else
            return min_f-(maxStep-diff);
    }


}

