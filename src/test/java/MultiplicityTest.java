import org.junit.Assert;
import org.junit.Test;

public class MultiplicityTest {

    @Test
    public void testMultiplicity(){

        int m = 15;
        String expectedRes = "Good Number";

        Multiplicity multiplicity = new Multiplicity();
        String actualRes = multiplicity.getMultiplicity(m);

        Assert.assertEquals(expectedRes, actualRes);
    }

    @Test
    public void testMultiplicity1(){

        int m = 9;
        String expectedRes = "Bad Number";

        Multiplicity multiplicity = new Multiplicity();
        String actualRes = multiplicity.getMultiplicity(m);

        Assert.assertEquals(expectedRes, actualRes);
    }

    @Test
    public void testMultiplicity2(){

        int m = 10;
        String expectedRes = "Poor Number";

        Multiplicity multiplicity = new Multiplicity();
        String actualRes = multiplicity.getMultiplicity(m);

        Assert.assertEquals(expectedRes, actualRes);
    }

    @Test
    public void testMultiplicity3(){

        int m = 14;
        String expectedRes = "-1";

        Multiplicity multiplicity = new Multiplicity();
        String actualRes = multiplicity.getMultiplicity(m);

        Assert.assertEquals(expectedRes, actualRes);
    }

}