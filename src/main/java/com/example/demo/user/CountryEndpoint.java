package com.example.demo.user;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.demo.Country;
import com.example.demo.GetCountryRequest;
import com.example.demo.GetCountryResponse;

@Endpoint
public class CountryEndpoint {
	private static final String NAMESPACE_URI = "http://www.yourcompany.com/webservice";

//    private CountryRepository countryRepository;
//
//    @Autowired
//    public CountryEndpoint(CountryRepository countryRepository) {
//        this.countryRepository = countryRepository;
//    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
        GetCountryResponse response = new GetCountryResponse();
        response.setCountry(new Country());
        return response;
    }
}
