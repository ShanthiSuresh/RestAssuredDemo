package com.test.restApis;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class GetReqBDD {

	@Test
	public void test_NumOfCircuits_2017(){
		given().
		when().
			get("http://ergast.com/api/f1/2007/circuits.json").
		then().
			assertThat().
			statusCode(200).
			body("MRData.CircuitTable.Circuits.circuitId",hasSize(17)).
			and().
			header("Content-Length",equalTo("3921")).
			log().all();
		
		
	}
}
