package image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Images {
	public static BufferedImage[] background;
	public static BufferedImage[] player;

	public Images() {
		background = new BufferedImage[6];
		player = new BufferedImage[3];
		try {
			background[0] = ImageIO.read(new File("/Users/sanaa/Desktop/GamePics/back.jpg"));
			background[1] = ImageIO.read(new File("/Users/sanaa/Desktop/GamePics/background.jpg"));
			background[2] = ImageIO.read(new File("/Users/sanaa/Desktop/GamePics/menuBack.png"));
			background[3] = ImageIO.read(new File("/Users/sanaa/Desktop/GamePics/deathBackground.jpg"));
			background[4] = ImageIO.read(new File("/Users/sanaa/Desktop/GamePics/win.jpg"));
			background[5] = ImageIO.read(new File("/Users/sanaa/Desktop/GamePics/helpBackground.jpg"));
			player[0] = ImageIO.read(new File("/Users/sanaa/Desktop/GamePics/pic.png"));
			player[1] = ImageIO.read(new File("/Users/sanaa/Desktop/GamePics/pic2.png"));
			player[2] = ImageIO.read(new File("/Users/sanaa/Desktop/GamePics/pic3.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
