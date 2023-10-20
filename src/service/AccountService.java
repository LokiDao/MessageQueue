package service;

import java.util.Set;

import model.Message;
import repository.MessageRepository;
import repository.impl.MessageQueueBasedRepository;
import repository.impl.MessageStackBasedRepository;

public class AccountService {
    private MessageRepository msgQueueRepo = new MessageQueueBasedRepository();
    private MessageRepository msgStackRepo = new MessageStackBasedRepository();

    public Set<Message> getAllMessages() {
        try{
            for (Message msg : msgStackRepo.getAllMessages())
                msgQueueRepo.save(msg);
            return msgQueueRepo.getAllMessages();
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    public Message getMessage() {
        msgQueueRepo.save(msgStackRepo.getMessage());
        return msgQueueRepo.getMessage();
    }

    public void save(Message msg) {
        msgStackRepo.save(msg);
    }
}
