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
       Job tester = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(tester.getName() != null);
        assertEquals(tester.getName(), "Product tester");
    }
}