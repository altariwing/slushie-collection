import java.util.concurrent.TimeUnit;

//easy way to perform a Thread.sleep
TimeUnit.NANOSECONDS.sleep(1); //(10)-9sec
TimeUnit.MICROSECONDS.sleep(1); //(10)-6sec
TimeUnit.MILLISECONDS.sleep(1); //(10)-3sec
TimeUnit.SECONDS.sleep(1);
TimeUnit.MINUTES.sleep(1);
TimeUnit.DAYS.sleep(1);
TimeUnit.HOURS.sleep(1);
//there's only Thread.sleep(MILLISECONDS) method
//so i think when using MICROSECONDS/NANOSECONDS, that's sleep(0)
//dump dump dump・ヘ・
