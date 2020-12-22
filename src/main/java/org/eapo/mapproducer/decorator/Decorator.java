package org.eapo.mapproducer.decorator;

import org.eapo.mapproducer.Key;
import org.eapo.mapproducer.MapProducer;

import java.util.Map;

abstract class Decorator implements MapProducer {

    MapProducer mapProducer;

   public Decorator(MapProducer mapProducer){
       this.mapProducer = mapProducer;
   }

    public Map<Key, String> produce(){
       Map<Key, String> map = mapProducer.produce();
       return map;
    }



}
