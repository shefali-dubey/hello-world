package hello

import org.springframework.context.annotation.Configuration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping


@Configuration
@EnableAutoConfiguration
@ComponentScan
@RestController
class HelloConfig {
  
	@RequestMapping(value=Array("/"))
	def printHello() : String = {
	  return "hello world"
	}
}