package defpackage;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class th2 {
    public static final Object p = new Object();
    public static ScheduledExecutorService q;
    public static int r;
    public final AudioTrack a;
    public final yg2 b;
    public final u59 c;
    public s9i d;
    public final vh2 e;
    public final boolean f;
    public final int g;
    public final d5o h;
    public final ijc i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public int n;
    public int o;

    public th2(AudioTrack audioTrack, yg2 yg2Var, u59 u59Var, kzk kzkVar) {
        int iS;
        this.a = audioTrack;
        this.b = yg2Var;
        this.c = u59Var;
        ijc ijcVar = new ijc(Thread.currentThread());
        this.i = ijcVar;
        ijcVar.b = false;
        int i = yg2Var.a;
        boolean zI = tym.I(i);
        this.f = zI;
        if (zI) {
            iS = tym.s(i) * Integer.bitCount(yg2Var.c);
            this.g = iS;
        } else {
            iS = -1;
            this.g = -1;
        }
        this.e = new vh2(new pjn(this, (byte) 14), kzkVar, audioTrack, yg2Var.a, iS, yg2Var.f);
        if (u59Var != null) {
            this.d = new s9i(audioTrack, u59Var);
        }
        d5o d5oVar = null;
        if (audioTrack.isOffloadedPlayback()) {
            d5o d5oVar2 = new d5o();
            d5oVar2.c = this;
            Handler handlerP = tym.p(null);
            d5oVar2.a = handlerP;
            sh2 sh2Var = new sh2(d5oVar2);
            d5oVar2.b = sh2Var;
            this.a.registerStreamEventCallback(new jj5(handlerP, (byte) 0), sh2Var);
            d5oVar = d5oVar2;
        }
        this.h = d5oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a() {
        /*
            Method dump skipped, instructions count: 815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.th2.a():long");
    }

    public final long b() {
        if (!this.f) {
            return this.l;
        }
        long j = this.k;
        long j2 = this.g;
        String str = tym.a;
        return ((j + j2) - 1) / j2;
    }

    public final void c(fjg fjgVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            LogSessionId logSessionIdA = fjgVar.a();
            if (logSessionIdA.equals(odf.c())) {
                return;
            }
            this.a.setLogSessionId(logSessionIdA);
        }
    }

    public final boolean d(long j, int i, ByteBuffer byteBuffer) {
        int iWrite;
        boolean z;
        u59 u59Var;
        uh2 uh2Var;
        xf2 xf2Var;
        yg2 yg2Var = this.b;
        boolean z2 = this.f;
        if (!z2 && this.n == 0) {
            this.n = ll6.h(yg2Var.a, byteBuffer);
        }
        b();
        AudioTrack audioTrack = this.a;
        int underrunCount = audioTrack.getUnderrunCount();
        boolean z3 = underrunCount > this.o;
        this.o = underrunCount;
        if (z3) {
            this.i.i(-1, new t40((byte) 25));
        }
        int iRemaining = byteBuffer.remaining();
        if (yg2Var.d) {
            if (j == Long.MIN_VALUE) {
                j = this.m;
            } else {
                this.m = j;
            }
            iWrite = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1, j * 1000);
        } else {
            iWrite = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (iWrite >= 0) {
            z = iWrite == iRemaining;
            if (z2) {
                this.k += iWrite;
                return z;
            }
            if (z) {
                this.l = (this.n * i) + this.l;
            }
            return z;
        }
        z = iWrite == -6 || iWrite == -32;
        if (z && (u59Var = this.c) != null && (xf2Var = (uh2Var = (uh2) u59Var.b).h) != null) {
            uf2 uf2Var = uf2.c;
            uh2Var.g = uf2Var;
            xf2Var.a(uf2Var);
        }
        throw new sg2(iWrite, z);
    }
}
