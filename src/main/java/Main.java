import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.masai.A;
import com.masai.b.B;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		A obj=ctx.getBean("a",A.class);
		B obj1=ctx.getBean("b",B.class);
		obj.funA();
		obj1.funB();
		
	}

}
