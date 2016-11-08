package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class PentagonCrazy_Variation_01
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    createColourPalette();
    drawPentagon();
  }
  private static void drawPentagon()
  {
    for (int i = 0; i < 1000; i++)
    {
      adjustPen();
      Tortoise.move(i);
      Tortoise.turn(36000 / 11111);
      Tortoise.turn(1464692);
    }
  }
  private static void adjustPen()
  {
    Tortoise.setPenColor(ColorWheel.getNextColor());
    Tortoise.setPenWidth(Tortoise.getPenWidth() + 1.0);
    if (Tortoise.getPenWidth() > 4)
    {
      Tortoise.setPenWidth(1.0);
    }
  }
  private static void createColourPalette()
  {
    ColorWheel.addColor(PenColors.Purples.DarkMagenta);
    ColorWheel.addColor(PenColors.Reds.Crimson);
    ColorWheel.addColor(PenColors.Pinks.HotPink);
    ColorWheel.addColor(PenColors.Blues.Teal);
    ColorWheel.addColor(PenColors.Grays.Silver);
  }
}
