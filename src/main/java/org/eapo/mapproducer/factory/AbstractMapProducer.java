package org.eapo.mapproducer.factory;

import org.eapo.mapproducer.Key;
import org.eapo.mapproducer.MapProducer;

import java.util.HashMap;
import java.util.Map;

abstract class AbstractMapProducer implements MapProducer {


    public Map<Key, String> produce() {
        Map<Key, String> map = new HashMap<Key, String>();
        map.put(Key.ONE, "раз");
        map.put(Key.TWO, "два");
        fillMap(map);
        return map;
    }

    protected abstract void fillMap(Map<Key, String> map);
}
