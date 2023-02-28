public class Wilder{

    //attributs
    private String firstName;
    private boolean aware;

    //constructor
    public Wilder(String name) {
        this.firstName = name;
        this.aware = false;
    }

    //getters
    public String getName() {
        return this.firstName;
    }

    public boolean getAware() {
        return this.aware;
    }

    //setters
    public void setName( String name) {
        this.firstName=name;
    }

    public void setAware( boolean aware) {
        this.aware=aware;
    }

    //method
    public String whoAmI () {
        if (getAware()) {
        return "Je m'appelle " + this.getName() + " et je suis aware";
          } else {
             return "Je m'appelle " + this.getName() + " et je ne suis pas aware";
         }
    }
}