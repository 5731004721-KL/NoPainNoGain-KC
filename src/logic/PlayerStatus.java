package logic;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import render.IRenderable;
import render.Resource;

public class PlayerStatus implements IRenderable {
	int height,width;
	Point position;
	int x,y;
	Color color;
	int picture;
	int hp;//persent
	private Font font = new Font("Tahoma", Font.BOLD, 10);
	public PlayerStatus(Point position,int high,int width,Color color,int picture) {
		// TODO Auto-generated constructor stub
		//This.position=position;
		this.position=position;
		x=position.getX();
		y=position.getY();
		this.height=high;
		this.width=width;
		this.color=color;
		this.picture=picture;
		hp=27;
	}
	@Override
	public void draw(Graphics2D g2) {
		// TODO Auto-generated method stub
		g2.setColor(color);
		g2.fillRect(x, y, width,height );
		if(Resource.playerPicture[picture]!=null)
		{
			g2.drawImage(Resource.playerPicture[picture], null, x+50, y+20);
		}
		g2.setColor(Color.darkGray);
		g2.drawRect(x+35, y+150, 150, 15);
		g2.setColor(Color.RED);
		g2.fillRect(x+35, y+150, 150*hp/100, 15);
		g2.drawString("HP", x+15, y+162);
		//55
	}
	@Override
	public boolean isVisible() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public int getZ() {
		// TODO Auto-generated method stub
		return Integer.MAX_VALUE;
	}
	
	@Override
	public boolean isDestroyed() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
