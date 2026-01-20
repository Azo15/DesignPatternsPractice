//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        1.senaryo:

//        IMessageSender smsKanali = new SmsSender();
//        Message acilMessage = new UrgentContent(smsKanali);
//        acilMessage.sendMessage("Sinav Sonuclari aciklandi...!!");


//        2.senaryo

//        IMessageSender emailKanal = new EmailSender();
//        Message message = new TextContent(emailKanal);
//        message.sendMessage("Yarın ders saat 10:00'da.");


//        3.senaryo
        IMessageSender emailKanal2 = new EmailSender();
        Message acilMessage2 = new UrgentContent(emailKanal2);
        acilMessage2.sendMessage("Yarın ders saat 10:00'da.");
    }
}