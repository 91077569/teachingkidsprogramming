package org.teachingkidsprogramming.section05recursion;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SpiderWeb
{
  public static void main(String[] args)
  {
    VirtualProctor.setName("Kevin and Dominic");
    VirtualProctor.setClassName("Palmdigital");
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setPenWidth(1);
    Tortoise.setAnimal(Animals.Spider);
    Tortoise.setPenColor(PenColors.Reds.Red);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Grays.Black);
    float length = 10.5f;
    float zoom = 1.1f;
    for (int i = 0; i < 10; i++)
    {
      length = weaveOneLayer(length, zoom);
      zoom = zoom * 1.3f;
    }
  }
  private static float weaveOneLayer(float length, float zoom)
  {
    for (int i = 0; i < 6; i++)
    {
      drawTriangle(length);
      Tortoise.turn(360 / 6);
      length = length + zoom;
    }
    return length;
  }
  private static void drawTriangle(float length)
  {
    for (int i = 0; i < 3; i++)
    {
      Tortoise.move(length);
      Tortoise.turn(360 / 3);
    }
  }
}
