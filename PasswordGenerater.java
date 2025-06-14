import java.util.Random;
public class PasswordGenerater  {
    public static void main(String[] args) {
        String uppercase ="QWERTYUIOPASDFGHJKLZXCVBNM";
        String lowercase = "qwertyuiopasdfghjklzxcvbnm";
        String number = "0123456789";
        String speacialchar = "<>,?,{},.,/";
        String combination =uppercase+lowercase+speacialchar+number;
        
        int len = 8;
        char[] password = new char[len];
        Random r=new Random();
        for(int i=0;i<len;i++){
            password[i]=combination.charAt(r.nextInt(combination.length()));
        }  
           
         System.out.println("Generated password: "+new String(password));
        
        
    }
}