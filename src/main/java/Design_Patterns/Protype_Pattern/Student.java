package Design_Patterns.Protype_Pattern;

public class Student implements Prototype<Student>{
    int id;
    String name;
    String batchName;
    double avgBatchPsp;
    int yearOfEnrollment;

    public Student(){
    }

    public Student(Student S){
        this.batchName=S.batchName;
        this.avgBatchPsp=S.avgBatchPsp;
        this.yearOfEnrollment=S.yearOfEnrollment;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public int getYearOfEnrollment() {
        return yearOfEnrollment;
    }

    public void setYearOfEnrollment(int yearOfEnrollment) {
        this.yearOfEnrollment = yearOfEnrollment;
    }
}
