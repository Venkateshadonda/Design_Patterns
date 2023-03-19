package Design_Patterns.Builder_Pattern;

public class Client {
    public static void main(String[] args) throws Exception{
        Builder b = new Builder();
        b.setName("Venkat");
        b.setId(1);
        b.setPSP(82);
        b.setYOE(3);
        b.setGradYear(2020);

        Student S = new Student(b);

        StudentV2 SV2=StudentV2.builder().
                        setId(1).
                        setName("Nikhil").
                        setPSP(84).
                        setYOE(2).
                        setGradYear(2023).build();
    }
}
