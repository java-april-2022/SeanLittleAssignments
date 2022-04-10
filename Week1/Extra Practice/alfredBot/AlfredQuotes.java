import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format("Hello, %s. Lovely to see you.", name);
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        return String.format("It is currently %s", new Date());
    }
    
    public String respondBeforeAlexis(String listen) {
        // YOUR CODE HERE
        if (listen.indexOf("Alexis") >= 0) {
            return "Don't bother with her Master Wayne, you'll always be better than Bezos.";
        }
        if (listen.indexOf("Alfred") >= 0)  {
            return "Maybe we should be focusing more on saving the city Master Wayne?";
        }
        return "Nothing is more comforting than the sound of silence.";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    public String testGuestGreeting(String name, String dayPeriod) {
        return String.format("Hello, %s. Lovely to see you on this wonderful %s.", name, dayPeriod);
    }

    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

