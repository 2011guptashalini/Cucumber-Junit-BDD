Feature: Validating Place API's
@AddPlace @Regression
Scenario Outline: Verify if Place is being Succesfully added using AddPlaceAPI
	Given Add Place Payload with "<name>"  "<language>" "<address>"
	When user calls "AddPlaceAPI" with "POST" http request
	Then the API call got success with status code 200
	And "status" in response body is "OK"
	And "scope" in response body is "APP"
	And verify place_Id created maps to "<name>" using "getPlaceAPI"
	
Examples:
	|name 	 | language |address		   |
	|AAhouse |  English |World cross center|
#	|BBhouse | Spanish  |Sea cross center  |

@DeletePlace @Regression
Scenario: Verify if Delete Place functionality is working

	Given DeletePlace Payload
	When user calls "deletePlaceAPI" with "POST" http request
	Then the API call got success with status code 200
	And "status" in response body is "OK"

@desktop	
Scenario: Verify if google.com opens and google word present
	Given User launch browser and type google.com
	When user search for apple and press enter
	Then search results opens
	And Apple is present on that

	 



	

	
	
	
	
	
	

	
	
	