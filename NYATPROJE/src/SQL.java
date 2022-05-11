
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class SQL {
    public static SQL data;

    private SQL() {

    }

    public static SQL Nesne() {
        if (data == null) {
            data = new SQL();
        }
        return data;
    }

    public boolean UserAuthentication(String Username, String Password) {
        try {
            String url="jdbc:postgresql://localhost:5432/Users";
            Connection concect=null;
            concect = DriverManager.getConnection( url, "postgres", "Yc.gedik.12.10");
            //if (concect != null) {
            String UserSQL = "SELECT * FROM public.\"Users\"";
            Statement stmt = concect.createStatement();
            ResultSet result = stmt.executeQuery(UserSQL);
            concect.close();
            String kullaniciAdi = "";
            String sifre = "";
            while (result.next()) {
                kullaniciAdi = result.getString("Adi");
                sifre = result.getString("Sifre");
                //}
                if (kullaniciAdi.equals(Username) && sifre.equals(Password)) {
                    System.out.println("Tebrikler Giriş Başarlı ");
                    return true;
                } else {
                    System.out.println("     Giriş Yanlış Lütfen Tekrar Deneyiniz!!   ");
                    return false;
                }
            } //else {
            //System.out.println("Veritabanina Baglanilaması Başarsız||Database Connect Failed");
            // return false;
            // }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

        return true;
    }
}
