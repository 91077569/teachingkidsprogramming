package org.teachingkidsprogramming.section02methods.Kata_and_Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class HousesToAPointyAndSlantedRoof_03
{
  //------------- Kata Question ------------------
  // How would you make a house with a slanted roof?
  //    and a house with a pointy roof
  // Write out the steps in English
  // Then translate the steps into code
  // Make sure to run after each line
  // make a slanted roof
  public static void main(String[] args)
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Kevin and Earvin");
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    int height = 40;
    // make a skyline with a pointy roof houses and slanted roof houses
    // make a house with a pointy roof and current height 
    drawHousePointyRoof(height);
    //make a house with a slanted roof and a height of 120 pixels 
    drawHouseSlantedRoof(120);
    //make a house with a pointy roof and a height of 90 pixels 
    drawHousePointyRoof(90);
    //make a house with a slanted roof and a height of 20 pixels
    drawHouseSlantedRoof(20);
  }
  private static void drawHouseFlatRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    drawFlatRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHouseSlantedRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    drawSlantedRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHousePointyRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    drawPointyRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawFlatRoof()
  {
    // make flat roof
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
  }
  private static void drawSlantedRoof()
  {
    //turn tortoise 45 degrees to the right--#1
    Tortoise.turn(45);
    // move the tortoise 30 pixels--#2
    Tortoise.move(30);
    // turn the tortoise 135 degrees to the right--#3
    Tortoise.turn(135);
    //move the tortoise 20 pixels--#4
    Tortoise.move(20);
  }
  private static void drawPointyRoof()
  {
    //Make a pointy roof 
    //turn the tortoise 45 degrees to the right--#1 
    Tortoise.turn(45);
    //move the tortoise ??? pixels--#2 
    Tortoise.move(30);
    //turn the tortoise 90 degrees to the right--#3
    Tortoise.turn(90);
    //Move the tortoise A pixel--#4 
    Tortoise.move(30);
    // turn the tortoise 45 degrees to the right--#5 
    Tortoise.turn(45);
  }
}
