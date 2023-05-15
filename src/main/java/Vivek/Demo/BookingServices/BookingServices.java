package Vivek.Demo.BookingServices;

import org.springframework.stereotype.Service;

import Vivek.Demo.Request.Passanger;
import Vivek.Demo.Response.TecketData;

@Service
public interface BookingServices {
  public TecketData bookTecket(Passanger passenger);
  
  public TecketData getTecket(Integer tecketNo);
}
