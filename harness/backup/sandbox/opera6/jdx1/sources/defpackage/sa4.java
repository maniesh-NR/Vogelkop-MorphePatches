package defpackage;

import android.media.ImageWriter;
import android.os.Handler;
import android.os.Trace;
import android.view.Surface;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class sa4 {
    public final /* synthetic */ byte a = 0;
    public final boolean b;
    public boolean c;
    public int d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public Object l;
    public Object m;

    public sa4(ac4 ac4Var, hnl hnlVar, Map map, Map map2, xfk xfkVar, sgk sgkVar, boolean z) {
        this.e = ac4Var;
        this.f = hnlVar;
        this.g = map;
        this.h = map2;
        this.i = xfkVar;
        this.j = sgkVar;
        this.b = z;
        bf2 bf2Var = ta4.a;
        bf2Var.getClass();
        this.d = bf2.b.incrementAndGet(bf2Var);
        this.k = new Object();
        m71 m71Var = null;
        if (!xfkVar.f.isEmpty()) {
            ufk ufkVar = (ufk) CollectionsKt.K(xfkVar.f);
            Surface inputSurface = ac4Var.getInputSurface();
            if (inputSurface == null) {
                qp2.n("inputSurface is required to create instance of imageWriter.");
                throw null;
            }
            try {
                int i = ufkVar.a;
                int i2 = ufkVar.b;
                Handler handlerA = hnlVar.a();
                ImageWriter imageWriterNewInstance = ImageWriter.newInstance(inputSurface, 1, i2);
                m71 m71Var2 = new m71(imageWriterNewInstance, i);
                imageWriterNewInstance.setOnImageReleasedListener(m71Var2, handlerA);
                m71Var = m71Var2;
            } catch (RuntimeException unused) {
                Objects.toString((ac4) this.e);
            }
            if (m71Var != null) {
                m71Var.toString();
                Objects.toString((ac4) this.e);
            }
        }
        this.m = m71Var;
    }

    public sa4(BrowserActivity browserActivity, umi umiVar, bf9 bf9Var, lq3 lq3Var, tcc tccVar, x77 x77Var, c5o c5oVar) {
        HashSet hashSet = new HashSet();
        this.g = hashSet;
        this.h = new HashSet();
        q65 q65Var = new q65(this, (byte) 5);
        this.i = q65Var;
        String[] strArr = OperaApplication.K;
        browserActivity.getApplicationContext();
        this.e = bf9Var;
        this.f = (String) lq3Var.c;
        this.k = tccVar;
        this.l = x77Var;
        this.b = bf9Var.r() < 2;
        this.j = bf9Var.t;
        byte b = lq3Var.b;
        if (b == 0 || !(b == 1 || b == 2 || (b != 3 && b == 100))) {
            f();
            return;
        }
        myk mykVarN = bf9Var.n(myk.class);
        if (mykVarN != null) {
            hashSet.add(new myf(browserActivity, bf9Var, mykVarN, lq3Var.b, new rgh(this, c5oVar, false)));
        }
        q65Var.B0(umiVar, 120L, TimeUnit.SECONDS);
        ArrayList arrayList = new ArrayList(hashSet);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            myf myfVar = (myf) obj;
            myfVar.a = new jxl(this, (byte) 1);
            myfVar.a();
            jxl jxlVar = myfVar.a;
            if (jxlVar != null) {
                jxlVar.a(myfVar, true, 0);
                myfVar.a = null;
            }
        }
    }

    public static void d(HashSet hashSet) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            myf myfVar = (myf) it.next();
            myfVar.a = null;
            myfVar.a();
        }
        hashSet.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x053b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ra4 a(boolean r31, java.util.List r32, u9d r33, java.util.Map r34, java.util.Map r35, defpackage.xm5 r36, java.util.List r37) throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 1352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sa4.a(boolean, java.util.List, u9d, java.util.Map, java.util.Map, xm5, java.util.List):ra4");
    }

    public final void b(Runnable runnable) {
        tcc tccVar = (tcc) this.k;
        if (((qdc) tccVar).i.d(qcc.e)) {
            runnable.run();
        } else {
            tccVar.a(new uoh(runnable));
        }
    }

    public final void c() {
        ((q65) this.i).S();
        ih4 ih4Var = (ih4) this.m;
        if (ih4Var != null) {
            ih4Var.cancel();
            this.m = null;
        }
        d((HashSet) this.g);
        d((HashSet) this.h);
        g();
        x77 x77Var = (x77) this.l;
        if (x77Var != null) {
            this.l = null;
            b(new kxl(x77Var));
        }
    }

    public final void e() {
        ra4 ra4Var;
        try {
            Trace.beginSection(this + "#disconnect");
            synchronized (this.k) {
                if (this.c) {
                    ra4Var = null;
                } else {
                    this.c = true;
                    m71 m71Var = (m71) this.m;
                    if (m71Var != null) {
                        am2.y(m71Var);
                    }
                    Surface inputSurface = ((ac4) this.e).getInputSurface();
                    if (inputSurface != null) {
                        inputSurface.release();
                    }
                    ra4Var = (ra4) this.l;
                }
            }
            if (this.b && ra4Var != null) {
                Objects.toString(ra4Var);
                if (((Unit) ((hnl) this.f).b(2000L, new pv((byte) 2, null, ra4Var))) == null) {
                    toString();
                    Objects.toString(ra4Var);
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void f() {
        ((q65) this.i).S();
        d((HashSet) this.g);
        d((HashSet) this.h);
        g();
        x77 x77Var = (x77) this.l;
        if (x77Var != null) {
            int i = this.d;
            this.l = null;
            b(new br(x77Var, i, (byte) 27));
        }
    }

    public final void g() {
        bf9 bf9Var = (bf9) this.e;
        if (this.c) {
            return;
        }
        if (this.b) {
            bf9Var.N();
            return;
        }
        String str = bf9Var.t;
        if (str == null || str.equals((String) this.j)) {
            return;
        }
        bf9Var.i(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046 A[Catch: all -> 0x005b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:10:0x0010, B:12:0x0019, B:14:0x0021, B:16:0x0026, B:18:0x002a, B:19:0x002c, B:20:0x0039, B:21:0x0046, B:23:0x0050, B:24:0x0055), top: B:30:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer h(defpackage.ra4 r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.k
            monitor-enter(r0)
            boolean r1 = r4.c     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L10
            r4.toString()     // Catch: java.lang.Throwable -> L5b
            java.util.Objects.toString(r5)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r0)
            r4 = 0
            return r4
        L10:
            java.util.ArrayList r1 = r5.c     // Catch: java.lang.Throwable -> L5b
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L5b
            r2 = 1
            if (r1 != r2) goto L46
            java.lang.Object r1 = r4.e     // Catch: java.lang.Throwable -> L5b
            ac4 r1 = (defpackage.ac4) r1     // Catch: java.lang.Throwable -> L5b
            boolean r2 = r1 instanceof defpackage.u21     // Catch: java.lang.Throwable -> L5b
            if (r2 != 0) goto L46
            boolean r2 = r5.b     // Catch: java.lang.Throwable -> L5b
            r3 = 0
            if (r2 == 0) goto L39
            boolean r2 = r4.b     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L2c
            r4.l = r5     // Catch: java.lang.Throwable -> L5b
        L2c:
            java.util.ArrayList r4 = r5.c     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L5b
            android.hardware.camera2.CaptureRequest r4 = (android.hardware.camera2.CaptureRequest) r4     // Catch: java.lang.Throwable -> L5b
            java.lang.Integer r4 = r1.s0(r4, r5)     // Catch: java.lang.Throwable -> L5b
            goto L59
        L39:
            java.util.ArrayList r4 = r5.c     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L5b
            android.hardware.camera2.CaptureRequest r4 = (android.hardware.camera2.CaptureRequest) r4     // Catch: java.lang.Throwable -> L5b
            java.lang.Integer r4 = r1.M0(r4, r5)     // Catch: java.lang.Throwable -> L5b
            goto L59
        L46:
            boolean r1 = r5.b     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r4 = r4.e     // Catch: java.lang.Throwable -> L5b
            ac4 r4 = (defpackage.ac4) r4     // Catch: java.lang.Throwable -> L5b
            java.util.ArrayList r2 = r5.c     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L55
            java.lang.Integer r4 = r4.u1(r2, r5)     // Catch: java.lang.Throwable -> L5b
            goto L59
        L55:
            java.lang.Integer r4 = r4.t0(r2, r5)     // Catch: java.lang.Throwable -> L5b
        L59:
            monitor-exit(r0)
            return r4
        L5b:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sa4.h(ra4):java.lang.Integer");
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "Camera2CaptureSequenceProcessor-" + this.d;
            default:
                return super.toString();
        }
    }
}
