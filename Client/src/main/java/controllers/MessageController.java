package controllers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import models.Id;
import models.Message;

public class MessageController {

    private HashSet<Message> messagesSeen;
    private List<Message> messagesList;

    public MessageController(HashSet<Message> messagesSeen) {
        this.messagesSeen = messagesSeen;
        messagesList = new ArrayList<>();
    }

    public MessageController() {
        messagesList = new ArrayList<>();
    }

    public HashSet<Message> getMessagesSeen() {
        return messagesSeen;
    }

    public void setMessagesSeen(HashSet<Message> messagesSeen) {
        this.messagesSeen = messagesSeen;
    }


    // WILL NEED TO COMPLETE THINGS IN HERE
    // why a HashSet??

//    public List<Message> getMessages() {
//
//        return messagesList;
//    }
//    public List<Message> getMessagesForId(Id Id) {
//
//        return messagesList;
//    }
//
//
//    public Message getMessageForSequence(String seq) {
//        return null;
//    }
//    public ArrayList<Message> getMessagesFromFriend(Id myId, Id friendId) {
//        return null;
//    }
//    public Message postMessage(Id myId, Id toId, Message msg) {
//        return null;
//    }
 
}