import java.io.IOException;

public class Semo2_Runtime{
	public static void main(String[] args) throws IOException{
		runtime r=Runtime.getruntime();
		//r.exec("shutdown -s -t 300");
		r.exec("shutdown -a");

		Timer t=new Timer();
		//excute certain task on certain time
		//常用在手机app开发
		t.schedule(new MyTimerTask(), new date(118, 11, 26, 12, 21, 01),3000);  //3000ms later repeat again

		while(true){
			Thread.sleep(1000);
			System.outprintln(new Date());
		}
	}
}

class MyTimerTask extends TimerTask {
	@public void run(){
		System.out.println("Wake up");
	}
}
