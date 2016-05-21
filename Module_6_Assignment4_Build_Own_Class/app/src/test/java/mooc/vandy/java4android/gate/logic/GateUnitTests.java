package mooc.vandy.java4android.gate.logic;

import org.junit.Test;

import io.magnum.autograder.junit.Rubric;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class GateUnitTests {

    @Rubric(
            value="testGateConstructor",
            goal="The goal of this evaluation is to test GateConstructor",
            points=4.0,
            reference="This Test fails when: The Could not create Gate object"
    )
    @Test(timeout=100)
    public void testGateConstructor() {
        Gate testGate = new Gate();
        assertEquals(testGate.getClass().getSimpleName().toString(), "Gate");
    }

    @Rubric(
            value="testGateLocked",
            goal="The goal of this evaluation is to test GateLocked",
            points=3.0,
            reference="This Test fails when: The Gate not locked on create"
    )
    @Test(timeout=100)
    public void testGateLocked() {
        Gate testGate = new Gate();
        assertTrue(testGate.isLocked());
    }

    @Rubric(
            value="testOpenIn",
            goal="The goal of this evaluation is to test OpenIn",
            points=4.0,
            reference="This Test fails when: The Gate could not be set to IN"
    )
    @Test(timeout=100)
    public void testOpenIn() {
        Gate testGate = new Gate();
        testGate.open(Gate.IN);
        assertFalse(testGate.isLocked());
        assertEquals(testGate.getSwingDirection(), Gate.IN);
    }

    @Rubric(
            value="testCloseGate",
            goal="The goal of this evaluation is to test CloseGate",
            points=4.0,
            reference="This Test fails when: The Gate did not close properly"
    )
    @Test(timeout=100)
    public void testCloseGate() {
        Gate testGate = new Gate();
        testGate.close();
        assertTrue(testGate.isLocked());
    }

    @Rubric(
            value="testSetSwingIn",
            goal="The goal of this evaluation is to test SetSwingIn",
            points=3.0,
            reference="This Test fails when: The Gate could not be set to swing IN"
    )
    @Test(timeout=100)
    public void testSetSwingIn() {
        Gate testGate = new Gate();
        assertTrue(testGate.setSwing(Gate.IN));
    }

    @Rubric(
            value="testSetSwingOut",
            goal="The goal of this evaluation is to test SetSwingOut",
            points=3.0,
            reference="This Test fails when: The Gate could not be set to swing OUT"
    )
    @Test(timeout=100)
    public void testSetSwingOut() {
        Gate testGate = new Gate();
        assertTrue(testGate.setSwing(Gate.OUT));
    }

    @Rubric(
            value="testInvalidSwingParameter",
            goal="The goal of this evaluation is to test InvalidSwingParameter",
            points=4.0,
            reference="This Test fails when: The Gate was set to invalid number"
    )
    @Test(timeout=100)
    public void testInvalidSwingParameter() {
        Gate testGate = new Gate();
        assertFalse(testGate.setSwing(43));
    }

    @Rubric(
            value="testThruIn",
            goal="The goal of this evaluation is to test ThruIn",
            points=4.0,
            reference="This Test fails when: The gate allows thru() with IN"
    )
    @Test(timeout=100)
    public void testThruIn() {
        int cur = 10;
        Gate testGate = new Gate();
        testGate.open(Gate.OUT);
        cur += testGate.thru(3);
        assertEquals(cur, 7);
    }

    @Rubric(
            value="testThruOut",
            goal="The goal of this evaluation is to test ThruOut",
            points=4.0,
            reference="This Test fails when: The gate allows thru() with OUT"
    )
    @Test(timeout=100)
    public void testThruOut() {
        int cur = 10;
        Gate testGate = new Gate();
        testGate.open(Gate.IN);
        cur += testGate.thru(8);
        assertEquals(cur, 18);
    }

    @Rubric(
            value="testThruWhenClosed",
            goal="The goal of this evaluation is to test ThruWhenClosed",
            points=4.0,
            reference="This Test fails when: The gate Allowed thru() when gate was closed"
    )
    @Test(timeout=100)
    public void testThruWhenClosed() {
        Gate testGate = new Gate();
        testGate.close();
        int cur = 10;
        cur += testGate.thru(4);
        assertEquals(cur, 10);
    }

    @Rubric(
            value="testGateToString",
            goal="The goal of this evaluation is to test GateToString",
            points=3.0,
            reference="This Test fails when: The method toString() is not created properly"
    )
    @Test(timeout=100)
    public void testGateToString() {
        Gate testGate = new Gate();
        testGate.close();
        assertEquals(testGate.toString(), "This gate is locked");
    }
}
