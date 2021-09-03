package edu.springboot.a2z.emporg.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class EmpOrgHealthCheck implements HealthIndicator {

	@Override
	public Health health() {
		// TODO Auto-generated method stub
		//return Health.down().withDetail("Error Code", 500).build();
		return Health.up().build();
	}

}
