package com.greedy.section02.superKeyword;

public class ComputerDTO extends ProductDTO {

	private String cpu; // cpu
	private int hdd; // hdd 용량
	private int ram; // ram 용량
	private String operationSystem; // 운영체제

	public ComputerDTO() {
//		super();

		System.out.println("기본생성자 호출함...");

	}

	public ComputerDTO(String cpu, int hdd, int ram, String operationSystem) {
		super();
		
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.operationSystem = operationSystem;

		System.out.println("ComputerDTO 클래스의 모든 필드를 초기화하는 생성자 호출함...");
	}

	/* 부모의 필드도 모두 초기화하는 생성자 */
	public ComputerDTO(String code, String brand, String name, int price, java.util.Date manufacturingDate, String cpu,
			int hdd, int ram, String operationSystem) {

		super(code, brand, name, price, manufacturingDate);

		/*
		 * 같은 클래스 내의 다른 생성자를 호출하게 되면 그 생성자 내부에도 super()가 호출되기 때문에 부모생성자를 두 번 호출하게 된다.
		 * 따라서 컴파일 에러가 발생하게 된다. 부모 인스턴스는 한 개만 생성되어야 하고, 따라서 부모 생성자는 한 번만 호출되어야 한다.
		 */
//		this(cpu, hdd, ram, operationSystem); super와 this는 함꼐 사용하지 못함.

		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.operationSystem = operationSystem;

	}

	public String getCpu() {
		return cpu;
	}

	public int getHdd() {
		return hdd;
	}

	public int getRam() {
		return ram;
	}

	public String getOperationSystem() {
		return operationSystem;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public void setOperationSystem(String operationSystem) {
		this.operationSystem = operationSystem;
	}

	@Override
	public String getInformation() {
		
//		return "ComuterDTO ["
//				+ "code=" + super.getCode()
//				+ ", brand=" + super.getBrand()
//				+ ", name=" + super.getName()
//				+ ", price=" + super.getPrice()
//				+ ", manufacturingDate=" + super.getManufacturingDate()
//				+", cpu=" + this.cpu
//				+", hdd" + this.hdd
//				+", ram=" + this.hdd
//				+", operationSystem=" + this.operationSystem
//				+ "]";
	
		return super.getInformation() 		// 재귀호출이란
				+"ComputerDTO ["
				+ "cpu=" + this.cpu
				+ ", hdd=" +  this.hdd
				+ ", ram=" + this.ram
				+ ", operationSystem=" + this.operationSystem
				+ "]";
	
	
	}
}
