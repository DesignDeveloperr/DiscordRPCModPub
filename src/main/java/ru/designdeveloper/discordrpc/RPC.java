package ru.designdeveloper.discordrpc;

import net.arikia.dev.drpc.DiscordEventHandlers;
import net.arikia.dev.drpc.DiscordRPC;
import net.arikia.dev.drpc.DiscordRichPresence;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.Display;

public class RPC {

    private static final String client_id = "706048306018517023";

    public static void init() {
        final DiscordEventHandlers handlers = new DiscordEventHandlers();
        DiscordRPC.discordInitialize(client_id, handlers, true);
        Display.setTitle("StonksCraft | " + Minecraft.getMinecraft().mcDataDir.getName());
    }

    public static void loadingPresence() {
        final DiscordRichPresence rich = new DiscordRichPresence();
        rich.details = "\u0417\u0430\u0433\u0440\u0443\u0437\u043A\u0430...";
        rich.largeImageKey = "logo";
        rich.largeImageText = "StonksCraft.ru";
        DiscordRPC.discordUpdatePresence(rich);
    }

    public static void loadedPresence() {
        final Minecraft mc = Minecraft.getMinecraft();
        final DiscordRichPresence rich = new DiscordRichPresence();
        rich.details = mc.mcDataDir.getName() + " | " + mc.getSession().getUsername();
        rich.startTimestamp = System.currentTimeMillis() / 1000L;
        rich.largeImageKey = "logo";
        rich.largeImageText = "StonksCraft.ru";
        DiscordRPC.discordUpdatePresence(rich);
    }

}
