public class Bus {
    private int routeNumber;
    private int capacity;

    public Bus(int routeNumber, int capacity) {
        this.routeNumber = routeNumber;
        this.capacity = capacity;
    }

    public int getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(int routeNumber) {
        this.routeNumber = routeNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void printInfo() {
        System.out.println("Bus route: " + routeNumber + ", capacity: " + capacity);
    }
}
