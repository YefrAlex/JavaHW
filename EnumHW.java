public class EnumHW {
//    Описание занятия: Представьте, что Вы живете в Берлине и собираетесь поехать в Мюнхен.
//    Вам необходимо создать enum, в котором будут такие варианты передвижения как: самолет, поезд, автомобиль, велосипед и пешком.
//    Вам необходимо создать такой enum, в котором в качестве конструктора задавалась бы продолжительность поездки,
//    в зависимости от способа передвижения. Значение будет задаваться в часах (дробное число, можно задать приближённое значение,
//    либо попробовать найти лучший вариант на google maps). Помимо этого, в этом enum необходимо создать метод для получения информации о продолжительности
//    поездки в днях, часах, минутах и секундах (разными методами)

    public static void main(String[] args) {
        for (BerlinMunchen i : BerlinMunchen.values()) {
            System.out.println(
                    i + " " + i.getTime() + " hours " + i.getTimeMinut() + " minutes " + i.getTimeSeconds() + " seconds " + i.getTimeDays() + " days "
            );
        }
    }
}
enum BerlinMunchen {
    AIRPLAN (1),
    TRAIN(9),
    AUTOMOBILE(4),
    BIKE(23),
    ON_FOOT(82);
    private int time;

    BerlinMunchen(int time) {
        this.time = time;
    }
    public int getTime() {
        return time;
    }
    public int getTimeMinut() {return time*60;}
    public int getTimeSeconds () {return time*3600;}
    public double getTimeDays() {return time/24;}


}
