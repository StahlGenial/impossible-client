package me.alpha432.oyvey.features.modules.movement;

import me.alpha432.oyvey.event.system.Subscribe;
import me.alpha432.oyvey.features.modules.Module;
import me.alpha432.oyvey.util.MathUtil;

public class Flight extends Module {
    public Flight() {
        super("Flight", "", Category.MOVEMENT);
    }

    @Subscribe
    public void onTick() {
        if (mc.options.keyJump.isDown()) {
            mc.player.setDeltaMovement(mc.player.getDeltaMovement().x,1, mc.player.getDeltaMovement().z);
        } else if (mc.options.keyShift.isDown()) {
            mc.player.setDeltaMovement(mc.player.getDeltaMovement().x, -1, mc.player.getDeltaMovement().z);
        } else {
            mc.player.setDeltaMovement(mc.player.getDeltaMovement().x, -1, mc.player.getDeltaMovement().z);
        }
        double speed[] = MathUtil.directionSpeed(1);
        mc.player.setDeltaMovement(speed[0], mc.player.getDeltaMovement().y, speed[1]);
    }
}

