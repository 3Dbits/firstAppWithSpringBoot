public class Comp {

    private String manName;
    private int speed;
    private double screenS;
    private int ram;
    private String type;
    private boolean osPre;
    private int serNum;

    public Comp() {
    }

    public Comp(String manName, double screenS, boolean osPre, int ram) {
        this.manName = manName;
        this.screenS = screenS;
        this.osPre = osPre;
        this.ram = ram;
    }

    public double getScreenS() {
        return screenS;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getManName() {
        return manName;
    }

    public void setManName(String manName) {
        this.manName = manName;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double isScreenS() {
        return screenS;
    }

    public void setScreenS(double screenS) {
        this.screenS = screenS;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isOsPre() {
        return osPre;
    }

    public void setOsPre(boolean osPre) {
        this.osPre = osPre;
    }

    public int getSerNum() {
        return serNum;
    }

    public void setSerNum(int serNum) {
        this.serNum = serNum;
    }

    @Override
    public String toString() {
        return "Comp{" +
                "manName='" + manName + '\'' +
                ", speed=" + speed +
                ", screenS=" + screenS +
                ", type='" + type + '\'' +
                ", osPre=" + osPre +
                ", serNum=" + serNum +
                '}';
    }
}
