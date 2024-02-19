package java_development_kit_2.server;

public interface ServerRepository {
    String getHistory();
    void completeHistory(String message);
}
