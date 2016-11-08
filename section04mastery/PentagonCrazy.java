package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class PentagonCrazy
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    //    createColorPalette (recipe below) --#8.1
    //
    createColourPalette();
    //
    //    drawPentagon (recipe below) --#10.1
    //
    drawPentagon();
  }
  private static void drawPentagon()
  {
    //    ------------- Recipe for drawPentagon --#10.2
    for (int i = 0; i < 200; i++)
    {
      //        adjustPen (recipe below) --#9.1
      //
      adjustPen();
      //
      Tortoise.move(i);
      Tortoise.turn(360 / 5);
      Tortoise.turn(1);
    }
    //    ------------- End of drawPentagon recipe --#10.3
  }
  private static void adjustPen()
  {
    //        ------------- Recipe for adjustPen --#9.2
    Tortoise.setPenColor(ColorWheel.getNextColor());
    //        Increase the tortoises pen width by 1 --#15
    Tortoise.setPenWidth(Tortoise.getPenWidth() + 1.0);
    //        If the tortoises pen width is greater than 4, then --#17
    if (Tortoise.getPenWidth() > 4)
    {
      //            Reset it to 1 --#16
      Tortoise.setPenWidth(1.0);
    }
    //        ------------- End of adjustPen recipe --#9.3 
  }
  private static void createColourPalette()
  {
    //    ------------- Recipe for createColorPalette --#8.2
    ColorWheel.addColor(PenColors.Blues.SteelBlue);
    ColorWheel.addColor(PenColors.Purples.DarkOrchid);
    ColorWheel.addColor(PenColors.Blues.DarkSlateBlue);
    ColorWheel.addColor(PenColors.Blues.Teal);
    ColorWheel.addColor(PenColors.Purples.Indigo);
    //    ------------- End of createColorPalette recipe --#8.3
  }
}
