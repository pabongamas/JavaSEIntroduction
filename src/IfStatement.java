public class IfStatement {
    public static void main(String[] args) {
         boolean isBluetoothEnabled=false;
         int fileSendend=3;

         if(isBluetoothEnabled){
             fileSendend++;
             System.out.println("archivo enviado");
             int i=0;
             i++;
         }
        System.out.println(isBluetoothEnabled);
        System.out.println(fileSendend);
    }
}
