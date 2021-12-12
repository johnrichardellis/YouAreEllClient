package youareell;

import controllers.*;

public class YouAreEll {

    TransactionController tt;
    MessageController messageController;
    IdController idController;

    public YouAreEll (TransactionController t) {
        this.tt = t;
    }


    public YouAreEll(MessageController messageController, IdController idController) {
        this.messageController = messageController;
        this.idController = idController;
//        this.tt = new TransactionController(messageController, idController);
    }

    public static void main(String[] args) {
        // hmm: is this Dependency Injection?
        YouAreEll urlhandler = new YouAreEll(
            new TransactionController(
                new MessageController(), new IdController()
        ));
        System.out.println(urlhandler.MakeURLCall("/ids", "GET", ""));
        System.out.println(urlhandler.MakeURLCall("/messages", "GET", ""));
    }


    private String MakeURLCall(String url, String method, String payload) {
        this.tt = new TransactionController(messageController, idController);
        if (method.equalsIgnoreCase("GET")) {
            return tt.getCalls(url);
        }
        return null;
    }

    public String get_ids() {

        return MakeURLCall("/ids", "GET", "");
    }

    public String get_messages() {

        return MakeURLCall("/messages", "GET", "");
    }


}
