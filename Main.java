// public transport management system
public class Main {
    public static void main(String[] args) {

        Bus bus1 = new Bus(10, 50);
        Bus bus2 = new Bus(20, 40);
        Bus bus3 = new Bus(30, 60);
        Commuter commuter = new Commuter("Nurasyl", 500);

        TransportService service = new TransportService("City Transport", 120);

        bus1.printInfo();
        bus2.printInfo();
        bus3.printInfo();
        commuter.printInfo();
        service.printInfo();

        // сравнение автобусов
        if (bus1.getCapacity() > bus2.getCapacity() && bus1.getCapacity()> bus3.getCapacity()) {
            System.out.println("Bus 1 has larger capacity");
        }else if (bus3.getCapacity()> bus1.getCapacity()){
            System.out.println("Bus 3 has larger that 1");
        }

        else {
            System.out.println("Bus 2 has larger or equal capacity");
        }
    }
}
