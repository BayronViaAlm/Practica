package PPP;
public class Token {
    private String codigo;
    private String atributo;

    public Token (String cod, String atri) {
        codigo = cod;
        atributo = atri;
    }

    public String getCod (){
        return codigo;
    }

    public String getAtr() {
        return atributo;
    }

    public String toString() {
        return "< " + codigo + ", " + (atributo != null? atributo : " >");
    }
}