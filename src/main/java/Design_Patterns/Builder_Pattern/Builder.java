package Design_Patterns.Builder_Pattern;

public class Builder {
    int id;
    private String name;
    private int YOE;
    private int PSP;
    private int GradYear;

    public Builder() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getYOE() {
        return YOE;
    }

    public void setYOE(int YOE) {
        this.YOE = YOE;
    }

    public int getPSP() {
        return PSP;
    }

    public void setPSP(int PSP) {
        this.PSP = PSP;
    }

    public int getGradYear() {
        return GradYear;
    }

    public void setGradYear(int gradYear) {
        this.GradYear = gradYear;
    }
}
