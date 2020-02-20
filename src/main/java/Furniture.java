import java.io.Serializable;
import java.util.ArrayList;

public class Furniture implements Cloneable, Serializable {

    String name;
    FurnitureType furnitureType;
    Location FurnitureLocation;
    ArrayList<Movables> inner;
    boolean hasInner;

    public Furniture(String name, FurnitureType furnitureType, Location furnitureLocation, boolean hasInner) {
        this.name = name;
        this.furnitureType = furnitureType;
        FurnitureLocation = furnitureLocation;
        if (hasInner) {this.hasInner = hasInner;
            inner = new ArrayList<>();
        }
    }

    @Override
    public String toString() {
        String cache;
/*        if(hasStorage)cache = ": "+storage.toString()+"\n";
        else cache = "";*/
        cache = hasInner ? inner.toString() : "";
        return (furnitureType
                + cache);
    }
}

enum FurnitureType {
    ABSORBER,
    BED,
    CHAIR,
    DESK,
    RACK,
    RAIL,
    STAND,
    STOOL,
    WALL_UNIT,
    WORKBENCH,
}
