package entidades;

public class Student {
    public String nome;
    public Double nota;
    public float soma;
    
    public float Soma(){
        if(soma > 0.0 && soma < 100.0){   
        }
        return this.soma;
    }
    
    public Double Notas(){
        
        if(this.nota < 0){
            this.nota = 0.0;    
        }
        else if(this.nota <= 34){
            this.nota = nota;
        }
        else if(nota > 35){
            this.nota = 35.0;
        }
        return nota;
    }
  
    /*public float Media(){
        return Soma()*(60/100);
    }*/
    
    public Double Resto(){
       Double resto = 60.0 - Soma();
       return resto; 
    }
}
