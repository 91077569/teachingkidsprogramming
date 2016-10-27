package org.teachingkidsprogramming.section02methods.Kata_and_Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class Variation01_Batman
{
  //------------- Kata Question ------------------
  // How would you make a house with a slanted roof?
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
    drawBatmanRoof(height);
    //    drawHouseSlantedRoof(120);
    //    drawHouseSlantedRoof(90);
    //    drawHouseSlantedRoof(20);
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
  private static void drawBatmanRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    drawBatRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
    Tortoise.turn(90);
    Tortoise.turn(-90);
    Tortoise.move(40);
    Tortoise.turn(135);
    Tortoise.move(27);
    Tortoise.turn(45);
    Tortoise.move(height);
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
    Tortoise.turn(90);
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
  private static void drawBatRoof()
  {
    //turn tortoise 45 degrees to the right--#1
    Tortoise.turn(45);
    // move the tortoise 30 pixels--#2
    Tortoise.move(30);
    // turn the tortoise 135 degrees to the right--#3
    Tortoise.turn(135);
    //move the tortoise 20 pixels--#4
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
