package ru.mirea.practice5.task3;

import static java.lang.Math.acos;
import static java.lang.Math.toRadians;
import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Location {
    public static final double EARTH_RADIUS = 6.371e6;
    private double latitude;
    private double longitude;

    public Location() {
        this(49.9935, 36.2304);
    }

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public static double getDistance(Location currentLocation, Location destinationLocation) {
        double lat1 = toRadians(currentLocation.getLatitude());
        double lon1 = toRadians(currentLocation.getLongitude());
        double lat2 = toRadians(destinationLocation.getLatitude());
        double lon2 = toRadians(destinationLocation.getLongitude());
        return EARTH_RADIUS * acos(sin(lat1) * sin(lat2) + cos(lat1) * cos(lat2) * cos(lon2 - lon1));
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
