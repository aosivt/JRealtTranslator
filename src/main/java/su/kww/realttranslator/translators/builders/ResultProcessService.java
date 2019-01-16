package su.kww.realttranslator.translators.builders;

import java.util.Set;

public interface ResultProcessService<E> {
    Set<String> getErrors();
    E getResult();
}
