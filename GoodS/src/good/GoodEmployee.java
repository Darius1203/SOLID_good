package good;

public class GoodEmployee {
    private String status;
    private String name;
    private int hours;

    public GoodEmployee(String status, String name, int hours) {
        this.status = status;
        this.name = name;
        this.hours = hours;
    }

    public String getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public String toString() {
        return "I am a GoodEmployee!";
    }
}
