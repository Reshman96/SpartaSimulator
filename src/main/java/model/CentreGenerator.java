package model;

import model.CentresTypes.CentreType;
import model.CentresTypes.TechCentre;

public class CentreGenerator {

        public void createCenter() {
            CentreType singleCenter = new TechCentre(CourseType.JAVA);
            CentreManager.addCentre(singleCenter);
        }
    }

