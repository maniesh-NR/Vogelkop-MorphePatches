package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class ttj {
    public xtj a;
    public long b;
    public boolean c;
    public int d;

    public ttj(long j, xtj xtjVar) {
        int iB;
        int iNumberOfTrailingZeros;
        this.a = xtjVar;
        this.b = j;
        bli bliVar = ytj.a;
        if (j != 0) {
            xtj xtjVarD = d();
            long j2 = xtjVarD.c;
            long[] jArr = xtjVarD.d;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = xtjVarD.b;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = xtjVarD.a;
                    if (j4 != 0) {
                        j2 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = iNumberOfTrailingZeros + j2;
            }
            synchronized (ytj.c) {
                iB = ytj.f.b(j);
            }
        } else {
            iB = -1;
        }
        this.d = iB;
    }

    public static void q(ttj ttjVar) {
        ytj.b.F(ttjVar);
    }

    public final void a() {
        synchronized (ytj.c) {
            b();
            p();
        }
    }

    public void b() {
        ytj.d = ytj.d.c(g());
    }

    public abstract void c();

    public xtj d() {
        return this.a;
    }

    public abstract Function1 e();

    public boolean f() {
        return false;
    }

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public Function1 i() {
        return null;
    }

    public final ttj j() {
        p8f p8fVar = ytj.b;
        ttj ttjVar = (ttj) p8fVar.get();
        p8fVar.F(this);
        return ttjVar;
    }

    public void k() {
        gyg.Y();
        throw null;
    }

    public void l() {
        gyg.Y();
        throw null;
    }

    public void m() {
    }

    public void n(vak vakVar) {
        bli bliVar = ytj.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            ytj.t(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(xtj xtjVar) {
        this.a = xtjVar;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract ttj u(Function1 function1);
}
