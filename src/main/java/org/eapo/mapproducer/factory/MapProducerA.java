package org.eapo.mapproducer.factory;

import org.eapo.mapproducer.Key;

import java.util.Map;

public class MapProducerA extends AbstractMapProducer {
    protected void fillMap(Map<Key, String> map) {
        map.put(Key.THREE, "три - A");
    }
}
