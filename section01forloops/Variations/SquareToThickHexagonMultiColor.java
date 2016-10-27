package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SquareToThickHexagonMultiColor
{
  // ----Kata Question ---- 
  // How would you make an equilateral Hexagon... 
  // with 20 pixels thick sides? 
  // and multi-colored lines 
  // Write out steps in Engish
  // Then translate the steps into code 
  // Make sure to run after each line
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Earvin and Kevin");
    Tortoise.setPenWidth(20);
    Tortoise.show();
    Tortoise.setSpeed(10);
    // Make 3 sides
    int sides = 6;
    for (int i = 0; i < sides; i++)
    {
      // Change the color of the line to multicolor
      Tortoise.setPenColor(PenColors.getRandomColor());
      Tortoise.move(50);
      Tortoise.turn(360 / sides);
    }
  }
}
