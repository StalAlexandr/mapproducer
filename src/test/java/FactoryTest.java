import org.eapo.mapproducer.factory.MapProducerA;
import org.eapo.mapproducer.factory.MapProducerB;
import org.junit.Test;

public class FactoryTest {

    @Test
    public void testA(){
        new MapProducerA().produce().forEach((key, val)->{
            System.out.println("key " + key + " val " + val);
        });

    }

    @Test
    public void testB(){
        new MapProducerB().produce().forEach((key, val)->{
            System.out.println("key " + key + " val " + val);
        });

    }
}
