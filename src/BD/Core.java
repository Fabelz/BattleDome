package BD;

import BD.GameStates.States;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * placeholder
 */
public class Core extends JavaPlugin {

    private static int ticks = 0;
    private static States states;

    public static States getState() {
        return states;
    }

    public static void setState(States states) {
        Core.states = states;
    }

    public static int getTicks() {
        return ticks;
    }

    public static void setTicks(int ticks) {
        Core.ticks = ticks;
    }

    private static Core instance;

    public static Core getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        ticks = 0;
        states = States.LOBBY;

    }

    @Override
    public void onDisable() {

    }
}
