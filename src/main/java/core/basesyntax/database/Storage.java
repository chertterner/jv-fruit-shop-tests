package core.basesyntax.database;

import java.util.HashMap;
import java.util.Map;

public class Storage {
    private static final Map<String, Integer> storage = new HashMap<>();

    public static Map<String, Integer> getStorage() {
        return storage;
    }
}
