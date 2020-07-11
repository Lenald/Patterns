package Singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("Eins");
        ProgramLogger.getProgramLogger().addLogInfo("Zwei");
        ProgramLogger.getProgramLogger().addLogInfo("Drei");

        ProgramLogger.getProgramLogger().showLogFile();
    }
}
