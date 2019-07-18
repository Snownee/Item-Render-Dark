///*
// * Copyright (c) 2015 Jerrell Fang
// *
// * This project is Open Source and distributed under The MIT License (MIT)
// * (http://opensource.org/licenses/MIT)
// *
// * You should have received a copy of the The MIT License along with
// * this project.   If not, see <http://opensource.org/licenses/MIT>.
// */
//package itemrender.keybind;
//
//import itemrender.rendering.FBOHelper;
//import itemrender.rendering.Renderer;
//import net.minecraft.client.Minecraft;
//import net.minecraft.client.gui.GuiChat;
//import net.minecraft.client.renderer.RenderItem;
//import net.minecraft.client.settings.KeyBinding;
//import net.minecraft.item.ItemStack;
//import net.minecraftforge.client.event.InputEvent;
//import net.minecraftforge.eventbus.api.SubscribeEvent;
//import net.minecraftforge.fml.client.FMLClientHandler;
//import net.minecraftforge.fml.client.registry.ClientRegistry;
//
//public class KeybindRenderInventoryBlock
//{
//
//    private final KeyBinding key;
//    public FBOHelper fbo;
//    private String filenameSuffix = "";
//    private RenderItem itemRenderer = Minecraft.getMinecraft().getRenderItem();
//
//    public KeybindRenderInventoryBlock(int textureSize, String filename_suffix, int keyVal, String des)
//    {
//        fbo = new FBOHelper(textureSize);
//        filenameSuffix = filename_suffix;
//        key = new KeyBinding(des, keyVal, "Item Render");
//        ClientRegistry.registerKeyBinding(key);
//    }
//
//    @SubscribeEvent
//    public void onKeyInput(InputEvent.KeyInputEvent event)
//    {
//        if (FMLClientHandler.instance().isGUIOpen(GuiChat.class))
//            return;
//        if (key.isPressed())
//        {
//            Minecraft minecraft = Minecraft.getInstance();
//            if (minecraft.player != null)
//            {
//                ItemStack current = minecraft.player.getHeldItemMainhand();
//                if (current != null && current.getItem() != null)
//                {
//                    Renderer.renderItem(current, fbo, filenameSuffix, itemRenderer);
//                }
//            }
//        }
//    }
//}
