package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.Tortoise;

public class PentagonCrazy
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    //    createColorPalette (recipe below) --#8.1
    //
    //    ------------- Recipe for createColorPalette --#8.2
    //    Add steel blue to the color wheel --#7
    //    Add dark orchid to the color wheel --#11
    //    Add dark slate blue to the color wheel --#12
    //    Add teal to the color wheel --#13
    //    Add indigo to the color wheel --#14
    //    ------------- End of createColorPalette recipe --#8.3
    //
    //    drawPentagon (recipe below) --#10.1
    //
    //    ------------- Recipe for drawPentagon --#10.2
    for (int i = 0; i < 200; i++)
    {
      //        adjustPen (recipe below) --#9.1
      //
      //        ------------- Recipe for adjustPen --#9.2
      //        Change the pen color of the line the tortoise draws to the next color on the color wheel --#6
      //        Increase the tortoises pen width by 1 --#15                                              
      //        If the tortoises pen width is greater than 4, then --#17
      //            Reset it to 1 --#16
      //        ------------- End of adjustPen recipe --#9.3 
      //
      //        The current length of a side is the same as the number of the side you are about to draw ( 1st side = 1 pixel, 2nd side = 2 pixels, etc) --#4.2
      int length = 1;
      int side = length + 1;
      //        Move the tortoise the length of a side --#4.1
      Tortoise.move(length * side);
      Tortoise.turn(360 / 5);
      //        Turn the tortoise 1 more degree --#5
      Tortoise.turn(1);
    }
    //    ------------- End of drawPentagon recipe --#10.3
  }
}
