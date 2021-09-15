/**
 * 
 */
package com._nguyenvantrung_17071691.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Nguyen Van Trung - 17071691
 *
 */
@Configuration
public class config {
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
