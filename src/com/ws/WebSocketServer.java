package com.ws;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/ws")
public class WebSocketServer {

	private Session session;

	@OnOpen
	public void connect(Session session) {
		this.session = session;
	}

	@OnClose
	public void close() {
		this.session = null;
	}
	
	@OnMessage
	public void message(String message) {
		System.out.println("Message = "+message);
		this.session.getAsyncRemote().sendText(message + " received");
	}
}
