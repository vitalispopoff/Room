import java.io.*;

public class Main implements Serializable {

    public static void main(String[] args) {

        Room room = new Room("theRoom");

        Room.roomPopulate(room);

        try {
            FileOutputStream fos = new FileOutputStream("src\\main\\resources\\room.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(room);
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream("src\\main\\resources\\room.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            room = (Room) ois.readObject();

            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}