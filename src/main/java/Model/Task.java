package Model;

public class Task implements Comparable{
    private int id;
    private int arrivalTime;
    private int serviceTime;

    public Task(int id, int arrivalTime, int serviceTime) {
        this.id = id;
        this.arrivalTime = arrivalTime;
        this.serviceTime = serviceTime;
    }

    @Override
    public int compareTo(Object o) {

        return this.arrivalTime- ((Task)o).arrivalTime;
    }

    @Override
    public String toString() {
        return "["+id+"|"+arrivalTime+"|"+serviceTime+"]";
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public int getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(int serviceTime) {
        this.serviceTime = serviceTime;
    }
}
