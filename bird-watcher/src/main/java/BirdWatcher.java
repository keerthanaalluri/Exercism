import java.util.Arrays;
class BirdWatcher {
   public final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay.length == 0 ? 0 : birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
       
        int k = Arrays.binarySearch(birdsPerDay, 0);
        return k>=0;
    }

    public int getCountForFirstDays(int numberOfDays) {
        
        return (int) Arrays.stream(birdsPerDay).limit(Math.min(numberOfDays, birdsPerDay.length)).sum();
    }

    public int getBusyDays() {
      
       return (int) Arrays.stream(birdsPerDay).filter(i -> i >= 5).count();
    }
}
