import java.io.Serializable;
import java.util.ArrayList;

public class Room implements Serializable {
    String name;
    ArrayList<Bound> inner;
    boolean hasInner;

//    @Override
    public Room(){
        this.hasInner = true;
        this.inner = new ArrayList<>();

    }

    public Room(String name) {
        this.name = name;
        this.inner = new ArrayList<>();
    }

    @Override
    public String toString(){
        return (name
                +": "
                + inner.toString());


    }

    @Override
    protected Room clone() throws CloneNotSupportedException{
        return (Room)super.clone();
    }

    public static void roomPopulate(Room room){

        Location northWallLoc = new Location(Quarter.NORTH, HorizontalOrientation.MIDDLE, VerticalOrientation.MID);
        Bound northWall = new Bound("windowWall", Bound.Surface.WALL, northWallLoc, true);
        room.inner.add(northWall);
        Furniture windowRack = new Furniture("windowRack", FurnitureType.RACK, new Location(HorizontalOrientation.LEFT, VerticalOrientation.BOTTOM), true);
        northWall.inner.add(windowRack);
        windowRack.inner.add(new Movables(MovableType.BOARD_GAMES));
        windowRack.inner.add(new Movables(MovableType.DOCUMENTS));
        windowRack.inner.add(new Movables(MovableType.VINYLS));

        Location easthWallLoc = new Location(Quarter.EAST, HorizontalOrientation.MIDDLE, VerticalOrientation.MID);
        Bound eastWall = new Bound("frontWall", Bound.Surface.WALL, easthWallLoc, true);
        room.inner.add(eastWall);
        Furniture albumRack = new Furniture("albumRack", FurnitureType.RACK, new Location(HorizontalOrientation.LEFT, VerticalOrientation.BOTTOM), true);
        Furniture displayDesk = new Furniture("displayDesk", FurnitureType.DESK, new Location(HorizontalOrientation.MIDDLE, VerticalOrientation.BOTTOM), true);
        eastWall.inner.add(albumRack);
        eastWall.inner.add(displayDesk);
        albumRack.inner.add(new Movables(MovableType.CDS));
        albumRack.inner.add(new Movables(MovableType.COMPUTER_GAMES));
        albumRack.inner.add(new Movables(MovableType.DVDS));
        albumRack.inner.add(new Movables(MovableType.VINYLS));
        displayDesk.inner.add(new Movables(MovableType.COMPUTER));
        displayDesk.inner.add(new Movables(MovableType.DISPLAY));
        displayDesk.inner.add(new Movables(MovableType.DISPLAY));
        displayDesk.inner.add(new Movables(MovableType.HUB));
        displayDesk.inner.add(new Movables(MovableType.SOUND_CARD));
        displayDesk.inner.add(new Movables(MovableType.AMPLIFIER));

        Location southWallLoc = new Location(Quarter.SOUTH, HorizontalOrientation.MIDDLE, VerticalOrientation.MID);
        Bound southWall = new Bound("doorWall", Bound.Surface.WALL, southWallLoc, true);
        room.inner.add(southWall);
        Furniture wallUnit = new Furniture("wallUnit", FurnitureType.WALL_UNIT, new Location(HorizontalOrientation.LEFT), true);
        southWall.inner.add(wallUnit);
        wallUnit.inner.add(new Movables(MovableType.BOOKS));
        wallUnit.inner.add(new Movables(MovableType.MUSICAL_INSTRUMENTS));
        wallUnit.inner.add(new Movables(MovableType.CLOTHES));
        wallUnit.inner.add(new Movables(MovableType.DOCUMENTS));
        wallUnit.inner.add(new Movables(MovableType.VINYLS));

        Location westWallLoc = new Location(Quarter.WEST, HorizontalOrientation.MIDDLE, VerticalOrientation.MID);
        Bound westWall = new Bound("backWall", Bound.Surface.WALL, westWallLoc,true);
        room.inner.add(westWall);
        Furniture bed = new Furniture("bed", FurnitureType.BED, new Location(HorizontalOrientation.MIDDLE, VerticalOrientation.BOTTOM), false);
        Furniture cableRail = new Furniture("rail", FurnitureType.RAIL, new Location(HorizontalOrientation.RIGHT, VerticalOrientation.MID), true);
        westWall.inner.add(bed);
        westWall.inner.add(cableRail);
        cableRail.inner.add(new Movables(MovableType.CABLE));

        Location ceilingLoc = new Location(Quarter.CENTER, HorizontalOrientation.MIDDLE, VerticalOrientation.TOP);
        Bound ceiling = new Bound("ceiling", Bound.Surface.WALL, ceilingLoc,true);
        room.inner.add(ceiling);
        Furniture absorber = new Furniture("absorber", FurnitureType.ABSORBER, new Location(HorizontalOrientation.MIDDLE), false);
        ceiling.inner.add(absorber);

        Location floorLoc = new Location(Quarter.CENTER, HorizontalOrientation.MIDDLE, VerticalOrientation.BOTTOM);
        Bound floor = new Bound("floor", Bound.Surface.WALL, floorLoc,true);
        room.inner.add(floor);
        Furniture workBench = new Furniture("workbench", FurnitureType.WORKBENCH, new Location(HorizontalOrientation.MIDDLE), true);
        Furniture leftStand = new Furniture("leftStand", FurnitureType.STAND, new Location(HorizontalOrientation.LEFT), true);
        Furniture rightStand = new Furniture("rightStand", FurnitureType.STAND, new Location(HorizontalOrientation.RIGHT), true);
        Furniture stool = new Furniture("stool", FurnitureType.STOOL, new Location(HorizontalOrientation.MIDDLE), false);
        Furniture chair = new Furniture("chair", FurnitureType.CHAIR, new Location(HorizontalOrientation.LEFT), false);
        floor.inner.add(workBench);
        workBench.inner.add(new Movables(MovableType.MOUSE));
        workBench.inner.add(new Movables(MovableType.CONTROL_SURFACE));
        workBench.inner.add(new Movables(MovableType.KEYBOARD));
        workBench.inner.add(new Movables(MovableType.MIDI_KEYBOARD));
        workBench.inner.add(new Movables(MovableType.HEADPHONES));
        floor.inner.add(leftStand);
        leftStand.inner.add(new Movables(MovableType.SPEAKER));
        floor.inner.add(rightStand);
        rightStand.inner.add(new Movables(MovableType.SPEAKER));
        floor.inner.add(stool);
        floor.inner.add(chair);

    }

}
