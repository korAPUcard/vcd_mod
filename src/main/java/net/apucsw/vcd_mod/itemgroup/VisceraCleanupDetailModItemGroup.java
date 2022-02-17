
package net.apucsw.vcd_mod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

import net.apucsw.vcd_mod.VcdModModElements;

@VcdModModElements.ModElement.Tag
public class VisceraCleanupDetailModItemGroup extends VcdModModElements.ModElement {
	public VisceraCleanupDetailModItemGroup(VcdModModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabviscera_cleanup_detail_mod") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Blocks.REDSTONE_WIRE);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
