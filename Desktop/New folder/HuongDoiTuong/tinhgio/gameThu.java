package HuongDoiTuong.tinhgio;

import java.util.Date;

public class gameThu implements Comparable<gameThu>{
    private String ma, name, tongTime;

    public gameThu(String ma, String name, String tongTime) {
        this.ma = ma;
        this.name = name;
        this.tongTime = tongTime;
    }

    public gameThu() {
    }

    public String tongTime(Date begin, Date end) {
        String tongTime = "";
        long diff = end.getTime() - begin.getTime();
        long hours = diff / (60*60*1000);
        long minutes = (diff / (60*1000)) -(60*hours);
        tongTime += hours + " gio " +minutes+ " phut";
        return tongTime;
    }

    @Override
    public String toString() {
        return ma + " "  + name + " "+ tongTime;
    }

    @Override
    public int compareTo(gameThu o) {
        String[] arrTime1 = this.tongTime.split(" ");
        long minsThis = Long.parseLong(arrTime1[0])*60 + Long.parseLong(arrTime1[2]);

        String[] arrTime2 = o.tongTime.split(" ");
        long minsThat = Long.parseLong(arrTime2[0])*60 + Long.parseLong(arrTime2[2]);
        if (minsThis > minsThat) return 1;
        else return -1;
    }
}
