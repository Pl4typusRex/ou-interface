
/**
 * Provides an interface for three methods, stroke(), canStroke() and feed().
 *
 * @author Pl4typusRex 
 * @version 2019-01-20
 */
public interface Lovable
{
   /**
    * Performs an action in response to 'stroke'.
    */
   public void stroke();

   /**
    * Performs an action in response to 'canStroke'.
    */
   public boolean canStroke();

   /**
    * Performs an action in response to 'feed'.
    */
   public void feed();
}
