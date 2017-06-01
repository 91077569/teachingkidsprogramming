package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class DoubleLoop
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setX(225);
    Tortoise.setY(150);
    Tortoise.setSpeed(10);
    ColorWheel.addColor(PenColors.Reds.Crimson);
    ColorWheel.addColor(PenColors.Reds.DarkRed);
    ColorWheel.addColor(PenColors.Reds.FireBrick);
    for (int i = 0; i < 6; i++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      Tortoise.move(i * 4);
      Tortoise.turn(360 / 6);
      for (int j = 0; j < 15; j++)
      {
        Tortoise.setPenWidth(17);
        Tortoise.move(j * 8);
        Tortoise.turn(360 / 5);
        Tortoise.hide();
      }
      Tortoise.getBackgroundWindow().setBackground(PenColors.Yellows.PeachPuff);
    }
    Tortoise.setX(200);
    Tortoise.setY(80);
    for (int i = 0; i < 5; i++)
    {
      Tortoise.setPenColor(PenColors.Grays.Black);
      Tortoise.move(25);
      Tortoise.turn(360 / 5);
    }
  }
}