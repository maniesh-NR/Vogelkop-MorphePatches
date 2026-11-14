package defpackage;

import ads_mobile_sdk.ox;
import android.content.res.AssetFileDescriptor;
import android.media.MediaMetadataRetriever;
import android.os.SystemClock;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class avj implements rsc, wom, o3n, jv0, ylo, djp, ee5 {
    public final /* synthetic */ byte a;

    public /* synthetic */ avj(byte b) {
        this.a = b;
    }

    public static boolean b(int i) {
        boolean z;
        synchronized (cak.e) {
            z = (cak.f.a & i) == i;
        }
        return z;
    }

    public static long e(long j) {
        long jNextLong = wmk.f.nextLong();
        return (jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong)) % j;
    }

    public static void f(Runnable runnable) {
        synchronized (cak.e) {
            Iterator it = cak.f.b.iterator();
            while (it.hasNext()) {
                if (((bak) it.next()).a == runnable) {
                    it.remove();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void g(int i, Runnable runnable) {
        synchronized (cak.e) {
            cak cakVar = cak.f;
            if ((cakVar.a & i) == i) {
                ArrayDeque arrayDeque = cakVar.c;
                if (arrayDeque.isEmpty()) {
                    runnable.run();
                } else {
                    arrayDeque.add(runnable);
                }
            } else {
                ArrayDeque arrayDeque2 = cakVar.b;
                bak bakVar = new bak();
                bakVar.a = runnable;
                bakVar.b = i;
                arrayDeque2.add(bakVar);
            }
        }
    }

    public final Object a() {
        switch (this.a) {
            case 11:
                return new igp("IntegrityService");
            default:
                return new yfp((byte) 0);
        }
    }

    public final Object a(int i) {
        ox oxVarA = ox.a(i);
        return oxVarA == null ? ox.UNRECOGNIZED : oxVarA;
    }

    public final void c() {
    }

    @Override // defpackage.rsc
    public final void cancelLoad() {
    }

    public final boolean d() {
        return true;
    }

    @Override // defpackage.o3n
    public final void h(MediaMetadataRetriever mediaMetadataRetriever, Object obj) throws IllegalArgumentException {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    public final void j(List list, x92 x92Var) {
    }

    public final void l(String str) {
    }

    @Override // defpackage.rsc
    public final void load() {
        synchronized (z5i.s) {
            Object obj = z5i.t;
            synchronized (obj) {
                try {
                    if (z5i.u) {
                        return;
                    }
                    long jZ = z5i.Z();
                    synchronized (obj) {
                        SystemClock.elapsedRealtime();
                        z5i.v = jZ;
                        z5i.u = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final Object r(x79 x79Var) {
        switch (this.a) {
            case 17:
                return new m3e();
            default:
                return new y55();
        }
    }

    public final boolean u() {
        return false;
    }

    public final boolean v() {
        return false;
    }
}
