package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class xfk implements AutoCloseable {
    public static final bf2 i = c26.j(0);
    public static final bf2 j = c26.j(0);
    public static final bf2 k = c26.j(0);
    public static final bf2 l = c26.j(0);
    public static final bf2 m = c26.j(0);
    public static final List n = Arrays.asList(qii.h, qii.i);
    public static final au9 o = new au9(23);
    public static final List p = Arrays.asList(new rfk(0), new rfk(34));
    public static final au9 q = new au9(24);
    public final fd4 a;
    public final LinkedHashMap b;
    public final List c;
    public final LinkedHashMap d;
    public final u9d e;
    public final List f;
    public final ArrayList g;
    public final ArrayList h;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xfk(defpackage.ge4 r28, defpackage.fd4 r29, defpackage.r16 r30) {
        /*
            Method dump skipped, instructions count: 1258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xfk.<init>(ge4, fd4, r16):void");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        boolean zIsTerminated;
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            AutoCloseable autoCloseable = (sya) it.next();
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else {
                if (!(autoCloseable instanceof ExecutorService)) {
                    hai.d();
                    return;
                }
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    public final cg4 h(int i2) {
        Object obj;
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i3);
            i3++;
            if (((cg4) obj).a == i2) {
                break;
            }
        }
        return (cg4) obj;
    }

    public final bg4 k(int i2) {
        Object next;
        Iterator it = this.b.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((cg4) ((Map.Entry) next).getValue()).a == i2) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (bg4) entry.getKey();
        }
        return null;
    }

    public final String toString() {
        return "StreamGraph(" + this.b + ')';
    }
}
