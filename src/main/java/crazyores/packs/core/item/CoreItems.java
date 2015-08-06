package crazyores.packs.core.item;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.ReflectionHelper;
import crazyores.manager.tabs.COTabList;
import crazyores.packs.core.util.CoreHarvestLevels;

public class CoreItems {
	
	//Overworld ore drops
	public static Item copperIngot;
	
	public static Item meteoriteCoal;
	public static Item meteoriteGem;
	
	public static Item adamiteShard;
	public static Item sapphireGem;
	public static Item rubyGem;
	
	public static Item foolsRubyGem;
	public static Item foolsRubyMush;
	
	public static Item zectiumIngot;
	public static Item tapaziteObelisk;
	public static Item tapaziteDust;
	public static Item osmoniumIngot;
	public static Item starconiumShard;
	public static Item experiumOrb;
	
	//Nether ore drops
	public static Item demoniteOrb;
	public static Item invisiumIngot;
	
	//TODO: Should be in the decorations pack
	public static Item darkstoneIngot;
	public static Item whiteLuminiteCrystal;
	
	//Ender ore drops
	public static Item enderGem;
	public static Item ultraGem;
	
	//Items
	public static Item zectiumCore;
	public static Item invisiumWand;
	
	//Pickaxes
	public static Item copperPickaxe;
	public static Item meteoritePickaxe;
	public static Item adamitePickaxe;
	public static Item sapphirePickaxe;
	public static Item rubyPickaxe;
	public static Item zectiumPickaxe;
	public static Item tapazitePickaxe;
	public static Item osmoniumPickaxe;
	public static Item starconiumPickaxe;
	public static Item invisiumPickaxe;
	public static Item enderPickaxe;
	
	/** Axe List **/
	public static Item copperAxe;
	public static Item meteoriteAxe;
	public static Item adamiteAxe;
	public static Item sapphireAxe;
	public static Item rubyAxe;
	public static Item zectiumAxe;
	public static Item tapaziteAxe;
	public static Item osmoniumAxe;
	public static Item starconiumAxe;
	public static Item invisiumAxe;
	public static Item enderAxe;

	/** Shovel List **/
 	public static Item copperShovel;
	public static Item meteoriteShovel;
	public static Item adamiteShovel;
	public static Item sapphireShovel;
	public static Item rubyShovel;
	public static Item zectiumShovel;
	public static Item tapaziteShovel;
	public static Item osmoniumShovel;
	public static Item starconiumShovel;
	public static Item invisiumShovel;
	public static Item enderShovel;

	/** Sword List **/
	public static Item meteoriteSword;
	public static Item copperSword;
	public static Item sapphireSword;
	public static Item adamiteSword;
	public static Item rubySword;
	public static Item zectiumSword;
	public static Item tapaziteSword;
	public static Item osmoniumSword;
	public static Item starconiumSword;
	public static Item invisiumSword;
	public static Item enderSword;
	
	/** Hoe List **/
	public static Item meteoriteHoe;
	public static Item copperHoe;
	public static Item sapphireHoe;
	public static Item adamiteHoe;
	public static Item rubyHoe;
	public static Item zectiumHoe;
	public static Item tapaziteHoe;
	public static Item osmoniumHoe;
	public static Item starconiumHoe;
	public static Item invisiumHoe;
	public static Item enderHoe;
	
	/** Hammer List **/
/*
	public static Item starconiumSledgehammer;
*/
	
	/** Helmet List **/

	public static Item copperHelmet;
	public static Item sapphireHelmet;
	public static Item adamiteHelmet;
	public static Item meteoriteHelmet;
	public static Item rubyHelmet;
	public static Item zectiumHelmet;
	public static Item tapaziteHelmet;
	public static Item osmoniumHelmet;
	public static Item starconiumHelmet;
	public static Item invisiumHelmet;
	public static Item enderHelmet;

	
	/** Chestplate List **/

	public static Item copperChestplate;
	public static Item sapphireChestplate;
	public static Item adamiteChestplate;
	public static Item meteoriteChestplate;
	public static Item rubyChestplate;
	public static Item zectiumChestplate;
	public static Item tapaziteChestplate;
	public static Item osmoniumChestplate;
	public static Item starconiumChestplate;
	public static Item invisiumChestplate;
	public static Item enderChestplate;

	
	/** Legging List **/

	public static Item copperLeggings;
	public static Item sapphireLeggings;
	public static Item adamiteLeggings;
	public static Item meteoriteLeggings;
	public static Item rubyLeggings;
	public static Item zectiumLeggings;
	public static Item tapaziteLeggings;
	public static Item osmoniumLeggings;
	public static Item starconiumLeggings;
	public static Item invisiumLeggings;
	public static Item enderLeggings;

	
	/** Boot List **/

	public static Item copperBoots;	
	public static Item sapphireBoots;
	public static Item adamiteBoots;
	public static Item meteoriteBoots;
	public static Item rubyBoots;
	public static Item zectiumBoots;
	public static Item tapaziteBoots;
	public static Item osmoniumBoots;
	public static Item starconiumBoots;
	public static Item invisiumBoots;
	public static Item enderBoots;

	
	/** Bucket List **/
/*
	public static Item copperBucketEmpty;
	public static Item copperBucketWater;
	public static Item copperBucketLava;
*/
	
	/** Items List **/
/*
	public static Item starconiumShard;
*/	
	
	/** Rod List **/
/*
	public static Item copperRod;
	public static Item sapphireRod;
	public static Item adamiteRod;
	public static Item meteoriteRod;
	public static Item rubyRod;
	public static Item zectiumRod;
	public static Item tapaziteRod;
	public static Item osmoniumRod;
	public static Item starconiumRod;
	public static Item invisiumRod;
	public static Item enderRod;
*/
	
	/** Bow List **/
/*
	public static Item meteoriteBow;
	public static Item copperBow;
	public static Item invisiumBow;
	public static Item sapphireBow;
	public static Item adamiteBow;
	public static Item rubyBow;
	public static Item zectiumBow;
	public static Item tapaziteBow;
	public static Item osmoniumBow;
	public static Item enderBow;
	public static Item starconiumBow;
*/	
	
	/** Arrow List **/
/*
	public static Item meteoriteArrow;
	public static Item copperArrow;
	public static Item invisiumArrow;
	public static Item sapphireArrow;
	public static Item adamiteArrow;
	public static Item rubyArrow;
	public static Item zectiumArrow;
	public static Item tapaziteArrow;
	public static Item osmoniumArrow;
	public static Item enderArrow;
	public static Item starconiumArrow;
*/

	public static void initItems() {
		initOreDrops();
		initTools();
		initArmor();
		
		//Items
		zectiumCore = new ItemZectiumCore("zectium_core", COTabList.crazyOresItemsTab, 16); registerItem(zectiumCore);
		
		invisiumWand = new CoreWand("invisium_wand", CoreHarvestLevels.INVISIUM); registerItem(invisiumWand);
	}
	
	private static void initOreDrops() {
		//Overworld ore drops
		copperIngot = new CoreItem("copper_ingot", COTabList.crazyOresItemsTab); registerItem(copperIngot);
		meteoriteCoal = new CoreItem("meteorite_coal", COTabList.crazyOresItemsTab); registerItem(meteoriteCoal);
		meteoriteGem = new CoreItem("meteorite_gem", COTabList.crazyOresItemsTab); registerItem(meteoriteGem);
		adamiteShard = new CoreItem("adamite_shard", COTabList.crazyOresItemsTab); registerItem(adamiteShard);
		sapphireGem = new CoreItem("sapphire_gem", COTabList.crazyOresItemsTab); registerItem(sapphireGem);
		rubyGem = new CoreItem("ruby_gem", COTabList.crazyOresItemsTab); registerItem(rubyGem);
		foolsRubyGem = new CoreItem("fools_ruby_gem", COTabList.crazyOresItemsTab); registerItem(foolsRubyGem);
		foolsRubyMush = new CoreItem("fools_ruby_mush", COTabList.crazyOresItemsTab); registerItem(foolsRubyMush);
		zectiumIngot = new CoreItem("zectium_ingot", COTabList.crazyOresItemsTab); registerItem(zectiumIngot);
		tapaziteObelisk = new ItemTapaziteObelisk("tapazite_obelisk", COTabList.crazyOresItemsTab); registerItem(tapaziteObelisk);
		/** TODO: ADD TEXTURE **/ tapaziteDust = new CoreItem("tapazite_dust", COTabList.crazyOresItemsTab); registerItem(tapaziteDust);
		osmoniumIngot = new CoreItem("osmonium_ingot", COTabList.crazyOresItemsTab); registerItem(osmoniumIngot);
		starconiumShard = new CoreItem("starconium_gem", COTabList.crazyOresItemsTab); registerItem(starconiumShard);
		experiumOrb = new CoreItem("experium_orb", COTabList.crazyOresItemsTab); registerItem(experiumOrb);
		
		//Nether ore drops
		demoniteOrb = new CoreItem("demonite_orb", COTabList.crazyOresItemsTab); registerItem(demoniteOrb);
		invisiumIngot = new CoreItem("invisium_ingot", COTabList.crazyOresItemsTab); registerItem(invisiumIngot);
		
		//Should be in the decorations pack
		darkstoneIngot = new CoreItem("darkstone_ingot", COTabList.crazyOresItemsTab); registerItem(darkstoneIngot);
		whiteLuminiteCrystal = new CoreItem("white_luminite_crystal", COTabList.crazyOresItemsTab); registerItem(whiteLuminiteCrystal);
		
		//Ender ore drops
		enderGem = new CoreItem("ender_gem", COTabList.crazyOresItemsTab); registerItem(enderGem);
		ultraGem = new CoreItem("ultra_gem", COTabList.crazyOresItemsTab); registerItem(ultraGem);
	}
	
	private static void initTools() {
		
		copperPickaxe = new CorePickaxe("copper_pickaxe", CoreHarvestLevels.COPPER); registerItem(copperPickaxe);
		copperAxe = new CoreAxe("copper_axe", CoreHarvestLevels.COPPER); registerItem(copperAxe);
		copperShovel = new CoreShovel("copper_shovel", CoreHarvestLevels.COPPER); registerItem(copperShovel);
		copperSword = new CoreSword("copper_sword", CoreHarvestLevels.COPPER); registerItem(copperSword);
		copperHoe = new CoreHoe("copper_hoe", CoreHarvestLevels.COPPER); registerItem(copperHoe);
		
		meteoritePickaxe = new CorePickaxe("meteorite_pickaxe", CoreHarvestLevels.METEORITE); registerItem(meteoritePickaxe);
		meteoriteAxe = new CoreAxe("meteorite_axe", CoreHarvestLevels.METEORITE); registerItem(meteoriteAxe);
		meteoriteShovel = new CoreShovel("meteorite_shovel", CoreHarvestLevels.METEORITE); registerItem(meteoriteShovel);
		meteoriteSword = new CoreSword("meteorite_sword", CoreHarvestLevels.METEORITE); registerItem(meteoriteSword);
		meteoriteHoe = new CoreHoe("meteorite_hoe", CoreHarvestLevels.METEORITE); registerItem(meteoriteHoe);
		
		adamitePickaxe = new CorePickaxe("adamite_pickaxe", CoreHarvestLevels.ADAMITE); registerItem(adamitePickaxe);
		adamiteAxe = new CoreAxe("adamite_axe", CoreHarvestLevels.ADAMITE); registerItem(adamiteAxe);
		adamiteShovel = new CoreShovel("adamite_shovel", CoreHarvestLevels.ADAMITE); registerItem(adamiteShovel);
		adamiteSword = new CoreSword("adamite_sword", CoreHarvestLevels.ADAMITE); registerItem(adamiteSword);
		adamiteHoe = new CoreHoe("adamite_hoe", CoreHarvestLevels.ADAMITE); registerItem(adamiteHoe);
		
		sapphirePickaxe = new CorePickaxe("sapphire_pickaxe", CoreHarvestLevels.SAPPHIRE); registerItem(sapphirePickaxe);
		sapphireAxe = new CoreAxe("sapphire_axe", CoreHarvestLevels.SAPPHIRE); registerItem(sapphireAxe);
		sapphireShovel = new CoreShovel("sapphire_shovel", CoreHarvestLevels.SAPPHIRE); registerItem(sapphireShovel);
		sapphireSword = new CoreSword("sapphire_sword", CoreHarvestLevels.SAPPHIRE); registerItem(sapphireSword);
		sapphireHoe = new CoreHoe("sapphire_hoe", CoreHarvestLevels.SAPPHIRE); registerItem(sapphireHoe);
		
		rubyPickaxe = new CorePickaxe("ruby_pickaxe", CoreHarvestLevels.RUBY); registerItem(rubyPickaxe);
		rubyAxe = new CoreAxe("ruby_axe", CoreHarvestLevels.RUBY); registerItem(rubyAxe);
		rubyShovel = new CoreShovel("ruby_shovel", CoreHarvestLevels.RUBY); registerItem(rubyShovel);
		rubySword = new CoreSword("ruby_sword", CoreHarvestLevels.RUBY); registerItem(rubySword);
		rubyHoe = new CoreHoe("ruby_hoe", CoreHarvestLevels.RUBY); registerItem(rubyHoe);
		
		zectiumPickaxe = new CorePickaxe("zectium_pickaxe", CoreHarvestLevels.ZECTIUM); registerItem(zectiumPickaxe);
		zectiumAxe = new CoreAxe("zectium_axe", CoreHarvestLevels.ZECTIUM); registerItem(zectiumAxe);
		zectiumShovel = new CoreShovel("zectium_shovel", CoreHarvestLevels.ZECTIUM); registerItem(zectiumShovel);
		zectiumSword = new CoreSword("zectium_sword", CoreHarvestLevels.ZECTIUM); registerItem(zectiumSword);
		zectiumHoe = new CoreHoe("zectium_hoe", CoreHarvestLevels.ZECTIUM); registerItem(zectiumHoe);
		
		tapazitePickaxe = new CorePickaxe("tapazite_pickaxe", CoreHarvestLevels.TAPAZITE); registerItem(tapazitePickaxe);
		tapaziteAxe = new CoreAxe("tapazite_axe", CoreHarvestLevels.TAPAZITE); registerItem(tapaziteAxe);
		tapaziteShovel = new CoreShovel("tapazite_shovel", CoreHarvestLevels.TAPAZITE); registerItem(tapaziteShovel);
		tapaziteSword = new CoreSword("tapazite_sword", CoreHarvestLevels.TAPAZITE); registerItem(tapaziteSword);
		tapaziteHoe = new CoreHoe("tapazite_hoe", CoreHarvestLevels.TAPAZITE); registerItem(tapaziteHoe);
		
		osmoniumPickaxe = new CorePickaxe("osmonium_pickaxe", CoreHarvestLevels.OSMONIUM); registerItem(osmoniumPickaxe);
		osmoniumAxe = new CoreAxe("osmonium_axe", CoreHarvestLevels.OSMONIUM); registerItem(osmoniumAxe);
		osmoniumShovel = new CoreShovel("osmonium_shovel", CoreHarvestLevels.OSMONIUM); registerItem(osmoniumShovel);
		osmoniumSword = new CoreSword("osmonium_sword", CoreHarvestLevels.OSMONIUM); registerItem(osmoniumSword);
		osmoniumHoe = new CoreHoe("osmonium_hoe", CoreHarvestLevels.OSMONIUM); registerItem(osmoniumHoe);
		
		starconiumPickaxe = new CorePickaxe("starconium_pickaxe", CoreHarvestLevels.STARCONIUM); registerItem(starconiumPickaxe);
		starconiumAxe = new CoreAxe("starconium_axe", CoreHarvestLevels.STARCONIUM); registerItem(starconiumAxe);
		starconiumShovel = new CoreShovel("starconium_shovel", CoreHarvestLevels.STARCONIUM); registerItem(starconiumShovel);
		starconiumSword = new CoreSword("starconium_sword", CoreHarvestLevels.STARCONIUM); registerItem(starconiumSword);
		starconiumHoe = new CoreHoe("starconium_hoe", CoreHarvestLevels.STARCONIUM); registerItem(starconiumHoe);
		
		invisiumPickaxe = new CorePickaxe("invisium_pickaxe", CoreHarvestLevels.INVISIUM); registerItem(invisiumPickaxe);
		invisiumAxe = new CoreAxe("invisium_axe", CoreHarvestLevels.INVISIUM); registerItem(invisiumAxe);
		invisiumShovel = new CoreShovel("invisium_shovel", CoreHarvestLevels.INVISIUM); registerItem(invisiumShovel);
		invisiumSword = new CoreSword("invisium_sword", CoreHarvestLevels.INVISIUM); registerItem(invisiumSword);
		invisiumHoe = new CoreHoe("invisium_hoe", CoreHarvestLevels.INVISIUM); registerItem(invisiumHoe);
		
		enderPickaxe = new CorePickaxe("ender_pickaxe", CoreHarvestLevels.ENDER); registerItem(enderPickaxe);
		enderAxe = new CoreAxe("ender_axe", CoreHarvestLevels.ENDER); registerItem(enderAxe);
		enderShovel = new CoreShovel("ender_shovel", CoreHarvestLevels.ENDER); registerItem(enderShovel);
		enderSword = new CoreSword("ender_sword", CoreHarvestLevels.ENDER); registerItem(enderSword);
		enderHoe = new CoreHoe("ender_hoe", CoreHarvestLevels.ENDER); registerItem(enderHoe);
	}
	
	private static void initArmor() {
		
		copperHelmet = new CoreArmor("copper_helmet", CoreHarvestLevels.COPPER_ARMOR, 4, 0); registerItem(copperHelmet);
		copperChestplate = new CoreArmor("copper_chestplate", CoreHarvestLevels.COPPER_ARMOR, 4, 1); registerItem(copperChestplate);
		copperLeggings = new CoreArmor("copper_leggings", CoreHarvestLevels.COPPER_ARMOR, 4, 2); registerItem(copperLeggings);
		copperBoots = new CoreArmor("copper_boots", CoreHarvestLevels.COPPER_ARMOR, 4, 3); registerItem(copperBoots);
		
		meteoriteHelmet = new CoreArmor("meteorite_helmet", CoreHarvestLevels.METEORITE_ARMOR, 4, 0); registerItem(meteoriteHelmet);
		meteoriteChestplate = new CoreArmor("meteorite_chestplate", CoreHarvestLevels.METEORITE_ARMOR, 4, 1); registerItem(meteoriteChestplate);
		meteoriteLeggings = new CoreArmor("meteorite_leggings", CoreHarvestLevels.METEORITE_ARMOR, 4, 2); registerItem(meteoriteLeggings);
		meteoriteBoots = new CoreArmor("meteorite_boots", CoreHarvestLevels.METEORITE_ARMOR, 4, 3); registerItem(meteoriteBoots);
		
		adamiteHelmet = new CoreArmor("adamite_helmet", CoreHarvestLevels.ADAMITE_ARMOR, 4, 0); registerItem(adamiteHelmet);
		adamiteChestplate = new CoreArmor("adamite_chestplate", CoreHarvestLevels.ADAMITE_ARMOR, 4, 1); registerItem(adamiteChestplate);
		adamiteLeggings = new CoreArmor("adamite_leggings", CoreHarvestLevels.ADAMITE_ARMOR, 4, 2); registerItem(adamiteLeggings);
		adamiteBoots = new CoreArmor("adamite_boots", CoreHarvestLevels.ADAMITE_ARMOR, 4, 3); registerItem(adamiteBoots);
		
		sapphireHelmet = new CoreArmor("sapphire_helmet", CoreHarvestLevels.ADAMITE_ARMOR, 4, 0); registerItem(sapphireHelmet);
		sapphireChestplate = new CoreArmor("sapphire_chestplate", CoreHarvestLevels.ADAMITE_ARMOR, 4, 1); registerItem(sapphireChestplate);
		sapphireLeggings = new CoreArmor("sapphire_leggings", CoreHarvestLevels.ADAMITE_ARMOR, 4, 2); registerItem(sapphireLeggings);
		sapphireBoots = new CoreArmor("sapphire_boots", CoreHarvestLevels.ADAMITE_ARMOR, 4, 3); registerItem(sapphireBoots);
		
		rubyHelmet = new CoreArmor("ruby_helmet", CoreHarvestLevels.ADAMITE_ARMOR, 4, 0); registerItem(rubyHelmet);
		rubyChestplate = new CoreArmor("ruby_chestplate", CoreHarvestLevels.ADAMITE_ARMOR, 4, 1); registerItem(rubyChestplate);
		rubyLeggings = new CoreArmor("ruby_leggings", CoreHarvestLevels.ADAMITE_ARMOR, 4, 2); registerItem(rubyLeggings);
		rubyBoots = new CoreArmor("ruby_boots", CoreHarvestLevels.ADAMITE_ARMOR, 4, 3); registerItem(rubyBoots);
		
		zectiumHelmet = new CoreArmor("zectium_helmet", CoreHarvestLevels.ADAMITE_ARMOR, 4, 0); registerItem(zectiumHelmet);
		zectiumChestplate = new CoreArmor("zectium_chestplate", CoreHarvestLevels.ADAMITE_ARMOR, 4, 1); registerItem(zectiumChestplate);
		zectiumLeggings = new CoreArmor("zectium_leggings", CoreHarvestLevels.ADAMITE_ARMOR, 4, 2); registerItem(zectiumLeggings);
		zectiumBoots = new CoreArmor("zectium_boots", CoreHarvestLevels.ADAMITE_ARMOR, 4, 3); registerItem(zectiumBoots);
		
		tapaziteHelmet = new CoreArmor("tapazite_helmet", CoreHarvestLevels.ADAMITE_ARMOR, 4, 0); registerItem(tapaziteHelmet);
		tapaziteChestplate = new CoreArmor("tapazite_chestplate", CoreHarvestLevels.ADAMITE_ARMOR, 4, 1); registerItem(tapaziteChestplate);
		tapaziteLeggings = new CoreArmor("tapazite_leggings", CoreHarvestLevels.ADAMITE_ARMOR, 4, 2); registerItem(tapaziteLeggings);
		tapaziteBoots = new CoreArmor("tapazite_boots", CoreHarvestLevels.ADAMITE_ARMOR, 4, 3); registerItem(tapaziteBoots);
		
		osmoniumHelmet = new CoreArmor("osmonium_helmet", CoreHarvestLevels.ADAMITE_ARMOR, 4, 0); registerItem(osmoniumHelmet);
		osmoniumChestplate = new CoreArmor("osmonium_chestplate", CoreHarvestLevels.ADAMITE_ARMOR, 4, 1); registerItem(osmoniumChestplate);
		osmoniumLeggings = new CoreArmor("osmonium_leggings", CoreHarvestLevels.ADAMITE_ARMOR, 4, 2); registerItem(osmoniumLeggings);
		osmoniumBoots = new CoreArmor("osmonium_boots", CoreHarvestLevels.ADAMITE_ARMOR, 4, 3); registerItem(osmoniumBoots);
		
		starconiumHelmet = new CoreArmor("starconium_helmet", CoreHarvestLevels.ADAMITE_ARMOR, 4, 0); registerItem(starconiumHelmet);
		starconiumChestplate = new CoreArmor("starconium_chestplate", CoreHarvestLevels.ADAMITE_ARMOR, 4, 1); registerItem(starconiumChestplate);
		starconiumLeggings = new CoreArmor("starconium_leggings", CoreHarvestLevels.ADAMITE_ARMOR, 4, 2); registerItem(starconiumLeggings);
		starconiumBoots = new CoreArmor("starconium_boots", CoreHarvestLevels.ADAMITE_ARMOR, 4, 3); registerItem(starconiumBoots);
		
		invisiumHelmet = new CoreArmor("invisium_helmet", CoreHarvestLevels.ADAMITE_ARMOR, 4, 0); registerItem(invisiumHelmet);
		invisiumChestplate = new CoreArmor("invisium_chestplate", CoreHarvestLevels.ADAMITE_ARMOR, 4, 1); registerItem(invisiumChestplate);
		invisiumLeggings = new CoreArmor("invisium_leggings", CoreHarvestLevels.ADAMITE_ARMOR, 4, 2); registerItem(invisiumLeggings);
		invisiumBoots = new CoreArmor("invisium_boots", CoreHarvestLevels.ADAMITE_ARMOR, 4, 3); registerItem(invisiumBoots);
		
		enderHelmet = new CoreArmor("ender_helmet", CoreHarvestLevels.ADAMITE_ARMOR, 4, 0); registerItem(enderHelmet);
		enderChestplate = new CoreArmor("ender_chestplate", CoreHarvestLevels.ADAMITE_ARMOR, 4, 1); registerItem(enderChestplate);
		enderLeggings = new CoreArmor("ender_leggings", CoreHarvestLevels.ADAMITE_ARMOR, 4, 2); registerItem(enderLeggings);
		enderBoots = new CoreArmor("ender_boots", CoreHarvestLevels.ADAMITE_ARMOR, 4, 3); registerItem(enderBoots);
	}
	
	private static void registerItem(Item item) {
		GameRegistry.registerItem(item, item.getUnlocalizedName());
	}
}
