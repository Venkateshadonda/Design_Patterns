package Design_Patterns.Protype_Pattern;

public class Client {
    public static void main(String[] args) {
        Registry registry=new Registry();

        Student febBatch=new Student();

        febBatch.setBatchName("FEB_2022");
        febBatch.setAvgBatchPsp(75);
        febBatch.setYearOfEnrollment(2022);

        registry.add(febBatch);

        Student mayBatch=new Student();

        mayBatch.setBatchName("MAY_2022");
        mayBatch.setAvgBatchPsp(75);
        mayBatch.setYearOfEnrollment(2022);
        registry.add(mayBatch);

        Student junBatch=new Student();

        junBatch.setBatchName("JUN_2022");
        junBatch.setAvgBatchPsp(75);
        junBatch.setYearOfEnrollment(2022);
        registry.add(junBatch);

        IntelligentStudent is=new IntelligentStudent();

        is.setQid(1);
        is.setBatchName("IntelligetBatch");
        is.setAvgBatchPsp(100);
        is.setYearOfEnrollment(2022);

        Student febStudent=registry.get("FEB_2022").clone();
        Student mayStudent=registry.get("MAY_2022").clone();
        Student junStudent=registry.get("JUN_2022").clone();

        IntelligentStudent IStudent=is.clone();

    }
}
