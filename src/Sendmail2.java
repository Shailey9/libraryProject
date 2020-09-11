import java.util.ArrayList;
import javax.mail.PasswordAuthentication;
import java.util.Properties;
import javax.mail.Session;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class Sendmail2 {
    static String MyAccount;
    static String Password;
    static ArrayList files = new ArrayList();
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

        MimeBodyPart[] b1 = new MimeBodyPart[files.size()];       
        try {
            int count = 0;
            for( Object o : files ){
              b1[count] = new MimeBodyPart();
              b1[count].attachFile(o.toString());
              count++;
          }  
        } catch (Exception ex) {
             Wrong w = new Wrong();
             w.setSize(650,360);
             w.setVisible(true);
             w.SetError("ERROR : "+ex.getMessage());
        }
        Multipart mp = new MimeMultipart();
        try {
            int count = 0;
            for( Object o : files )
             {
                mp.addBodyPart(b1[count]);
                count++;
             }
        } catch (MessagingException ex) {
             Wrong w = new Wrong();
             w.setSize(650,360);
             w.setVisible(true);
             w.SetError("ERROR : "+ex.getMessage());
        }
       
        Message message = prepareMessage(session,MyAccount,r,sub,mymess,mp);
        int i = 1;
        try {
            Transport.send(message);
        } catch (Exception ex) {
             i--;
             EWrong1 d = new EWrong1();
             d.setSize(720,450);
             d.setVisible(true);
        }
        return i;
    }
    private static Message prepareMessage(Session session, String MyAccount, String r,String sub, String mymess, Multipart mp) {
        try {
            Message m = new MimeMessage(session);
            m.setFrom(new InternetAddress(MyAccount));
            m.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(r) );
            m.setSubject(sub);
            m.setText(mymess);
            m.setContent(mp);
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