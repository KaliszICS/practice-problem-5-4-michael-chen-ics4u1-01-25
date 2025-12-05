public class VideoPlayer implements Player {
    private boolean onOff;
    private String video;
    private int currentTime;
    private int volume;

    public VideoPlayer(String video) {
        this.onOff = false;
        this.video = video;
        this.currentTime = 0;
        this.volume = 0;
    }

    public void start() {
        if (!this.onOff) {
            this.onOff = true;
        }
    }

    public void stop() {
        if (this.onOff) {
            this.onOff = false;
        }
    }

    public boolean getOnOff() {
        return this.onOff;
    }

    public void volumeUp() {
        this.volume += 5;
    }

    public void volumeDown() {
        this.volume -= 5;
    }

    public int getVolume() {
        return this.volume;
    }

    public void fastForward() {
        if (this.onOff) {
            this.currentTime += 5;
        }
    }

    public void rewind() {
        if (this.onOff) {
            this.currentTime -= 5;
        }
    }

    public int getCurrentTime() {
        return this.currentTime;
    }

    public String getVideo() {
        return this.video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
    
}
