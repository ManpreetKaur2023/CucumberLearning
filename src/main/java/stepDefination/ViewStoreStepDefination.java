package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import org.junit.Assert;

public class ViewStoreStepDefination {

	Response response;
	
	@Given("store API is available")
	public void store_api_is_available() {
	    System.out.println("Given Method");
	    baseURI = "http://localhost:3030/";
	}

	@When("I invoke store API with get method")
	public void i_invoke_store_api_with_get_method() {
		System.out.println("When Method");
		response = given().when().get("stores");
		given().when().log().all().get("stores");
	}

	@Then("The response code should be {int}")
	public void the_response_code_should_be(Integer int1) {
		System.out.println("Then Method");
		 Assert.assertEquals(Long.toString(response.statusCode()), Long.toString(int1));
	}
}
