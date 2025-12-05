public class MusicPlayer implements Player {
    private boolean onOff;
    private String[] musicList;
    private String currentSong;
    private int volume;

    public MusicPlayer(String[] musicList) {
        this.onOff = false;
        this.musicList = musicList;
        this.currentSong = "";
        this.volume = 0;
    }

    public void start() {
        if (!this.onOff) {
            this.onOff = true;
            this.currentSong = this.musicList[0];
        }
    }

    public void stop() {
        if (this.onOff) {
            this.onOff = false;
            this.currentSong = "";
        }
    }

    public boolean getOnOff() {
        return this.onOff;
    }
    public void volumeUp() {
        this.volume++;
    }

    public void volumeDown() {
        this.volume--;
    }

    public int getVolume() {
        return this.volume;
    }

    public void next() {
        if (this.onOff) {
            for (int i = 0; i < this.musicList.length; i++) {
                if (this.musicList[i].equals(this.currentSong)) {
                    this.currentSong = this.musicList[(i + 1)];
                    break;
                }
            }
        }
    }

    public void previous() {
        if (this.onOff) {
            for (int i = 0; i < this.musicList.length; i++) {
                if (this.musicList[i].equals(this.currentSong)) {
                    this.currentSong = this.musicList[(i - 1)];
                    break;
                }
            }
        }
    }

    public String getCurrentSong() {
        return this.currentSong;
    }
}
