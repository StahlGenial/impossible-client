package me.alpha432.oyvey.features.modules.movement;

import me.alpha432.oyvey.features.modules.Module;

public class Sprint extends Module {
    public Sprint() {
        super("Sprint", "", Category.MOVEMENT);
    }
    @Override public void onTick() {
        if (!mc.player.isSprinting() && !mc.player.isUsingItem() && !mc.player.isMovingSlowly() && mc.options.keyUp.isDown()) {
            mc.player.setSprinting(true);
        }
    }
}
