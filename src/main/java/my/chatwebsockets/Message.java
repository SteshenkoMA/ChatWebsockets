/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.chatwebsockets;

import java.util.Date;

/**
 *
 * @author maxim
 */
public class Message {
    
    private String message;
	private String sender;
	private Date received;

	public final String getMessage() {
		return message;
	}

	public final void setMessage(final String message) {
		this.message = message;
	}

	public final String getSender() {
		return sender;
	}

	public final void setSender(final String sender) {
		this.sender = sender;
	}

	public final Date getReceived() {
		return received;
	}

	public final void setReceived(final Date received) {
		this.received = received;
	}

	@Override
	public String toString() {
		return "[message=" + message + ", sender=" + sender
				+ ", received=" + received + "]";
	}
    
}
