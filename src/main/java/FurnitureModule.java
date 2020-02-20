import java.io.Serializable;
import java.util.ArrayList;

public class FurnitureModule implements Serializable {
    ModuleType moduleType;
    ArrayList<Movables> storage;
}

enum ModuleType{
    SHELF,
    CLOSET,
}
