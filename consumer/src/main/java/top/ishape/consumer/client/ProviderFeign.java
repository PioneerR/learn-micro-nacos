package top.ishape.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "provider")
public interface ProviderFeign {

	@GetMapping("/provider/service")
	String service();

}
