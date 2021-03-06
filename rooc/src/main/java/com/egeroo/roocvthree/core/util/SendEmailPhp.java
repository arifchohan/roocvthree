package com.egeroo.roocvthree.core.util;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmailPhp {

    private String from;
    private String to;
    private String subject;
    private String text;

    public SendEmailPhp(String from, String to, String subject, String text){
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.text = text;
    }

    public static void main(String[] args) {

            String from = "email@server.com";
            String to = "email@server.com";
            String subject = "Test";
            String message = "A test message";
            SendEmailPhp sendMail = new SendEmailPhp(from, to, subject, message);
            sendMail.send();
    }

    public void send(){

        Properties props = new Properties();
        props.put("mail.smtp.host", "email.server.com");
        //props.put("mail.smtp.port", "25");
        Session mailSession = Session.getDefaultInstance(props);
        Message simpleMessage = new MimeMessage(mailSession);
        InternetAddress fromAddress = null;
        InternetAddress toAddress = null;
        try {
            fromAddress = new InternetAddress(from);
            toAddress = new InternetAddress(to);
        } catch (AddressException e) {
            e.printStackTrace();
        }

        try {
        	System.out.print("Trying to send");
            simpleMessage.setFrom(fromAddress);
            simpleMessage.setRecipient(RecipientType.TO, toAddress);
            simpleMessage.setSubject(subject);
            simpleMessage.setText(text);    
            Transport.send(simpleMessage);
            System.out.print("send....");
        } catch (MessagingException e) {
        	System.out.print("failed to send");
            e.printStackTrace();
        }
    }
}