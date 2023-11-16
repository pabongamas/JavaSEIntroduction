public class Funciones {
    public static void main(String[] args) {

        double y =3;
        //area de un circulo
        //pi*r2

        double area=circleArea(y);
        System.out.println(area);

        //area de una esfera
        //4*pi*r2

        System.out.println("pesos a dolares "+converToDolar(200,"COP"));
    }
    public static double circleArea (double r){
        return Math.PI*Math.pow(r,2);
    }
    public static double sphereArea(double r){
        return 4*Math.pow(r,2);
    }
    public static double sphereVolumen(double r){
        return (4/3)*Math.PI*Math.pow(r,3);
    }
    /**
     * Descripcion:Funcion que especificando su moneda convierte una cantidad de dinero a dolares
     * @param quantity Cantidad de dinero
     * @param currency Tipo de Moneda:Solo acepta MXN O COP
     * @return quantity Devuelve la cantidad actualizada en Dolares
     * */
    public  static double converToDolar(double quantity,String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                quantity=quantity*0.052;
                break;
            case "COP":
                quantity=quantity=0.00031;
                break;
        }
        return quantity;
    }
}
