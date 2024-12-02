public class Day_1_Switch_Case {

    public static double areaSwitchCase(int ch, double[] a) {
        switch (ch) {
            case 1:
                if (a.length == 1) {
                    return Math.PI * a[0] * a[0]; // Area of circle
                }
                break;
            case 2:
                if (a.length == 2) {
                    return a[0] * a[1]; // Area of rectangle
                }
                break;
        }
        throw new IllegalArgumentException("Invalid input.");
    }

    public static void main(String[] args) {
        // Example for circle
        double[] circleDimensions = { 5.0 }; // Radius
        System.out.println("Area of Circle: " + areaSwitchCase(1, circleDimensions));

        // Example for rectangle
        double[] rectangleDimensions = { 5.0, 4.0 }; // Length and Width
        System.out.println("Area of Rectangle: " + areaSwitchCase(2, rectangleDimensions));
    }
}