package org.launchcode.techjobs.oo.test;

import com.sun.jdi.Locatable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import javax.naming.Name;
import javax.print.attribute.standard.JobName;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job testJob1 = new Job();
        Job testJob2 = new Job();
        assertNotEquals(testJob1.getId(),testJob2.getId());
    }//testSettingJobId

    @Test
    public void testJobConstructorSetsAllFields(){
        Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob3.getName() instanceof String);
        assertTrue(testJob3.getEmployer() instanceof Employer);
        assertTrue(testJob3.getLocation() instanceof Location);
        assertTrue(testJob3.getPositionType() instanceof PositionType);
        assertTrue(testJob3.getCoreCompetency() instanceof CoreCompetency);

        assertEquals(testJob3.getName(),"Product tester");
        assertEquals(testJob3.getEmployer().getValue(),"ACME");
        assertEquals(testJob3.getLocation().getValue(),"Desert");
        assertEquals(testJob3.getPositionType().getValue(),"Quality control" );
        assertEquals(testJob3.getCoreCompetency().getValue(), "Persistence");

    }//testJobConstructorSetsAllFields

    @Test
    public void testJobsForEquality(){
        Job testJob4 = new Job();
        Job testJob5 = new Job();

        System.out.println(testJob4.equals(testJob5));
    }//testJobsForEquality

}//public class


