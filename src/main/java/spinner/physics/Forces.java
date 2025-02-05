package spinner.physics;

public class Forces
{
    public static void main(String[] args) {
        Forces forces = new Forces();

        double magnitude1 = 10;
        double degree1 = 32;

        double magnitude2 = 10;
        double degree2 = 105;

        double degree1Rad = Math.toRadians(degree1);
        double degree2Rad = Math.toRadians(degree2);

        double forces1x = magnitude1 * Math.cos(degree1Rad);
        double forces1y = magnitude1 * Math.sin(degree1Rad);

        double forces2x = magnitude2 * Math.cos(degree2Rad);
        double forces2y = magnitude2 * Math.sin(degree2Rad);

        double resultx = forces1x + forces2x;
        double resulty = forces1y + forces2y;

        double resultantMagnitude = Math.sqrt(Math.pow(resultx, 2) + Math.pow(resulty, 2));
        double resultantAngle = Math.toDegrees(Math.atan2(resulty, resultx));

        System.out.printf("Magnitude: %.2f N\n", resultantMagnitude);
        System.out.printf("Direction: %.2f degrees\n", resultantAngle);
    }
}

