package PartII;

import junit.framework.TestCase;
import w16cs350.datatype.Angle;

public class JUnitTestAngle extends TestCase
{

    public void testAdding()
    {
        Angle res = Angle.ANGLE_045.add(Angle.ANGLE_090);
        assertEquals(Angle.ANGLE_135.getValue(), res.getValue());

        res = Angle.ANGLE_315.add(Angle.ANGLE_225);
        assertEquals(Angle.ANGLE_180.getValue(), res.getValue());

    }

    public void testSubtracting()
    {
        Angle res = Angle.ANGLE_045.subtract(Angle.ANGLE_090);
        assertEquals(Angle.ANGLE_315.getValue(), res.getValue());

        res = Angle.ANGLE_315.subtract(Angle.ANGLE_225);
        assertEquals(Angle.ANGLE_090.getValue(), res.getValue());
    }


}