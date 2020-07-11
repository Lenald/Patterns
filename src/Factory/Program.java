package Factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = getDeveloperFactoryBySpeciality("php");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory getDeveloperFactoryBySpeciality(String speciality) {
        if (speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("c++")
                   ||
                   speciality.equalsIgnoreCase("cpp")) {
            return new CppDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("php")){
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(speciality + " speciality is unknown speciality!");
        }
    }
}
