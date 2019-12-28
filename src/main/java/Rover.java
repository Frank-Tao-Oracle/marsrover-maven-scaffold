import static org.fest.util.Arrays.format;

public class Rover {

    private Area area;
    private int positionX;
    private int positionY;
    private String direction;


    public void land(Area area, int positionX, int positionY, String direction) {
        this.area = area;
        this.positionX = positionX;
        this.positionY = positionY;
        this.direction = direction;

    }

    public String getPosition() {
        String result = "" + this.positionX + this.positionY + this.direction;
        return result;
    }
}
