package by.htp.oop_task4.main;

public class TrainLogic {
    private Train[] trains;

    public TrainLogic(Train[] trains) {
        this.trains = trains;
    }

    public void sortByNumber() {
        for (int left = 0; left < trains.length; left++) {
            int minInd = left;
            for (int i = left; i < trains.length; i++) {
                if (trains[i].getNumber() < trains[minInd].getNumber()) {
                    minInd = i;
                }
            }
            swap(trains, left, minInd);
        }
    }

    public void getTrainInfoByNumber(int number) {
        for (Train train: trains) {
            if (train.getNumber() == number) {
                System.out.println("Train number: " + train.getNumber()
                        + "\n Destination: " + train.getDestination()
                        + "\n Departure time: " + train.getDepartureTime());
                break;
            }
        }
    }

    private void swap(Train[] array, int ind1, int ind2) {
        Train tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
