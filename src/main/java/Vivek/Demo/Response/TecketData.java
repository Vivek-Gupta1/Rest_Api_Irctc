package Vivek.Demo.Response;

import lombok.Data;

@Data
public class TecketData {
	private Integer tecketNo;
	private String status;
	private Double Tecprice;
	private String name;
	private String from;
	private String to;
	private String doj;
	private String trainNo;
}
