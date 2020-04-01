package com.epam.EL;

import static org.junit.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.epam.EL.HCCELogging;

import org.junit.Test;

public class HCCELoggingTest 
{
    /**
     * Rigorous Test :-)
     */
	HCCELogging hc=new HCCELogging();
    @Test
    public void check_costs()
    {
        assertEquals(6494400.0,hc.cost("standard","no",5412),0.0);
        assertEquals(5034000.0,hc.cost("above standard","yes",3356),0.0);
        assertEquals(8136000.0,hc.cost("high standard","no",4520 ),0.0);
        assertEquals(1.13E7,hc.cost("high standard","yes",4520),0.0);
        assertEquals(0.0,hc.cost("any standard","no",5564),0.0);
    }
}
