package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zjl extends q83 implements Handler.Callback {
    public eq4 A;
    public eq4 B;
    public int C;
    public final Handler D;
    public final mi8 E;
    public final i16 F;
    public boolean G;
    public boolean H;
    public oj9 I;
    public long J;
    public long K;
    public final hr5 s;
    public final qj6 t;
    public z36 u;
    public final qie v;
    public boolean w;
    public byte x;
    public mnk y;
    public rnk z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjl(mi8 mi8Var, Looper looper) {
        Handler handler;
        super(3);
        qie qieVar = onk.zp;
        this.E = mi8Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = tym.a;
            handler = new Handler(looper, this);
        }
        this.D = handler;
        this.v = qieVar;
        this.s = new hr5();
        this.t = new qj6(1);
        this.F = new i16((byte) 18);
        this.K = -9223372036854775807L;
        this.J = -9223372036854775807L;
    }

    public final void D() {
        boolean z = Objects.equals(this.I.n, "application/cea-608") || Objects.equals(this.I.n, "application/x-mp4-cea-608") || Objects.equals(this.I.n, "application/cea-708");
        String str = this.I.n;
        if (z) {
            return;
        }
        qp2.n(n1h.j("Legacy decoding is disabled, can't handle %s samples (expected %s).", str, "application/x-media3-cues"));
    }

    public final void E() {
        a1b a1bVar = h1b.b;
        y36 y36Var = new y36(G(this.J), csh.e);
        Handler handler = this.D;
        if (handler != null) {
            handler.obtainMessage(1, y36Var).sendToTarget();
        } else {
            I(y36Var);
        }
    }

    public final long F() {
        if (this.C == -1) {
            return Long.MAX_VALUE;
        }
        this.A.getClass();
        if (this.C >= this.A.getEventTimeCount()) {
            return Long.MAX_VALUE;
        }
        return this.A.getEventTime(this.C);
    }

    public final long G(long j) {
        z4o.H(j != -9223372036854775807L);
        return j - this.k;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H() throws java.lang.NumberFormatException {
        /*
            r7 = this;
            r0 = 1
            r7.w = r0
            oj9 r1 = r7.I
            r1.getClass()
            qie r2 = r7.v
            java.lang.Object r2 = r2.b
            r16 r2 = (defpackage.r16) r2
            java.lang.String r3 = r1.n
            int r4 = r1.K
            if (r3 == 0) goto L4d
            int r5 = r3.hashCode()
            r6 = -1
            switch(r5) {
                case 930165504: goto L30;
                case 1566015601: goto L27;
                case 1566016562: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L38
        L1d:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L38
            r0 = 2
            goto L3b
        L27:
            java.lang.String r5 = "application/cea-608"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L3b
            goto L38
        L30:
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3a
        L38:
            r0 = r6
            goto L3b
        L3a:
            r0 = 0
        L3b:
            switch(r0) {
                case 0: goto L47;
                case 1: goto L47;
                case 2: goto L3f;
                default: goto L3e;
            }
        L3e:
            goto L4d
        L3f:
            cq4 r0 = new cq4
            java.util.List r1 = r1.q
            r0.<init>(r4, r1)
            goto L6a
        L47:
            yp4 r0 = new yp4
            r0.<init>(r3, r4)
            goto L6a
        L4d:
            boolean r0 = r2.b(r1)
            if (r0 == 0) goto L72
            vnk r0 = r2.k(r1)
            s17 r1 = new s17
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = "Decoder"
            r2.concat(r3)
            r1.<init>(r0)
            r0 = r1
        L6a:
            r7.y = r0
            long r1 = r7.l
            r0.a(r1)
            return
        L72:
            java.lang.String r7 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r7 = sko.j(r7, r3)
            qp2.o(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zjl.H():void");
    }

    public final void I(y36 y36Var) {
        csh cshVar = y36Var.a;
        mi8 mi8Var = this.E;
        mi8Var.a.n.i(27, new ki8(cshVar, (byte) 0));
        qi8 qi8Var = mi8Var.a;
        qi8Var.g0 = y36Var;
        qi8Var.n.i(27, new uk6(y36Var, (byte) 26));
    }

    public final void J() {
        this.z = null;
        this.C = -1;
        eq4 eq4Var = this.A;
        if (eq4Var != null) {
            eq4Var.j();
            this.A = null;
        }
        eq4 eq4Var2 = this.B;
        if (eq4Var2 != null) {
            eq4Var2.j();
            this.B = null;
        }
    }

    @Override // defpackage.kuh
    public final int b(oj9 oj9Var) {
        boolean zEquals = Objects.equals(oj9Var.n, "application/x-media3-cues");
        String str = oj9Var.n;
        if (!zEquals) {
            qie qieVar = this.v;
            qieVar.getClass();
            if (!((r16) qieVar.b).b(oj9Var) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return dzd.n(str) ? kuh.g(1, 0, 0, 0) : kuh.g(0, 0, 0, 0);
            }
        }
        return kuh.g(oj9Var.O == 0 ? 4 : 2, 0, 0, 0);
    }

    @Override // defpackage.q83, defpackage.kuh
    public final String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            I((y36) message.obj);
            return true;
        }
        h9o.e();
        return false;
    }

    @Override // defpackage.q83
    public final boolean l() {
        return this.H;
    }

    @Override // defpackage.q83
    public final boolean m() {
        oj9 oj9Var = this.I;
        if (oj9Var != null) {
            if (Objects.equals(oj9Var.n, "application/x-media3-cues")) {
                z36 z36Var = this.u;
                z36Var.getClass();
                if (z36Var.g(this.J) == Long.MIN_VALUE) {
                    try {
                        vhi vhiVar = this.i;
                        vhiVar.getClass();
                        vhiVar.maybeThrowError();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else {
                if (this.H) {
                    return false;
                }
                if (this.G) {
                    eq4 eq4Var = this.A;
                    long j = this.J;
                    if (eq4Var == null || eq4Var.getEventTimeCount() <= 0 || eq4Var.getEventTime(eq4Var.getEventTimeCount() - 1) <= j) {
                        eq4 eq4Var2 = this.B;
                        long j2 = this.J;
                        if ((eq4Var2 == null || eq4Var2.getEventTimeCount() <= 0 || eq4Var2.getEventTime(eq4Var2.getEventTimeCount() - 1) <= j2) && this.z != null) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // defpackage.q83
    public final void n() {
        this.I = null;
        this.K = -9223372036854775807L;
        E();
        this.J = -9223372036854775807L;
        if (this.y != null) {
            J();
            mnk mnkVar = this.y;
            mnkVar.getClass();
            mnkVar.release();
            this.y = null;
            this.x = (byte) 0;
        }
    }

    @Override // defpackage.q83
    public final void q(long j, boolean z, boolean z2) throws NumberFormatException {
        this.J = j;
        z36 z36Var = this.u;
        if (z36Var != null) {
            z36Var.clear();
        }
        E();
        this.G = false;
        this.H = false;
        this.K = -9223372036854775807L;
        oj9 oj9Var = this.I;
        if (oj9Var == null || Objects.equals(oj9Var.n, "application/x-media3-cues")) {
            return;
        }
        if (this.x == 0) {
            J();
            mnk mnkVar = this.y;
            mnkVar.getClass();
            mnkVar.flush();
            mnkVar.a(this.l);
            return;
        }
        J();
        mnk mnkVar2 = this.y;
        mnkVar2.getClass();
        mnkVar2.release();
        this.y = null;
        this.x = (byte) 0;
        H();
    }

    @Override // defpackage.q83
    public final void v(oj9[] oj9VarArr, long j, long j2, jrd jrdVar) throws NumberFormatException {
        oj9 oj9Var = oj9VarArr[0];
        this.I = oj9Var;
        if (Objects.equals(oj9Var.n, "application/x-media3-cues")) {
            this.u = this.I.L == 1 ? new yud() : new s64((byte) 3);
            return;
        }
        D();
        if (this.y != null) {
            this.x = (byte) 1;
        } else {
            H();
        }
    }

    @Override // defpackage.q83
    public final void y(long j, long j2) throws NumberFormatException {
        boolean z;
        boolean z2;
        long eventTime;
        if (this.n) {
            long j3 = this.K;
            if (j3 != -9223372036854775807L && j >= j3) {
                J();
                this.H = true;
            }
        }
        if (this.H) {
            return;
        }
        oj9 oj9Var = this.I;
        oj9Var.getClass();
        boolean zEquals = Objects.equals(oj9Var.n, "application/x-media3-cues");
        Handler handler = this.D;
        i16 i16Var = this.F;
        boolean zA = false;
        zA = false;
        zA = false;
        if (zEquals) {
            this.u.getClass();
            if (!this.G) {
                qj6 qj6Var = this.t;
                if (x(i16Var, qj6Var, 0) == -4) {
                    if (qj6Var.d(4)) {
                        this.G = true;
                    } else {
                        qj6Var.l();
                        ByteBuffer byteBuffer = qj6Var.e;
                        byteBuffer.getClass();
                        long j4 = qj6Var.g;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.s.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        z0b z0bVarP = h1b.p();
                        for (int i = 0; i < parcelableArrayList.size(); i++) {
                            Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                            bundle2.getClass();
                            z0bVarP.c(x36.b(bundle2));
                        }
                        a46 a46Var = new a46(z0bVarP.g(), j4, bundle.getLong("d"));
                        qj6Var.i();
                        zA = this.u.a(a46Var, j);
                    }
                }
            }
            long jG = this.u.g(this.J);
            if (jG == Long.MIN_VALUE && this.G && !zA) {
                this.H = true;
            }
            if (jG != Long.MIN_VALUE && jG <= j) {
                zA = true;
            }
            if (zA) {
                h1b h1bVarB = this.u.b(j);
                long jC = this.u.c(j);
                y36 y36Var = new y36(G(jC), h1bVarB);
                if (handler != null) {
                    handler.obtainMessage(1, y36Var).sendToTarget();
                } else {
                    I(y36Var);
                }
                this.u.h(jC);
            }
            this.J = j;
            return;
        }
        D();
        this.J = j;
        if (this.B == null) {
            mnk mnkVar = this.y;
            mnkVar.getClass();
            mnkVar.setPositionUs(j);
            try {
                mnk mnkVar2 = this.y;
                mnkVar2.getClass();
                this.B = (eq4) mnkVar2.dequeueOutputBuffer();
            } catch (nnk e) {
                w7d.r("Subtitle decoding failed. streamFormat=" + this.I, e);
                E();
                J();
                mnk mnkVar3 = this.y;
                mnkVar3.getClass();
                mnkVar3.release();
                this.y = null;
                this.x = (byte) 0;
                H();
                return;
            }
        }
        if (this.h == 2) {
            if (this.A != null) {
                long jF = F();
                z = false;
                while (jF <= j) {
                    this.C++;
                    jF = F();
                    z = true;
                }
            } else {
                z = false;
            }
            eq4 eq4Var = this.B;
            boolean z3 = z;
            if (eq4Var != null) {
                z3 = z;
                if (!eq4Var.d(4)) {
                    z3 = z;
                    if (eq4Var.c <= j) {
                        eq4 eq4Var2 = this.A;
                        if (eq4Var2 != null) {
                            eq4Var2.j();
                        }
                        this.C = eq4Var.getNextEventTimeIndex(j);
                        this.A = eq4Var;
                        this.B = null;
                        z3 = true;
                    }
                } else if (!z) {
                    z3 = z;
                    if (F() == Long.MAX_VALUE) {
                        if (this.x == 2) {
                            J();
                            mnk mnkVar4 = this.y;
                            mnkVar4.getClass();
                            mnkVar4.release();
                            this.y = null;
                            this.x = (byte) 0;
                            H();
                            z3 = z;
                        } else {
                            J();
                            this.H = true;
                            z3 = z;
                        }
                    }
                }
            }
            if (z3) {
                this.A.getClass();
                int nextEventTimeIndex = this.A.getNextEventTimeIndex(j);
                if (nextEventTimeIndex == 0 || this.A.getEventTimeCount() == 0) {
                    eventTime = this.A.c;
                } else {
                    eq4 eq4Var3 = this.A;
                    eventTime = nextEventTimeIndex == -1 ? eq4Var3.getEventTime(eq4Var3.getEventTimeCount() - 1) : eq4Var3.getEventTime(nextEventTimeIndex - 1);
                }
                y36 y36Var2 = new y36(G(eventTime), this.A.getCues(j));
                if (handler != null) {
                    handler.obtainMessage(1, y36Var2).sendToTarget();
                } else {
                    I(y36Var2);
                }
            }
            if (this.x != 2) {
                while (!this.G) {
                    try {
                        rnk rnkVar = this.z;
                        if (rnkVar == null) {
                            mnk mnkVar5 = this.y;
                            mnkVar5.getClass();
                            rnkVar = (rnk) mnkVar5.dequeueInputBuffer();
                            if (rnkVar == null) {
                                return;
                            } else {
                                this.z = rnkVar;
                            }
                        }
                        if (this.x == 1) {
                            rnkVar.b = 4;
                            mnk mnkVar6 = this.y;
                            mnkVar6.getClass();
                            mnkVar6.queueInputBuffer(rnkVar);
                            this.z = null;
                            this.x = (byte) 2;
                            return;
                        }
                        int iX = x(i16Var, rnkVar, 0);
                        if (iX == -4) {
                            if (rnkVar.d(4)) {
                                this.G = true;
                                this.w = false;
                                z2 = false;
                            } else {
                                oj9 oj9Var2 = (oj9) i16Var.c;
                                if (oj9Var2 == null) {
                                    return;
                                }
                                rnkVar.j = oj9Var2.s;
                                rnkVar.l();
                                z2 = this.w & (!rnkVar.d(1));
                                this.w = z2;
                            }
                            if (!z2) {
                                mnk mnkVar7 = this.y;
                                mnkVar7.getClass();
                                mnkVar7.queueInputBuffer(rnkVar);
                                this.z = null;
                            }
                        } else if (iX == -3) {
                            return;
                        }
                    } catch (nnk e2) {
                        w7d.r("Subtitle decoding failed. streamFormat=" + this.I, e2);
                        E();
                        J();
                        mnk mnkVar8 = this.y;
                        mnkVar8.getClass();
                        mnkVar8.release();
                        this.y = null;
                        this.x = (byte) 0;
                        H();
                        return;
                    }
                }
            }
        }
    }
}
