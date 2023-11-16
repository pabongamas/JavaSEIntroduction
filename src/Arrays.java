public class Arrays {
    public static void main(String[] args) {
        String[] androidVersions=new String[17];
        int days[]=new int[7];

        /*
         * +------------------------------+
         * |  Country    |  City          |
         * --------------------------------
         * | México      | CDMX           |
         * | México      | Guadalajara    |
         * | Colombia    | Bogotá         |
         * | Colombia    | Medellín       |
         * +------------------------------+
         * */

        String[][] cities=new String[4][2]; //4*2=8;

        int [][][] numbers =new int[2][2][2];
        int [][][][] numbers4=new int [2][2][2][2];

        androidVersions[0]="Apple Pie";
        androidVersions[1]="Banana Bread";
        androidVersions[2]="Cupcake";
        androidVersions[3]="Donut";

        for (int i = 0; i < androidVersions.length; i++) {
            if (androidVersions[i] == null){
                continue;
            }
            //System.out.println(androidVersions[i]);
        }


        cities[0][0] = "Colombia ";
        cities[0][1] = "Medillin ";
        cities[1][0] = "Colombia ";
        cities[1][1] = "Bogota ";
        cities[2][0] = "Mexico ";
        cities[2][1] = "Guadalajara ";
        cities[3][0] = "Mexico ";
        cities[3][1] = "CDMX ";
        for (int i = 0; i <cities.length ; i++) {
            for (int j = 0; j <cities[i].length ; j++) {
                System.out.println(cities[i][j]);
            }
        }

        String[][][][] animals =new String[2][3][2][2];
        animals[1][0][0][1]="Monkey";
        /**System.out.println(animals[1][0][0][1]);*/

        for (String androidVersion:androidVersions) {
            System.out.println(androidVersion+ " xd");
        }

        for (String[] pair:cities) {
            for (String name:pair) {
                System.out.println(name+" xd");
            }
        }
    }
}
