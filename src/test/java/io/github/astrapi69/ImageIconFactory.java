package io.github.astrapi69;

import io.github.astrapi69.lang.ClassExtensions;
import io.github.astrapi69.throwable.RuntimeExceptionDecorator;
import org.apache.batik.transcoder.TranscoderInput;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class ImageIconFactory
{

	/**
	 * Factory method for create a new {@link ImageIcon}
	 *
	 * @param image
	 *            the file that contains the image
	 * @return the new {@link ImageIcon}
	 */
	public static ImageIcon newImageIcon(File image)
	{
		ImageIcon img = newImageIcon(image.getAbsolutePath());
		return img;
	}

	/**
	 * Factory method for create a new {@link ImageIcon}
	 *
	 * @param relativeImagePath
	 *            the relative image path
	 * @return the new {@link ImageIcon}
	 */
	public static ImageIcon newImageIcon(String relativeImagePath)
	{
		return newImageIcon(relativeImagePath, true);
	}

	/**
	 * Factory method for create a new {@link ImageIcon}
	 *
	 * @param imagePath
	 *            the image path
	 * @param relativePath
	 *            the flag that indicates if the given path is relative
	 * @return the new {@link ImageIcon}
	 */
	public static ImageIcon newImageIcon(String imagePath, boolean relativePath)
	{
		if(relativePath) {
			InputStream resourceAsStream = ClassExtensions.getResourceAsStream(imagePath);
			final BufferedImage bufferedImage = RuntimeExceptionDecorator
				.decorate(() -> ImageIO.read(resourceAsStream));
			return new ImageIcon(bufferedImage);
		}
		return new ImageIcon(imagePath);
	}

	/**
	 * Factory method for create a new {@link ImageIcon}
	 *
	 * @param imagePath
	 *            the image path
	 * @param formatName
	 *            the formatName example 'png' or 'jpg'
	 * @return the new {@link ImageIcon}
	 */
	public static ImageIcon newImageIconFromSVG(String imagePath, final String formatName,  final int targetWidth, final int targetHeight)
		throws IOException
	{
		InputStream resourceAsStream = ClassExtensions.getResourceAsStream(imagePath);
		TranscoderInput input = new TranscoderInput(resourceAsStream);
		MyTranscoder transcoder = new MyTranscoder();
		// !!! the following code does not work. investigate why not...
		//		TranscodingHints hints = new TranscodingHints();
		//		hints.put(ImageTranscoder.KEY_WIDTH, 16);
		//		hints.put(ImageTranscoder.KEY_HEIGHT, 16);
		//		transcoder.setTranscodingHints(hints);
		RuntimeExceptionDecorator
			.decorate(() -> transcoder.transcode(input, null));
		BufferedImage bufferedImage = transcoder.getImage();
		BufferedImage resizedImage = ImageExtensions.getResized(bufferedImage, formatName, 16, 16);
		ImageIcon imageIcon = new ImageIcon(resizedImage);
		return imageIcon;
	}
}
