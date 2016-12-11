/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.chatwebsockets;

import java.io.StringReader;
import java.util.Date;
import javax.json.Json;
import javax.json.JsonObject;

import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

/**
 *
 * @author maxim
 */
public class MessageDecoder implements Decoder.Text<Message> {
    
	@Override
	public void init(final EndpointConfig config) {
	}

	@Override
	public void destroy() {
	}

	@Override
	public Message decode(final String textMessage) throws DecodeException {
		Message chatMessage = new Message();
         //       System.out.println(textMessage);
		JsonObject obj = Json.createReader(new StringReader(textMessage))
				.readObject();
		chatMessage.setMessage(obj.getString("message"));
		chatMessage.setSender(obj.getString("sender"));
		chatMessage.setReceived(new Date());
         //         System.out.println(chatMessage.toString());
		return chatMessage;
	}

	@Override
	public boolean willDecode(final String s) {
		return true;
	}
}
