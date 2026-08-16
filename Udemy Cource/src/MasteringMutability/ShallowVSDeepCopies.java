package MasteringMutability;

import java.util.Arrays;

record Person2 (String name, String dob, Person2[] kids) {

    public Person2(Person2 p) {
        this(p.name, p.dob,
                p.kids == null ? null : Arrays.copyOf(p.kids, p.kids.length));
//                                            ^copyOf() -> shallow copy
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", kids=" + Arrays.toString(kids) +
                '}';
    }
}

public class ShallowVSDeepCopies {

    public static void main(String[] args) {

        Person2 joe = new Person2("Joe", "01/01/1961", null);
        Person2 jim = new Person2("Jim", "02/02/1962", null);
        Person2 jack = new Person2("Jack", "03/03/1963",
                new Person2[]{joe, jim});
        Person2 jane = new Person2("Jane", "04/04/1964", null);
        Person2 jill = new Person2("Jill", "05/05/1965",
                new Person2[]{joe, jim});

        Person2[] Person2s = {joe, jim, jack, jane, jill};
        Person2[] Person2sCopy = Person2s.clone();
        //                               ^clone() -> shallow copy

//        Person2[] Person2sCopy = Arrays.copyOf(Person2s, Person2s.length);
        //                                  copyOf() -> shallow copy


//        Person2[] Person2sCopy = new Person2[5];
//        Arrays.setAll(Person2sCopy, i -> new Person2(Person2s[i]));

//        for (int i = 0; i < 5; i++) {
//            Person2sCopy[i] = new Person2(Person2s[i]);
//        }

        var jillsKids = Person2sCopy[4].kids();
        jillsKids[1] = jane;

        for (int i = 0; i < 5; i++) {
            if (Person2s[i] == Person2sCopy[i]) {
                System.out.println("Equal References " + Person2s[i]);
            }
        }
        System.out.println(Person2s[4]);
        System.out.println(Person2sCopy[4]);
    }
}
