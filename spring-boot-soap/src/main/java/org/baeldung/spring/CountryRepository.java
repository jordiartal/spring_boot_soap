package org.baeldung.spring;
@Component
public class CountryRepository {
	private static final Map<String, Country> countries = new HashMap<>();

	@PostConstruct
	public void initData() {
// initialize countries map
	}

	public Country findCountry(String name) {
		return countries.get(name);
	}
}