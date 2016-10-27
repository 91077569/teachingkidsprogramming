package org.teachingkidsprogramming.section03ifs.Katas_And_Variations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow_variation_03
{
  public static void main(String[] args)
  {
    int answer = NumberUtils.getRandomInt(50, 100);
    MessageBox.showMessage("The answer is" + answer);
    int numGuesses = MessageBox.askForNumericalInput("How many guesses do you want?");
    for (int i = 0; i < numGuesses; i++)
    {
      int guess = MessageBox.askForNumericalInput("Guess an integer between 50 and 100");
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