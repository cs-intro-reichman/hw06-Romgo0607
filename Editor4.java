import java.awt.Color;

/**
 * The program morphs an image into its grescaled version.
 * The program recieves two command-line arguments: a string representing the name
 * of the PPM file of a source image, and the number of morphing steps (an int). 
 * For example, to morph ironman into GREY ironman in 50 steps, use:
 * java Editor4 ironman.ppm 50
 */
public class Editor4 {

	public static void main (String[] args) {
		String image = args[0];
		int n = Integer.parseInt(args[1]);
		Color[][] sourceImage = Runigram.read(image);
		Color[][] greyImage = Runigram.grayScaled(sourceImage);
		Runigram.setCanvas(sourceImage);
		Runigram.morph(sourceImage, greyImage, n);
	}
}
