package com.myjpcap;

import com.ui.Main;

import jpcap.PacketReceiver;
import jpcap.packet.EthernetPacket;
import jpcap.packet.Packet;
import jpcap.packet.TCPPacket;
import jpcap.packet.UDPPacket;

/**
 * 该类实现PacketReceiver接口
 */
public class GetPacket implements PacketReceiver {
	Main main;	//主窗口句柄
	
	public GetPacket(Main main){
		this.main = main;
	}
	
	@Override
	public void receivePacket(Packet packet) {
		EthernetPacket ethernet = (EthernetPacket)packet.datalink;
		this.main.addPacket(packet);
	}

}
