package cn.itcast;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DomeController {
	
	@RequestMapping("dome")
	public String dome() {
		return "这是一个小测sdf试";
	}
}
