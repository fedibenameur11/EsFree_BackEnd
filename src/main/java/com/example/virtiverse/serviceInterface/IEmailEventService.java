package com.example.virtiverse.serviceInterface;

import com.example.virtiverse.entities.Participation;

public interface IEmailEventService {
    public void sendConfirmationEmailWithQRCode(Participation participation);
   // public void sendSimpleMessage(String to, String subject, String text);

}
