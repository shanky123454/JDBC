package springdemo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {

	public static void main(String[] args) {
	//	======> 1st method
		//Triangle triangle = new Triangle();
		//triangle.draw();
		
	// =========> 2nd method	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Triangle triangle =  context.getBean("triangle", Triangle.class);
		triangle.draw();
		context.close();
		
		ClassPathXmlApplicationContext context3 = new ClassPathXmlApplicationContext("applicationContext.xml");
		Quadilateral quadilateral =  context3.getBean("quadilateral", Quadilateral.class);
		quadilateral.draw();
		//context3.close();
		
		ClassPathXmlApplicationContext context4 = new ClassPathXmlApplicationContext("applicationContext.xml");
		Triangle triangle1 =  context4.getBean("triangle", Triangle.class);
		triangle1.draw();
		context4.close();
		
		
		boolean b = (context==context3);
		System.out.println(b);
		
		boolean b1 = (triangle==triangle1);
		System.out.println(b1);
		
		ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext.xml");
		pointinterface q = context1.getBean("triangle",pointinterface.class);
		q.draw();
		context1.close();
		
		
	//=========> 3rd method (but depricated not used now)
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("applicationContext.xml"));
//		Triangle triangle = (Triangle) factory.getBean("triangle");
//		triangle.draw();

	}

}
