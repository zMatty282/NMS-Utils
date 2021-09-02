package it.matty.nms;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public class NMSUtils extends JavaPlugin {
    @Getter private static NMSUtils instance;


    @Override
    public void onEnable() {
        instance = this;
    }
}
