package br.com.hrservices.payrollapi.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hrservices.payrollapi.domain.Payroll;
import br.com.hrservices.payrollapi.services.PayrollService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/payments")
public class PayRollResource {
	
	private final PayrollService service;
	
	@GetMapping(value = "/{workedId}")
	public ResponseEntity<Payroll> getPayment(@PathVariable Long workedId, @RequestBody Payroll payment){
		return ResponseEntity.ok().body(service.getPayment(workedId, payment));
				
	}

}
