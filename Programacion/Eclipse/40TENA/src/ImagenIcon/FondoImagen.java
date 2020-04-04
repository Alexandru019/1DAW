package ImagenIcon;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class FondoImagen extends JPanel {
	ImageIcon imagen;
	
	public FondoImagen(String url) {
		super();
		initialize();
		imagen=new ImageIcon(getClass().getResource(url));
		setSize(imagen.getIconWidth(),imagen.getIconHeight());
	}
	protected void paintComponent (Graphics g) {
		Dimension d=getSize();
		g.drawImage(imagen.getImage(), 0, 0, d.width, d.height, null);
		this.setOpaque(false);
		super.paintComponent(g);
	}
	private void initialize() {
		this.setSize(150,150);
		this.setLayout(new GridBagLayout());
	}
}
