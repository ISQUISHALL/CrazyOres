package crazyores.packs.core.render;

import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import crazyores.packs.core.entity.EntityZectiumCore;
import crazyores.packs.core.entity.tileentity.TileEntityTapaziteCrystal;
import crazyores.packs.core.item.CoreItems;

public class CoreRenderRegistry {

	public static void renderCoreEntities() {
		RenderingRegistry.registerEntityRenderingHandler(EntityZectiumCore.class, new RenderSnowball(CoreItems.zectiumCore));
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTapaziteCrystal.class, new RenderTapaziteCrystal());
	}
}
