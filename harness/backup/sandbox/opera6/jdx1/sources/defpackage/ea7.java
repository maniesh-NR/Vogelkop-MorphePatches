package defpackage;

import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ea7 implements Closeable {
    public final File a;
    public final File b;
    public final File c;
    public final File d;
    public BufferedWriter i;
    public int k;
    public long h = 0;
    public final LinkedHashMap j = new LinkedHashMap(0, 0.75f, true);
    public long l = 0;
    public final ThreadPoolExecutor m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new z97());
    public final y97 n = new y97((Object) this, (byte) 0);
    public final boolean e = true;
    public final boolean g = true;
    public final int f = 262144000;

    public ea7(File file) {
        this.a = file;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.d = new File(file, "journal.bkp");
    }

    public static void E(File file, File file2, boolean z) throws IOException {
        if (z) {
            l(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void h(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void l(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void n(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static ea7 q(File file) throws IOException {
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                E(file2, file3, false);
            }
        }
        ea7 ea7Var = new ea7(file);
        if (ea7Var.b.exists()) {
            try {
                ea7Var.s();
                ea7Var.r();
                return ea7Var;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                ea7Var.close();
                qym.a(ea7Var.a);
            }
        }
        file.mkdirs();
        ea7 ea7Var2 = new ea7(file);
        ea7Var2.D();
        return ea7Var2;
    }

    public final synchronized void D() {
        BufferedWriter bufferedWriter = this.i;
        if (bufferedWriter != null) {
            h(bufferedWriter);
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), qym.a));
        try {
            bufferedWriter2.write("libcore.io.DiskLruCache");
            bufferedWriter2.write("\n");
            bufferedWriter2.write("1");
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.e ? 1 : 0));
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.g ? 1 : 0));
            bufferedWriter2.write("\n");
            bufferedWriter2.write("\n");
            for (aa7 aa7Var : this.j.values()) {
                if (aa7Var.f != null) {
                    bufferedWriter2.write("DIRTY " + aa7Var.a + '\n');
                } else {
                    bufferedWriter2.write("CLEAN " + aa7Var.a + aa7Var.a() + '\n');
                }
            }
            h(bufferedWriter2);
            if (this.b.exists()) {
                E(this.b, this.d, true);
            }
            E(this.c, this.b, false);
            this.d.delete();
            this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), qym.a));
        } catch (Throwable th) {
            h(bufferedWriter2);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    public final void G() {
        while (this.h > this.f) {
            String str = (String) ((Map.Entry) this.j.entrySet().iterator().next()).getKey();
            synchronized (this) {
                if (this.i == null) {
                    throw new IllegalStateException("cache is closed");
                }
                aa7 aa7Var = (aa7) this.j.get(str);
                if (aa7Var != null && aa7Var.f == null) {
                    for (int i = 0; i < this.g; i++) {
                        File file = aa7Var.c[i];
                        if (file.exists() && !file.delete()) {
                            throw new IOException("failed to delete " + file);
                        }
                        long j = this.h;
                        long[] jArr = aa7Var.b;
                        this.h = j - jArr[i];
                        jArr[i] = 0;
                    }
                    this.k++;
                    this.i.append((CharSequence) "REMOVE");
                    this.i.append(' ');
                    this.i.append((CharSequence) str);
                    this.i.append('\n');
                    this.j.remove(str);
                    if (p()) {
                        this.m.submit(this.n);
                    }
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.i == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.j.values());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            tn tnVar = ((aa7) obj).f;
            if (tnVar != null) {
                tnVar.g();
            }
        }
        G();
        h(this.i);
        this.i = null;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    public final synchronized void k(tn tnVar, boolean z) {
        aa7 aa7Var = (aa7) tnVar.b;
        if (aa7Var.f != tnVar) {
            throw new IllegalStateException();
        }
        if (z && !aa7Var.e) {
            for (int i = 0; i < this.g; i++) {
                if (!((boolean[]) tnVar.c)[i]) {
                    tnVar.g();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!aa7Var.d[i].exists()) {
                    tnVar.g();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.g; i2++) {
            File file = aa7Var.d[i2];
            if (!z) {
                l(file);
            } else if (file.exists()) {
                File file2 = aa7Var.c[i2];
                file.renameTo(file2);
                long j = aa7Var.b[i2];
                long length = file2.length();
                aa7Var.b[i2] = length;
                this.h = (this.h - j) + length;
            }
        }
        this.k++;
        aa7Var.f = null;
        if (aa7Var.e || z) {
            aa7Var.e = true;
            this.i.append((CharSequence) "CLEAN");
            this.i.append(' ');
            this.i.append((CharSequence) aa7Var.a);
            this.i.append((CharSequence) aa7Var.a());
            this.i.append('\n');
            if (z) {
                this.l++;
            }
        } else {
            this.j.remove(aa7Var.a);
            this.i.append((CharSequence) "REMOVE");
            this.i.append(' ');
            this.i.append((CharSequence) aa7Var.a);
            this.i.append('\n');
        }
        n(this.i);
        if (this.h > this.f || p()) {
            this.m.submit(this.n);
        }
    }

    public final tn m(String str) {
        synchronized (this) {
            if (this.i == null) {
                throw new IllegalStateException("cache is closed");
            }
            aa7 aa7Var = (aa7) this.j.get(str);
            if (aa7Var == null) {
                aa7Var = new aa7(this, str);
                this.j.put(str, aa7Var);
            } else if (aa7Var.f != null) {
                return null;
            }
            tn tnVar = new tn(this, aa7Var);
            aa7Var.f = tnVar;
            this.i.append((CharSequence) "DIRTY");
            this.i.append(' ');
            this.i.append((CharSequence) str);
            this.i.append('\n');
            n(this.i);
            return tnVar;
        }
    }

    public final synchronized qq6 o(String str) {
        if (this.i == null) {
            throw new IllegalStateException("cache is closed");
        }
        aa7 aa7Var = (aa7) this.j.get(str);
        if (aa7Var == null) {
            return null;
        }
        if (!aa7Var.e) {
            return null;
        }
        for (File file : aa7Var.c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.k++;
        this.i.append((CharSequence) "READ");
        this.i.append(' ');
        this.i.append((CharSequence) str);
        this.i.append('\n');
        if (p()) {
            this.m.submit(this.n);
        }
        return new qq6(aa7Var.c, (byte) 5);
    }

    public final boolean p() {
        int i = this.k;
        return i >= 2000 && i >= this.j.size();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    public final void r() throws IOException {
        l(this.c);
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            aa7 aa7Var = (aa7) it.next();
            tn tnVar = aa7Var.f;
            ?? r3 = this.g;
            int i = 0;
            if (tnVar == null) {
                while (i < r3) {
                    this.h += aa7Var.b[i];
                    i++;
                }
            } else {
                aa7Var.f = null;
                while (i < r3) {
                    l(aa7Var.c[i]);
                    l(aa7Var.d[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void s() {
        File file = this.b;
        rgk rgkVar = new rgk(new FileInputStream(file), qym.a);
        try {
            try {
                String strH = rgkVar.h();
                String strH2 = rgkVar.h();
                String strH3 = rgkVar.h();
                String strH4 = rgkVar.h();
                String strH5 = rgkVar.h();
                if (!"libcore.io.DiskLruCache".equals(strH) || !"1".equals(strH2) || !Integer.toString(this.e ? 1 : 0).equals(strH3) || !Integer.toString(this.g ? 1 : 0).equals(strH4) || !"".equals(strH5)) {
                    throw new IOException("unexpected journal header: [" + strH + ", " + strH2 + ", " + strH4 + ", " + strH5 + "]");
                }
                int i = 0;
                while (true) {
                    try {
                        t(rgkVar.h());
                        i++;
                    } catch (EOFException unused) {
                        this.k = i - this.j.size();
                        if (rgkVar.e == -1) {
                            D();
                        } else {
                            this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), qym.a));
                        }
                        try {
                            return;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                }
            } finally {
                try {
                    rgkVar.close();
                } catch (Exception unused3) {
                }
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public final void t(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            s49.m("unexpected journal line: ".concat(str));
            return;
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.j;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        aa7 aa7Var = (aa7) linkedHashMap.get(strSubstring);
        if (aa7Var == null) {
            aa7Var = new aa7(this, strSubstring);
            linkedHashMap.put(strSubstring, aa7Var);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                aa7Var.f = new tn(this, aa7Var);
                return;
            } else {
                if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
                    return;
                }
                s49.m("unexpected journal line: ".concat(str));
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        aa7Var.e = true;
        aa7Var.f = null;
        if (strArrSplit.length != aa7Var.g.g) {
            t3p.p(Arrays.toString(strArrSplit), "unexpected journal line: ");
            return;
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                aa7Var.b[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                t3p.p(Arrays.toString(strArrSplit), "unexpected journal line: ");
                return;
            }
        }
    }
}
