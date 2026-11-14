package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class byd extends q83 implements Handler.Callback {
    public lxd A;
    public long B;
    public final qii s;
    public final mi8 t;
    public final Handler u;
    public final uxd v;
    public z7h w;
    public boolean x;
    public boolean y;
    public long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byd(mi8 mi8Var, Looper looper) {
        Handler handler;
        super(5);
        qii qiiVar = qii.e;
        this.t = mi8Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = tym.a;
            handler = new Handler(looper, this);
        }
        this.u = handler;
        this.s = qiiVar;
        this.v = new uxd(1);
        this.B = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(defpackage.lxd r7, java.util.ArrayList r8) {
        /*
            r6 = this;
            r0 = 0
        L1:
            jxd[] r1 = r7.a
            int r2 = r1.length
            if (r0 >= r2) goto L48
            r2 = r1[r0]
            oj9 r2 = r2.a()
            if (r2 == 0) goto L40
            qii r3 = r6.s
            boolean r4 = r3.z(r2)
            if (r4 == 0) goto L40
            z7h r2 = r3.p(r2)
            r1 = r1[r0]
            byte[] r1 = r1.c()
            r1.getClass()
            uxd r3 = r6.v
            r3.i()
            int r4 = r1.length
            r3.k(r4)
            java.nio.ByteBuffer r4 = r3.e
            java.lang.String r5 = defpackage.tym.a
            r4.put(r1)
            r3.l()
            lxd r1 = r2.f(r3)
            if (r1 == 0) goto L45
            r6.D(r1, r8)
            goto L45
        L40:
            r1 = r1[r0]
            r8.add(r1)
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byd.D(lxd, java.util.ArrayList):void");
    }

    public final long E(long j) {
        z4o.H(j != -9223372036854775807L);
        z4o.H(this.B != -9223372036854775807L);
        return j - this.B;
    }

    public final void F(lxd lxdVar) {
        mi8 mi8Var = this.t;
        qi8 qi8Var = mi8Var.a;
        vjd vjdVar = qi8Var.q0;
        ijc ijcVar = qi8Var.n;
        ujd ujdVarA = vjdVar.a();
        int i = 0;
        while (true) {
            jxd[] jxdVarArr = lxdVar.a;
            if (i >= jxdVarArr.length) {
                break;
            }
            jxdVarArr[i].b(ujdVarA);
            i++;
        }
        qi8Var.q0 = new vjd(ujdVarA);
        vjd vjdVarZ0 = qi8Var.z0();
        if (!vjdVarZ0.equals(qi8Var.S)) {
            qi8Var.S = vjdVarZ0;
            ijcVar.d(14, new uk6(mi8Var, (byte) 27));
        }
        ijcVar.d(28, new uk6(lxdVar, (byte) 28));
        ijcVar.c();
    }

    @Override // defpackage.kuh
    public final int b(oj9 oj9Var) {
        if (this.s.z(oj9Var)) {
            return kuh.g(oj9Var.O == 0 ? 4 : 2, 0, 0, 0);
        }
        return kuh.g(0, 0, 0, 0);
    }

    @Override // defpackage.q83, defpackage.kuh
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            F((lxd) message.obj);
            return true;
        }
        h9o.e();
        return false;
    }

    @Override // defpackage.q83
    public final boolean l() {
        return this.y;
    }

    @Override // defpackage.q83
    public final boolean m() {
        return true;
    }

    @Override // defpackage.q83
    public final void n() {
        this.A = null;
        this.w = null;
        this.B = -9223372036854775807L;
    }

    @Override // defpackage.q83
    public final void q(long j, boolean z, boolean z2) {
        this.A = null;
        this.x = false;
        this.y = false;
    }

    @Override // defpackage.q83
    public final void v(oj9[] oj9VarArr, long j, long j2, jrd jrdVar) {
        this.w = this.s.p(oj9VarArr[0]);
        lxd lxdVar = this.A;
        if (lxdVar != null) {
            long j3 = lxdVar.b;
            long j4 = (this.B + j3) - j2;
            if (j3 != j4) {
                lxdVar = new lxd(j4, lxdVar.a);
            }
            this.A = lxdVar;
        }
        this.B = j2;
    }

    @Override // defpackage.q83
    public final void y(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.x && this.A == null) {
                uxd uxdVar = this.v;
                uxdVar.i();
                i16 i16Var = this.c;
                i16Var.k();
                int iX = x(i16Var, uxdVar, 0);
                if (iX == -4) {
                    if (uxdVar.d(4)) {
                        this.x = true;
                    } else if (uxdVar.g >= this.l) {
                        uxdVar.j = this.z;
                        uxdVar.l();
                        z7h z7hVar = this.w;
                        String str = tym.a;
                        lxd lxdVarF = z7hVar.f(uxdVar);
                        if (lxdVarF != null) {
                            ArrayList arrayList = new ArrayList(lxdVarF.a.length);
                            D(lxdVarF, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.A = new lxd(E(uxdVar.g), (jxd[]) arrayList.toArray(new jxd[0]));
                            }
                        }
                    }
                } else if (iX == -5) {
                    oj9 oj9Var = (oj9) i16Var.c;
                    oj9Var.getClass();
                    this.z = oj9Var.s;
                }
            }
            lxd lxdVar = this.A;
            if (lxdVar == null || lxdVar.b > E(j)) {
                z = false;
            } else {
                lxd lxdVar2 = this.A;
                Handler handler = this.u;
                if (handler != null) {
                    handler.obtainMessage(1, lxdVar2).sendToTarget();
                } else {
                    F(lxdVar2);
                }
                this.A = null;
                z = true;
            }
            if (this.x && this.A == null) {
                this.y = true;
            }
        }
    }
}
