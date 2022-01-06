package model.CentresTypes;

public class Bootcamp extends CentreType{

    public Bootcamp(String courseType) {
        super(courseType);
    }

    @Override
    public int getMaxSize() {
        return 0;
    }
}
