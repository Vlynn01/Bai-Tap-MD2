package $4_LopVaDoiTuongTrongJava.BaiTap.XayDungLopStopWatch;

import java.time.LocalDateTime;

public class StopWatch {
    private LocalDateTime startTime, endTime;

    public StopWatch() {
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = LocalDateTime.now();
    }

    public void end() {
        endTime = LocalDateTime.now();
    }

    public int getElapsedTime() {
        return endTime.getSecond() - startTime.getSecond();
    }

    @Override
    public String toString() {
        return "startTime=" + startTime +
                ", endTime=" + endTime;
    }

}
