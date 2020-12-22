package org.eapo.mapproducer.decorator;

import org.eapo.mapproducer.Key;
import org.eapo.mapproducer.MapProducer;

import java.util.HashMap;
import java.util.Map;

public class BaseMapProducer implements MapProducer {

    public Map<Key, String> produce() {
        Map<Key, String> map = new HashMap<Key, String>();
        map.put(Key.ONE, "раз");
        map.put(Key.TWO, "два");
        return map;
    }
}
