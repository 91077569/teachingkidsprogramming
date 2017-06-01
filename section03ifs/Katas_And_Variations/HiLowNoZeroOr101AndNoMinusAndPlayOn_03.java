package org.teachingkidsprogramming.section03ifs.Katas_And_Variations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;
//------------- Kata Question -----------//
// How would you make sure the guess is NOT zero
// and end the game if the guess is zero
// how would you make sure the guess is NOT a negative number
//  but go to the next turn if the guess is a negative
// How would make sure if the guess is less than 100
//      and end the game
// write out the steps in english
// then translate the steps into code
// make sure to run after each line

public class HiLowNoZeroOr101AndNoMinusAndPlayOn_03
{
  public static void main(String[] args)
  {
    int answer = NumberUtils.getRandomInt(1, 100);
    //MessageBox.showMessage("The answer is " + answer); // delete (or comment out) this line after testing the game 
    for (int i = 0; i < 10; i++)
    {
      int guess = MessageBox.askForNumericalInput("Guess a number");
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You won!");
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
    MessageBox.showMessage("You lost");
  }
}