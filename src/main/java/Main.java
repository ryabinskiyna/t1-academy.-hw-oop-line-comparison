public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 1);

        Line line1 = new Line(p1, p2);
        Line line2 = new Line(new Point(0, 0), new Point(1, 1));

        if (line1.equals(line2)) {
            System.out.println("Линии равны.");
        } else {
            System.out.println("Линии не равны.");
        }

        Line clonedLine = line1.clone();

        System.out.println("Оригинал и клон равны? " + line1.equals(clonedLine));
        System.out.println("Это один и тот же объект? " + (line1 == clonedLine));
        System.out.println("Начальные точки равны? " + (line1.start == clonedLine.start));
    }
}
