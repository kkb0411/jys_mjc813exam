package com.mjc.mjc813.cal;

public class Computer {
	private String name;
	private String cpu;
	private int ram;
	private String storageType;
	private int storageSize;
	private String graphicCard;
	
	public Computer(String name, String cpu, int ram, String storageType, int storageSize, String graphicCard) {
		this.name = name;
		this.cpu = cpu;
		this.ram = ram;
		this.storageType = storageType;
		this.storageSize = storageSize;
		this.graphicCard = graphicCard;
	}
	public void boot() {
		System.out.println(name + " 켜졌습니다.");
	}
	
	public void printSpec() {
		System.out.println("CPU : " + cpu);
		System.out.println("RAM : " + ram + "GB");
		System.out.println("Storage : " + storageType + " " + storageSize + "GB");
		System.out.println("Graphic : " + graphicCard);
		System.out.println("----------------------------");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer[] computers = new Computer[5];
		computers[0] = new Computer("mjc813Com", "Gen9_i7", 16, "HDD", 500, "GTX_1660");
		computers[1] = new Computer("devMachine1", "Gen9_i5", 8, "SSD", 1000, "Intel_A770");
		computers[2] = new Computer("renderBox", "Gen9_i9", 32, "SSD", 2000, "RTX_4080");
		computers[3] = new Computer("gamingRig", "Gen9_i7", 16, "HDD", 1000, "GTX_1660");
		computers[4] = new Computer("testBench", "Gen9_i5", 4, "SSD", 500, "Intel_A770");
		
		for(Computer c : computers) {
			c.boot();
			c.printSpec();
		}

	}

}
