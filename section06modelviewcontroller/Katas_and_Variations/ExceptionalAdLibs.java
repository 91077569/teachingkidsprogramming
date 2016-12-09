package org.teachingkidsprogramming.section06modelviewcontroller.Katas_and_Variations;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ExceptionalAdLibs
{
  public static void main(String[] args)
  {
    String adverb = askAdverb();
    //MessageBox.showMessage("The adverb is " + adverb);
    String edVerb = askEdVerb();
    //MessageBox.showMessage("The edverb is " + edVerb);
    String bodyPart = askBodyPart();
    //MessageBox.showMessage("The body part is " + bodyPart);
    String currentStory = "Today I woke " + adverb + ". Then I " + edVerb + " my " + bodyPart + ".";
    MessageBox.showMessage(currentStory);
  }
  public static String askBodyPart()
  {
    String bodyPart = MessageBox.askForTextInput("What is the bodyPart");
    if (bodyPart.isEmpty())
    {
      MessageBox.showMessage("Please enter a body part");
      bodyPart = askBodyPart();
    }
    if (bodyPart.matches("[\\d]*"))
    {
      MessageBox.showMessage("No body, no story, pay attention and start over");
      bodyPart = askBodyPart();
    }
    return bodyPart;
  }
  public static String askEdVerb()
  {
    String edVerb = MessageBox.askForTextInput("What is the -ed verb");
    if (edVerb.isEmpty())
    {
      MessageBox.showMessage("Please enter a verb ending with ed");
      edVerb = askEdVerb();
    }
    if (edVerb.matches("[\\d]*"))
    {
      MessageBox.showMessage("Numbers ain't adverbs try again");
      edVerb = askEdVerb();
    }
    return edVerb;
  }
  public static String askAdverb()
  {
    String adverb = MessageBox.askForTextInput("What is the adverb");
    if (adverb.isEmpty())
    {
      MessageBox.showMessage("Please enter an adverb");
      adverb = askAdverb();
    }
    if (adverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("No body, no story, pay attention and start over");
      adverb = askAdverb();
    }
    return adverb;
  }
}