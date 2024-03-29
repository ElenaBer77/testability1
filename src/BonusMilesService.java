public class BonusMilesService {
    public int calculate(int price, int onMil) {
        int result;
        result = price / onMil;
        return result;
    }
}