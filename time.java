import java.util.Date;



public class TimeAndDate {
	public static void TimeNew() {
		try {
            
                  new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {                        
                        Date d  = new Date();
                        String strTime = d.toString();
                     String [] time =    strTime.split(" ");
                     System.out.println(time[3]);
                    }
                }
            }).start();

        } catch (Exception e) {
            e.printStackTrace();
        }
        
		
	}
	

}
