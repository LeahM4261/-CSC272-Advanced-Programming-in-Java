public class Microwave {
    private int time = 0;
    private int powerLevel = 1;

    public void increaseTime() {
        time += 30;
        System.out.println("Time increased by 30 seconds. Current time: " + time + " seconds.");
    }

    public void switchPowerLevel() {
        powerLevel = (powerLevel == 1) ? 2 : 1;
        System.out.println("Power level switched to: " + powerLevel);
    }

    public void start() {
        System.out.println("Cooking for " + time + " seconds at level " + powerLevel + ".");
    }

    public void reset() {
        time = 0;
        powerLevel = 1;
        System.out.println("Microwave reset. Time and power level set to default.");
    }

    public static void main(String[] args) {
        Microwave microwave = new Microwave();

        microwave.increaseTime();
        microwave.switchPowerLevel();
        microwave.start();
        microwave.reset();
    }
}