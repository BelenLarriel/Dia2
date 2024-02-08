package DiaTres;




public class Reloj {

    public int horas;
    public int minutos;
    public int segundos;


    public Reloj() {
            this(12,0,0);
        }




    public Reloj(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;

    }

    public Reloj(int segundosDesdeMedianoche) {
        setReloj(segundosDesdeMedianoche);
    }


        private void setReloj(int segundosmedianoche){


             this.horas =( segundosmedianoche / 3600) ;
             this.minutos = (segundosmedianoche % 3600) / 60;
             this.segundos = (segundosmedianoche % 3600) % 60;



        }


        private int getHoras(){
         return horas;

    }

       private int getMinutos(){
        return minutos;
       }


        private int getSegundos(){
            return segundos;
        }


        private void setHoras(int horas){
            if (horas >= 0 && horas <= 23) {
                this.horas = horas;

            }

        }
         private void setMinutos(int minutos) {
             if (minutos >= 0 && minutos <= 59) {
                 this.minutos = minutos;

             }
         }
         private void setSegundos(int segundos) {
             if (segundos >= 0 && segundos <= 59){
                 this.segundos = segundos;


             }
         }

    void tick(){
    segundos ++;
    if(segundos == 60) {
        segundos = 0;
        minutos++;
        if (minutos == 60) {
            minutos = 0;
            horas++;

            if (horas == 24) {
                horas = 0;

            }
        }


    }
        }

     private void  addReloj(Reloj dosReloj) {


         this.segundos = this.segundos + dosReloj.segundos;
         this.minutos = this.minutos + dosReloj.minutos;
         this.horas = this.horas + dosReloj.horas;
         if (this.segundos >= 60) {
             this.segundos -= 60;
             this.minutos++;
         }
         if (this.minutos >= 60) {
             this.minutos -= 60;
             this.horas++;
         }



         if (this.horas >= 24) {
             this.horas = 0;
         }


     }

    public String toString() {

        return String.format("[%02d:%02d:%02d]", horas, minutos, segundos);


    }



         void tickDecrement() {

             segundos--;
             if (segundos < 0) {
                 segundos = 59;
                 minutos--;
                 if (minutos < 0) {
                     minutos = 59;
                     horas = (horas - 1 + 24) % 24;
                 }
             }


         }





         public Reloj restaReloj(Reloj dosReloj) {
             int calculo = this.horas * 3600 + this.minutos * 60 + this.segundos
                     - dosReloj.horas * 3600 - dosReloj.minutos * 60 - dosReloj.segundos;


             int horas = calculo / 3600;
             int minutos = (calculo % 3600) / 60;
             int segundos = calculo % 60;


             return new Reloj(calculo);
         }


     }





