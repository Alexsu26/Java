package dome.src;

public class CD extends Item{
    private String artist;
    private int numofTracks;


    public CD(String title, String artist, int numofTracks, int playingTime, String comment) {
        super(title, playingTime, false, comment);               //调用Item传递title
//        this.title = title;
        this.artist = artist;
        this.numofTracks = numofTracks;
//        this.playingTime = playingTime;
//        this.comment = comment;
    }

    @Override
    public String toString() {
        return "CD{" +
                "artist='" + artist + '\'' +
                ", numofTracks=" + numofTracks +
                "} " + super.toString();
    }

    @Override                           //告诉编译器，下面的函数要覆盖父类的函数，而这两个函数必须有完全相同的函数签名(函数名和参数表)
    public boolean equals(Object obj) {
        CD cc = (CD)obj;
        return artist.equals(cc.artist);
    }

    public static void main(String[] args) {
        CD cd = new CD("a","a",4,4,"..");
        CD cd1 = new CD("a","a",4,4,"..");
        cd.print();
        System.out.println();
        System.out.println(cd);             //自动完成toString的调用
        System.out.println(cd.equals(cd1));
    }

//    public void print() {
//        System.out.println("CD:" + title + ":" + artist);
//    }
}
