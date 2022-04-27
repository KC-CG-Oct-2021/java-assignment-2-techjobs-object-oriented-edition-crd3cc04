package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId(){
        Job testJob1 = new Job();
        Job testJob2 = new Job();
        assertEquals(testJob1.getId(), testJob2.getId(), 1);
        assertNotEquals(testJob1.getId(), testJob2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){ //test to see if all 6 fields are in the Job object and that they have been give their own unique id
       Job testJob3 = new Job("Product tester", new Employer("ACE"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob3.getName() instanceof String);
        assertTrue(testJob3.getEmployer() instanceof Employer);
        assertTrue(testJob3.getLocation() instanceof Location);
        assertTrue(testJob3.getPositionType() instanceof PositionType);
        assertTrue(testJob3.getCoreCompetency() instanceof CoreCompetency);

        // considers equal if they have the same id value; considers not equal if they don't have the same id value
        assertEquals("Product Tester", testJob3.getName());
        assertEquals("ACME", testJob3.getEmployer());
        assertEquals("Desert", testJob3.getLocation());
        assertEquals("Quality control", testJob3.getPositionType());
        assertEquals("Persistence", testJob3.getCoreCompetency());


    }

}
