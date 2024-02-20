public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList LinkedList = new LinkedList();

        LinkedList.addNode("PAN");
        LinkedList.addNode("MED");
        LinkedList.addNode("CAL");
        AirportNode headNode = LinkedList.getHeadNode();
        System.out.println("Current HeadNode: " + headNode.airportID);
    }
}