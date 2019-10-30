import java.io.Serializable;

public class Location implements Serializable {

    Quarter geoSide;
    HorizontalOrientation horizontalLocation;
    VerticalOrientation verticalLocation;

    public Location(Quarter geoSide, HorizontalOrientation horizontalLocation, VerticalOrientation verticalLocation) {
        this.geoSide = geoSide;
        this.horizontalLocation = horizontalLocation;
        this.verticalLocation = verticalLocation;
    }

    public Location(HorizontalOrientation horizontalLocation, VerticalOrientation verticalLocation) {
        this.horizontalLocation = horizontalLocation;
        this.verticalLocation = verticalLocation;
    }

    public Location(HorizontalOrientation horizontalLocation) {
        this.horizontalLocation = horizontalLocation;
    }

    @Override
    public String toString() {
        String geo = geoSide == null ? "" : geoSide.toString();
        String hor = horizontalLocation == null ? "" : horizontalLocation.toString();
        String ver = verticalLocation == null ? "" : verticalLocation.toString();

        return (geo + ", " + hor + ", " + ver);
    }
}

enum Quarter {
    NORTH,
    EAST,
    SOUTH,
    WEST,
    CENTER
}

enum HorizontalOrientation {
    LEFT,
    MIDDLE,
    RIGHT,
}

enum VerticalOrientation {
    TOP,
    MID,
    BOTTOM
}
