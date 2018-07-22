package start;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import tools.GET;
import tools.IpPort;

public class ServerMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("服务器启动.......");
		try {
			ServerSocket so = new ServerSocket(IpPort.SERVER_PORT);
			while (true) {
				Socket s = so.accept();
				System.out.println(s.getInetAddress().getHostAddress() + "已访问");
				Thread t = new GET(s);
				t.start();
			}
		} catch (IOException e) {
			System.out.println("客户端已退出" + e.getMessage());
		}

	}

}
