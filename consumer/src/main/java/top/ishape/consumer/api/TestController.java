package top.ishape.consumer.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.ishape.consumer.client.ProviderFeign;

@RestController
public class TestController {

	@Autowired
	private ProviderFeign feign;

	@GetMapping("/test/provider")
	public String testProvider() {
		return feign.service();
	}

}
