package defpackage;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class z9p implements Closeable {
    public final File a;
    public final File b;
    public final File c;
    public BufferedWriter h;
    public int j;
    public boolean m;
    public long g = 0;
    public final LinkedHashMap i = new LinkedHashMap(0, 0.75f, true);
    public long k = 0;
    public final ExecutorService l = gxo.c.a;
    public final y97 n = new y97((Object) this, (byte) 4);
    public final boolean d = true;
    public final boolean f = true;
    public final int e = 2097152;

    static {
        Charset.forName("UTF-8");
    }

    public z9p(File file) {
        this.a = file;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
    }

    public static void G(String str) {
        if (str.contains(" ") || str.contains("\n") || str.contains("\r")) {
            qp2.o(sko.k("keys must not contain spaces or newlines: \"", str, "\""));
        }
    }

    public static String k(BufferedInputStream bufferedInputStream) throws IOException {
        StringBuilder sb = new StringBuilder(80);
        while (true) {
            int i = bufferedInputStream.read();
            if (i == -1) {
                qp2.c();
                return null;
            }
            if (i == 10) {
                int length = sb.length();
                if (length > 0) {
                    int i2 = length - 1;
                    if (sb.charAt(i2) == '\r') {
                        sb.setLength(i2);
                    }
                }
                return sb.toString();
            }
            sb.append((char) i);
        }
    }

    public static z9p l(File file) {
        z9p z9pVar = new z9p(file);
        File file2 = z9pVar.b;
        if (file2.exists()) {
            try {
                z9pVar.t();
                z9pVar.r();
                z9pVar.h = new BufferedWriter(new FileWriter(file2, true), 8192);
                return z9pVar;
            } catch (IOException unused) {
                z9pVar.close();
                sjo.g(z9pVar.a);
            }
        }
        file.mkdirs();
        z9p z9pVar2 = new z9p(file);
        z9pVar2.E();
        return z9pVar2;
    }

    public static void n(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public final synchronized void D(String str) {
        if (this.h == null) {
            throw new IllegalStateException("cache is closed");
        }
        G(str);
        r9p r9pVar = (r9p) this.i.get(str);
        if (r9pVar != null && r9pVar.d == null) {
            for (int i = 0; i < this.f; i++) {
                File fileA = r9pVar.a(i);
                if (!fileA.delete()) {
                    throw new IOException("failed to delete " + fileA);
                }
                long j = this.g;
                long[] jArr = r9pVar.b;
                this.g = j - jArr[i];
                jArr[i] = 0;
            }
            this.j++;
            this.h.append((CharSequence) ("REMOVE " + str + '\n'));
            this.i.remove(str);
            if (q()) {
                H();
            }
        }
    }

    public final synchronized void E() {
        StringBuilder sb;
        String strB;
        BufferedWriter bufferedWriter = this.h;
        if (bufferedWriter != null) {
            bufferedWriter.close();
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(this.c), 8192);
        bufferedWriter2.write("libcore.io.DiskLruCache");
        bufferedWriter2.write("\n");
        bufferedWriter2.write("1");
        bufferedWriter2.write("\n");
        bufferedWriter2.write(Integer.toString(this.d ? 1 : 0));
        bufferedWriter2.write("\n");
        bufferedWriter2.write(Integer.toString(this.f ? 1 : 0));
        bufferedWriter2.write("\n");
        bufferedWriter2.write("\n");
        for (r9p r9pVar : this.i.values()) {
            if (r9pVar.d != null) {
                sb = new StringBuilder();
                sb.append("DIRTY ");
                strB = r9pVar.a;
            } else {
                sb = new StringBuilder();
                sb.append("CLEAN ");
                sb.append(r9pVar.a);
                strB = r9pVar.b();
            }
            sb.append(strB);
            sb.append('\n');
            bufferedWriter2.write(sb.toString());
        }
        bufferedWriter2.close();
        this.c.renameTo(this.b);
        this.h = new BufferedWriter(new FileWriter(this.b, true), 8192);
    }

    public final synchronized void H() {
        if (!this.m) {
            this.m = true;
            this.l.submit(this.n);
        }
    }

    public final void I() {
        while (this.g > this.e) {
            D((String) ((Map.Entry) this.i.entrySet().iterator().next()).getKey());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.h != null) {
            ArrayList arrayList = new ArrayList(this.i.values());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                eyi eyiVar = ((r9p) obj).d;
                if (eyiVar != null) {
                    eyiVar.d();
                }
            }
            I();
            this.h.close();
            this.h = null;
        }
    }

    public final eyi h(String str) {
        synchronized (this) {
            if (this.h == null) {
                throw new IllegalStateException("cache is closed");
            }
            G(str);
            r9p r9pVar = (r9p) this.i.get(str);
            if (r9pVar == null) {
                r9pVar = new r9p(this, str);
                this.i.put(str, r9pVar);
            } else if (r9pVar.d != null) {
                return null;
            }
            eyi eyiVar = new eyi(this, r9pVar);
            r9pVar.d = eyiVar;
            this.h.write("DIRTY " + str + '\n');
            this.h.flush();
            return eyiVar;
        }
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean] */
    public final synchronized void m(eyi eyiVar, boolean z) {
        r9p r9pVar = (r9p) eyiVar.c;
        if (r9pVar.d != eyiVar) {
            throw new IllegalStateException();
        }
        if (z && !r9pVar.c) {
            for (int i = 0; i < this.f; i++) {
                if (!r9pVar.c(i).exists()) {
                    eyiVar.d();
                    throw new IllegalStateException("edit didn't create file " + i);
                }
            }
        }
        for (int i2 = 0; i2 < this.f; i2++) {
            File fileC = r9pVar.c(i2);
            if (!z) {
                n(fileC);
            } else if (fileC.exists()) {
                File fileA = r9pVar.a(i2);
                fileC.renameTo(fileA);
                long j = r9pVar.b[i2];
                long length = fileA.length();
                r9pVar.b[i2] = length;
                this.g = (this.g - j) + length;
            }
        }
        this.j++;
        r9pVar.d = null;
        if (r9pVar.c || z) {
            r9pVar.c = true;
            this.h.write("CLEAN " + r9pVar.a + r9pVar.b() + '\n');
            if (z) {
                this.k++;
            }
        } else {
            this.i.remove(r9pVar.a);
            this.h.write("REMOVE " + r9pVar.a + '\n');
        }
        this.h.flush();
        if (this.g > this.e || q()) {
            H();
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
    public final synchronized gt6 o(String str) {
        if (this.h == null) {
            throw new IllegalStateException("cache is closed");
        }
        G(str);
        r9p r9pVar = (r9p) this.i.get(str);
        if (r9pVar != null && r9pVar.c) {
            InputStream[] inputStreamArr = new InputStream[this.f];
            for (int i = 0; i < this.f; i++) {
                try {
                    inputStreamArr[i] = new FileInputStream(r9pVar.a(i));
                } catch (FileNotFoundException unused) {
                }
            }
            this.j++;
            this.h.append((CharSequence) ("READ " + str + '\n'));
            if (q()) {
                H();
            }
            return new gt6(inputStreamArr, (byte) 2);
        }
        return null;
    }

    public final synchronized File p(String str) {
        if (this.h == null) {
            throw new IllegalStateException("cache is closed");
        }
        G(str);
        r9p r9pVar = (r9p) this.i.get(str);
        if (r9pVar == null || !r9pVar.c) {
            return null;
        }
        this.j++;
        this.h.append((CharSequence) ("READ " + str + '\n'));
        if (q()) {
            H();
        }
        return r9pVar.a(0);
    }

    public final boolean q() {
        int i = this.j;
        return i >= 2000 && i >= this.i.size();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    public final void r() throws IOException {
        n(this.c);
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            r9p r9pVar = (r9p) it.next();
            eyi eyiVar = r9pVar.d;
            ?? r3 = this.f;
            int i = 0;
            if (eyiVar == null) {
                while (i < r3) {
                    this.g += r9pVar.b[i];
                    i++;
                }
            } else {
                r9pVar.d = null;
                while (i < r3) {
                    n(r9pVar.a(i));
                    n(r9pVar.c(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void s(String str) throws IOException {
        String[] strArrSplit = str.split(" ");
        if (strArrSplit.length >= 2) {
            String str2 = strArrSplit[1];
            boolean zEquals = strArrSplit[0].equals("REMOVE");
            LinkedHashMap linkedHashMap = this.i;
            if (zEquals && strArrSplit.length == 2) {
                linkedHashMap.remove(str2);
                return;
            }
            r9p r9pVar = (r9p) linkedHashMap.get(str2);
            if (r9pVar == null) {
                r9pVar = new r9p(this, str2);
                linkedHashMap.put(str2, r9pVar);
            }
            if (strArrSplit[0].equals("CLEAN") && strArrSplit.length == (this.f ? 1 : 0) + 2) {
                r9pVar.c = true;
                r9pVar.d = null;
                String[] strArr = (String[]) Arrays.copyOfRange(strArrSplit, 2, strArrSplit.length);
                if (strArr.length == r9pVar.e.f) {
                    for (int i = 0; i < strArr.length; i++) {
                        try {
                            r9pVar.b[i] = Long.parseLong(strArr[i]);
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return;
                }
                t3p.p(Arrays.toString(strArr), "unexpected journal line: ");
                return;
            }
            if (strArrSplit[0].equals("DIRTY") && strArrSplit.length == 2) {
                r9pVar.d = new eyi(this, r9pVar);
                return;
            } else if (strArrSplit[0].equals("READ") && strArrSplit.length == 2) {
                return;
            }
        }
        s49.m("unexpected journal line: ".concat(str));
    }

    public final void t() {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.b), 8192);
        try {
            String strK = k(bufferedInputStream);
            String strK2 = k(bufferedInputStream);
            String strK3 = k(bufferedInputStream);
            String strK4 = k(bufferedInputStream);
            String strK5 = k(bufferedInputStream);
            if (!"libcore.io.DiskLruCache".equals(strK) || !"1".equals(strK2) || !Integer.toString(this.d ? 1 : 0).equals(strK3) || !Integer.toString(this.f ? 1 : 0).equals(strK4) || !"".equals(strK5)) {
                throw new IOException("unexpected journal header: [" + strK + ", " + strK2 + ", " + strK4 + ", " + strK5 + "]");
            }
            while (true) {
                try {
                    s(k(bufferedInputStream));
                } catch (EOFException unused) {
                    return;
                }
            }
        } finally {
            r9h.l(bufferedInputStream);
        }
    }
}
