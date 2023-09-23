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
       assertNotNull(tester.getCoreCompetency());
        assertEquals(tester.getName(), "Product tester");
       assertNotNull(tester.getEmployer());
        assertEquals(tester.getEmployer().getValue(), "ACME");
       assertNotNull(tester.getLocation());
        assertEquals(tester.getLocation().getValue(), "Desert");
       assertNotNull(tester.getPositionType());
        assertEquals(tester.getPositionType().getValue(), "Quality control");
        assertTrue(tester.getId() != 0);
        assertEquals(tester.getCoreCompetency().getValue(), "Persistence");

        
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