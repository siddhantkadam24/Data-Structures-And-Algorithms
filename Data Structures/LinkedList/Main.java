public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertAtStart(10);
        list.insertAtStart(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.insertAtRandom(60, 2);
        list.insertAtRandom(70, 3);
        list.displayFromStart();
        list.deleteAt(1);
        list.displayFromStart();
    }
}
