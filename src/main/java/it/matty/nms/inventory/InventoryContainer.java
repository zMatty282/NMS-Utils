package it.matty.nms.inventory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.minecraft.world.inventory.Containers;

@AllArgsConstructor @Getter
public enum InventoryContainer {
    GENERIC_9X1(Containers.a),
    GENERIC_9X2(Containers.b),
    GENERIC_9X3(Containers.c),
    GENERIC_9X4(Containers.d),
    GENERIC_9X5(Containers.e),
    GENERIC_9X6(Containers.f),
    DISPENSER(Containers.g),
    ANVIL(Containers.h),
    BEACON(Containers.i),
    BLAST_FURNACE(Containers.j),
    BREWING_STAND(Containers.k),
    WORKBENCH(Containers.l),
    ENCHANTING_TABLE(Containers.m),
    FURNACE(Containers.n),
    GRINDSTONE(Containers.o),
    HOPPER(Containers.p);


    private final Containers type;
}
