import static org.fest.util.Arrays.format;

public class Rover {

    public final static String EAST = "E";
    public final static String WEST = "W";
    public final static String SOUTH = "S";
    public final static String NORTH = "N";


    private Area area;
    private int positionX;
    private int positionY;
    private String direction;

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

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

    public void move() {
        if (this.direction.equals(Rover.EAST)) {
            int newPositionX = this.positionX + 1 > this.area.getMaxX() ? this.area.getMaxX() : this.positionX + 1;
            this.positionX = newPositionX;
            return;
        } else if (this.direction.equals(Rover.WEST)) {
            int newPositionX = this.positionX - 1 < 0 ? 0 : this.area.getMaxX();
            this.positionX = newPositionX;
            return;
        } else if (this.direction.equals(Rover.SOUTH)) {
            int newPositionY = this.positionY - 1 < 0 ? 0 : this.positionY - 1;
            this.positionY = newPositionY;
            return;
        } else if (this.direction.equals(Rover.NORTH)) {
            int newPositionY = this.positionY + 1 > this.area.getMaxY() ? this.area.getMaxY() : this.positionY + 1;
            this.positionY = newPositionY;
            return;
        }
        return;
    }

    public void turnLeft() {
        if (this.direction.equals(Rover.EAST)) {
            this.direction = Rover.NORTH;
            return;
        } else if (this.direction.equals(Rover.WEST)) {
            this.direction = Rover.SOUTH;
            return;
        } else if (this.direction.equals(Rover.SOUTH)) {
            this.direction = Rover.EAST;
            return;
        } else if (this.direction.equals(Rover.NORTH)) {
            this.direction = Rover.WEST;
            return;
        }
        return;
    }

    public void turnRight() {
        if (this.direction.equals(Rover.EAST)) {
            this.direction = Rover.SOUTH;
            return;
        } else if (this.direction.equals(Rover.WEST)) {
            this.direction = Rover.NORTH;
            return;
        } else if (this.direction.equals(Rover.SOUTH)) {
            this.direction = Rover.WEST;
            return;
        } else if (this.direction.equals(Rover.NORTH)) {
            this.direction = Rover.EAST;
            return;
        }
        return;
    }
}
