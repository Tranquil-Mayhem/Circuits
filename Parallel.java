import java.util.ArrayList;

/***
 * This is the Parallel class of the program. It represents a parallel, which is a type of circuit that
 * contains multiple types of circuits that can be resistors or serials. It is a child class to Circuit.
 */
public class Parallel
        extends Circuit{
    private final ArrayList<Circuit> circuitList;
    private double totalResistance = 0.0;

    /***
     * This is the constructor for the Parallel class. It initializes a circuitList to be a new list of type Circuit
     */
    public Parallel(){
      circuitList = new ArrayList<Circuit>();

    }

    /***
     * This is the add method for this parallel. It adds each circuit to the circuitList that the parallel contains
     * @param circuit each circuit that is contained within the parallel
     */
    public void add(Circuit circuit) {
        circuitList.add(circuit);
    }

    /***
     * This Method overrides the getResistance method in Circuit so that when a new parallel is created, it must have
     * a totalResistance returned. It iterates through all of the circuits in circuitList and adds 1 divided their
     * resistance to the total resistance of the parallel.
     * @return the reciprocal of the total resistance of this parallel
     */
    @Override
    public double getResistance() {
            for (var c : this.circuitList){
                totalResistance += 1 / c.getResistance();
            }
            return 1 / totalResistance;
    }

    /***
     * This Method overrides the toString method so that if the user would like to know the details of the specific
     * Parallel, they can
     * @return the Parallel's details: it's total resistance as a string
     */
    @Override
    public String toString(){
        String details = "Parallel with total resistance of: " + getResistance();
        return details;
    }

}
