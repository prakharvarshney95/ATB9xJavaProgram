package Nov_2024.ex_08112024_Encapsulation;

public class Lab118_Encap {

    public static void main(String[] args) {
        VWOLogin vwoLogin = new VWOLogin("admin", "password123");
        System.out.println(vwoLogin.password);
        vwoLogin.password = "hacker";
        System.out.println(vwoLogin.password);

        GoodVWOLogin goodVWOLogin = new GoodVWOLogin("goodadmin", "admin123");
//        System.out.println(goodVWOLogin.password);
//        goodVWOLogin.password = "pass123";

        String pass = goodVWOLogin.getPassword(true);
        goodVWOLogin.setPassword("hacker123",true);
        System.out.println(pass);
    }
}

class VWOLogin {
    public String username;
    public String password;

    public VWOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

class GoodVWOLogin {

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword(boolean isAdmin) {
        if(isAdmin) {
            return password;
        }
        return "None";
    }

    public void setPassword(String password, boolean isAdmin) {
        if(isAdmin) {
            this.password = password;
        }else {
            System.out.println("Not Allowed");
        }
    }

    private String username;
     private String password;

    public GoodVWOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
