import org.eapo.mapproducer.decorator.BaseMapProducer;
import org.eapo.mapproducer.decorator.DecoratorA;
import org.eapo.mapproducer.decorator.DecoratorB;
import org.junit.Test;

public class DecoratorTest {

@Test
public void testA(){

    new DecoratorA(new BaseMapProducer()).produce().forEach((key, val)->{
        System.out.println("key " + key + " val " + val);
    });

}

    @Test
    public void testB(){


        new DecoratorB(new BaseMapProducer()).produce().forEach((key, val)->{
            System.out.println("key " + key + " val " + val);
        });

    }


}
