public class Task_1 {
    public static void main(String[] args) {
        int population=10000000;
        int fertility=14;
        int mortality=8;
        int years=10;
        for (int y=0; y<years; y++){
            population =population+(population/1000*fertility-population/1000*mortality);

        }
        System.out.println(population);

    }
}
