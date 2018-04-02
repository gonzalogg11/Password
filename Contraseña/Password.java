import java.util.Random;
public class Password {
    
    protected int longitud = 8;
    protected String contraseña;
    
    public Password() {
        this.longitud = longitud;
        this.contraseña = contraseña;
    }
    
    public Password(int longitud) {
        
        this.longitud = longitud;
        this.contraseña = generarPassword(longitud);
    }
    
    public Password(String Contraseña) {
        this.longitud = Contraseña.length();
        this.contraseña = Contraseña;
    }
    
    public boolean esFuerte() {
        if(contraseña.length()>=8){
            for(int i=0; i<contraseña.length(); i++){
                int ascii = (int) contraseña.charAt(i);
                if(ascii >= 65 && ascii <=90){
                    for(int j=0; j<contraseña.length(); j++){
                        ascii = (int) contraseña.charAt(j);
                        if(ascii >= 97 && ascii <=122){
                            for(int k=0; k<contraseña.length(); k++){
                                char letra = contraseña.charAt(k);
                                if(Character.isDigit(letra)){
                                    return true;
                                }  
                            }
                            return false;
                        }
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }
    
    public String generarPassword(int longitud){
        Random r = new Random();
        StringBuilder password = new StringBuilder();
            do {
                int opt = r.nextInt(2);
                char aux;
                switch(opt){
                    case 0:
                        aux = (char)(r.nextInt(26)+'a'); 
                        password.append(aux);
                    case 1:
                        aux = (char)(r.nextInt(26)+'A'); 
                        password.append(aux);
                    case 2:
                        aux = (char)(r.nextInt(9)+48); 
                        password.append(aux);
                        break;
                }
            } while(password.length()<longitud);
        return password.toString();
    } 
    
    public String toString(){
        return contraseña + " " + longitud;
    }
    
    public String getContraseña(){
        return this.contraseña;
    }
    
    public int getLongitud(){
        return this.longitud;
    }
}