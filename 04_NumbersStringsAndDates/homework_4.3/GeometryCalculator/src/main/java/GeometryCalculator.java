public class GeometryCalculator {
    // the method must use the absolute value of radius
    public static double getCircleSquare(double radius) {
        return Math.PI * radius * radius;
    }

    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius) {
        return 4.0 / 3.0 * Math.PI * Math.abs(Math.pow(radius, 3));
    }

    public static boolean isTrianglePossible(double a, double b, double c) {
        return a < b + c && b < a + c && c < a + b;
    }

    // before calculating the area, it is recommended to check whether such a triangle is possible
    // using the isTrianglePossible method, if it is impossible to return -1.0
    public static double getTriangleSquare(double a, double b, double c)
    {
        if (isTrianglePossible(a,  b,  c))
        {
            double p = (a + b + c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return -1;
    }
}

