package org.teachingkidsprogramming.section01forloops.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class CompletsSquare
{
  // Use the tortoise to draw a red square with a width and a height of 40 pixels
  //
  // Write each of the English line comments(use at least six line comments)
  //
  // Number each comment line at the end, so your user knows the correct order  
  // to translate the code 
  // 
  // Verify - step one - Translate EACH comment line into Java code. 
  // 
  // Verify - step two - Run your code after each line
  public static void main(String[] args) throws Exception
  {
    // TODO: write comments and then code here
    //Show the tortoise --#1 
    Tortoise.show();
    //Do the following 4 times #5.1
    //    Change the pen color of the line the line the tortoise draws to red --#4 
    Tortoise.setPenColor(PenColors.Reds.Red);
    //    Move the tortoise 40 pixels --#2 
    Tortoise.move(40);
    //    Turn the tortoise to the right 90 degrees --#3
    Tortoise.turn(90);
    // Repeat --#5.2
  }
}