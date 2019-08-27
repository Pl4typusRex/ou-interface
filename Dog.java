
/**
 * Write a description of class Dog here.
 *
 * TMA02 Q3
 * @author Pl4typusRex 
 * @version 2019-01-17
 */
public class Dog extends Pet implements Lovable
{
   // instance variables
   private int happiness;
   private int timesFedToday;

   public Dog(String aName, String aDescription)
   {
      super(aName, aDescription);
      happiness = 2;
   }

   /**
    * Getter method for happiness
    */
   public int getHappiness()
   {
      return happiness;
   }

   /**
    * Getter method for happiness
    */
   public int getTimesFedToday()
   {
      return timesFedToday;
   }

   /**
    * Decrements happiness by 1 until it hits 0
    */
   public void decrementHappiness()
   {
      if (getHappiness() > 0)
      {
         happiness = getHappiness() - 1;
      }
      else
      {
         System.out.println("Happiness is 0");
      }
   }

   /**
    * Decrements timesFedToday by 1 until it hits 0
    */
   public void decrementTimesFedToday()
   {
      if (getTimesFedToday() > 0)
      {
         timesFedToday = getTimesFedToday() - 1;
      }
      else
      {
         System.out.println("Times fed today is 0");
      }
   }

   /**
    * Increments happiness by 1
    */
   public void incrementHappiness()
   {
      happiness = getHappiness() + 1;
   }

   /**
    * Increments timesFedToday by 1
    */
   public void incrementTimesFedToday()
   {
      timesFedToday = getTimesFedToday() + 1;
   }

   /**
    * While timesFedToday is above 0
    * Happiness + 1 and timesFedToday - 1
    */
   public void walkies()
   {
      while (getTimesFedToday() > 0)
      {
         System.out.println("I'm going for a walk!");
         incrementHappiness();
         System.out.println("I'm getting hungry");
         decrementTimesFedToday();
      }
   }

   /**
    * Sleep will return true if happiness and timesFedToday are both above 0
    * Otherwise returns false
    */
   public boolean sleep()
   {
      if (getHappiness() > 0 && getTimesFedToday() > 0)
      {
         return true;
      }
      else if (getHappiness() == 0 && getTimesFedToday() == 0)
      {
         System.out.println("Not happy, can't sleep");
         System.out.println("Hungry, can't sleep");
         return false;
      }
      else if (getHappiness() == 0)
      {
         System.out.println("Not happy, can't sleep");
         return false;
      }
      else if (getTimesFedToday() == 0)
      {
         System.out.println("Hungry, can't sleep");
         return false;
      }
      else
      {
         return false;
      }
   }

   /**
    * Prints a statement and lowers happiness by 1
    */
   public void noWalkies()
   {
      System.out.println("No walkies :-(");
      decrementHappiness();
   }

   public void stroke(){}
   public boolean canStroke(){return true;}
   public void feed(){}
}
