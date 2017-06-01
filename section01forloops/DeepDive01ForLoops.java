package org.teachingkidsprogramming.section01forloops;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle;
import org.teachingextensions.logo.utils.TortoiseUtils;

public class DeepDive01ForLoops
{
  //  Step 1: SELECT the method name (numbersDoNotNeedQuotes on line 23), then click the Run Button
  //            Keyboard shortcut to run ->  PC: Ctrl+F11 or Mac: Command+fn+F11
  //  Step 2: READ the name of the method that failed
  //  Step 3: FILL IN the blank (___) to make that method pass
  //  Step 4: SAY at least one thing you just learned
  //  Step 5: GO to the next method
  //  IMPORTANT - Do NOT change anything except the blank (___)
  //  
  @Test
  public void numbersDoNotNeedQuotes()
  {
    Assert.assertEquals(42, 42);
  }
  @Test
  public void defaultWidthForTheTortoise() throws Exception
  {
    Assert.assertEquals(Tortoise.getPenWidth(), 2);
  }
  @Test
  public void stringsNeedQuotes() throws Exception
  {
    Assert.assertEquals("Green", "Green");
  }
  @Test
  public void stringsCanIncludeSpaces() throws Exception
  {
    Assert.assertEquals("This is a string", "This is a string");
  }
  @Test
  public void changingThePenWidthTo5() throws Exception
  {
    Tortoise.setPenWidth(5);
    Assert.assertEquals(5, Tortoise.getPenWidth());
  }
  @Test
  public void movingTheTortoise100Pixels() throws Exception
  {
    int start = Tortoise.getY();
    Tortoise.move(100);
    Assert.assertEquals(Tortoise.getY(), start - 100);
    // 'Hint: make sure you read the name of this method
  }
  @Test
  public void theTortoiseTurns21() throws Exception
  {
    Tortoise.turn(21.0);
    Assert.assertEquals(21.0, Tortoise.getAngle(), 0.01);
  }
  @Test
  public void theTortoiseTurns15Twice() throws Exception
  {
    Tortoise.turn(15);
    Tortoise.turn(15);
    Assert.assertEquals(30.0, Tortoise.getAngle(), 0.01);
  }
  @Test
  public void howFastCanTheTortoiseGo() throws Exception
  {
    Tortoise.setSpeed(10);
    Assert.assertEquals(topSpeed, Tortoise.getSpeed());
    // 'Hint: Click SetSpeed then read the documentation on the left ----->
  }
  @Test
  public void assigningVariables() throws Exception
  {
    int myFavoriteNumber = 101;
    Assert.assertEquals(myFavoriteNumber, 101);
  }
  @Test
  public void bbgbbb() throws Exception
  {
    int age = 3 + 4;
    Assert.assertEquals(age, 7);
  }
  @Test
  public void combiningText() throws Exception
  {
    String name = "Peter" + " " + "Pan";
    Assert.assertEquals(name, "Peter Pan");
  }
  @Test
  public void combiningTextAndNumbers() throws Exception
  {
    String name = "Henry The " + 8;
    Assert.assertEquals(name, "Henry The 8");
  }
  @Test
  public void textIsTextEvenWhenItsNumbers() throws Exception
  {
    String age = "3" + "4";
    Assert.assertEquals(age, "34");
  }
  @Test
  public void combiningTextInALoop() throws Exception
  {
    String sound = "A";
    for (int i = 0; i < 3; i++)
    {
      sound += "H";
    }
    Assert.assertEquals(sound, "AHHH");
  }
  @Test
  public void forLoopsEndAtTheEnd() throws Exception
  {
    String numbers = "# ";
    for (int i = 0; i < 6; i++)
    {
      numbers += i;
      preventInfiniteLoops();
    }
    Assert.assertEquals("# 012345", numbers);
  }
  @Test
  public void forLoopsCanStartAnywhere() throws Exception
  {
    String answer = "Because ";
    for (int i = 7; i < 10; i++)
    {
      answer += i;
      preventInfiniteLoops();
    }
    // 'Question: Why is 7 the most feared number?
    Assert.assertEquals("Because 789", answer);
  }
  @Test
  public void forLoopsCanSkip() throws Exception
  {
    String numbers = "# ";
    for (int i = 1; i < 20; i += 2)
    {
      numbers = numbers + i + ",";
      preventInfiniteLoops();
    }
    Assert.assertEquals("# 1,3,5,7,9,11,13,15,17,19,", numbers);
  }
  @Test
  public void forLoopsCanSkipUpAndDown() throws Exception
  {
    String numbers = "# ";
    for (int i = 20; 0 < i && i < 40; i += -3)
    {
      numbers = numbers + i + ",";
      preventInfiniteLoops();
    }
    Assert.assertEquals("# 20,17,14,11,8,5,2,", numbers);
  }
  @Test
  public void forLoopsCanGoBackwards() throws Exception
  {
    String numbers = "Countdown: ";
    for (int i = 9; i >= 1; i += -1)
    {
      numbers += i;
      preventInfiniteLoops();
    }
    Assert.assertEquals("Countdown: 987654321", numbers);
  }
  @Test
  public void semicolonsMessUpForLoops() throws Exception
  {
    String sound = "A";
    for (int i = 0; i < 13; i++);
    {
      sound += "H";
    }
    Assert.assertEquals(sound, "AH");
  }
  /**
   * Ignore the following, it's needed to run the deep dive
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   */
  public String ___      = "You need to fill in the blank ___";
  public int    ____     = 1;
  int           topSpeed = 10;
  int           counter  = 0;
  @Before
  public void init()
  {
    TortoiseUtils.resetTurtle();
    Tortoise.setSpeed(Turtle.TEST_SPEED);
  }
  private void preventInfiniteLoops()
  {
    if (counter++ > 100) { throw new RuntimeException("You have created an infinite loop"); }
  }
}