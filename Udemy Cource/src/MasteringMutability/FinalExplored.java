package MasteringMutability;

public class FinalExplored {
    static void main(String[] args) {
        BaseClass parent = new BaseClass();
        ChildClass childClass = new ChildClass();

        BaseClass childClass1 = new ChildClass();

        parent.recommendedMethod();
        System.out.println("-------------");
        childClass1.recommendedMethod();
        System.out.println("-------------");
        childClass.recommendedMethod();

        System.out.println("-------------");
        parent.recommendedStatic();
        System.out.println("-------------");
        childClass1.recommendedStatic();
        System.out.println("-------------");
        childClass.recommendedStatic();

        System.out.println("-------------");
        ChildClass.recommendedStatic();
        System.out.println("-------------");
        BaseClass.recommendedStatic();

        System.out.println("-------------");
        String x = "Hello";
        StringBuilder zArg = new StringBuilder("After ");
        doXYZ(x, 16, zArg);
        System.out.println(zArg);

        StringBuilder tracker = new StringBuilder("Step 1 is abc");
        Logger.logToConsole(tracker.toString());
        tracker.append(", Step 2 is xyz.");
        Logger.logToConsole(tracker.toString());
        System.out.println("After logging, tracker = " + tracker);
    }
// side effects vvvv
    private static void doXYZ(String x, int y, final StringBuilder z) {
        final String c = x + y;
        System.out.println(c);

        z.append(y);
//        z = new StringBuilder();
    }
}
