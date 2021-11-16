package io.github.astrapi69;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.swing.*;

import io.github.astrapi69.icon.ImageIconFactory;
import io.github.astrapi69.swing.button.IconButtonFactory;
import org.apache.batik.transcoder.TranscoderException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class LoadIconTest
{

	@Test
//	@Disabled
	public void testloadIcons() throws TranscoderException
	{
		String imagePath = "io/github/astrapi69/remixicon/Document/folder-3-fill.svg";
		ImageIcon applicationAdd = ImageIconFactory.newImageIconFromSVG(imagePath, 16.f,
			16.f);
		JButton btnApplicationAdd = IconButtonFactory.newIconButton(applicationAdd,
			"New application");
		assertNotNull(btnApplicationAdd);
	}

}
