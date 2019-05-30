/*
 * WIP XI Computer Programing 
 */

package III.Output;

/**
 *
 * @author sittiwatlcp
 */
public class _2_Printf {
    public static void main(String[] args) {
        String firstName = "Wippo";
        String lastName = "Ontour";
        String nickName = "Wip";
        double ownWallet = 200.746352;
        double friendWallet = 500.947855;
        
        System.out.printf("สวัสดี เราชื่อ %s นามสกุล %s\nชื่อเล่นชื่อ %s เรามีเงิน %.3f บาท และเพิ่อนเรามีเงิน %.1f บาท \n", firstName, lastName, nickName, ownWallet, friendWallet);
        
        int money = 100;
        System.out.printf("มีเงิน %d บาท", money);
        
    }
}
