
package numberguesser;

import java.util.Random;

/**
 *
 * @author Jenni
 */
public class NumberGuesserService {

  private int number;
  private int guessNumber;
  private String win = "You Win!  You guessed my number!";
  private String lose = "You lost!  My number is ";
  private String message = "";

    public NumberGuesserService(int guessNumber) {
        // validation required
        this.guessNumber = guessNumber;
        this.setNumber(number);
    }

    public int getGuessNumber() {
        return guessNumber;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        Random random = new Random();
        number = random.nextInt(21);
        this.number = number;
    }
    
    public void checkNumbers() {
        // validation required
        if (this.getNumber() == guessNumber){
            message = message + win;
        } else {
            message = message + lose + this.getNumber();
        }
    }
    
    public void setMessage(String message) {
        this.message = message;          
    }

    public String getMessage() {
        return message;
    }  
    
}
