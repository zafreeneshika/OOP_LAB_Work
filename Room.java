public class Room {
    int roomNo;
    String roomType;
    Float roomArea;
    boolean acMachine;
    Room(){
        System.out.println("Hello");

    }
    Room(int roomNo,String roomType,Float roomArea,boolean acMachine) {
    this.roomNo=roomNo;
    this.roomType=roomNo;
    this.roomNo=roomArea;
    this.acMachine=acMachine;
    }
    public void displayData(){
        System.out.println(roomNo);
        System.out.println(roomType);
        System.out.println(roomArea);
        System.out.println(acMachine);
    }
    public static void main(String[]args){
            new Room();
        Room b1 = new Room("roomnNo: 101,roomType: CSE,roomArea: 4701,acMachine: false");
        b1.displayData();

    }
}
