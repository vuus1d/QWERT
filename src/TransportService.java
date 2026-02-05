public class TransportService {
    private String serviceName;
    private int totalBuses;

    public TransportService(String serviceName, int totalBuses) {
        this.serviceName = serviceName;
        this.totalBuses = totalBuses;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getTotalBuses() {
        return totalBuses;
    }

    public void setTotalBuses(int totalBuses) {
        this.totalBuses = totalBuses;
    }

    public void printInfo() {
        System.out.println("Transport Service: " + serviceName + ", buses: " + totalBuses);
    }
}