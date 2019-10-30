import java.io.Serializable;

public class Movables implements Serializable {
    MovableType movableType;
    String name;

    public Movables(MovableType movableType) {
        this.movableType = movableType;
    }

    @Override
    public String toString() {
        String cache = name == null ? movableType.toString() : movableType.toString() + ": " + name;
        return (cache);
    }
}

enum MovableType {
    //    ADAPTER,
    AMPLIFIER,
    BOARD_GAMES,
    BOOKS,
    CABLE,
    CDS,
    CLOTHES,
    COMPUTER,
    COMPUTER_GAMES,
    CONTROL_SURFACE,
    DISPLAY,
    DOCUMENTS,
    DVDS,
    HEADPHONES,
    HUB,
    KEYBOARD,
    MIDI_KEYBOARD,
    MOUSE,
    MUSICAL_INSTRUMENTS,
    SOUND_CARD,
    SPEAKER,
    VINYLS
}


