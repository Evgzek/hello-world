import java.util.Scanner;
public class Main {public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Введите максимальную вершину: ");
    int maxStep = in.nextInt();

    System.out.print("Введите максимальный перепад трех ближайших вершин: ");
    int maxDiff = in.nextInt();

    System.out.print("Введите длину маршрута: ");
    int routeLength = in.nextInt();

    Roc test = new Roc(maxStep,maxDiff,routeLength);

    test.PrintGraph();
    System.out.println(test.toString());


}
}
