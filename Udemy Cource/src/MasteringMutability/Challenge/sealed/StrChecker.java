package MasteringMutability.Challenge.sealed;

import java.util.function.Predicate;

public final class StrChecker implements SealedInterface{
    @Override
    public boolean testData(Predicate<String> p, String... strings) {
        return false;
    }
}
