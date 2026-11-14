package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class cak {
    public static final avj d = new avj((byte) 1);
    public static final Object e = new Object();
    public static final cak f = new cak();
    public int a;
    public final ArrayDeque b = new ArrayDeque();
    public final ArrayDeque c = new ArrayDeque();

    public cak() {
        new Handler(Looper.getMainLooper());
    }

    public static final void a(int i) {
        synchronized (e) {
            f.b(i);
        }
    }

    public final void b(int i) {
        ArrayDeque arrayDeque;
        int i2 = this.a;
        int i3 = i | i2;
        this.a = i3;
        if (i2 == i3) {
            return;
        }
        Iterator it = this.b.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayDeque = this.c;
            if (!zHasNext) {
                break;
            }
            bak bakVar = (bak) it.next();
            byte b = bakVar.b;
            Runnable runnable = bakVar.a;
            if ((this.a & b) == b) {
                it.remove();
                arrayDeque.add(runnable);
            }
        }
        while (true) {
            Runnable runnable2 = (Runnable) arrayDeque.pollFirst();
            if (runnable2 == null) {
                return;
            } else {
                runnable2.run();
            }
        }
    }
}
