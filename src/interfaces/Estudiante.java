package interfaces;

public class Estudiante implements Persona{

    @Override
    public void caminar() {
        System.out.println("Me encuentro caminando");
    }

    @Override
    public String correr() {
        return "Me encuentro corriendo";
    }

    @Override
    public String hablar() {
        return "Me encuentro hablando";
    }
}
