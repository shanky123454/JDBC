package springdemo1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Quadilateral implements pointinterface,InitializingBean,DisposableBean {

	public point pointa;
	public point pointb;
	public point pointc;
	public point pointd;
	public point getPointd() {
		return pointd;
	}
	public void setPointd(point pointd) {
		this.pointd = pointd;
	}
	public point getPointa() {
		return pointa;
	}
	public void setPointa(point pointa) {
		this.pointa = pointa;
	}
	public point getPointb() {
		return pointb;
	}
	public void setPointb(point pointb) {
		this.pointb = pointb;
	}
	public point getPointc() {
		return pointc;
	}
	public void setPointc(point pointc) {
		this.pointc = pointc;
	}
	public void draw() {
 	   
 	  // System.out.println( getType() + " " + "triangle is drwan" + "of height" +getHeight());
	   System.out.println("pointa" + getPointa().getX()+"," + getPointa().getY() );
	   System.out.println("pointb" + getPointb().getX()+"," + getPointb().getY() );
 	   System.out.println("pointc" + getPointc().getX()+"," + getPointc().getY() );
 	   System.out.println("pointd" + getPointd().getX()+"," + getPointd().getY() );

	}
//	//@PostConstruct
//	public void init()
//	{
//		System.out.println("init method started in quadilateral;");
//	}
//	//@PreDestroy
//	public void destroy()
//	{
//		System.out.println("destroy method called quadilateral");
//	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init method started in quadilateral;");		
	}
@Override
public void destroy() throws Exception {
	System.out.println("destroy method called quadilateral");	
}
	
}
