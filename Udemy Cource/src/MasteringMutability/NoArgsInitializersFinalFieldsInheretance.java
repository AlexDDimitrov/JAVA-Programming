package MasteringMutability;

//command terminal: javap -p <out/production/...>

import java.time.LocalDate;
import java.time.format.SignStyle;
import java.util.Random;

public class NoArgsInitializersFinalFieldsInheretance {
    static void main(String[] args) {
        Parent parent = new Parent("John Doe", "01/01/1900", 4);
        Child child = new Child("John Doe", "01/01/1900", 5);
        System.out.println(parent);
        System.out.println(child);

        PersonRecord2 joe = new PersonRecord2("Joe", "01-01-1900");
        System.out.println(joe);

        Generation g = Generation.BABY_BOOMER;

        System.out.println(g);
    }
}

class Parent {

    static {
        System.out.println("Static initializer");
    }

    private final String name;
    private final String dob;

    protected final int siblings;

    //Instance Initializer
    {
//        name = "John Doe";
//        dob = "01/01/1900";
        System.out.println("In Parent Initializer");
    }

//    public Parent() {
//        System.out.println("In Parent No-Args Constructor");
//    }

    public Parent(String name, String dob, int siblings) {
        this.name = name;
        this.dob = dob;
        this.siblings = siblings;
        System.out.println("In Parent Constructor");
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "Parent: " + name + " " + dob;
    }
}

class Child extends Parent{

    private final int bOrder = getBirthOrder();
    private final String bOrderStr;

    {
        if(siblings == 0) {
            bOrderStr = "Only";
        } else if (bOrder == 1) {
            bOrderStr = "First";
        } else if (bOrder == (siblings + 1)) {
            bOrderStr = "Last";
        } else {
            bOrderStr = "Middle";
        }
        System.out.println(bOrder + " " + bOrderStr);
    }

    public Child(String name, String dob, int siblings) {
        super(name, dob, siblings);
        System.out.println("Child constructor");
    }

    @Override
    public String toString() {
        return "Child: " + getName() + " " + getDob() + " " + bOrderStr;
    }

    private final int getBirthOrder() {
        if (siblings == 0) return 1;
        return new Random().nextInt(1, siblings + 2);
    }
}

record PersonRecord2(String name, String dob) {
    //  canonical constructor
    //    public PersonRecord2(String name, String dob) {
//        this.name = name;
//        this.dob = dob.replace('-', '/').trim();
//    }

    public PersonRecord2 (PersonRecord2 p) {
        this(p.name, p.dob);
    }


//  compact constructor
    PersonRecord2 {
        if (dob == null) throw new IllegalArgumentException("Bad data");
        dob = dob.replace('-', '/');
    }
}

enum Generation {
    GEN_Z {

    },
    MILLENNIAL(1981, 2000),
    GEN_X(1965, 1980),
    BABY_BOOMER(1946, 1964),
    SILENT_GENERATION(1927, 1945),
    GREATEST_GENERATION(1901, 1926);

    private final int startYear;
    private final int endYear;

    Generation() {
        this(2021, LocalDate.now().getYear());
    }

    Generation(int startYear, int endYear) {
        System.out.println(this + " " + startYear + " " +endYear);
        this.startYear = startYear;
        this.endYear = endYear;
    }

    @Override
    public String toString() {
        return this.name() + " " + startYear + " " + endYear;
    }
}
