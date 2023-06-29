
package prova_vanessa;


public enum EstadoCivil {
    
    SOLTEIRO ("Solteiro"), 
    CASADO ("Casado"), 
    SEPARADO ("Separado"),
    DIVORCIADO ("Divorciado"),
    VIUVO ("Viúvo");
    
    private final String texto;

    private EstadoCivil(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
    
    
    
    
}
