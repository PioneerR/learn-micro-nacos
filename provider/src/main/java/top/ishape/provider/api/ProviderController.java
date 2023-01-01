package top.ishape.provider.api;

import com.alibaba.nacos.client.utils.LogUtils;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {


	@GetMapping("/provider/service")
	public String testProvider() {
		Logger log = LogUtils.logger(ProviderController.class);
		log.info("provider - service");
		return "provider - service";
	}

}
