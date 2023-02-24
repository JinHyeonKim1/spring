package com.app.set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.set.domain.sampleVO;
import com.app.set.service.sampleServiceImpl;

import javax.inject.Inject;

import org.apache.ibatis.javassist.tools.reflect.Sample;
//프린트문
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@Controller
public class sampleController {

	private static final Logger logger = LoggerFactory.getLogger(sampleController.class);

	@Inject
	private sampleServiceImpl sampleService;
	

	@RequestMapping(value = "sampleList", method = RequestMethod.GET)
	public void sampleList(Model model) throws Exception {
		
		System.out.println("good");
		logger.info("sample list 접속 성공");
		
		model.addAttribute("sampleVO", sampleService.allList());
		
	}
	

	@RequestMapping(value="update", method=RequestMethod.GET)
	public String edit(sampleVO vo, Model model, RedirectAttributes rttr) throws Exception {
		
		logger.info("update로 접속을 성공");
		
		sampleService.update(vo);
				
		return "sampleUpdate";		
	}
	
	@RequestMapping(value="sampleInsert", method=RequestMethod.POST)
	public String sampleInsert(sampleVO vo, Model model, RedirectAttributes rttr) throws Exception {
		
		sampleService.create(vo);
		
		logger.info("삽입 성공");
		
		rttr.addFlashAttribute("msg", "INSERT");
		
		return "redirect:/sampleList";
				
	}
	
	
	
	@RequestMapping("sampleDelete")
	public String sampleDelete(@RequestParam("name") String name, Model model) throws Exception {
		
		
		logger.info("DTO 값 전달하자");
		
		sampleService.delete(name);
		
		return "sampleDeleteResult";
		
		
				
	}
}
