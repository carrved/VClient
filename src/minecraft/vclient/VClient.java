package vclient;

import org.lwjgl.opengl.Display;

import net.minecraft.client.Minecraft;
import vclient.event.EventManager;
import vclient.event.EventTarget;
import vclient.event.impl.ClientTick;
import vclient.hud.HUDConfigScreen;
import vclient.hud.mod.HudManager;
import vclient.mod.ModManager;
import vclient.ui.clickgui.ClickGUI;
import vclient.util.SessionChanger;

public class VClient {
	
	public String NAME = "Vex Client", VERSION = "DEV", AUTHOR = "Zaxify", NAMEVER = NAME+ " " + VERSION;
	public String DISCORDURL = "DISCORD: dsc.gg/javacraft";
	public String YTURL = "YOUTUBE : bit.ly/2VJjMqA";
	public String DISCORDS = "SUPPORT: zaxify#1234 ON DISCORD";
	public static VClient INSTANCE = new VClient();
	public Minecraft mc = Minecraft.getMinecraft();
	
	public EventManager eventManager;
	public ModManager modManager;
	public HudManager hudManager;
	
	public void startup() {
		eventManager = new EventManager();
		modManager = new ModManager();
		hudManager = new HudManager();
		
		SessionChanger.getInstance().setUserOffline("_everythingg");
		
		Display.setTitle(NAMEVER);
		
		System.out.println("Starting " + NAMEVER + " by " + AUTHOR);
		
		eventManager.register(this);
	}
		
	public void shutdown() {
		System.out.println("Shutting down " + NAMEVER);
		
		eventManager.unregister(this);
	}
	
	@EventTarget
	public void onTick(ClientTick event) {
		if(mc.gameSettings.TEST_MOD.isPressed()) {
			modManager.testMod.toggle();
		}
		if(mc.gameSettings.keyBindSprint.isPressed()) {
			modManager.toggleSprint.toggle();
		}
		if(mc.gameSettings.HUD_CONFIG.isPressed()) {
			mc.displayGuiScreen(new HUDConfigScreen());
		}
		if(mc.gameSettings.CLICK_GUI.isPressed()) {
			mc.displayGuiScreen(new ClickGUI());
		}
	}
	
}