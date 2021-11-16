/**
 * The MIT License
 *
 * Copyright (C) 2015 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package io.github.astrapi69;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.swing.*;

import org.apache.batik.transcoder.TranscoderException;
import org.junit.jupiter.api.Test;

import io.github.astrapi69.icon.ImageIconFactory;
import io.github.astrapi69.swing.button.IconButtonFactory;

/**
 * The unit test class demonstrates how to load an icon from this library in java
 *
 * @author Asterios Raptis
 */
class LoadIconTest
{

	/**
	 * Test for method for demonstrate how to load an icon
	 */
	@Test
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
