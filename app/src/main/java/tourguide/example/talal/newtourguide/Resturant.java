package tourguide.example.talal.newtourguide;

/**
 * Created by talal on 20/04/18.
 */

public class Resturant {

    private String name;
    private String rate;

    public Resturant(String name, String rate) {
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public String getRate() {
        return rate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}
