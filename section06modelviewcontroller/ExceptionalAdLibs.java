package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ExceptionalAdLibs
{
  public static void main(String[] args)
  {
    String currentAdverb = MessageBox.askForTextInput("Please enter an adverb");
    String currentEdverb = MessageBox.askForTextInput("Please enter a verb");
    String currentBodyPart = MessageBox.askForTextInput("Please enter a body part");
    String currentStory = "Today ";
    currentStory = currentStory + "I woke " + currentAdverb + ".";
    currentStory = currentStory + "Then I " + currentEdverb + " ";
    currentStory = currentStory + "my " + currentBodyPart + ".";
    MessageBox.showMessage(currentStory);
  }
}