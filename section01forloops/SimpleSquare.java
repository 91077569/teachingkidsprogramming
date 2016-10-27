package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

//
//----- Kata Question ------
//
//How would you make an equilateral triangle with a 
//horizontal base?
//Write the steps out in English
//Then translate the steps into code
//Make sure to run after every line
//
public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    //Make all the 3 sides equal -- #1
    for (int i = 0; i < 3; i++)
    {
      Tortoise.setPenColor(PenColors.Pinks.Pink);
      Tortoise.move(50);
      //Make all the angles equal -- #2
      Tortoise.turn(280);
      Tortoise.turn(120);
    }
    //
    //  (Optional): Sign your work using the Virtual Proctor 
    //  See your work at http://virtualproctor.tkpjava.org
  }
}
