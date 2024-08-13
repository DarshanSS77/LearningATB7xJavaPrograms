package ex_10082024.encapsulation;

public class ICICIBankRunner {

    public static void main(String[] args) {
        ICICIBank user1 = new ICICIBank("Darshan", 200);
        user1.setBalance(500000, false);
        System.out.println(user1.getName());
        System.out.println(user1.getBalance());

        ICICIBank user2 = new ICICIBank("Darshan", 200);

        user2.setBalance(500000, true);
        System.out.println(user2.getName());
        System.out.println(user2.getBalance());
    }


}
