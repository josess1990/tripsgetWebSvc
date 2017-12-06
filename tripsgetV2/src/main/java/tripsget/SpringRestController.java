package tripsget;

	import org.springframework.web.bind.annotation.*;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RestController;



	@RestController
	@RequestMapping("/service")
	public class SpringRestController {
	 
		@RequestMapping(value = "/{name}", method = RequestMethod.GET)
		 public String hello(@PathVariable String name) {
			String result="Hello "+name; 
			return result;
		 }
	
	
		@RequestMapping(value = "/getPrice", method = RequestMethod.GET)
	    public Budget getPrice(
	    		@RequestParam(value = "cityId", required = false) String cityId,
	    		@RequestParam(value = "travellers", required = false) String travellers,
	    		@RequestParam(value = "days", required = false) String days,
	    		@RequestParam(value = "transportLvl", required = false) String transportLvl,
	    		@RequestParam(value = "partyLvl", required = false) String partyLvl,
	    		@RequestParam(value = "foodLvl", required = false) String foodLvl,
	    		@RequestParam(value = "hotelLvl", required = false) String hotelLvl,
	    		@RequestParam(value = "startDate", required = false) String startDate,
	    		@RequestParam(value = "endDate", required = false) String endDate,
	    		@RequestParam(value = "transportBudget", required = false) String transportBudget,
	    		@RequestParam(value = "partyBudget", required = false) String partyBudget,
	    		@RequestParam(value = "foodBudget", required = false) String foodBudget,
	    		@RequestParam(value = "hotelBudget", required = false) String hotelBudget,
	    		@RequestParam(value = "entertainmentBudget", required = false) String entertainmentBudget
	    		) {
	       
			Budget respBudg = new Budget(transportBudget, partyBudget, foodBudget, hotelBudget, entertainmentBudget);

	        return respBudg;
	    }
		

	    class Budget {

	    	public Budget(){
	    		
	    	}
	        
	    	public Budget(String transportBudget, String partyBudget, String foodBudget, String hotelBudget,
					String entertainmentBudget) {
				this.transportBudget = transportBudget;
				this.partyBudget = partyBudget;
				this.foodBudget = foodBudget;
				this.hotelBudget = hotelBudget;
				this.entertainmentBudget = entertainmentBudget;
			}
			public String transportBudget;
	        public String partyBudget;
	        public String foodBudget;
	        public String hotelBudget;
	        public String entertainmentBudget;
			public String getTransportBudget() {
				return transportBudget;
			}
			public void setTransportBudget(String transportBudget) {
				this.transportBudget = transportBudget;
			}
			public String getPartyBudget() {
				return partyBudget;
			}
			public void setPartyBudget(String partyBudget) {
				this.partyBudget = partyBudget;
			}
			public String getFoodBudget() {
				return foodBudget;
			}
			public void setFoodBudget(String foodBudget) {
				this.foodBudget = foodBudget;
			}
			public String getHotelBudget() {
				return hotelBudget;
			}
			public void setHotelBudget(String hotelBudget) {
				this.hotelBudget = hotelBudget;
			}
			public String getEntertainmentBudget() {
				return entertainmentBudget;
			}
			public void setEntertainmentBudget(String entertainmentBudget) {
				this.entertainmentBudget = entertainmentBudget;
			}


	        
	    }
	}
