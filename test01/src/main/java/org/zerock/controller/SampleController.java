package org.zerock.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.domain.SampleVO;

@RestController //rest 방식의 컨트롤러 입니다.
public class SampleController {

	//@GetMapping("/hello")
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello World";
	}
	
	
	//@GetMapping("/sample")
	@RequestMapping("/sample")
	public SampleVO makeSample() {
		
		SampleVO vo = new SampleVO();
		vo.setVal1("V1");
		vo.setVal2("V2");
		//vo.setVal3("V3");
		
		System.out.print(vo);
		
		return vo;
	}
	
	
	@GetMapping("/sampleString")
	public String makeSampleString() {
		
		SampleVO vo = new SampleVO();
		vo.setVal1("V1");
		vo.setVal2("V2");
		vo.setVal3("V3");
		
		return vo.toString();
	}
}

