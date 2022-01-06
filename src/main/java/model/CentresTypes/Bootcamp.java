package model.CentresTypes;

public class Bootcamp extends CentreType{

    public Bootcamp() {
        super(null, 3);
    }

    @Override
    public int getMaxSize() {
        return 500;
    }
}
