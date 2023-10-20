package controller;

import java.util.Set;

import model.Message;
import repository.MessageRepository;
import service.AccountService;

public class Account {
    private String name;
    // private final MessageRepository msgRepo;
    private AccountService accountService;

    // public Account(MessageRepository msgRepo) {
    // this.msgRepo = msgRepo;
    // }

    public Account(AccountService accountService) {
        this.accountService = accountService;
    }

    // public Account(MessageRepository msgRepo, String name) {
    // this(msgRepo);
    // this.name = name;
    // }

    public void send(Message msg) {
        accountService.save(msg);
        System.out.printf("From: %s send message successfully!\n", this.name);
    }

    public void showAllMessages() {
        Set<Message> setMsg = accountService.getAllMessages();
        if (setMsg.isEmpty()) {
            System.out.println("*********************************");
            System.out.println("****Please send more message!****");
            System.out.println("*********************************");
        } else {
            try{
                for (Message msg : setMsg) {
                    System.out.println(String.format("From: %s -> To: %s", msg.getFrom(), msg.getTo()));
                    System.out.println(msg.getData());
                }
            }
            catch(Exception e){
                System.out.println("There are erros while trying to view the message");
                return;
            }
        }
    }

    public void showMessage() {
        Message msgLatest = accountService.getMessage();
        if (msgLatest != null) {
            System.out.println(String.format("From: %s -> To: %s", msgLatest.getFrom(), msgLatest.getTo()));
            System.out.println(msgLatest.getData());
        } else {
            System.out.println("*********************************");
            System.out.println("****Please send more message!****");
            System.out.println("*********************************");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}