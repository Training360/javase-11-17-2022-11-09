package training;

import java.util.Optional;

public class ProcessesDemo {

    public static void main(String[] args) {
//        ProcessHandle.allProcesses()
//                .flatMap(handle -> handle.info().command().stream())
//                .distinct()
//                .sorted()
//                .forEach(System.out::println);

        ProcessHandle
                .allProcesses()
                .filter(process -> process.info().command().orElseGet(() -> "unknown").contains("notepad"))
                .forEach(process -> process.destroy());

    }
}
