package it.matty.nms.inventory;

import it.matty.nms.NMSUtils;
import lombok.experimental.UtilityClass;
import net.minecraft.network.chat.ChatComponentText;
import net.minecraft.network.protocol.game.PacketPlayOutOpenWindow;
import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_17_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

@UtilityClass
public class InventoryPacket {

    public void editTitle(Player player, InventoryContainer container, String newTitle) {
        PacketPlayOutOpenWindow packet = new PacketPlayOutOpenWindow(
                ((CraftPlayer) player).getHandle().bU.getStateId(),
                container.getType(),
                new ChatComponentText(newTitle));
        ((CraftPlayer) player).getHandle().b.sendPacket(packet);
    }

    public void editTitle(Player player, InventoryContainer container, int tick, String newTitle) {
        Bukkit.getScheduler().runTaskLaterAsynchronously(NMSUtils.getInstance(), () -> {
            PacketPlayOutOpenWindow packet = new PacketPlayOutOpenWindow(
                    ((CraftPlayer) player).getHandle().bU.getStateId(),
                    container.getType(),
                    new ChatComponentText(newTitle));
            ((CraftPlayer) player).getHandle().b.sendPacket(packet);
        }, tick);
    }
}
