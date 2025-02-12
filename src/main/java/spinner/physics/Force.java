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

    public double getDegrees()
    {
        return degrees;
    }

    public double getMagnitude()
    {
        return magnitude;
    }

    public Force add(Force force) {

        double radians1 = Math.toRadians(this.degrees);
        double radians2 = Math.toRadians(force.degrees);

        double x1 = this.magnitude * Math.cos(radians1);
        double y1 = this.magnitude * Math.sin(radians1);
        double x2 = force.magnitude * Math.cos(radians2);
        double y2 = force.magnitude * Math.sin(radians2);

        double resultx = x1 + x2;
        double resulty = y1 + y2;

        double resultantMagnitude = Math.sqrt(resultx * resultx + resulty * resulty);

        double resultantAngle = Math.toDegrees(Math.atan2(resulty, resultx));

        return new Force(resultantAngle, resultantMagnitude);

    }

    public Force scale(double t)
    {
        return new Force(this.degrees, this.magnitude * t);
    }



}

