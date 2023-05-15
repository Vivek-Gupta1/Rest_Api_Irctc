package Vivek.Demo.RestController;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import Vivek.Demo.BookingServices.BookingServices;
import Vivek.Demo.Request.Passanger;
import Vivek.Demo.Response.TecketData;

@RestController
public class TecketRestController {
	@Autowired
 private BookingServices services;
	
	//method for post the details
	@PostMapping(value="/tecket",
			    consumes= {"application/json"},
			    produces = {"application/json"}
			)
	public ResponseEntity<TecketData> tecketBooking(@RequestBody Passanger passanger){
		TecketData tecket = services.bookTecket(passanger);
		return new ResponseEntity<>(tecket,HttpStatus.CREATED);
		
	}
	
	//method for get the details
	@GetMapping(value="/tecket/{tecketNo}",

			 produces = MediaType.APPLICATION_JSON_VALUE
			)
	public TecketData getTecketDataByNum(@PathVariable Integer tecketNo) {
		return services.getTecket(tecketNo) ;
		
	}
	
}
