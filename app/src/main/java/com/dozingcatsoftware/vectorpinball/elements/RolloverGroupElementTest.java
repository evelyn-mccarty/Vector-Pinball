package com.dozingcatsoftware.vectorpinball.elements;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.dozingcatsoftware.vectorpinball.model.*;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/*class RolloverGroupElementTest {

    @Test
    void testRolloverActivationAndDeactivation() {
        RolloverGroupElement rolloverGroup = createTestRolloverGroup(3);

        Field field = createMockField();
        Ball ball = createMockBall(new Vector2(0, 0));

        assertFalse(rolloverGroup.allRolloversActive());

        rolloverGroup.activateFirstUnactivatedRollover();
        assertTrue(rolloverGroup.isRolloverActiveAtIndex(0));
        assertFalse(rolloverGroup.isRolloverActiveAtIndex(1));
        assertFalse(rolloverGroup.isRolloverActiveAtIndex(2));

        rolloverGroup.activateFirstUnactivatedRollover();
        assertTrue(rolloverGroup.isRolloverActiveAtIndex(0));
        assertTrue(rolloverGroup.isRolloverActiveAtIndex(1));
        assertFalse(rolloverGroup.isRolloverActiveAtIndex(2));

        rolloverGroup.activateFirstUnactivatedRollover();
        assertTrue(rolloverGroup.isRolloverActiveAtIndex(0));
        assertTrue(rolloverGroup.isRolloverActiveAtIndex(1));
        assertTrue(rolloverGroup.isRolloverActiveAtIndex(2));

        rolloverGroup.setRolloverActiveAtIndex(1, false);
        assertTrue(rolloverGroup.isRolloverActiveAtIndex(0));
        assertFalse(rolloverGroup.isRolloverActiveAtIndex(1));
        assertTrue(rolloverGroup.isRolloverActiveAtIndex(2));
    }

    @Test
    void testRolloverGroupCycle() {
        RolloverGroupElement rolloverGroup = createTestRolloverGroup(4);

        Field field = createMockField();
        Ball ball = createMockBall(new Vector2(0, 0));

        rolloverGroup.setRolloverActiveAtIndex(0, true);
        rolloverGroup.setRolloverActiveAtIndex(1, true);

        rolloverGroup.cycleRollovers(true);
        assertFalse(rolloverGroup.isRolloverActiveAtIndex(0));
        assertFalse(rolloverGroup.isRolloverActiveAtIndex(1));
        assertTrue(rolloverGroup.isRolloverActiveAtIndex(2));
        assertTrue(rolloverGroup.isRolloverActiveAtIndex(3));

        rolloverGroup.cycleRollovers(false);
        assertTrue(rolloverGroup.isRolloverActiveAtIndex(0));
        assertTrue(rolloverGroup.isRolloverActiveAtIndex(1));
        assertFalse(rolloverGroup.isRolloverActiveAtIndex(2));
        assertFalse(rolloverGroup.isRolloverActiveAtIndex(3));
    }

    @Test
    void testRolloverVisibility() {
        RolloverGroupElement rolloverGroup = createTestRolloverGroup(2);

        Field field = createMockField();
        Ball ball = createMockBall(new Vector2(0, 0));

        assertTrue(rolloverGroup.getVisible());

        rolloverGroup.setVisible(false);
        assertFalse(rolloverGroup.getVisible());

        rolloverGroup.activateFirstUnactivatedRollover();
        assertTrue(rolloverGroup.isRolloverActiveAtIndex(0));
        assertFalse(rolloverGroup.isRolloverActiveAtIndex(1));

        rolloverGroup.setVisible(true);
        assertTrue(rolloverGroup.getVisible());

        assertTrue(rolloverGroup.isRolloverActiveAtIndex(0));
        assertFalse(rolloverGroup.isRolloverActiveAtIndex(1));
    }

    private RolloverGroupElement createTestRolloverGroup(int numRollovers) {
        RolloverGroupElement rolloverGroup = new RolloverGroupElement();
        rolloverGroup.finishCreateElement(Collections.emptyMap(), null);

        for (int i = 0; i < numRollovers; i++) {
            Rollover rollover = new Rollover();
            rollover.position = new Vector2(i * 2, 0);
            rollover.radius = 1.0f;
            rolloverGroup.rollovers.add(rollover);
        }

        return rolloverGroup;
    }

}
*/