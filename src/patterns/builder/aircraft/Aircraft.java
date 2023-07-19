package patterns.builder.aircraft;

public abstract class Aircraft {

    private String body;
    private String engine;
    private String cockpit;
    private String wings;
    private String seats;
    private String bathroom;

    public void setBody(String body) {
        this.body = body;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setCockpit(String cockpit) {
        this.cockpit = cockpit;
    }

    public void setWings(String wings) {
        this.wings = wings;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public void setBathroom(String bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public String toString() {
        return "Body = " + body + "\n Engine = " + engine + "\n Cockpit = " + cockpit + "\n Wings = " + wings + "\n Seats = " + seats + "\n Bathroom = " + bathroom;
    }
}
