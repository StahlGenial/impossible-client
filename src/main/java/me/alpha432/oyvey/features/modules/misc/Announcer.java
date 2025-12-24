package me.alpha432.oyvey.features.modules.misc;

import me.alpha432.oyvey.event.system.Subscribe;
import me.alpha432.oyvey.features.modules.Module;
import me.alpha432.oyvey.util.models.Timer;

// TODO: улучшить

public class Announcer extends Module {
    Timer timer = new Timer();
    public Announcer() {
        super("Announcer", "", Category.MISC);
    }
    @Subscribe public void onTick() {
        if (timer.passedS(15)) {
            if (mc.player.isFallFlying()) {
                mc.getConnection().sendChat("Я лечу на элитрах с помощью Impossible Client!");
                timer.reset();
            }
        }
    }
}
