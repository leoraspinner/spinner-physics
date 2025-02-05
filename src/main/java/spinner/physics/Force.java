package spinner.physics;

public class Force
{

    private double degrees;
    private double magnitude;

    public Force(double degrees, double magnitude)
    {
        this.degrees = degrees;
        this.magnitude = magnitude;
    }

    public Force add(Force force) {

        double degree1 = Math.toRadians(this.degrees);
        double degree2 = Math.toRadians(this.degrees);

        double x1 = this.magnitude * Math.cos(degree1);
        double y1 = this.magnitude * Math.sin(degree1);
        double x2 = this.magnitude * Math.cos(degree2);
        double y2 = this.magnitude * Math.sin(degree2);

        double resultx = x1 + x2;
        double resulty = y1 + y2;

        double resultantMagnitude = Math.sqrt(Math.pow(resultx, 2) + Math.pow(resulty, 2));
        double resultantAngle = Math.toDegrees(Math.atan2(resulty, resultx));

        return new Force(resultantAngle, resultantMagnitude);

    }


}

