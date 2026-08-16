package MasteringMutability.Challenge.sealed;

import java.util.function.Predicate;

public sealed interface SealedInterface permits BetterInterface, StrChecker {
    boolean testData(Predicate<String> p, String... strings);
}
