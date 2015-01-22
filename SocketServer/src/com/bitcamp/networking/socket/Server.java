package com.bitcamp.networking.socket;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {
	public static final int port = 1728;
	
	public static void startServer(){
		try {
			ServerSocket server = new ServerSocket(port);
			while(true){
				System.out.println("waiting");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		startServer();
	}

}
