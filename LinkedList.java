public class LinkedList {
    private AirportNode headNode;

    public void addNode(String airportID) {
        //Instantiate and assign airport ID
        AirportNode node = new AirportNode();
        node.airportID = airportID;

        //Set next node to head
        node.nextNode = headNode;

        //Assign new Head
        headNode = node;

        }

    public AirportNode getHeadNode() {
        return headNode;
    }
}
