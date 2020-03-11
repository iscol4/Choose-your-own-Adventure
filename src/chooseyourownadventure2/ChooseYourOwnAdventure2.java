/*
Isaac Collier
March 11 2020
This program uses nested if statements to create a choose your own adventure game
 */

package chooseyourownadventure2;

/**
 *
 * This class is teaching me about choose your own adventure games and how to make them.
 */
import java.util.Scanner;
public class ChooseYourOwnAdventure2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  //declares variables:
        String decision1, decision2, decision3, decision4, decision5, decision6,decision7,decision8;
              Scanner keyedInput = new Scanner (System.in);
           
              //starts choose your own adventure and prompts user to input "yes" or "no"
              System.out.println("Its halloween night and the big house at the end of the street's big steel gates are open... Do you go and get candy?");
    decision1 = keyedInput.nextLine();
     if (decision1.equals ("yes"))
     {
         System.out.println("When you get close to the house, you notice the front door is open, and inside is pitch black... Do you enter?");
         decision2 = keyedInput.nextLine();
         if (decision2.equals ("yes"))
         {
             System.out.println("You enter the house and the door shuts behind you. You hear a deep noise. Nothing human. It's coming from the basement. Do you go upstairs, to the kitchen, or to the basement?");
         }
         else
              {
        System.out.println("You go trick-or-treating at the other houses and get a decent stash of candy but the houses gates never opened again and you never find out what happened to it on Halloween night...");
             }
         
         decision3 = keyedInput.nextLine();
         if (decision3.equals ("Basement")||decision3.equals("The basement")||decision3.equals("basement"))
         {
             System.out.println("You see a group of ghosts, witches, werewolves and vampires. They capture you and put you in their stew. You died.");
         }
         
         else if (decision3.equals ("Upstairs")||decision3.equals ("upstairs"))
         {
             System.out.println("You go upstairs along creaky wooden floorboards and encouter a vampire. Do you fight back, run, or try to talk to it?");
         decision7 = keyedInput.nextLine();
                          if (decision7.equals ("fight back")||decision7.equals("Fight back")||decision7.equals("fight it")||decision7.equals("Fight it"))
                          {
                              System.out.println("You take a piece of floorboard and smack the vampire over its head. It vanishes and leaves behind the key to leave.");
                              System.out.println("You take the key and leave the house, having seen its horrors and you never return again.");
                          }
           else if (decision7.equals ("Talk")||decision7.equals ("talk")||decision7.equals ("talk to it")||decision7.equals ("Talk to it"))
                          {
                              System.out.println("You have no leverage over the vampire. He captures you and brings you to the basement so his friends can put you in their stew. You died.");
                          }
                          else
                          {
                              System.out.println("In a panic, you run, but the vampire catches you. He brings you to the basement with his friends and they put you in their stew. You died.");
                          }
         
         
         
         }
         else
         {
             System.out.println("You go to the kitchen and find a slice of garlic bread. Do you take it with you?");
         }
         
         decision5 = keyedInput.nextLine();
         if (decision5.equals("yes"))
                 {
                     System.out.println("Suddenly you hear footsteps from the second floor. Do you go upstairs or downstairs?");
                     decision6 = keyedInput.nextLine();
                      if (decision6.equals ("Upstairs")||decision6.equals ("upstairs"))
                      {
                          System.out.println("You go upstairs along creaky wooden floorboards and encouter a vampire. Do you fight back, run, or try to talk to it?");
                          decision7 = keyedInput.nextLine();
                          if (decision7.equals ("fight back")||decision7.equals("Fight back")||decision7.equals("fight it")||decision7.equals("Fight it"))
                          {
                              System.out.println("You take a piece of floorboard and smack the vampire over its head. It vanishes and leaves behind the key to leave.");
                              System.out.println("You take the key and leave the house, having seen its horrors and you never return again.");
                          }
                          else if (decision7.equals ("Talk")||decision7.equals("talk")||decision7.equals("talk to it")||decision7.equals("Talk to it"))
                          {
                              System.out.println("You threaten the vampire with the garlic and it gives you the key to leave the house if you spare it.");
                            System.out.println("You take the key and leave the house, having seen its horrors and you never return again.");
                          }
                              else
                          {
                              System.out.println("In a panic, you run, but the vampire catches you. He brings you to the basement with his friends and they put you in their stew. You died.");
                          }
                              
                              
                              }
                      else
                      {
                          System.out.println("You go downstairs and see a group of ghosts, witches, werewolves and vampires. They capture you and put you in their stew. You died.");
                      }
                 }
     else 
     {
         System.out.println("Suddenly you hear footsteps from the second floor. Do you go upstairs or downstairs?");
        decision6 = keyedInput.nextLine();
         if (decision6.equals ("Upstairs")||decision6.equals ("upstairs"))
         {
             System.out.println("You go upstairs along creaky wooden floorboards and encouter a vampire. Do you fight back, run, or try to talk to it?");
        decision7 = keyedInput.nextLine();
                          if (decision7.equals ("fight back")||decision7.equals("Fight back")||decision7.equals("fight it")||decision7.equals("Fight it"))
                          {
                              System.out.println("You take a piece of floorboard and smack the vampire over its head. It vanishes and leaves behind the key to leave.");
                              System.out.println("You take the key and leave the house, having seen its horrors and you never return again.");
                          }
                          else if (decision7.equals ("Talk")||decision7.equals ("talk")||decision7.equals ("talk to it")||decision7.equals ("Talk to it"))
                          {
                              System.out.println("You have no leverage over the vampire. He captures you and brings you to the basement so his friends can put you in their stew. You died.");
                          }
                          else
                          {
                              System.out.println("In a panic, you run, but the vampire catches you. He brings you to the basement with his friends and they put you in their stew. You died.");
                          }
         }
         else
         {
            System.out.println("You see a group of ghosts, witches, werewolves and vampires. They capture you and put you in their stew. You died."); 
         }
         }
     }
  else
     {
        System.out.println("You go trick-or-treating at the other houses and get a decent stash of candy but the houses gates never opened again and you never find out what happened to it on Halloween night...");
             }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     }
  
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
    }
    

