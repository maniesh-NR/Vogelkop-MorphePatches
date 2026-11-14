package defpackage;

import java.io.File;
import java.util.Arrays;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public abstract class q3b {
    public static final Regex a;
    public static final Regex b;

    static {
        irh irhVar = irh.b;
        a = new Regex("<TITLE>([^<]*)</TITLE>", irhVar);
        b = new Regex("<H1>([^<]*)</H1>", irhVar);
    }

    public static File a(File file) {
        File file2 = new File(file, "Takeout/Chrome");
        if (!file2.exists() || !file2.isDirectory()) {
            return null;
        }
        File file3 = new File(file2, "Bookmarks.html");
        if (file3.exists()) {
            return file3;
        }
        File[] fileArrListFiles = file2.listFiles(new o3b((byte) 0));
        if (fileArrListFiles == null) {
            return null;
        }
        File[] fileArr = (File[]) Arrays.stream(fileArrListFiles).filter(new zx1(new q9a((byte) 26), (byte) 13)).toArray(new p3b());
        if (fileArr.length == 1) {
            return fileArr[0];
        }
        return null;
    }
}
