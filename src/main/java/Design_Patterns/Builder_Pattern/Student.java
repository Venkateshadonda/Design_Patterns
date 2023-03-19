package Design_Patterns.Builder_Pattern;

import Design_Patterns.Builder_Pattern.Exceptions.InvalidGradYearException;
import Design_Patterns.Builder_Pattern.Exceptions.InvalidPSPException;
import Design_Patterns.Builder_Pattern.Exceptions.InvalidYOEException;

public class Student {
    private int id;
    private String name;
    private int YOE;
    private int PSP;
    private int GradYear;

    public Student(Builder b) throws Exception {

        if(b.getYOE()<1)
                throw new InvalidYOEException("Invalid Years of Experience");
        if(b.getGradYear()>2023)
                throw new InvalidGradYearException("Invalid Year of Graduation");
        if(b.getPSP()<75)
                throw new InvalidPSPException("Please increase your PSP and try");

        this.id = b.getId();
        this.name = b.getName();
        this.YOE = b.getYOE();
        this.PSP = b.getPSP();
        this.GradYear = b.getGradYear();
    }

}
