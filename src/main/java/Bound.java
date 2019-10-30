import java.io.Serializable;
import java.util.ArrayList;

public class Bound implements Cloneable, Serializable {

    String name;
    Surface type;
    Location location;
    ArrayList<Outfit> outfits;
    ArrayList<Furniture> inner;
    boolean hasInner;

    public Bound(String name, Surface type, Location location, boolean hasInner) {
        this.name = name;
        this.type = type;
        this.location = location;
        this.outfits = new ArrayList<>();
        if (hasInner){this.inner = new ArrayList<>();}
    }

    @Override
    public String toString(){
        return ("\n"+type
                +": "
                +location.toString()
                +":\n"+ inner
        );
    }

enum Surface {
    WALL,
    FLOOR,
    CEILING

}

    enum Outfit {
        CURTAIN,
        DOOR,
        LAMP,
        OUTLET,
        RADIATOR,
        SWITCH,
        WINDOW,
        WINDOWSILL,
    }
}