package Design_Patterns.Protype_Pattern;

public interface Prototype<T> {
    T clone();
}

/*
Generics <T>
public interface Student{
    Student clone();
}

public interface Teacher{
    Teacher clone();
}

public interface CEO{
    CEO clone();
}

So instead of using multiple Interface for each object we created a Generic object interface.

 */
