package io.github.astrapi69;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class LoadIconTest
{

	@Test @Disabled public void testloadIcons() throws Exception
	{
		String imagePath = "io/github/astrapi69/remixicon/Document/folder-3-fill.svg";
		String formatName = "png";
		ImageIcon applicationAdd = ImageIconFactory.newImageIconFromSVG(imagePath, formatName, 16,
			16);
		JButton btnApplicationAdd = IconButtonFactory.newIconButton(applicationAdd,
			"New application");
		assertNotNull(btnApplicationAdd);
	}

}
