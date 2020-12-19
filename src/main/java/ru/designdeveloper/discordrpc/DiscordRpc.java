package ru.designdeveloper.discordrpc;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLConstructionEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = DiscordRpc.MOD_ID, version = DiscordRpc.MOD_VERSION, name = DiscordRpc.MOD_NAME)
public class DiscordRpc {

    public static final String MOD_ID = "discordrpcmod";
    public static final String MOD_VERSION = "GRADLEMODVERSION";
    public static final String MOD_NAME = "Discord RPC";

    @SidedProxy(clientSide = "ru.designdeveloper.discordrpc.ClientProxy", serverSide = "ru.designdeveloper.discordrpc.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void onConstruction(FMLConstructionEvent event) {
        proxy.onConstruction(event);
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

}
