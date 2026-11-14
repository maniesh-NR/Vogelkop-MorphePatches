package defpackage;

import java.io.File;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class pz5 {
    public static final Pattern b = Pattern.compile("\\.dmp([0-9]*)\\z");
    public static final Pattern c = Pattern.compile("\\.dmp([0-9]*)(\\.try([0-9]+))\\z");
    public static final yg9 d = new yg9((byte) 24);
    public final File a;

    public pz5(File file) {
        if (file != null) {
            this.a = file;
        } else {
            t3p.q("Specified context cannot be null.");
            throw null;
        }
    }

    public static int b(String str) {
        int iLastIndexOf = str.lastIndexOf(".try");
        if (iLastIndexOf >= 0) {
            String strSubstring = str.substring(iLastIndexOf + 4);
            try {
                int iNextInt = new Scanner(strSubstring).useDelimiter("[^0-9]+").nextInt();
                if (strSubstring.indexOf(Integer.toString(iNextInt)) == 0) {
                    return iNextInt;
                }
            } catch (NoSuchElementException unused) {
            }
        }
        return -1;
    }

    public final File[] a(Pattern pattern) {
        File[] fileArrListFiles = new File(this.a, "crash_dumps").listFiles(pattern != null ? new oz5(this, pattern) : null);
        if (fileArrListFiles == null) {
            return new File[0];
        }
        Arrays.sort(fileArrListFiles, d);
        return fileArrListFiles;
    }
}
