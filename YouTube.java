class YouTube {
String videoTitle;
String channelName;
int views;
public YouTube() {
}
public YouTube(String videoTitle, String channelName, int views) {
this.videoTitle = videoTitle;
this.channelName = channelName;
this.views = views;
}
public void display() {
System.out.println(videoTitle);
System.out.println(channelName);
System.out.println(views);
System.out.println("-------------------");
}
}

