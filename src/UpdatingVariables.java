public class UpdatingVariables {
    public static void main(String[] args) {
        int salary=1000;

        //bono $200;
        salary+=200;

        //pension:$50 pesos =>descuento
        salary-=50;

        //2 horas extra =>$30 cada una
        //cupon comida :$45
        System.out.println(salary);
        salary+=(30*2)-45;

        //actualizando cadenas de texto
        String employeeName="Anahi salgado";
        employeeName+=" Diaz de la vega";
        employeeName="irene "+employeeName;


        System.out.println(salary);
        System.out.println(employeeName);
    }
}
