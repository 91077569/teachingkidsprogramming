package org.teachingkidsprogramming.section03ifs.Katas_And_Variations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;
//------------- Kata Question -----------//
// What happens when you enter letters (i.e "ABC") as your guess
//   How can you see what your guess is exactly
// write out the steps in English
// then translate the steps into code
// make sure to run after each line

//
public class HiLowSeeBugInfo_04
{
  public static void main(String[] args)
  {
    int answer = NumberUtils.getRandomInt(1, 100);
    MessageBox.showMessage("The answer is " + answer); // delete (or comment out) this line after testing the game 
    for (int i = 0; i < 3; i++)
    {
      int guess = MessageBox.askForNumericalInput("Guess a number");
      MessageBox.showMessage("Your guess is " + guess);
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You won! But its just a game loser go outside and ride a bike get a life gosh!");
        System.exit(0);
      }
      // if guess equals or less than zero 
      //if guess is greater than 100 end the game 
      if (guess == 0 || guess > 100)
      {
        // tell the user to not put 0 or less than 0
        MessageBox.showMessage("Please do not put 0 or greater than 100 put a valid number");
        // exit the program
        System.exit(0);
      }
      // if guess is a negative
      if (guess < 0)
      {
        // tell the user to not put a negative #
        MessageBox.showMessage("Please do not put a negative number");
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too high");
      }
      else
      {
        MessageBox.showMessage("Too low");
      }
    }
    MessageBox.showMessage("You lost. HAHAHAHAHAHAHA LOSER!!!!!!");
  }
}