package org.eapo.mapproducer.decorator;

import org.eapo.mapproducer.Key;
import org.eapo.mapproducer.MapProducer;

import java.util.Map;

public class DecoratorB extends Decorator {
    public DecoratorB(MapProducer mapProducer) {
        super(mapProducer);
    }

    @Override
    public Map<Key, String> produce() {
        Map<Key, String> map = super.produce();
        map.put(Key.THREE, "три - B");
        return map;
    }
}

