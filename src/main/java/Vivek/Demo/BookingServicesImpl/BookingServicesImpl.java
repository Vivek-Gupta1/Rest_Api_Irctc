package Vivek.Demo.BookingServicesImpl;

import java.util.HashMap;
import java.util.Map;

import org.apache.catalina.mbeans.MBeanUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import Vivek.Demo.BookingServices.BookingServices;
import Vivek.Demo.Request.Passanger;
import Vivek.Demo.Response.TecketData;


@Service
public class BookingServicesImpl implements BookingServices{
  //to store our data in key and value
private Map<Integer,TecketData>mapTecket = new HashMap<>();
	private  Integer tecketNo   = 1;
	@Override
	public TecketData bookTecket(Passanger passenger) {
		System.out.println(passenger);
		TecketData t = new TecketData();
		//Copy TecketData  to passenger
		BeanUtils.copyProperties(passenger, t);
		t.setTecprice(505.0);
		t.setStatus("confirm");
		t.setTecketNo(tecketNo);
		mapTecket.put(tecketNo, t);
		tecketNo++;
		return t;
	}

	@Override
	public TecketData getTecket(Integer tecketNo) {
		if (mapTecket.containsKey(tecketNo)) {
			return mapTecket.get(tecketNo);
		}
		return null;
	}

}
