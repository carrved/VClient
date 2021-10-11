package net.minecraft.client.gui;

import java.io.IOException;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.GameSettings;
import optifine.Config;
import optifine.GuiAnimationSettingsOF;
import optifine.GuiDetailSettingsOF;
import optifine.GuiOptionButtonOF;
import optifine.GuiOptionSliderOF;
import optifine.GuiOtherSettingsOF;
import optifine.GuiPerformanceSettingsOF;
import optifine.GuiQualitySettingsOF;
import optifine.Lang;
import optifine.TooltipManager;
import shadersmod.client.GuiShaders;

public class GuiClientSettings extends GuiScreen
{
    private GuiScreen parentGuiScreen;
    protected String screenTitle = "love bts";
    /**
     * Adds the buttons (and other controls) to the screen in question. Called when the GUI is displayed and when the
     * window resizes, the buttonList is cleared beforehand.
     */
    public void initGui()
    {
        this.screenTitle = I18n.format("qwrkefsjf", new Object[0]);
        this.buttonList.clear();
        
        this.buttonList.add(new GuiOptionButton(202, 100, 100, I18n.format("kdfns", new Object[0])));
        this.buttonList.add(new GuiOptionButton(201, 200, 200, I18n.format("Toggle Dark Mode", new Object[0])));
        this.buttonList.add(new GuiOptionButton(212, 250, 300, I18n.format("gggg,,,,,,,,,,,,", new Object[0])));
   
        this.buttonList.add(new GuiButton(200, this.width / 2 - 100, this.height / 6 + 168 + 11, I18n.format("gui.done", new Object[0])));
    }

    /**
     * Called by the controls from the buttonList when activated. (Mouse pressed for buttons)
     */
    protected void actionPerformed(GuiButton button) throws IOException
    {
        if (button.enabled)
        {
           
            if (button.id == 200)
            {
                this.mc.gameSettings.saveOptions();
                this.mc.displayGuiScreen(this.parentGuiScreen);
            }
            
            if (button.id == 201)
            {
                this.mc.gameSettings.saveOptions();
               System.out.println("201");
            }

            if (button.id == 202)
            {
                this.mc.gameSettings.saveOptions();
                System.out.println("202");
                
            }

            
                this.mc.gameSettings.saveOptions();
                
        }
    }

    /**
     * Draws the screen and all the components in it. Args : mouseX, mouseY, renderPartialTicks
     */
    public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, this.screenTitle, this.width / 2, 15, 16777215);
        String s = "Vex Client";
        String s1 = "HD_U";

        if (s1.equals("HD"))
        {
            s = "OptiFine HD H8";
        }

        if (s1.equals("HD_U"))
        {
            s = "Optifine HD H8 Ultra included!";
        }

        if (s1.equals("L"))
        {
            s = "OptiFine H8 Light";
        }

        this.drawString(this.fontRendererObj, s, 2, this.height - 10, 8421504);
        String s2 = "Vex Client DEV";
        int i = this.fontRendererObj.getStringWidth(s2);
        this.drawString(this.fontRendererObj, s2, this.width - i - 2, this.height - 10, 8421504);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }
    
    public void enableDarkBackground() {
    	
    	//if ()
    	
    }

    public static int getButtonWidth(GuiButton p_getButtonWidth_0_)
    {
        return p_getButtonWidth_0_.width;
    }

    public static int getButtonHeight(GuiButton p_getButtonHeight_0_)
    {
        return p_getButtonHeight_0_.height;
    }

    public static void drawGradientRect(GuiScreen p_drawGradientRect_0_, int p_drawGradientRect_1_, int p_drawGradientRect_2_, int p_drawGradientRect_3_, int p_drawGradientRect_4_, int p_drawGradientRect_5_, int p_drawGradientRect_6_)
    {
        p_drawGradientRect_0_.drawGradientRect(p_drawGradientRect_1_, p_drawGradientRect_2_, p_drawGradientRect_3_, p_drawGradientRect_4_, p_drawGradientRect_5_, p_drawGradientRect_6_);
    }
}