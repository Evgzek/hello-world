public class Roc {
    private int maxStep;
    private int maxDiff;
    private int route_length;
    private int[] route;
    private String string = "0 1 ";
    private String[] graph;

    public int getMaxStep() {
        return maxStep;
    }


    public int getMaxDiff() {
        return maxDiff;
    }


    public int getRoute_length() {
        return route_length;
    }

    @Override
    public String toString() {
        return string;
    }

    public Roc(int maxStep, int maxDiff, int route_length){

        if (route_length > 2 && maxStep > 1 && maxDiff > 0) {
            this.maxStep = maxStep;
            this.maxDiff = maxDiff;
            this.route_length = route_length;
        } else {
            throw new IllegalArgumentException("invalid type");
        }

        if(maxDiff > maxStep) {
            maxDiff = maxStep;
        }

        route = new int[route_length];
        Point point = new Point(maxStep,maxDiff);

        route[0] = 0;
        route[1] = 1;


        for (int i = 2; i < route_length; i++) {
            route[i] = point.getPoint(route[i-2],route[i-1]);
            string += route[i] + " ";

        }
    };

    public void PrintGraph()
    {
        graph = new String[maxStep];
        for (int i = 0; i < Point.getMaxValue();i++){
            graph[i] = " ";
            for (int j = 0; j < route_length; j++) {
                if (route[j] > 0) {
                    graph[i] += "*";
                    route[j] -= 1;
                } else graph[i] += " ";
            }
        }
        for (int i = Point.getMaxValue()-1; i >=0; i--){
            System.out.println(graph[i]);
        }
    }

}
