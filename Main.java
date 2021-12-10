//Jamie Gashler
//Java Programming I
//Homework 7 - Circuits

/***
 * This is the main class of this program, where the main functions of the program are accomplished.
 */
public class Main {

    /** This is the main method of the program. It displays the Resistance of the combined circuits given for each
     * test case.
     * @param args contains the supplied command-line arguments as an array of String objects
     */
    public static void main(String[] args) {

        //Example given in HW assignment
        var circuit1 = new Parallel();
        circuit1.add(new Resistor(100));
        var circuit2 = new Serial();
        circuit2.add(new Resistor(100));
        circuit2.add(new Resistor(200));
        circuit1.add(circuit2);
        System.out.printf("Example- Combined Resistance: %.2f", circuit1.getResistance());

        //Test case 1
        var circuit3 = new Parallel();
        var circuit4 = new Serial();
        circuit4.add(new Resistor(100));
        circuit4.add(new Resistor(200));
        circuit4.add(new Resistor(100));
        circuit4.add(new Resistor(300));
        circuit3.add(circuit4);
        var circuit5 = new Parallel();
        var circuit6 = new Resistor(100);
        circuit5.add(circuit6);
        var circuit7 = new Resistor(200);
        circuit5.add(circuit7);
        circuit3.add(circuit5);
        System.out.printf("%nTest Case 1- Combined Resistance: %.2f", circuit3.getResistance());

        //Test case 2
        var circuit8 = new Parallel();
        var circuit9 = new Serial();
        circuit9.add(new Resistor(400));
        circuit9.add(new Resistor(800));
        circuit8.add(circuit9);
        var circuit10 = new Parallel();
        var circuit11 = new Serial();
        circuit11.add(new Resistor(100));
        circuit11.add(new Resistor(600));
        circuit10.add(circuit11);
        var circuit12 = new Resistor(700);
        circuit10.add(circuit12);
        circuit8.add(circuit10);
        System.out.printf("%nTest Case 2- Combined Resistance: %.2f", circuit8.getResistance());

        //Test case 3
        var circuit13 = new Parallel();
        var circuit14 = new Serial();
        circuit14.add(new Resistor(400));
        circuit14.add(new Resistor(500));
        circuit13.add(circuit14);
        var circuit15 = new Parallel();
        var circuit16 = new Resistor(400);
        circuit15.add(circuit16);
        var circuit17 = new Parallel();
        var circuit18 = new Resistor(100);
        circuit17.add(circuit18);
        var circuit19 = new Resistor(200);
        circuit17.add(circuit19);
        circuit15.add(circuit17);
        circuit13.add(circuit15);
        System.out.printf("%nTest Case 3- Combined Resistance: %.2f", circuit13.getResistance());
    }

}
