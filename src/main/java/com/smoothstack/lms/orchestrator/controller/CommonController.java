package com.smoothstack.lms.orchestrator.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@RestController
public class CommonController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/auth/**")
	public ResponseEntity<Object> handleAuthGetRequest(HttpServletRequest request,
			@RequestHeader MultiValueMap<String, String> headers) {
		try {
			return restTemplate.exchange(String.format("http://auth%s", request.getRequestURI()), HttpMethod.GET,
					new HttpEntity<Object>(headers), Object.class);
		} catch (HttpClientErrorException e) {
			return ResponseEntity.status(e.getStatusCode()).build();
		}
	}

	@PostMapping("/auth/**")
	public ResponseEntity<Object> handleAuthPostRequest(HttpServletRequest request, @RequestBody Object object,
			@RequestHeader MultiValueMap<String, String> headers) {
		try {
			return restTemplate.exchange(String.format("http://auth%s", request.getRequestURI()), HttpMethod.POST,
					new HttpEntity<Object>(object, headers), Object.class);
		} catch (HttpClientErrorException e) {
			return ResponseEntity.status(e.getStatusCode()).build();
		}
	}

	@GetMapping("/administrator/**")
	public ResponseEntity<Object> handleAdministratorGetRequest(HttpServletRequest request,
			@RequestHeader MultiValueMap<String, String> headers) {
		try {
			return restTemplate.exchange(String.format("http://administrator-service%s", request.getRequestURI()),
					HttpMethod.GET, new HttpEntity<Object>(headers), Object.class);
		} catch (HttpClientErrorException e) {
			return ResponseEntity.status(e.getStatusCode()).build();
		}
	}

	@PostMapping("/administrator/**")
	public ResponseEntity<Object> handleAdministratorPostRequest(HttpServletRequest request, @RequestBody Object object,
			@RequestHeader MultiValueMap<String, String> headers) {
		try {
			return restTemplate.exchange(String.format("http://administrator-service%s", request.getRequestURI()),
					HttpMethod.POST, new HttpEntity<Object>(object, headers), Object.class);
		} catch (HttpClientErrorException e) {
			return ResponseEntity.status(e.getStatusCode()).build();
		}
	}

	@PutMapping("/administrator/**")
	public ResponseEntity<Object> handleAdministratorPutRequest(HttpServletRequest request, @RequestBody Object object,
			@RequestHeader MultiValueMap<String, String> headers) {
		try {
			return restTemplate.exchange(String.format("http://administrator-service%s", request.getRequestURI()),
					HttpMethod.PUT, new HttpEntity<Object>(object, headers), Object.class);
		} catch (HttpClientErrorException e) {
			return ResponseEntity.status(e.getStatusCode()).build();
		}
	}

	@DeleteMapping("/administrator/**")
	public ResponseEntity<Object> handleAdministratorDeleteRequest(HttpServletRequest request,
			@RequestHeader MultiValueMap<String, String> headers) {
		try {
			return restTemplate.exchange(String.format("http://administrator-service%s", request.getRequestURI()),
					HttpMethod.DELETE, new HttpEntity<Object>(headers), Object.class);
		} catch (HttpClientErrorException e) {
			return ResponseEntity.status(e.getStatusCode()).build();
		}
	}

	@GetMapping("/librarian/**")
	public ResponseEntity<Object> handleLibrarianGetRequest(HttpServletRequest request,
			@RequestHeader MultiValueMap<String, String> headers) {
		try {
			return restTemplate.exchange(String.format("http://librarian-service%s", request.getRequestURI()),
					HttpMethod.GET, new HttpEntity<Object>(headers), Object.class);
		} catch (HttpClientErrorException e) {
			return ResponseEntity.status(e.getStatusCode()).build();
		}
	}

	@PostMapping("/librarian/**")
	public ResponseEntity<Object> handleLibrarianPostRequest(HttpServletRequest request, @RequestBody Object object,
			@RequestHeader MultiValueMap<String, String> headers) {
		try {
			return restTemplate.exchange(String.format("http://librarian-service%s", request.getRequestURI()),
					HttpMethod.POST, new HttpEntity<Object>(object, headers), Object.class);
		} catch (HttpClientErrorException e) {
			return ResponseEntity.status(e.getStatusCode()).build();
		}
	}

	@PutMapping("/librarian/**")
	public ResponseEntity<Object> handleLibrarianPutRequest(HttpServletRequest request, @RequestBody Object object,
			@RequestHeader MultiValueMap<String, String> headers) {
		try {
			return restTemplate.exchange(String.format("http://librarian-service%s", request.getRequestURI()),
					HttpMethod.PUT, new HttpEntity<Object>(object, headers), Object.class);
		} catch (HttpClientErrorException e) {
			return ResponseEntity.status(e.getStatusCode()).build();
		}
	}

	@DeleteMapping("/librarian/**")
	public ResponseEntity<Object> handleLibrarianDeleteRequest(HttpServletRequest request,
			@RequestHeader MultiValueMap<String, String> headers) {
		try {
			return restTemplate.exchange(String.format("http://librarian-service%s", request.getRequestURI()),
					HttpMethod.DELETE, new HttpEntity<Object>(headers), Object.class);
		} catch (HttpClientErrorException e) {
			return ResponseEntity.status(e.getStatusCode()).build();
		}
	}

	@GetMapping("/borrower/**")
	public ResponseEntity<Object> handleBorrowerGetRequest(HttpServletRequest request,
			@RequestHeader MultiValueMap<String, String> headers) {
		try {
			return restTemplate.exchange(String.format("http://borrower-service%s", request.getRequestURI()),
					HttpMethod.GET, new HttpEntity<Object>(headers), Object.class);
		} catch (HttpClientErrorException e) {
			return ResponseEntity.status(e.getStatusCode()).build();
		}
	}

	@PostMapping("/borrower/**")
	public ResponseEntity<Object> handleBorrowerPostRequest(HttpServletRequest request, @RequestBody Object object,
			@RequestHeader MultiValueMap<String, String> headers) {
		try {
			return restTemplate.exchange(String.format("http://borrower-service%s", request.getRequestURI()),
					HttpMethod.POST, new HttpEntity<Object>(object, headers), Object.class);
		} catch (HttpClientErrorException e) {
			return ResponseEntity.status(e.getStatusCode()).build();
		}
	}

	@PutMapping("/borrower/**")
	public ResponseEntity<Object> handleBorrowerPutRequest(HttpServletRequest request, @RequestBody Object object,
			@RequestHeader MultiValueMap<String, String> headers) {
		try {
			return restTemplate.exchange(String.format("http://borrower-service%s", request.getRequestURI()),
					HttpMethod.PUT, new HttpEntity<Object>(object, headers), Object.class);
		} catch (HttpClientErrorException e) {
			return ResponseEntity.status(e.getStatusCode()).build();
		}
	}

	@DeleteMapping("/borrower/**")
	public ResponseEntity<Object> handleBorrowerDeleteRequest(HttpServletRequest request,
			@RequestHeader MultiValueMap<String, String> headers) {
		try {
			return restTemplate.exchange(String.format("http://borrower-service%s", request.getRequestURI()),
					HttpMethod.DELETE, new HttpEntity<Object>(headers), Object.class);
		} catch (HttpClientErrorException e) {
			return ResponseEntity.status(e.getStatusCode()).build();
		}
	}

}
