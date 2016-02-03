package uk.co.itmoore;

import org.junit.Assert;
import org.junit.Test;

public class ATestClassTest {

    @Test
    public void testX(){
        Assert.assertEquals("msg", AClass.aMethof(), "hello");
    }

}
