package spinner.physics;

public class Location
{

    private double x;
    private double y;

    public Location(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Location apply(Force f) {

        double radians = Math.toRadians(f.getDegrees());


        double dx = f.getMagnitude() * Math.cos(radians);
        double dy = f.getMagnitude() * Math.sin(radians);

        return new Location(this.x + dx, this.y + dy);
    }

}
