package MasteringMutability;

public class BaseClass {
    public final void recommendedMethod() {
        System.out.println("[BaseClass.recommendedMethod]: Best Way to Do it");
        optionalMethod();
        mandatoryMethod();
    }

    protected void optionalMethod() {
        System.out.println("[BaseClass.optionalMethod]: Customize Optional Method");
    }

    // final greyed out due to private and final being redundant
    private final void mandatoryMethod() {
        System.out.println("[BaseClass.mandatoryMethod]: NON-NEGOTIABLE!");
    }

    //final static method cant be hidden
    public static void recommendedStatic() {
        System.out.println("[BaseClass.recommendedStatic]: Best Way to Do it");
        optionalStatic();
        mandatoryStatic();
    }

    protected static void optionalStatic() {
        System.out.println("[BaseClass.optionalStatic]: Customize Optional Method");
    }

    private static void mandatoryStatic() {
        System.out.println("[BaseClass.mandatoryStatic]: NON-NEGOTIABLE!");
    }
}

class ChildClass extends BaseClass {

    @Override
    protected void optionalMethod() {
        System.out.println("[ChildClass.optionalMethod]: Extra stuff");
        super.optionalMethod();
    }

//    Cannot override due to it being private in the parent (BaseClass) class
//    @Override
//    public void recommendedMethod() {
//        System.out.println("[BaseClass.recommendedMethod]: Doing things my way");
//        optionalMethod();
//    }

    //hiding a method
    public static void recommendedStatic() {
        System.out.println("[Child.recommendedStatic]: Best Way to Do it");
        optionalStatic();
//        mandatoryStatic();
    }
}
