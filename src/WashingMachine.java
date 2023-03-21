public class WashingMachine implements Motor {
    @Override
    public void run() {
        System.out.println("The washing machine is running.");
    }
    @Override
    public void consume() {
        System.out.println("The washing machine consumes " + capacity + " units of electricity.");
    }
}
