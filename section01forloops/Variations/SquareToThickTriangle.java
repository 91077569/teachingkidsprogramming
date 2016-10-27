package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SquareToThickTriangle
{
  // ----Kata Question ---- 
  // How would you make an equilateral triangle... 
  // Write out the steps in English
  // Then translate the steps into code 
  // Make sure to run after each line
  // Make the line with = 20 pixels
  public static void main(String[] args) throws Exception
  {
    // With 20 pixel thick sides?
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Earvin and Kevin");
    Tortoise.setPenWidth(20);
    Tortoise.show();
    Tortoise.setSpeed(10);
    // Make 3 sides
    int sides = 3;
    for (int i = 0; i < sides; i++)
    {
      Tortoise.setPenColor(PenColors.Pinks.Pink);
      Tortoise.move(50);
      Tortoise.turn(360 / sides);
    }
  }
}
