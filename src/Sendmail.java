import javax.mail.PasswordAuthentication;
import java.util.Properties;
import javax.mail.Session;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Sendmail {
      
    static String MyAccount;
    static String Password;
    public static int smail(String r, String sub,String mymess)
    {
       Properties p = new Properties();
       p.put("mail.smtp.auth","true");
       p.put("mail.smtp.starttls.enable","true");
       p.put("mail.smtp.host","smtp.gmail.com");
       p.put("mail.smtp.port","587");
        
       Session session;
       session = Session.getInstance(p, new Authenticator() {
           
           @Override
           protected PasswordAuthentication getPasswordAuthentication(){
              return new PasswordAuthentication(MyAccount, Password);
           }
       });
       
        Message message = prepareMessage(session,MyAccount,r,sub,mymess);
        int i = 1;
        try {
            Transport.send(message);
        } catch (Exception ex) {
             i--;
             EWrong1 w = new EWrong1();
             w.setSize(720,430);
             w.setVisible(true);   
        }
        return i;
    }

    private static Message prepareMessage(Session session, String MyAccount, String r,String sub, String mymess) {
        try {
            Message m = new MimeMessage(session);
            m.setFrom(new InternetAddress(MyAccount));
            m.setRecipient(Message.RecipientType.TO, new InternetAddress(r));
            m.setSubject(sub);
            m.setText(mymess);
            return m;
        } catch (Exception ex) {
             Wrong w = new Wrong();
             w.setSize(650,360);
             w.setVisible(true);
             w.SetError(ex.getMessage());
        }
        return null;
    }
}
