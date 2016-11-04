package org.teachingkidsprogramming.section03ifs.Katas_And_Variations;

import java.awt.Color;

import org.teachingextensions.approvals.lite.util.ThreadUtils;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ChooseYourOwnAdventure_01
{
  public static void main(String[] args)
  {
    startStory();
  }
  private static void startStory()
  {
    tellMoreStory("One morning the Tortoise woke up in a dream.");
    animateStartStory();
    String action = askAQuestion("Do you want to 'wake up' or 'explore' the dream?");
    if ("wake up".equalsIgnoreCase(action))
    {
      //          wakeUp (recipe below) --#2.1
      wakeUpLazyBacon();
    }
    else if ("explore".equalsIgnoreCase(action))
    {
      //      approachOoze (recipe below) --#4.1
      approachOoze();
    }
    else
    {
      //      endStory (recipe below) --#6.1
      endStory();
    }
  }
  private static void endStory()
  {
    //      ------------- Recipe for endStory --#6.2
    MessageBox.showMessage(
        "You don't know how to read directions. You can't play this game. The end. Oh and we can not be friends");
    //      ------------- End of endStory recipe --#6.3
  }
  private static void approachOoze()
  {
    //      ------------- Recipe for approachOoze --#4.2
    MessageBox.showMessage("You find an ugly man");
    String input = askAQuestion("What do you say to the man 'You ugly' 'nothing' or 'Will you marry me'");
    if ("toilet".equalsIgnoreCase(input))
    {
      //            pourIntoToilet (recipe below) --#12.1
      pourIntoToilet();
    }
    else if ("backyard".equalsIgnoreCase(input))
    {
      //            pourIntoBackyard (recipe below) --#19.1
      pourIntoBackyard();
    }
    else
    {
      endStory();
    }
    //      ------------- End of approachOoze recipe --#4.3
  }
  private static void pourIntoBackyard()
  {
    //            ------------- Recipe for pourIntoBackyard --#19.2
    MessageBox.showMessage(
        "As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water.");
    String backyard = askAQuestion("As the man starts to prepare you as soup, do you...'Scream' or 'Faint'?");
    if ("toilet".equalsIgnoreCase(backyard))
    {
      //            pourIntoToilet (recipe below) --#12.1
      pourIntoToilet();
    }
    if ("faint".equalsIgnoreCase(backyard))
    {
      MessageBox.showMessage("You made a delicious soup! Yum! The end.");
    }
    else if ("scream".equalsIgnoreCase(backyard))
    {
    }
    //                    startStory --#22
    else
    {
      startStory();
    }
    endStory();
    //         ------------- End of pourIntoBackyard recipe --#19.3
  }
  private static void pourIntoToilet()
  {
    //            ------------- Recipe for pourIntoToilet --#12.2
    MessageBox.showMessage(
        "As you pour the ooze into the toilet it backs up, gurgles, and explodes, covering you in radioactive waste.");
    String toilet = askAQuestion("Do you get bullied then do you want to be a NINJAA? Yes or HECK YES?");
    if ("yes".equalsIgnoreCase(toilet))
    {
      MessageBox
          .showMessage("Awesome dude!  You live out the rest of your life fighting crimes and eating pizza!");
    }
    else if ("heck yes".equalsIgnoreCase(toilet))
    {
      MessageBox
          .showMessage("Awesome dude!  You live out the rest of your life fighting crimes and eating pizza!");
    }
    else
    {
      endStory();
    }
    //            ------------- End of pourIntoToilet recipe --#12.3
  }
  private static void wakeUpLazyBacon()
  {
    //          ------------- Recipe for wakeUp --#2.2
    MessageBox.showMessage("You wake up.Eat bacon,go to work at mcdonalds,eat beans,watch trumps life story, "
        + "go to bed with your shoelace.WOW that was fun!!!*sarcasm*");
    //          ------------- End of wakeUp recipe --#2.3
  }
  private static void animateStartStory()
  {
    Tortoise.show();
    Color color = PenColors.Grays.Black;
    for (int i = 0; i < 25; i++)
    {
      Tortoise.getBackgroundWindow().setColor(color);
      color = PenColors.lighten(color);
      ThreadUtils.sleep(100);
    }
  }
  private static void tellMoreStory(String message)
  {
    MessageBox.showMessage(message);
  }
  private static String askAQuestion(String question)
  {
    String answer = MessageBox.askForTextInput(question);
    return answer;
  }
}
