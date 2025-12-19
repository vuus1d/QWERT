// public transport management system
public class Main {
    public static void main(String[] args) {

        Bus bus1 = new Bus(10, 50);
        Bus bus2 = new Bus(20, 40);

        Commuter commuter = new Commuter("Nurasyl", 500);

        TransportService service = new TransportService("City Transport", 120);

        bus1.printInfo();
        bus2.printInfo();
        commuter.printInfo();
        service.printInfo();

        // сравнение автобусов
        if (bus1.getCapacity() > bus2.getCapacity()) {
            System.out.println("Bus 1 has larger capacity");
        } else {
            System.out.println("Bus 2 has larger or equal capacity");
        }
    }
}
