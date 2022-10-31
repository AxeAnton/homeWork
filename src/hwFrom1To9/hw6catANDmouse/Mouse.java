package hwFrom1To9.hw6catANDmouse;

public class Mouse {

     private int speedMouse;

    public Mouse(int speedMouse) {
        setSpeedMouse(speedMouse);
        this.speedMouse = speedMouse;
    }

    public int getSpeedMouse() {
        return speedMouse;
    }

    public void setSpeedMouse(int speedMouse) {
        if (speedMouse < 0) {
            throw new IllegalArgumentException("speedMouse should be > 0 ");
        }
        this.speedMouse = speedMouse;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "speedMouse=" + speedMouse +
                '}';
    }
}
