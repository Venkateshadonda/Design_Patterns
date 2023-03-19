package Design_Patterns.Protype_Pattern;

public class IntelligentStudent extends Student{
    int qid;

    public IntelligentStudent(){}

    public IntelligentStudent(IntelligentStudent is){
        super(is);
        this.qid=is.qid;
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }
}
