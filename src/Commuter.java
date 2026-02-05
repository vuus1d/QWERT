public class Commuter {
    private String name;
    private double ticketBalance;

    public Commuter(String name, double ticketBalance) {
        this.name = name;
        this.ticketBalance = ticketBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTicketBalance() {
        return ticketBalance;
    }

    public void setTicketBalance(double ticketBalance) {
        this.ticketBalance = ticketBalance;
    }

    public void printInfo() {
        System.out.println("Commuter: " + name + ", balance: " + ticketBalance);
    }
}