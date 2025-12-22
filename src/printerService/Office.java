package printerService;

public class Office {
     private Printable printer;

     private Faxable faxable;

     private Scannable scannable;

     public Office(Printable printer){
         this.printer  = printer;
     }

     public Office(Scannable scannable){
          this.scannable = scannable;
     }

     public Office(Faxable faxable){
          this.faxable = faxable;
     }

     public void doWork(){
          printer.print();
     }

}
