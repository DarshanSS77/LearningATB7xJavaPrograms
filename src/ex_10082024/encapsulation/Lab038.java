package ex_10082024.encapsulation;

public class Lab038 {
    public static void main(String[] args) {
//        login1 l = new login1();
        login1 l = new login1("username123", "pass123");
        System.out.println(l.getUsername());
        System.out.println(l.getPassword());

        l.setUsername("Darshan", true);

        System.out.println(l.getUsername());
//        l.username = "new name";
//        System.out.println(l.username);
    }

}

class login1 {
    private String username = "abc";
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username, boolean isAuth) {
        if (isAuth) {
            this.username = username;
        } else {
            System.out.println("Not allowed to set the username");
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public login1(String name, String pass) {
        this.username = name;
        this.password = pass;
    }
//    public login1() {
//        this.username = "abcd";
////        this.password ;
//    }
}


