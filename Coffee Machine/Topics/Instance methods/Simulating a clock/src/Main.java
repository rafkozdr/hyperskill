class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {

        if (minutes == 59 && hours == 12) {
            minutes = 00;
            hours = 1;
        } else if (minutes == 59) {
            minutes = 0;
            hours++;
        } else {
            minutes++;
        }
    }
}