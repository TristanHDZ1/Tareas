public class MaquinaDeCafe {
    private int cant_de_agua;
    private int cant_de_cafe;
    private int cant_de_crema;
    private int cant_de_vasos_termicos;

    public MaquinaDeCafe() {
        this.cant_de_cafe = 1000;
        this.cant_de_agua = 5000;
        this.cant_de_crema = 1500;
        this.cant_de_vasos_termicos = 50;
    }

    public MaquinaDeCafe(int cant_de_agua, int cant_de_cafe, int cant_de_crema, int cant_de_vasos_termicos) {
        this.cant_de_agua = cant_de_agua;
        this.cant_de_cafe = cant_de_cafe;
        this.cant_de_crema = cant_de_crema;
        this.cant_de_vasos_termicos = cant_de_vasos_termicos;
    }

    public int getCant_de_agua() {
        return cant_de_agua;
    }

    public void setCant_de_agua(int cant_de_agua) {
        this.cant_de_agua = cant_de_agua;
    }

    public int getCant_de_cafe() {
        return cant_de_cafe;
    }

    public void setCant_de_cafe(int cant_de_cafe) {
        this.cant_de_cafe = cant_de_cafe;
    }

    public int getCant_de_crema() {
        return cant_de_crema;
    }

    public void setCant_de_crema(int cant_de_crema) {
        this.cant_de_crema = cant_de_crema;
    }

    public int getCant_de_vasos_termicos() {
        return cant_de_vasos_termicos;
    }

    public void setCant_de_vasos_termicos(int cant_de_vasos_termicos) {
        this.cant_de_vasos_termicos = cant_de_vasos_termicos;
    }

    @Override
    public String toString() {
        return "MaquinaDeCafe{" +
                "cant_de_agua=" + cant_de_agua +
                ", cant_de_cafe=" + cant_de_cafe +
                ", cant_de_crema=" + cant_de_crema +
                ", cant_de_vasos_termicos=" + cant_de_vasos_termicos +
                '}';
    }

    // Método para servir un café
    public void servirCafe(String tipo) {
        switch (tipo) {
            case "Americano":
                if (cant_de_agua >= 180 && cant_de_cafe >= 15 && cant_de_vasos_termicos > 0) {
                    cant_de_agua -= 180;
                    cant_de_cafe -= 15;
                    cant_de_vasos_termicos--;
                    System.out.println("Café americano servido");
                } else {
                    System.out.println("No se puede servir más café");
                }
                break;
            case "Expreso":
                if (cant_de_agua >= 120 && cant_de_cafe >= 20 && cant_de_vasos_termicos > 0) {
                    cant_de_agua -= 120;
                    cant_de_cafe -= 20;
                    cant_de_vasos_termicos--;
                    System.out.println("Café expreso servido");
                } else {
                    System.out.println("No se puede servir más café");
                }
                break;
            case "Capuchino":
                if (cant_de_agua >= 100 && cant_de_cafe >= 14 && cant_de_crema >= 70 && cant_de_vasos_termicos > 0) {
                    cant_de_agua -= 100;
                    cant_de_cafe -= 14;
                    cant_de_crema -= 70;
                    cant_de_vasos_termicos--;
                    System.out.println("Capuchino servido");
                } else {
                    System.out.println("No se puede servir más café");
                }
                break;
            default:
                System.out.println("Tipo de café no válido");
        }
    }

    // Método para obtener la cantidad de vasos disponibles
    public int getCantidadVasos() {
        return cant_de_vasos_termicos;
    }
}

