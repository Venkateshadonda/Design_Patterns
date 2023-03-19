package Design_Patterns.Builder_Pattern;

import Design_Patterns.Builder_Pattern.Exceptions.InvalidGradYearException;
import Design_Patterns.Builder_Pattern.Exceptions.InvalidPSPException;
import Design_Patterns.Builder_Pattern.Exceptions.InvalidYOEException;

public class StudentV2 {
    private int id;
    private String name;
    private int YOE;
    private int PSP;
    private int GradYear;

    public StudentV2(Builder b) throws Exception {

        this.id = b.id;
        this.name = b.name;
        this.YOE = b.YOE;
        this.PSP = b.PSP;
        this.GradYear = b.GradYear;
    }

    public static Builder builder(){
        Builder b=new Builder();
        return b;
    }

    //static is used as we call static builder without object and this return Builder type object so Builder type object
    //should also be static , So Builder class is declared static
    static class Builder {
        int id;
        private String name;
        private int YOE;
        private int PSP;
        private int GradYear;

        public StudentV2 build() throws Exception{
            if(YOE<1)
                throw new InvalidYOEException("Invalid Years of Experience");
            if(GradYear>2023)
                throw new InvalidGradYearException("Invalid Year of Graduation");
            if(PSP<75)
                throw new InvalidPSPException("Please increase your PSP and try");

            StudentV2 S=new StudentV2(this);
            return S;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setYOE(int YOE) {
            this.YOE = YOE;
            return this;
        }

        public Builder setPSP(int PSP) {
            this.PSP = PSP;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            GradYear = gradYear;
            return this;
        }
    }
}
