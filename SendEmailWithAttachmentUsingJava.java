package demoproject;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendEmailWithAttachmentUsingJava {

	public static void main(String[] args) throws Exception, MessagingException {
		final String username="username";
		final String password="password";
		
		String fromemail="fromEmail@email.com";
		String toEmail="toEmail@outlook.com";

		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.startttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");

		Session session = Session.getInstance(properties, new Authenticator() {

			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}

		});

		MimeMessage message = new MimeMessage(session);

		message.setFrom(new InternetAddress(fromemail));
		message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
		message.setSubject("Email with Attachment");

		// Body Part which contains the text
		Multipart content = new MimeMultipart();
		MimeBodyPart textBodyPart = new MimeBodyPart();
		textBodyPart.setText("Resume");

		// Body Part which contains the attachment
		MimeBodyPart attachmentBodyPart = new MimeBodyPart();
		attachmentBodyPart.attachFile("D:\\Hemendra Data\\HemendraResume.pdf");

		// Attaching both the body parts
		content.addBodyPart(textBodyPart);
		content.addBodyPart(attachmentBodyPart);
		message.setContent(content);

		Transport.send(message);

	}

}
