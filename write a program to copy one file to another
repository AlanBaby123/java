import java.io.*;
import java.util.*;
class CopyFile {
    public static void main(String arg[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide source file name: ");
        String sfile = sc.next();
        System.out.print("Provide destination file name: ");
        String dfile = sc.next();
        FileReader fin = new FileReader(sfile);
        FileWriter fout = new FileWriter(dfile, true);

        int c;
        while ((c = fin.read()) != -1) {
            fout.write(c);
        }
        System.out.println("Copy finish...");
        fin.close();
        fout.close();
    }
}



                   output
---------------------------------------
C:\Users\mlm\.jdks\openjdk-21.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.3\lib\idea_rt.jar=62877:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\mlm\IdeaProjects\j2\out\production\j2 CopyFile
Provide source file name: source.txt


source.txt
---------------
Java is a popular programming language, created in 1995.
It is owned by Oracle, and more than 3 billion devices run Java.
It is used for: Mobile applications (specially Android apps) Desktop applications

Provide destination file name: destination.txt
Copy finish...

destination.txt
-----------------------
Java is a popular programming language, created in 1995.
It is owned by Oracle, and more than 3 billion devices run Java.
It is used for: Mobile applications (specially Android apps) Desktop applications
