package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    //    Choose a random number between 1 and 100 --#4.1 (fake!) & --#13
    int randomInt = NumberUtils.getRandomInt(-1000, 1000);
    for (int i = 0; i < 12; i++)
    {
      int guess = MessageBox.askForNumericalInput("What is your guess");
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
