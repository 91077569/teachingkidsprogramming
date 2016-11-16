package org.teachingkidsprogramming.section05recursion;

import java.awt.Color;
import java.util.HashMap;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class TurtleTree
{
  @SuppressWarnings("unused")
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    //    Turn the background black  --#21
    Tortoise.getBackgroundWindow().setBackground(PenColors.Grays.Black);
    int branchLength = 60;
    drawBranch(branchLength);
  }
  private static void drawBranch(int branchLength)
  {
    if (branchLength > 0)
    {
      adjustColour(branchLength);
      Tortoise.move(branchLength);
      drawLowerBranches(branchLength);
    }
  }
  private static void adjustColour(int branchLength)
  {
    HashMap<Integer, Color> colors = new HashMap<Integer, Color>();
    colors.put(10, PenColors.Greens.Lime);
    colors.put(20, PenColors.Greens.ForestGreen);
    colors.put(30, PenColors.Greens.DarkGreen);
    colors.put(40, PenColors.Greens.Olive);
    colors.put(50, PenColors.Browns.Sienna);
    colors.put(60, PenColors.Browns.SaddleBrown);
    Tortoise.setPenColor(colors.get(branchLength));
  }
  private static void drawLowerBranches(int branchLength)
  {
    Tortoise.turn(30);
    //
    drawShorterBranch(branchLength);
    //
    Tortoise.turn(-60);
    drawShorterBranch(branchLength);
    Tortoise.turn(30);
    adjustColour(branchLength);
    Tortoise.move(-branchLength);
  }
  private static void drawShorterBranch(int branchLength)
  {
    //            ------------- Recipe for drawShorterBranch --#8.2
    drawBranch(branchLength - 10);
    //            ------------- End of drawShorterBranch recipe --#8.3
  }
}