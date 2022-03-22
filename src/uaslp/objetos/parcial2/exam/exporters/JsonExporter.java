package uaslp.objetos.parcial2.exam.exporters;

public class JsonExporter{
    @Override
    public String export(String message) {
        return "{ \"message\":\"json format\"}";
    }
}
