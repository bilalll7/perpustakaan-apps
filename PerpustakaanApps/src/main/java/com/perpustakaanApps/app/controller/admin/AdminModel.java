
package main.java.com.perpustakaanApps.app.controller.admin;

public class AdminModel {
    private static String username;
    private String nomorTelepon;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        AdminModel.username = username;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }
    
}
