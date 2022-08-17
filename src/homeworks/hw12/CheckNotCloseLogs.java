package homeworks.hw12;

import java.io.*;
import java.util.*;

public class CheckNotCloseLogs {
    private List<Log> listOpenLog = new ArrayList<>();
    private List<Log> listCloseLog = new ArrayList<>();
    private List<Log> listNotClose = new ArrayList<>();


    public void read(String pathReadFile) throws IOException {

        FileInputStream fos = new FileInputStream(pathReadFile);
        InputStreamReader isr = new InputStreamReader(fos);
        BufferedReader br = new BufferedReader(isr);
        String logRead;
        while ((logRead = br.readLine()) != null) {
            if (logRead.charAt(0) == 'O') {
                listOpenLog.add(new Log(logRead.substring(16), logRead));
            } else {
                listCloseLog.add(new Log(logRead.substring(16), logRead));
            }
        }
        br.close();
        System.out.println("Считывание логов с файла " + " " + pathReadFile + " " + "прошло успешно.");
    }

    public void write(String pathWriteFile) throws IOException {
        FileOutputStream fos = new FileOutputStream(pathWriteFile);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        for (Log log : listNotClose) {
            bw.write(log.stringLog +"\n");
        }
        bw.close();
        System.out.println("Запись открытых логов в файл " + " " + pathWriteFile + " прошла успешно.");
    }

    public void difference() {
        listNotClose.addAll(listOpenLog);
        listNotClose.removeAll(listCloseLog);
    }


    public void printNotCloseLogs() {
        System.out.println("Логи, которые остались открытыми: ");
        for (Log log : listNotClose) {
            System.out.println(log.stringLog);
        }

    }

    class Log {
        private String nameLog;

        private String stringLog;

        public Log(String nameLog, String stringLog) {
            this.nameLog = nameLog;
            this.stringLog = stringLog;
        }


        public String getNameLog() {
            return nameLog;
        }

        public void setNameLog(String nameLog) {
            this.nameLog = nameLog;
        }

        public String getStringLog() {
            return stringLog;
        }

        public void setStringLog(String stringLog) {
            this.stringLog = stringLog;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Log log = (Log) o;
            return Objects.equals(nameLog, log.nameLog);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nameLog);
        }

        @Override
        public String toString() {
            return "\n" + nameLog + " : " + stringLog;
        }
    }


}
