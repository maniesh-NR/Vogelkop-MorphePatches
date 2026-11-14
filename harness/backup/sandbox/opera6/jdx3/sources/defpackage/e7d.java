package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public abstract class e7d {
    public static int b = 1;
    public static int d;
    public static final Object a = new Object();
    public static final ArrayList c = new ArrayList();

    public static void a(Context context, c7d c7dVar) {
        synchronized (a) {
            int iA = vep.A(b);
            if (iA == 0) {
                b = 2;
                c.add(c7dVar);
            } else if (iA == 1) {
                c.add(c7dVar);
                return;
            } else if (iA == 2) {
                c7dVar.onSuccess();
                return;
            } else if (iA == 3) {
                c7dVar.c(d);
                return;
            }
            try {
                new d7d(context.getApplicationContext()).executeOnExecutor(he2.c, new Void[0]);
            } catch (RejectedExecutionException e) {
                b(1, e);
            }
        }
    }

    public static void b(int i, Throwable th) {
        String str;
        String string = th != null ? th.toString() : "";
        if (i == 1) {
            str = "LIB_LOAD";
        } else if (i == 2) {
            str = "CHROMIUM_START";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "EMULATED_ARM";
        }
        ks3.B("MainLibraryBoot: ".concat(str), string);
        synchronized (a) {
            b = 4;
            d = i;
            ArrayList arrayList = c;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((c7d) obj).c(i);
            }
            c.clear();
        }
    }

    public static void c(c7d c7dVar) {
        synchronized (a) {
            c.remove(c7dVar);
        }
    }
}
