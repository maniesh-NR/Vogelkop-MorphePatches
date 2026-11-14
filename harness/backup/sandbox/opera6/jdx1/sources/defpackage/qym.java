package defpackage;

import java.io.File;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class qym {
    public static final Charset a = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    public static void a(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            n57.d(file, "not a readable directory: ");
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                a(file2);
            }
            if (!file2.delete()) {
                n57.d(file2, "failed to delete file: ");
                return;
            }
        }
    }
}
