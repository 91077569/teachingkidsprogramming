package org.teachingkidsprogramming.section02methods.Kata_and_Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

//------------FourSquare Kata---------------//
//  Use the Tortoise to draw four squares, each with a width and height of 50 pixels
// Write out the steps in English
// Then translate the steps into code
// Make sure to run after each line 

public class CompleteFourSquare
{
  public static void main(String[] args)
  {
    System.out.println("be sure to complete the main method to start");
    //TODO: write comments and then code here
    //Show the tortoise-- # 1 
    Tortoise.show();
    //Set the speed of the tortoise to 10--#8
    Tortoise.setSpeed(10);
    //Repeat the following 4 times again--# 7.1
    for (int i = 0; i < 4; i++)
    {
    // start of recipe--# 6.1
    drawSquare();
    //end of recipe --# 6.2
    //Turn the tortoise 90--# 9
    Tortoise.turn(90);
    //repeat --# 7.2  
    }
  }

  private static void drawSquare()
  {
    // drawSquareRecipe
    //Repeat the following 4 times-- #5.1
    for (int i = 0; i < 4; i++)
    {   
    //Move the tortoise 50--# 2
    Tortoise.move(50);
    //Turn the tortoise 90--# 3 
    Tortoise.turn(90);
    //Change the pen color into random--#4
    Tortoise.setPenColor(PenColors.getRandomColor());
    //Repeat--# 5.1
    }
  }
}