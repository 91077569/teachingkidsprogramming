package org.teachingkidsprogramming.section02methods.Kata_and_Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
//----------- Kata Questions ----------//
//Where do you see duplicate lines of code? 
// and how can you refactor to make this code more readable? 
//Write out the steps in english 
//The translate the steps into code 
//Make sure to run after each line

public class PyramidsOfGizaRemoveDuplication_01
{
  public static void main(String[] args) throws Exception
  {
    setUpPyramidLand();
    Tortoise.turn(-90);
    Tortoise.move(220);
    Tortoise.turn(135);
    Tortoise.move(100);
    moveDown();
    Tortoise.turn(-90);
    Tortoise.move(100);
    moveDown();
    Tortoise.turn(-90);
    Tortoise.move(100);
    moveDown();
    Tortoise.turn(135);
    Tortoise.move(210);
  }
  private static void moveDown()
  {
    //move the tortoise down
    //extract a method and name it moveDown()
    Tortoise.turn(90);//!!!
    Tortoise.move(100);//!!!
  }
  private static void setUpPyramidLand()
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Blues.AliceBlue);
    Tortoise.setPenColor(PenColors.Yellows.DarkGoldenrod);
    Tortoise.setPenWidth(2);
    Tortoise.hide();
  }
}
