package defpackage;

import android.os.HandlerThread;
import android.os.Looper;

/* loaded from: classes.dex */
public final class sbk {
    public final nv6 a;
    public final ue2 b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public int k;
    public int l;
    public int m;

    public sbk(nv6 nv6Var) {
        this.a = nv6Var;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        StringBuilder sb = zym.a;
        ceg cegVar = new ceg(looper, (byte) 3);
        cegVar.sendMessageDelayed(cegVar.obtainMessage(), 1000L);
        this.b = new ue2(handlerThread.getLooper(), this, (byte) 13);
    }

    public final ybk a() {
        ua1 ua1Var = (ua1) this.a.a;
        return new ybk(ua1Var.maxSize(), ua1Var.size(), this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, System.currentTimeMillis());
    }
}
