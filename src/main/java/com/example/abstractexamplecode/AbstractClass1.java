package com.example.abstractexamplecode;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractClass1 {
    protected ConcreteDependance1 concreteDependance1;
    protected ConcreteDependance2 concreteDependance2;

    public AbstractClass1(ConcreteDependance1 concreteDependance1, ConcreteDependance2 concreteDependance2) {
        this.concreteDependance1 = concreteDependance1;
        this.concreteDependance2 = concreteDependance2;
    }
}
