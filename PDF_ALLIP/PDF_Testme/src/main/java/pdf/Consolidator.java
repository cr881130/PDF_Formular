// 
// Decompiled by Procyon v0.5.36
// 

package pdf;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.nio.file.OpenOption;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FilenameFilter;
import java.io.File;
import java.util.Hashtable;

public class Consolidator
{
    public static void main(String[] args) throws IOException {
        if (args == null || args.length == 0) {
            args = new String[] { "C:\\Temp\\eMailTest\\" };
        }
        final Hashtable<String, Hashtable<String, StringBuilder>> daten = new Hashtable<String, Hashtable<String, StringBuilder>>();
        String path = args[0];
        System.out.println("Consolidator pfad: " + path);
        path = path.replaceAll("\"", "");
        final File f = new File(path);
        if (f.exists() && f.isDirectory()) {
            System.out.println("Consolidator pfad gefunden");
            final File[] listFiles = f.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(final File dir, final String name) {
                    return name.endsWith(".csv");
                }
            });
            for (int i = 0; i < listFiles.length; ++i) {
                final File file = listFiles[i];
                final String absolutePath = file.getAbsolutePath();
                final String name = file.getName();
                System.out.println("Consolidator gefunden " + name);
                final String datum = name.substring(0, 8);
                final String content = new String(Files.readAllBytes(Paths.get(absolutePath, new String[0])));
                final int indexOfDelimiter = content.indexOf(";");
                final String type = content.substring(0, indexOfDelimiter);
                if (daten.get(type) == null) {
                    daten.put(type, new Hashtable<String, StringBuilder>());
                }
                if (daten.get(type).get(datum) == null) {
                    final StringBuilder stringBuilder = new StringBuilder();
                    if (KAFormularData.getType().equals(type)) {
                        stringBuilder.append(KAFormularData.getHeader());
                        stringBuilder.append(System.lineSeparator());
                    }
                    if (AAFormularData.getType().equals(type)) {
                        stringBuilder.append(AAFormularData.getHeader());
                        stringBuilder.append(System.lineSeparator());
                    }
                    daten.get(type).put(datum, stringBuilder);
                }
                daten.get(type).get(datum).append(content);
                daten.get(type).get(datum).append(System.lineSeparator());
            }
        }
        final Set<String> types = daten.keySet();
        for (final String type2 : types) {
            final Hashtable<String, StringBuilder> filesProTypeTable = daten.get(type2);
            final Set<String> datums = filesProTypeTable.keySet();
            for (final String datum2 : datums) {
                final StringBuilder stringBuilder2 = filesProTypeTable.get(datum2);
                final String name2 = String.valueOf(datum2) + "_" + type2 + "_Zusammenfassung.csv";
                final String export = String.valueOf(path) + "\\" + name2;
                System.out.println("Consolidator erstelle " + export);
                Files.write(Paths.get(export, new String[0]), stringBuilder2.toString().getBytes(), new OpenOption[0]);
            }
        }
    }
}
