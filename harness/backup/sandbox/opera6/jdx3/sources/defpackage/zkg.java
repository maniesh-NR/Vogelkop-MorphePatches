package defpackage;

import android.util.SparseArray;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class zkg {
    public static final Pattern a = Pattern.compile("\\s*\\[playlist\\]\\s*", 2);
    public static final Pattern b = Pattern.compile("\\s*File(\\d+)\\s?=(.*)", 2);
    public static final Pattern c = Pattern.compile("\\s*Title(\\d+)\\s?=(.*)", 2);
    public static final Pattern d = Pattern.compile("\\s*#EXTINF:-?\\d+,(.*)");
    public static final Pattern e = Pattern.compile("\\s*#EXTINF:(.*)");

    public static ArrayList a(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                if (!line.trim().isEmpty()) {
                    if (a.matcher(line).matches()) {
                        arrayList = b(bufferedReader);
                    } else {
                        String strTrim = null;
                        do {
                            if (!line.trim().isEmpty() && !"#EXTM3U".equals(line)) {
                                Matcher matcher = d.matcher(line);
                                if (matcher.matches()) {
                                    strTrim = matcher.group(1).trim();
                                } else {
                                    Matcher matcher2 = e.matcher(line);
                                    if (matcher2.matches()) {
                                        strTrim = matcher2.group(1).trim();
                                    } else if (!line.startsWith("#")) {
                                        arrayList.add(new ykg(line.trim(), strTrim));
                                        strTrim = null;
                                    }
                                }
                            }
                            line = bufferedReader.readLine();
                        } while (line != null);
                    }
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        bufferedReader.close();
        return arrayList;
    }

    public static ArrayList b(BufferedReader bufferedReader) throws IOException {
        SparseArray sparseArray = new SparseArray();
        SparseArray sparseArray2 = new SparseArray();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            Matcher matcher = b.matcher(line);
            if (matcher.matches()) {
                sparseArray.put(Integer.parseInt(matcher.group(1)) - 1, matcher.group(2).trim());
            } else {
                Matcher matcher2 = c.matcher(line);
                if (matcher2.matches()) {
                    sparseArray2.put(Integer.parseInt(matcher2.group(1)) - 1, matcher2.group(2).trim());
                }
            }
        }
        ArrayList arrayList = new ArrayList(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            int iKeyAt = sparseArray.keyAt(i);
            while (arrayList.size() < iKeyAt) {
                arrayList.add(new ykg("", null));
            }
            arrayList.add(new ykg((String) sparseArray.valueAt(i), (String) sparseArray2.get(iKeyAt)));
        }
        return arrayList;
    }
}
