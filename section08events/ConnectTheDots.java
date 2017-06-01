package org.teachingkidsprogramming.section08events;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.EventUtils.MouseRightClickListener;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Circle;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Text;

public class ConnectTheDots implements MouseRightClickListener, MouseLeftClickListener
{
  public static void main(String[] args)
  {
    new ConnectTheDots();
  }
  public ConnectTheDots()
  {
    setUpTheWindow();
    prepareColorPalette();
    Tortoise.getBackgroundWindow().addMouseLeftClickListener(this);
    Tortoise.getBackgroundWindow().addMouseRightClickListener(this);
  }
  @Override
  public void onLeftMouseClick(int x, int y)
  {
    addDot(x, y);
    new Text("Right click to clear the window").setTopLeft(100, 100).addTo(Tortoise.getBackgroundWindow());
  }
  private void addDot(int x, int y)
  {
    createCircle(x, y);
    Tortoise.moveTo(x, y);
  }
  private void createCircle(int x, int y)
  {
    Circle circle = new Circle(11, ColorWheel.getNextColor());
    circle.setTransparency(40);
    circle.setCenter(x, y);
    Tortoise.getBackgroundWindow().add(circle);
  }
  @Override
  public void onRightMouseClick(int x, int y)
  {
    Tortoise.clear();
  }
  private static void prepareColorPalette()
  {
    ColorWheel.addColor(PenColors.Reds.Red);
    ColorWheel.addColor(PenColors.Greens.Green);
    ColorWheel.addColor(PenColors.Blues.Blue);
    ColorWheel.addColor(PenColors.Purples.Purple);
    ColorWheel.addColor(PenColors.Pinks.Pink);
    ColorWheel.addColor(PenColors.Greens.Teal);
  }
  private void setUpTheWindow()
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.hide();
  }
}
