/***
 * This is the public class that represents a circuit. It contains the compareTo and abstract getResistance
 * methods. It implements the Comparable interface, and is the parent class to classes Resistor, Serial and Parallel.
 */
public abstract class Circuit
    implements Comparable<Circuit> {

    /***
     *getResistance() is the abstract method which gets the resistance of each individual circuit. It
     * returns no value and is declared without braces.
     */
     abstract public double getResistance();

    /***
     * This Method overrides the compareTo method to allow the comparison of the resistance for each circuit
     * @param circuit a single circuit
     * @return the compared value whether or not the resistance was greater, equal to or less than the resistance
     * of the single circuit
     */
    @Override
    public int compareTo(Circuit circuit){
        if (this.getResistance() < circuit.getResistance())
        {
            return -1;
        }
        else if((this.getResistance() > circuit.getResistance()))
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
