/***
 * This is the Resistor class of the program. It represents a resistor which is a type of circuit that
 * contains a resistance. It is a child class to Circuit.
 */
public class Resistor
        extends Circuit{
    private final double my_resistance;

    /***
     * This is the constructor for this class. It initializes my_resistance to be the resistance of the resistor.
     * @param resistance the resistance of the resistor
     */
    public Resistor(double resistance){
        this.my_resistance = resistance;
    }

    /***
     * This Method overrides the getResistance method in Circuit so that when a new resistor is created, it must have
     * a resistance returned.
     * @return the resistance of this resistor
     */
    @Override
    public double getResistance() {
        return my_resistance;
    }

    /***
     * This Method overrides the toString method so that if the user would like to know the details of the specific
     * resistor, they can
     * @return the resistor's details: it's resistance as a string
     */
    @Override
    public String toString(){
        String details = "Resistor with resistance of: " + String.valueOf(my_resistance);
        return details;
    }

}
