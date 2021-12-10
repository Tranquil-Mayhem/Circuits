import java.util.ArrayList;

/***
 * This is the Serial class of the program. It represents a serial, which is a type of circuit that
 * contains multiple resistors. It is a child class to Circuit.
 */
public class Serial
        extends Circuit{
    private final ArrayList<Circuit> circuitList;
    private double totalResistance = 0.0;

    /***
     * This is the constructor for this class. It initializes a circuitList to be a new list of type Circuit
     */
    public Serial(){
        circuitList = new ArrayList<Circuit>();

    }

    /***
     * This is the add method for this Serial. It adds each resistor to the circuitList that the serial contains
     * @param resistor each resistor that is contained within the serial
     */
    public void add(Resistor resistor) {
        circuitList.add(resistor);
    }

    /***
     * This Method overrides the getResistance method in Circuit so that when a new serial is created, it must have
     * a totalResistance returned. It iterates through all of the resistors in circuitList and adds each of their
     * resistances to the total resistance of the serial.
     * @return the total resistance of this serial (or series of resistors)
     */
    @Override
    public double getResistance() {
        for (var c : this.circuitList){
            totalResistance += c.getResistance();
        }
        return totalResistance;
    }

    /***
     * This Method overrides the toString method so that if the user would like to know the details of the specific
     * serial, they can
     * @return the Serial's details: it's total resistance as a string
     */
    @Override
    public String toString(){
        String details = "Serial with total resistance of: " + getResistance();
        return details;
    }

}
