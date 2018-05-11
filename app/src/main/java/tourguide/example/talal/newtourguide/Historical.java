package tourguide.example.talal.newtourguide;

/**
 * Created by talal on 21/04/18.
 */

public class Historical {
    private String decs;
    private int imgRecurceID ;

    public Historical(String decs, int imgRecurceID) {
        this.decs = decs;
        this.imgRecurceID = imgRecurceID;
    }

    public String getDecs() {
        return decs;
    }

    public int getImgRecurceID() {
        return imgRecurceID;
    }

    public void setDecs(String decs) {
        this.decs = decs;
    }

    public void setImgRecurceID(int imgRecurceID) {
        this.imgRecurceID = imgRecurceID;
    }
}
