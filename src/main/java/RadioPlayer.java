public class RadioPlayer implements Player {
    private boolean onOff;
    private int volume;
    private double station;
    private double[] stationList;

    public RadioPlayer(double[] stationList) {
        this.onOff = false;
        this.volume = 0;
        this.station = 0;
        this.stationList = stationList;
    }

    public void start() {
        if (!this.onOff) {
            this.onOff = true;
            this.station = this.stationList[0];
        }
    }

    public void stop() {
        if (this.onOff) {
            this.onOff = false;
            this.station = 0;
        }
    }

    public boolean getOnOff() {
        return this.onOff;
    }

    public void volumeUp() {
        this.volume += 2;
    }

    public void volumeDown() {
        this.volume -= 2;
    }

    public int getVolume() {
        return this.volume;
    }

    public void next() {
        if (this.onOff) {
            for (int i = 0; i < this.stationList.length; i++) {
                if (this.stationList[i] == this.station) {
                    this.station = this.stationList[(i + 1)];
                    break;
                }
            }
        }
    }

    public void previous() {
        if (this.onOff) {
            for (int i = 0; i < this.stationList.length; i++) {
                if (this.stationList[i] == this.station) {
                    this.station = this.stationList[(i - 1)];
                    break;
                }
            }
        }
    }

    public double getStation() {
        return this.station;
    }
    
}
