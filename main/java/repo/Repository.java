package repo;

import model.User;
import model.chat.Chat;
import view.general.GeneralView;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Repository {

    public static User currentUser;

    public static Chat singleChat;

    public static Map map = new HashMap();

    public static GeneralView generalView;

    public static byte[] convertImageToByte(File file) {
        try {
            BufferedImage bi = ImageIO.read(file);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(bi, "png", baos);
            byte[] bytes = baos.toByteArray();
            return bytes;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static BufferedImage convertByteToImage(byte[] bytes){
        try {
            InputStream is = new ByteArrayInputStream(bytes);
            BufferedImage newBi = ImageIO.read(is);
            return newBi;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
