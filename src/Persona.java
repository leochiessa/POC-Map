public class Persona {
    private String dni;

    public Persona(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return dni;
    }
}