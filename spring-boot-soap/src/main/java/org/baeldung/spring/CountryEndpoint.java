package org.baeldung.spring;

@Endpoint
public class CountryEndpoint {
private static final String NAMESPACE_URI = "http://www.baeldung.com/springsoap/gen (http://www.bael
	private CountryRepository countryRepository;

	@Autowired
	public CountryEndpoint(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
	@ResponsePayload
	public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
		GetCountryResponse response = new GetCountryResponse();
		response.setCountry(countryRepository.findCountry(request.getName()));
		return response;
	}
}