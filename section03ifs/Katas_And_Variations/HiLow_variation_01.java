package org.teachingkidsprogramming.section03ifs.Katas_And_Variations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow_variation_01
{
  public static void main(String[] args)
  {
    //    Choose a random number between 1 and 100 --#4.1 (fake!) & --#13
    int randomInt = NumberUtils.getRandomInt(1, 100);
    int numGuesses = 2;
    for (int i = 0; i < numGuesses; i++)
    {
      int guess = MessageBox.askForNumericalInput("Guess an integer between 1 and 100");
      int answer = randomInt;
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You WON!!!!!!! the game.");
        System.exit(0);
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("The guess is to high:(");
      }
      else
      {
        MessageBox.showMessage("The guess is to low:(");
      }
    }
    MessageBox.showMessage("You have lost hahahahah!!!");
  }
}