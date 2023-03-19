package Design_Patterns.Protype_Pattern;

import java.util.HashMap;

public class Registry {
    HashMap<String, Student> registry;
    public Registry(){
        registry=new HashMap<>();
    }

    public void add(Student S){
        String batchName=S.getBatchName();
        if(!registry.containsKey(batchName))
            registry.put(batchName, S);
    }
    public Student get(String batchName){
        return registry.get(batchName);
    }
}
