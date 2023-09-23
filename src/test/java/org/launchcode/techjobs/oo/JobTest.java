package org.launchcode.techjobs.oo;

import org.junit.Test;

import javax.naming.Name;


import static org.junit.Assert.*;

public class JobTest {


    @Test
    public void testSettingJobId() {
      Job newJob = new Job();
      Job alsoNewJob = new Job();
      assertNotEquals(newJob.getId(), alsoNewJob.getId(), .001);
    }

   @Test
    public void testJobConstructorSetsAllFields() {
       Job tester = new Job("Product tester", new Employer ("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(tester.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(tester.getName(), "Product tester");
        assertTrue(tester.getEmployer() instanceof Employer);
        assertEquals(tester.getEmployer(), "ACME");
        assertTrue(tester.getLocation() instanceof Location);
        assertEquals(tester.getLocation(), "Desert");
        assertTrue(tester.getPositionType() instanceof PositionType);
        assertEquals(tester.getPositionType(), "Quality control");
        assertTrue(tester.getId() != 0);
        assertEquals(tester.getCoreCompetency(), "Persistence");

        
    }


    @Test
    public void testJobsForEquality() {
        Job jobby = new Job("Product tester", new Employer("ACME"),new Location("St. Louis"), new PositionType("QC"), new CoreCompetency("Persistance"));
        Job jobish = new Job("Product tester", new Employer("ACME"),new Location("St. Louis"), new PositionType("QC"), new CoreCompetency("Persistance"));
        assertNotEquals(jobby.getId(), jobish.getId(), .001);
    }

    /*@Test
    public void testToStringStartsAndEndsWithNewLine() {

    }
*/
}