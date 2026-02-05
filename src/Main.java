import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Bus bus1 = new Bus(10, 50);
        Bus bus2 = new Bus(20, 40);
        Bus bus3 = new Bus(30, 60);

        // типа массив данных
        ArrayList<Bus> buses = new ArrayList<>();
        buses.add(bus1);
        buses.add(bus2);
        buses.add(bus3);

        // фильтр типа
        System.out.println("Buses with capacity > 45:");
        for (Bus bus : buses) {
            if (bus.getCapacity() > 45) {
                System.out.println(bus);
            }
        }

        // ыздейд
        System.out.println("\nSearching bus with route 20:");
        for (Bus bus : buses) {
            if (bus.getRouteNumber() == 20) {
                System.out.println("Found: " + bus);
            }
        }

        // сортировать етед
        buses.sort(Comparator.comparingInt(Bus::getCapacity));
        System.out.println("\nSorted buses by capacity:");
        for (Bus bus : buses) {
            System.out.println(bus);
        }

        // хранения
        Transport transport = new Bus(99, 70);
        System.out.println("\nPolymorphism example, capacity: " + transport.getCapacity());

        BusDAO busDAO = new BusDAO();



        busDAO.addBus(new Bus(101, 45));
        busDAO.addBus(new Bus(102, 60));

        try{
            busDAO.updateCapacity(101,80);
            System.out.println("Успешно ауысты");
        }catch (SQLException e){
            System.out.println("Ошибка");
        }


        List<Bus> dbBuses = busDAO.getAllBuses();
        for (Bus b : dbBuses) {
            System.out.println(b);
        }

        busDAO.updateCapacity(101, 55);
        busDAO.deleteBus(102);
    }
}