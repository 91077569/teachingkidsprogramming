package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.TKPLogoUtils.TKPLogo;

public class MakeALogo
{
  public static int YValue = 300;
  public static int XValue = 100;
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    TKPLogo.setupColorWheel();
    TKPLogo.draw_tkp_T();
    TKPLogo.drawLeftBracket();
    TKPLogo.draw_tkp_K();
    TKPLogo.drawRightBracket();
    TKPLogo.draw_outer_tkp_P();
    TKPLogo.draw_inner_tkp_P();
  }
}
