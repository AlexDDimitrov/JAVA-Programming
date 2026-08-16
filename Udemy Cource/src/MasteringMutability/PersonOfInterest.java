package MasteringMutability;

public class PersonOfInterest extends PersonImmutable{
    public PersonOfInterest(PersonImmutable personImmutable) {
        super(personImmutable);
    }

//    @Override
//    public PersonImmutable[] getKids() {
//        return super.kids;
//    }
}
