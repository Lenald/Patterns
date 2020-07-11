package AbstractFactory.Website;

import AbstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP developer writes website code...");
    }
}
