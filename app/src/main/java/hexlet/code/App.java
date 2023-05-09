package hexlet.code;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import picocli.CommandLine.HelpCommand;

//import java.io.File;
import java.util.concurrent.Callable;

@Command(name = "genDiff", mixinStandardHelpOptions = true, version = "genDiff 1.0",
        description = "Prints the difference between the data as a string.")
public class App implements Callable<Integer> {

        //@Parameters(index = "0", description = "The file whose checksum to calculate.", defaultValue = "/etc/hosts")
        //private File file = new File("/etc/hosts");

        //@Option(names = {"-a", "--algorithm"}, description = "MD5, SHA-1, SHA-256, ...")
        //private String algorithm = "MD5";

        @Option(names = {"-V", "--version"}, versionHelp = true, description = "display version info")
        boolean versionInfoRequested;

        @Option(names = {"-h", "--help"}, usageHelp = true, description = "display this help message")
        boolean usageHelpRequested;

        // this example implements Callable, so parsing, error handling and handling user
        // requests for usage help or version help can be done with one line of code.
        public static void main(String... args) {
                int exitCode = new CommandLine(new App()).execute(args);
                System.exit(exitCode);
        }

        @Override
        public Integer call() throws Exception { // your business logic goes here...
                //byte[] fileContents = Files.readAllBytes(file.toPath());
                //byte[] digest = MessageDigest.getInstance(algorithm).digest(fileContents);
                //System.out.printf(algorithm + " hash of " + file.getPath() + ": %0" + (digest.length*2) + "x%n", new BigInteger(1, digest));
                return 0;
        }
}
