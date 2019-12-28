public class RecoverController {
    private Rover rover;

    public RecoverController(Rover rover) {
        this.rover = rover;
    }


    public void execute(String mission) {
        if (mission == null || mission.length() < 5) {
            return;
        }

        String[] step = mission.split(",");

        this.rover.setArea(new Area(Integer.parseInt(step[0]), Integer.parseInt(step[1])));
        this.rover.setPositionX(Integer.parseInt(step[2]));
        this.rover.setPositionY(Integer.parseInt(step[3]));
        this.rover.setDirection(step[4]);

        for (int i = 5; i < step.length; i++) {
            if (step[i] != null && step[i].equals("M")) {
                this.rover.move();
            } else if (step[i] != null && step[i].equals("L")) {
                this.rover.turnLeft();
            } else if (step[i] != null && step[i].equals("R")) {
                this.rover.turnRight();
            } else {
                continue;
            }
        }


    }
}
