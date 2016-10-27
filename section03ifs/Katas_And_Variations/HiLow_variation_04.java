package org.teachingkidsprogramming.section03ifs.Katas_And_Variations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow_variation_04
{
  public static void main(String[] args)
  {
    int answer = NumberUtils.getRandomInt(1, 100);
    MessageBox.showMessage("The answer is" + answer);
    int numGuesses = MessageBox.askForNumericalInput("How many guesses do you want?");
    for (int i = 0; i < numGuesses; i++)
    {
      int guess = MessageBox.askForNumericalInput("Guess an integer between 1 and 100");
      if (guess <= 0)
      {
        MessageBox.showMessage("You cannot enter values less than 1 ---- You lose hahahahhahaha");
        System.exit(0);
      }
      if (guess > 100)
      {
        MessageBox.showMessage("You cannot enter values greater than 100 ---- You lose hahahahhahaha");
        System.exit(0);
      }
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You WON!!!!!!! the game");
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