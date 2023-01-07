package springdemo1;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements pointinterface,InitializingBean,DisposableBean {
	public String type;
	public int height;
//	public point pointa;
//	public point pointb;
//	public point pointc;
//       public point getPointa() {
//		return pointa;
//	}
//	public void setPointa(point pointa) {
//		this.pointa = pointa;
//	}
//	public point getPointb() {
//		return pointb;
//	}
//	public void setPointb(point pointb) {
//		this.pointb = pointb;
//	}
//	public point getPointc() {
//		return pointc;
//	}
//	public void setPointc(point pointc) {
//		this.pointc = pointc;
//	}
	List<point> points;
	
	public List<point> getPoints() {
		return points;
	}
	public void setPoints(List<point> points) {
		this.points = points;
	}
	public String getType() {
		return type;
	}
       public Triangle(String type, int height)
       {
    	   this.type =type;
    	   this.height=height;
       }
//	public void setType(String type) {
//		this.type = type;
//	}
	public void draw() {
    	   
    	   System.out.println( getType() + " " + "triangle is drwan" + "of height" +getHeight());
//    	   System.out.println("pointa" + getPointa().getX()+"," + getPointa().getY() );
//    	   System.out.println("pointb" + getPointb().getX()+"," + getPointb().getY() );
//    	   System.out.println("pointc" + getPointc().getX()+"," + getPointc().getY() );
   	  for(point p: points){
    	   System.out.println( p.getX() + " " + p.getY() );

       }
	}
//	  //@PostConstruct
//	public void init()
//	{
//		System.out.println("init method inside triangle");
//	}
//	
//	//@PreDestroy
//	public void destroy()
//	{	
//		System.out.println("destroy method inside triangle");
//
//	}
	public int getHeight() {
		return height;
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init method inside triangle");		
	}
	@Override
	public void destroy() throws Exception {
	System.out.println("destroy method inside triangle");
		
	}
}
