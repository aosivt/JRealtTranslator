package su.kww.realttranslator.translators.builder;

import java.util.Set;

public interface ResultProcessService<E> {
    Set<String> getErrors();
    E getResult();
}
