public class forces
{
    public static void main(String[] args) {
        double magnitude1 = 10;
        double angle1 = 32;

        double magnitude2 = 10;
        double angle2 = 105;

        double angle1Rad = Math.toRadians(angle1);
        double angle2Rad = Math.toRadians(angle2);

        double F1x = magnitude1 * Math.cos(angle1Rad);
        double F1y = magnitude1 * Math.sin(angle1Rad);

        double F2x = magnitude2 * Math.cos(angle2Rad);
        double F2y = magnitude2 * Math.sin(angle2Rad);

        double Rx = F1x + F2x;
        double Ry = F1y + F2y;

        double resultantMagnitude = Math.sqrt(Math.pow(Rx, 2) + Math.pow(Ry, 2));
        double resultantAngle = Math.toDegrees(Math.atan2(Ry, Rx));

        System.out.printf("Magnitude: %.2f N\n", resultantMagnitude);
        System.out.printf("Direction: %.2f degrees\n", resultantAngle);
    }
}

