package com.dozingcatsoftware.vectorpinball.elements;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.physics.box2d.joints.RevoluteJoint;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class FlipperElementTest {

    @Test
    void testFlipperCreation() {
        World world = new World(new Vector2(0, -9.8f), true);
        FlipperElement flipper = new FlipperElement();
        flipper.finishCreateElement(createParams(), null);
        flipper.createBodies(world);

        assertNotNull(flipper.anchorBody);
        assertNotNull(flipper.flipperBody);
        assertNotNull(flipper.joint);
        assertEquals(0, flipper.getEffectiveMotorSpeed());
    }

    @Test
    void testFlipperEngagement() {
        FlipperElement flipper = createInitializedFlipper();

        assertFalse(flipper.isFlipperEngaged());
        flipper.setFlipperEngaged(true);
        assertTrue(flipper.isFlipperEngaged());
        flipper.setFlipperEngaged(false);
        assertFalse(flipper.isFlipperEngaged());
    }

    @Test
    void testFlipperMovement() {
        FlipperElement flipper = createInitializedFlipper();
        float initialAngle = flipper.joint.getJointAngle();

        flipper.setFlipperEngaged(true);
        flipper.tick(null, 1000000000L);

        assertTrue(flipper.getEffectiveMotorSpeed() > 0);
        assertTrue(flipper.joint.getJointAngle() > initialAngle);

        flipper.setFlipperEngaged(false);
        flipper.tick(null, 1000000000L);

        assertTrue(flipper.getEffectiveMotorSpeed() < 0);
        assertTrue(flipper.joint.getJointAngle() < initialAngle);
    }



    private FlipperElement createInitializedFlipper() {
        FlipperElement flipper = new FlipperElement();
        flipper.finishCreateElement(createParams(), null);
        flipper.createBodies(new World(new Vector2(0, -9.8f), true));
        return flipper;
    }

    private Map<String, Object> createParams() {
        Map<String, Object> params = new HashMap<>();
        params.put(FlipperElement.POSITION_PROPERTY, Arrays.asList(0.0, 0.0));
        params.put(FlipperElement.LENGTH_PROPERTY, 2.0);
        params.put(FlipperElement.MIN_ANGLE_PROPERTY, -20.0);
        params.put(FlipperElement.MAX_ANGLE_PROPERTY, 20.0);
        params.put(FlipperElement.UP_SPEED_PROPERTY, 7.0);
        params.put(FlipperElement.DOWN_SPEED_PROPERTY, 3.0);
        return params;
    }


}