package usingstatic;

public class Date {
private int d, m, y;

  public int dayOfWeek() {
//  public /*static*/ int dayOfWeek(Date this) {
//    public static int dayOfWeek(Date date) {
//    public static int dayOfWeek(int day, int month, int year) {
    int day = this.d; // or date.d in the static version
    int month = this.m;
    int year = this.y;
    // zeller's congruence returns 0 = Saturday -> 6 = Friday
    if (month < 3) {
    month += 12;
    year -= 1;
    }
    return (day + (13 * (month + 1) / 5) + year + year/4 - year/100 + year/400) % 7;
    }
}
