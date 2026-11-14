package defpackage;

import android.graphics.Paint;
import android.os.Build;
import android.view.ViewParent;
import androidx.core.app.NotificationCompat;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class wye extends o1d implements pfd, b2c {
    public static final zbe U = new zbe((byte) 11);
    public static final zbe V = new zbe((byte) 12);
    public static final m1i W = new m1i();
    public static final x1c X = new x1c();
    public static final float[] Y = afd.a();
    public static final uye Z = new uye();
    public static final hv5 a0 = new hv5();
    public n27 A;
    public d2c B;
    public ufd D;
    public zde E;
    public float G;
    public ree H;
    public x1c I;
    public voh K;
    public voh L;
    public boolean M;
    public boolean N;
    public q3a O;
    public sh4 P;
    public hda Q;
    public final tye R;
    public boolean S;
    public evf T;
    public final m3c u;
    public wye v;
    public wye w;
    public boolean x;
    public boolean y;
    public Function1 z;
    public float C = 0.8f;
    public long F = 0;
    public paj J = kfo.i;

    public wye(m3c m3cVar) {
        this.u = m3cVar;
        this.A = m3cVar.y;
        this.B = m3cVar.z;
        voh vohVar = voh.e;
        this.K = vohVar;
        this.L = vohVar;
        this.R = new tye(this, (byte) 1);
    }

    public static wye v1(b2c b2cVar) {
        wye wyeVar;
        r1d r1dVar = b2cVar instanceof r1d ? (r1d) b2cVar : null;
        return (r1dVar == null || (wyeVar = r1dVar.a.u) == null) ? (wye) b2cVar : wyeVar;
    }

    @Override // defpackage.o1d
    public final b2c A0() {
        return this;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pxb */
    public final void A1(boolean z) throws pxb {
        m3c m3cVar;
        float f;
        lqh lqhVar;
        long j;
        char c;
        int i;
        boolean z2;
        m3c m3cVar2;
        tye tyeVar;
        byte b;
        tye tyeVar2;
        evf evfVar = this.T;
        Function1 function1 = this.z;
        if (evfVar == null) {
            if (function1 == null) {
                return;
            }
            a8b.b("null layer with a non-null layerBlock");
            return;
        }
        if (function1 == null) {
            throw vep.q("updateLayerParameters requires a non-null layerBlock");
        }
        m1i m1iVar = W;
        m1iVar.a();
        m3c m3cVar3 = this.u;
        m1iVar.t = m3cVar3.y;
        m1iVar.u = m3cVar3.z;
        m1iVar.r = fr3.g0(this.c);
        lqh lqhVar2 = new lqh();
        ((tuj) p3c.a(m3cVar3).K.a).e(this, U, new hv(function1, this, lqhVar2, (byte) 29));
        x1c x1cVar = this.I;
        if (x1cVar == null) {
            x1cVar = new x1c();
            this.I = x1cVar;
        }
        x1c x1cVar2 = X;
        x1cVar2.getClass();
        x1cVar2.a = x1cVar.a;
        x1cVar2.b = x1cVar.b;
        x1cVar2.c = x1cVar.c;
        x1cVar2.d = x1cVar.d;
        x1cVar2.e = x1cVar.e;
        x1cVar2.f = x1cVar.f;
        x1cVar2.g = x1cVar.g;
        x1cVar2.h = x1cVar.h;
        x1cVar2.i = x1cVar.i;
        x1cVar.a = m1iVar.b;
        x1cVar.b = m1iVar.c;
        x1cVar.c = m1iVar.e;
        x1cVar.d = m1iVar.f;
        x1cVar.e = m1iVar.j;
        x1cVar.f = m1iVar.k;
        x1cVar.g = m1iVar.l;
        x1cVar.h = m1iVar.m;
        x1cVar.i = m1iVar.n;
        s3a s3aVar = (s3a) evfVar;
        v31 v31Var = s3aVar.c;
        int i2 = m1iVar.a | s3aVar.n;
        s3aVar.l = m1iVar.u;
        n27 n27Var = m1iVar.t;
        s3aVar.k = n27Var;
        if ((1048576 & i2) != 0) {
            q3a q3aVar = s3aVar.a;
            m1iVar.s.getClass();
            int iM = n27Var.M(0.0f);
            m1iVar.s.getClass();
            int iM2 = n27Var.M(0.0f);
            m1iVar.s.getClass();
            int iM3 = n27Var.M(0.0f);
            m1iVar.s.getClass();
            int iM4 = n27Var.M(0.0f);
            q3aVar.v = iM;
            q3aVar.w = iM2;
            q3aVar.x = iM3;
            q3aVar.y = iM4;
            u3a u3aVar = q3aVar.a;
            if (iM < 0 || iM2 < 0 || iM3 < 0 || iM4 < 0) {
                f = 0.0f;
                m3cVar = m3cVar3;
                StringBuilder sbO = sko.o(iM, iM2, "Outsets cannot be negative! Left: ", ", Top: ", ", Right: ");
                sbO.append(iM3);
                sbO.append(", Bottom: ");
                sbO.append(iM4);
                z7b.a(sbO.toString());
            } else {
                m3cVar = m3cVar3;
                f = 0.0f;
            }
            int i3 = u3aVar.x;
            if (iM != i3 || iM2 != u3aVar.y || iM3 != u3aVar.z || iM4 != u3aVar.A) {
                boolean z3 = (iM == i3 && iM2 == u3aVar.y) ? false : true;
                u3aVar.x = iM;
                u3aVar.y = iM2;
                u3aVar.z = iM3;
                u3aVar.A = iM4;
                u3aVar.e();
                if (z3) {
                    u3aVar.d();
                }
            }
            s3aVar.c();
        } else {
            m3cVar = m3cVar3;
            f = 0.0f;
        }
        int i4 = i2 & 4096;
        if (i4 != 0) {
            s3aVar.o = m1iVar.n;
        }
        if ((i2 & 1) != 0) {
            q3a q3aVar2 = s3aVar.a;
            float f2 = m1iVar.b;
            u3a u3aVar2 = q3aVar2.a;
            if (u3aVar2.l != f2) {
                u3aVar2.l = f2;
                u3aVar2.c.setScaleX(f2);
            }
        }
        if ((i2 & 2) != 0) {
            q3a q3aVar3 = s3aVar.a;
            float f3 = m1iVar.c;
            u3a u3aVar3 = q3aVar3.a;
            if (u3aVar3.m != f3) {
                u3aVar3.m = f3;
                u3aVar3.c.setScaleY(f3);
            }
        }
        if ((i2 & 4) != 0) {
            q3a q3aVar4 = s3aVar.a;
            float f4 = m1iVar.d;
            u3a u3aVar4 = q3aVar4.a;
            if (u3aVar4.h != f4) {
                u3aVar4.h = f4;
                u3aVar4.c.setAlpha(f4);
            }
        }
        if ((i2 & 8) != 0) {
            q3a q3aVar5 = s3aVar.a;
            float f5 = m1iVar.e;
            u3a u3aVar5 = q3aVar5.a;
            if (u3aVar5.n != f5) {
                u3aVar5.n = f5;
                u3aVar5.c.setTranslationX(f5);
            }
        }
        if ((i2 & 16) != 0) {
            q3a q3aVar6 = s3aVar.a;
            float f6 = m1iVar.f;
            u3a u3aVar6 = q3aVar6.a;
            if (u3aVar6.o != f6) {
                u3aVar6.o = f6;
                u3aVar6.c.setTranslationY(f6);
            }
        }
        if ((i2 & 32) != 0) {
            q3a q3aVar7 = s3aVar.a;
            float f7 = m1iVar.g;
            u3a u3aVar7 = q3aVar7.a;
            if (u3aVar7.p != f7) {
                u3aVar7.p = f7;
                u3aVar7.c.setElevation(f7);
                q3aVar7.g = true;
                q3aVar7.a();
            }
            if (m1iVar.g > f && !s3aVar.t && (tyeVar2 = s3aVar.e) != null) {
                tyeVar2.invoke();
            }
        }
        if ((i2 & 64) != 0) {
            q3a q3aVar8 = s3aVar.a;
            long j2 = m1iVar.h;
            u3a u3aVar8 = q3aVar8.a;
            long j3 = u3aVar8.q;
            int i5 = u95.h;
            if (!jgm.a(j2, j3)) {
                u3aVar8.q = j2;
                u3aVar8.c.setAmbientShadowColor(cs5.u0(j2));
            }
        }
        if ((i2 & NotificationCompat.FLAG_HIGH_PRIORITY) != 0) {
            q3a q3aVar9 = s3aVar.a;
            long j4 = m1iVar.i;
            u3a u3aVar9 = q3aVar9.a;
            long j5 = u3aVar9.r;
            int i6 = u95.h;
            if (!jgm.a(j4, j5)) {
                u3aVar9.r = j4;
                u3aVar9.c.setSpotShadowColor(cs5.u0(j4));
            }
        }
        if ((i2 & 1024) != 0) {
            q3a q3aVar10 = s3aVar.a;
            float f8 = m1iVar.l;
            u3a u3aVar10 = q3aVar10.a;
            if (u3aVar10.u != f8) {
                u3aVar10.u = f8;
                u3aVar10.c.setRotationZ(f8);
            }
        }
        if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            q3a q3aVar11 = s3aVar.a;
            float f9 = m1iVar.j;
            u3a u3aVar11 = q3aVar11.a;
            if (u3aVar11.s != f9) {
                u3aVar11.s = f9;
                u3aVar11.c.setRotationX(f9);
            }
        }
        if ((i2 & NotificationCompat.FLAG_GROUP_SUMMARY) != 0) {
            q3a q3aVar12 = s3aVar.a;
            float f10 = m1iVar.k;
            u3a u3aVar12 = q3aVar12.a;
            if (u3aVar12.t != f10) {
                u3aVar12.t = f10;
                u3aVar12.c.setRotationY(f10);
            }
        }
        if ((i2 & 2048) != 0) {
            q3a q3aVar13 = s3aVar.a;
            float f11 = m1iVar.m;
            u3a u3aVar13 = q3aVar13.a;
            if (u3aVar13.v != f11) {
                u3aVar13.v = f11;
                u3aVar13.c.setCameraDistance(f11);
            }
        }
        if (i4 != 0) {
            j = 4294967295L;
            boolean zA = a2m.a(s3aVar.o, a2m.b);
            q3a q3aVar14 = s3aVar.a;
            if (zA) {
                q3aVar14.g(9205357640488583168L);
                c = ' ';
                lqhVar = lqhVar2;
            } else {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (s3aVar.o >> 32)) * ((int) (s3aVar.f >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (s3aVar.o & 4294967295L)) * ((int) (s3aVar.f & 4294967295L));
                long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                int iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat2);
                c = ' ';
                lqhVar = lqhVar2;
                q3aVar14.g((jFloatToRawIntBits << 32) | (iFloatToRawIntBits & 4294967295L));
            }
        } else {
            lqhVar = lqhVar2;
            j = 4294967295L;
            c = ' ';
        }
        if ((i2 & 16384) != 0) {
            q3a q3aVar15 = s3aVar.a;
            boolean z4 = m1iVar.p;
            if (q3aVar15.A != z4) {
                q3aVar15.A = z4;
                q3aVar15.g = true;
                q3aVar15.a();
            }
        }
        if ((131072 & i2) != 0) {
            u3a u3aVar14 = s3aVar.a.a;
        }
        if ((262144 & i2) != 0) {
            q3a q3aVar16 = s3aVar.a;
            kh3 kh3Var = m1iVar.v;
            u3a u3aVar15 = q3aVar16.a;
            if (!Intrinsics.a(u3aVar15.j, kh3Var)) {
                u3aVar15.j = kh3Var;
                Paint paint = u3aVar15.e;
                if (paint == null) {
                    paint = new Paint();
                    u3aVar15.e = paint;
                }
                paint.setColorFilter(kh3Var != null ? kh3Var.a : null);
                u3aVar15.c();
            }
        }
        if ((524288 & i2) != 0) {
            q3a q3aVar17 = s3aVar.a;
            int i7 = m1iVar.w;
            u3a u3aVar16 = q3aVar17.a;
            if (u3aVar16.i != i7) {
                u3aVar16.i = i7;
                Paint paint2 = u3aVar16.e;
                if (paint2 == null) {
                    paint2 = new Paint();
                    u3aVar16.e = paint2;
                }
                paint2.setBlendMode(alo.e0(i7));
                u3aVar16.c();
            }
        }
        if ((32768 & i2) != 0) {
            q3a q3aVar18 = s3aVar.a;
            int i8 = m1iVar.q;
            if (i8 == 0) {
                b = 0;
            } else if (i8 == 1) {
                b = 1;
            } else {
                b = 2;
                if (i8 != 2) {
                    qp2.n("Not supported composition strategy");
                    return;
                }
            }
            u3a u3aVar17 = q3aVar18.a;
            if (u3aVar17.F != b) {
                u3aVar17.F = b;
                u3aVar17.c();
            }
        }
        if ((i2 & 7963) != 0) {
            s3aVar.q = true;
            s3aVar.r = true;
        }
        if (Intrinsics.a(s3aVar.p, m1iVar.x)) {
            i = i2;
            z2 = false;
        } else {
            w7d w7dVar = m1iVar.x;
            s3aVar.p = w7dVar;
            if (w7dVar == null) {
                i = i2;
            } else {
                q3a q3aVar19 = s3aVar.a;
                if (w7dVar instanceof mtf) {
                    voh vohVar = ((mtf) w7dVar).k;
                    float f12 = vohVar.a;
                    float f13 = vohVar.b;
                    i = i2;
                    q3aVar19.i((Float.floatToRawIntBits(f12) << c) | (Float.floatToRawIntBits(f13) & j), (Float.floatToRawIntBits(vohVar.c - f12) << c) | (Float.floatToRawIntBits(vohVar.d - f13) & j), 0.0f);
                } else {
                    i = i2;
                    if (w7dVar instanceof ltf) {
                        d91 d91Var = ((ltf) w7dVar).k;
                        q3aVar19.k = null;
                        q3aVar19.i = 9205357640488583168L;
                        q3aVar19.h = 0L;
                        q3aVar19.j = f;
                        q3aVar19.g = true;
                        q3aVar19.n = false;
                        q3aVar19.l = d91Var;
                        q3aVar19.a();
                    } else {
                        if (!(w7dVar instanceof ntf)) {
                            h9o.p();
                            return;
                        }
                        ntf ntfVar = (ntf) w7dVar;
                        d91 d91Var2 = ntfVar.l;
                        if (d91Var2 != null) {
                            q3aVar19.k = null;
                            q3aVar19.i = 9205357640488583168L;
                            q3aVar19.h = 0L;
                            q3aVar19.j = 0.0f;
                            q3aVar19.g = true;
                            q3aVar19.n = false;
                            q3aVar19.l = d91Var2;
                            q3aVar19.a();
                        } else {
                            h8i h8iVar = ntfVar.k;
                            float f14 = h8iVar.b;
                            float f15 = h8iVar.a;
                            q3aVar19.i((Float.floatToRawIntBits(f15) << c) | (Float.floatToRawIntBits(f14) & j), (Float.floatToRawIntBits(h8iVar.c - f15) << c) | (Float.floatToRawIntBits(h8iVar.d - f14) & j), Float.intBitsToFloat((int) (h8iVar.h >> c)));
                        }
                    }
                }
                if (Build.VERSION.SDK_INT < 33 && (((w7dVar instanceof ltf) || ((w7dVar instanceof ntf) && !ioh.s(((ntf) w7dVar).k))) && (tyeVar = s3aVar.e) != null)) {
                    tyeVar.invoke();
                }
            }
            z2 = true;
        }
        s3aVar.n = m1iVar.a;
        if (i != 0 || z2) {
            ViewParent parent = v31Var.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(v31Var, v31Var);
            }
            if (v31.s()) {
                v31Var.U(0.0f);
            }
        }
        boolean z5 = this.y;
        this.y = m1iVar.p;
        this.C = m1iVar.d;
        boolean z6 = x1cVar2.a == x1cVar.a && x1cVar2.b == x1cVar.b && x1cVar2.c == x1cVar.c && x1cVar2.d == x1cVar.d && x1cVar2.e == x1cVar.e && x1cVar2.f == x1cVar.f && x1cVar2.g == x1cVar.g && x1cVar2.h == x1cVar.h && a2m.a(x1cVar2.i, x1cVar.i);
        if (!z || (z6 && z5 == this.y && !lqhVar.a)) {
            m3cVar2 = m3cVar;
        } else {
            m3cVar2 = m3cVar;
            v31 v31Var2 = m3cVar2.n;
            if (v31Var2 != null) {
                v31Var2.C(m3cVar2);
            }
        }
        if (z6) {
            return;
        }
        m3cVar2.N(this);
        if (m3cVar2.P > 0) {
            v31 v31VarA = p3c.a(m3cVar2);
            s6h s6hVar = (s6h) v31VarA.P.e;
            if (m3cVar2.P > 0) {
                ((dfe) s6hVar.a).c(m3cVar2);
                m3cVar2.O = true;
            }
            v31VarA.M(null);
        }
    }

    @Override // defpackage.b2c
    public final long B(long j) {
        long jU = U(j);
        v31 v31VarA = p3c.a(this.u);
        v31VarA.I();
        return afd.b(v31VarA.U, jU);
    }

    @Override // defpackage.o1d
    public final boolean B0() {
        return this.D != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B1(long r24) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wye.B1(long):boolean");
    }

    @Override // defpackage.b2c
    public final void D(float[] fArr) {
        v31 v31VarA = p3c.a(this.u);
        y1(v1(rm5.v(this)), fArr);
        v31VarA.w(fArr);
    }

    @Override // defpackage.o1d
    public final m3c D0() {
        return this.u;
    }

    @Override // defpackage.o1d
    public final ufd G0() {
        ufd ufdVar = this.D;
        if (ufdVar != null) {
            return ufdVar;
        }
        qp2.n("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // defpackage.o1d
    public final o1d H0() {
        return this.w;
    }

    @Override // defpackage.o1d
    public final long I0() {
        return this.F;
    }

    @Override // defpackage.b2c
    public final long K(long j) {
        if (!Z0().n) {
            a8b.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return p3c.a(this.u).x(U(j));
    }

    @Override // defpackage.o1d
    public final void M0() {
        d0(this.F, this.G, this.z);
    }

    public final void O0(wye wyeVar, ree reeVar, boolean z) {
        if (wyeVar != this) {
            wye wyeVar2 = this.w;
            if (wyeVar2 != null) {
                wyeVar2.O0(wyeVar, reeVar, z);
            }
            long j = this.F;
            float f = (int) (j >> 32);
            reeVar.b -= f;
            reeVar.d -= f;
            float f2 = (int) (j & 4294967295L);
            reeVar.c -= f2;
            reeVar.e -= f2;
            evf evfVar = this.T;
            if (evfVar != null) {
                s3a s3aVar = (s3a) evfVar;
                float[] fArrA = s3aVar.a();
                if (!s3aVar.s) {
                    if (fArrA == null) {
                        reeVar.b = 0.0f;
                        reeVar.c = 0.0f;
                        reeVar.d = 0.0f;
                        reeVar.e = 0.0f;
                    } else {
                        afd.c(fArrA, reeVar);
                    }
                }
                if (this.y && z) {
                    long j2 = this.c;
                    reeVar.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                }
            }
        }
    }

    public final long P0(wye wyeVar, long j) {
        if (wyeVar == this) {
            return j;
        }
        wye wyeVar2 = this.w;
        return (wyeVar2 == null || Intrinsics.a(wyeVar, wyeVar2)) ? W0(j) : W0(wyeVar2.P0(wyeVar, j));
    }

    public final long Q0(long j) {
        float fY;
        float fX;
        if (a1()) {
            voh vohVar = this.K;
            fY = vohVar.c - vohVar.a;
        } else {
            fY = Y();
        }
        if (a1()) {
            voh vohVar2 = this.K;
            fX = vohVar2.d - vohVar2.b;
        } else {
            fX = X();
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - fY;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - fX;
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        float fMax2 = Math.max(0.0f, fIntBitsToFloat2 / 2.0f);
        return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L);
    }

    @Override // defpackage.b2c
    public final b2c R() {
        boolean z = Z0().n;
        m3c m3cVar = this.u;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (m3c m3cVarU = m3cVar; m3cVarU != null; m3cVarU = m3cVarU.u()) {
                sb.append("\n|");
                sb.append(m3cVarU);
                sb.append(" isAttached=");
                sb.append(m3cVarU.H());
                sb.append(" modifier=");
                sb.append(m3cVarU.K);
                sb.append(" tail=");
                sb.append(Z0());
            }
            a8b.b(sb.toString());
        }
        j1();
        return ((wye) m3cVar.F.e).w;
    }

    public final float R0(long j, long j2) {
        if (Y() >= Float.intBitsToFloat((int) (j2 >> 32)) && X() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jQ0 = Q0(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jQ0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jQ0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - Y());
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) < 0.0f ? -r9 : r9 - X())) & 4294967295L);
        if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
            int i = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= fIntBitsToFloat) {
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i2) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat4 = Float.intBitsToFloat(i);
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i2);
                    return (fIntBitsToFloat5 * fIntBitsToFloat5) + (fIntBitsToFloat4 * fIntBitsToFloat4);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void S0(sh4 sh4Var, q3a q3aVar) {
        evf evfVar = this.T;
        if (evfVar == null) {
            long j = this.F;
            float f = (int) (j >> 32);
            float f2 = (int) (j & 4294967295L);
            sh4Var.e(f, f2);
            T0(sh4Var, q3aVar);
            sh4Var.e(-f, -f2);
            return;
        }
        s3a s3aVar = (s3a) evfVar;
        uh4 uh4Var = s3aVar.m;
        s3aVar.g();
        s3aVar.t = s3aVar.a.a.p > 0.0f;
        d5o d5oVar = uh4Var.b;
        d5oVar.H(sh4Var);
        d5oVar.b = q3aVar;
        cs5.x(uh4Var, s3aVar.a);
    }

    public final void T0(sh4 sh4Var, q3a q3aVar) {
        wye wyeVar;
        sh4 sh4Var2;
        q3a q3aVar2;
        b8e b8eVarB1 = b1(4);
        if (b8eVarB1 == null) {
            p1(sh4Var, q3aVar);
            return;
        }
        m3c m3cVar = this.u;
        m3cVar.getClass();
        o3c o3cVar = p3c.a(m3cVar).o().s;
        long jG0 = fr3.g0(this.c);
        dfe dfeVar = null;
        while (b8eVarB1 != null) {
            if (b8eVarB1 instanceof lk7) {
                wyeVar = this;
                sh4Var2 = sh4Var;
                q3aVar2 = q3aVar;
                o3cVar.c(sh4Var2, jG0, wyeVar, (lk7) b8eVarB1, q3aVar2);
            } else {
                wyeVar = this;
                sh4Var2 = sh4Var;
                q3aVar2 = q3aVar;
                if ((b8eVarB1.c & 4) != 0 && (b8eVarB1 instanceof i17)) {
                    int i = 0;
                    for (b8e b8eVar = ((i17) b8eVarB1).p; b8eVar != null; b8eVar = b8eVar.f) {
                        if ((b8eVar.c & 4) != 0) {
                            i++;
                            if (i == 1) {
                                b8eVarB1 = b8eVar;
                            } else {
                                if (dfeVar == null) {
                                    dfeVar = new dfe(new b8e[16]);
                                }
                                if (b8eVarB1 != null) {
                                    dfeVar.c(b8eVarB1);
                                    b8eVarB1 = null;
                                }
                                dfeVar.c(b8eVar);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                sh4Var = sh4Var2;
                this = wyeVar;
                q3aVar = q3aVar2;
            }
            b8eVarB1 = ui6.U(dfeVar);
            sh4Var = sh4Var2;
            this = wyeVar;
            q3aVar = q3aVar2;
        }
    }

    @Override // defpackage.b2c
    public final long U(long j) {
        if (!Z0().n) {
            a8b.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        j1();
        while (this != null) {
            m3c m3cVar = this.u;
            if (this == ((wye) m3cVar.F.e) && !m3cVar.c) {
                long jB = p3c.a(m3cVar).t.b(m3cVar);
                if (!ybb.a(jB, 9223372034707292159L)) {
                    return scd.c0(j, jB);
                }
            }
            evf evfVar = this.T;
            if (evfVar != null) {
                s3a s3aVar = (s3a) evfVar;
                float[] fArrB = s3aVar.b();
                if (!s3aVar.s) {
                    j = afd.b(fArrB, j);
                }
            }
            j = scd.c0(j, this.F);
            this = this.w;
        }
        return j;
    }

    public abstract void U0();

    public final wye V0(wye wyeVar) {
        m3c m3cVarU = wyeVar.u;
        m3c m3cVar = this.u;
        if (m3cVarU == m3cVar) {
            b8e b8eVarZ0 = wyeVar.Z0();
            b8e b8eVarZ02 = Z0();
            if (!b8eVarZ02.a.n) {
                a8b.b("visitLocalAncestors called on an unattached node");
            }
            b8e b8eVar = b8eVarZ02.a;
            while (true) {
                b8eVar = b8eVar.e;
                if (b8eVar == null) {
                    break;
                }
                if ((b8eVar.c & 2) != 0 && b8eVar == b8eVarZ0) {
                    break;
                }
            }
            return wyeVar;
        }
        while (m3cVarU.p > m3cVar.p) {
            m3cVarU = m3cVarU.u();
        }
        m3c m3cVarU2 = m3cVar;
        while (m3cVarU2.p > m3cVarU.p) {
            m3cVarU2 = m3cVarU2.u();
        }
        while (m3cVarU != m3cVarU2) {
            m3cVarU = m3cVarU.u();
            m3cVarU2 = m3cVarU2.u();
            if (m3cVarU == null || m3cVarU2 == null) {
                qp2.o("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (m3cVarU2 != m3cVar) {
            if (m3cVarU != wyeVar.u) {
                return (j8b) m3cVarU.F.b;
            }
            return wyeVar;
        }
        return this;
    }

    public final long W0(long j) {
        long j2 = this.F;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L));
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
        evf evfVar = this.T;
        if (evfVar != null) {
            s3a s3aVar = (s3a) evfVar;
            float[] fArrA = s3aVar.a();
            if (fArrA == null) {
                return 9187343241974906880L;
            }
            if (!s3aVar.s) {
                return afd.b(fArrA, jFloatToRawIntBits);
            }
        }
        return jFloatToRawIntBits;
    }

    public abstract q1d X0();

    public final long Y0() {
        return this.A.y0(this.u.A.d());
    }

    @Override // defpackage.o1d
    public final boolean Z() {
        return (this.T == null || this.x || !this.u.H()) ? false : true;
    }

    public abstract b8e Z0();

    public final boolean a1() {
        return this.M && !this.K.f();
    }

    @Override // defpackage.n27
    public final float b() {
        return this.u.y.b();
    }

    public final b8e b1(int i) {
        boolean zG = xye.g(i);
        b8e b8eVarZ0 = Z0();
        if (!zG && (b8eVarZ0 = b8eVarZ0.e) == null) {
            return null;
        }
        for (b8e b8eVarC1 = c1(zG); b8eVarC1 != null && (b8eVarC1.d & i) != 0; b8eVarC1 = b8eVarC1.f) {
            if ((b8eVarC1.c & i) != 0) {
                return b8eVarC1;
            }
            if (b8eVarC1 == b8eVarZ0) {
                return null;
            }
        }
        return null;
    }

    public final b8e c1(boolean z) {
        b8e b8eVarZ0;
        tah tahVar = this.u.F;
        if (((wye) tahVar.e) == this) {
            return (b8e) tahVar.g;
        }
        wye wyeVar = this.w;
        if (!z) {
            if (wyeVar != null) {
                return wyeVar.Z0();
            }
            return null;
        }
        if (wyeVar == null || (b8eVarZ0 = wyeVar.Z0()) == null) {
            return null;
        }
        return b8eVarZ0.f;
    }

    public final void d1(b8e b8eVar, vye vyeVar, long j, oea oeaVar, int i, boolean z) {
        if (b8eVar == null) {
            g1(vyeVar, j, oeaVar, i, z);
            return;
        }
        if (!vyeVar.o(b8eVar)) {
            d1(f03.L(b8eVar, vyeVar.c()), vyeVar, j, oeaVar, i, z);
            return;
        }
        int i2 = oeaVar.c;
        dee deeVar = oeaVar.a;
        oeaVar.c(i2 + 1, deeVar.b);
        oeaVar.c++;
        deeVar.a(b8eVar);
        oeaVar.b.a(wyh.b(-1.0f, z, false));
        d1(f03.L(b8eVar, vyeVar.c()), vyeVar, j, oeaVar, i, z);
        oeaVar.c = i2;
    }

    public final void e1(b8e b8eVar, vye vyeVar, long j, oea oeaVar, int i, boolean z, float f) {
        if (b8eVar == null) {
            g1(vyeVar, j, oeaVar, i, z);
            return;
        }
        if (!vyeVar.o(b8eVar)) {
            e1(f03.L(b8eVar, vyeVar.c()), vyeVar, j, oeaVar, i, z, f);
            return;
        }
        int i2 = oeaVar.c;
        dee deeVar = oeaVar.a;
        oeaVar.c(i2 + 1, deeVar.b);
        oeaVar.c++;
        deeVar.a(b8eVar);
        oeaVar.b.a(wyh.b(f, z, false));
        o1(f03.L(b8eVar, vyeVar.c()), vyeVar, j, oeaVar, i, z, f, true);
        oeaVar.c = i2;
    }

    @Override // defpackage.b2c
    public final boolean f() {
        return Z0().n;
    }

    public final void f1(vye vyeVar, long j, oea oeaVar, int i, boolean z) {
        boolean z2;
        dee deeVar = oeaVar.a;
        b8e b8eVarB1 = b1(vyeVar.c());
        boolean z3 = false;
        if (!B1(j)) {
            if (i == 1) {
                float fR0 = R0(j, Y0());
                if ((Float.floatToRawIntBits(fR0) & Integer.MAX_VALUE) < 2139095040) {
                    if (oeaVar.c != deeVar.b - 1) {
                        if (qyn.p(oeaVar.b(), wyh.b(fR0, false, false)) <= 0) {
                            return;
                        }
                    }
                    e1(b8eVarB1, vyeVar, j, oeaVar, i, false, fR0);
                    return;
                }
                return;
            }
            return;
        }
        if (b8eVarB1 == null) {
            g1(vyeVar, j, oeaVar, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < Y() && fIntBitsToFloat2 < X()) {
            d1(b8eVarB1, vyeVar, j, oeaVar, i, z);
            return;
        }
        float fR02 = i == 1 ? R0(j, Y0()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fR02) & Integer.MAX_VALUE) < 2139095040) {
            if (oeaVar.c == deeVar.b - 1) {
                z2 = z;
            } else {
                z2 = z;
                if (qyn.p(oeaVar.b(), wyh.b(fR02, z2, false)) > 0) {
                }
            }
            z3 = true;
        } else {
            z2 = z;
        }
        o1(b8eVarB1, vyeVar, j, oeaVar, i, z2, fR02, z3);
    }

    @Override // defpackage.b2c
    public final void g(b2c b2cVar, float[] fArr) {
        wye wyeVarV1 = v1(b2cVar);
        wyeVarV1.j1();
        wye wyeVarV0 = V0(wyeVarV1);
        afd.d(fArr);
        wyeVarV1.y1(wyeVarV0, fArr);
        x1(wyeVarV0, fArr);
    }

    public void g1(vye vyeVar, long j, oea oeaVar, int i, boolean z) {
        wye wyeVar = this.v;
        if (wyeVar != null) {
            wyeVar.f1(vyeVar, wyeVar.W0(j), oeaVar, i, z);
        }
    }

    @Override // defpackage.shb
    public final d2c getLayoutDirection() {
        return this.u.z;
    }

    @Override // defpackage.b2c
    public final long h() {
        return this.c;
    }

    public final void h1() {
        evf evfVar = this.T;
        if (evfVar != null) {
            ((s3a) evfVar).c();
            return;
        }
        wye wyeVar = this.w;
        if (wyeVar != null) {
            wyeVar.h1();
        }
    }

    public final boolean i1() {
        if (this.T != null && this.C <= 0.0f) {
            return true;
        }
        wye wyeVar = this.w;
        if (wyeVar != null) {
            return wyeVar.i1();
        }
        return false;
    }

    public final void j1() {
        this.u.G.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [b8e] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [b8e] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [dfe] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [dfe] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void k1() {
        b8e b8eVarZ0;
        boolean zG = xye.g(NotificationCompat.FLAG_HIGH_PRIORITY);
        b8e b8eVarC1 = c1(zG);
        if (b8eVarC1 == null || (b8eVarC1.a.d & NotificationCompat.FLAG_HIGH_PRIORITY) == 0) {
            return;
        }
        ttj ttjVarT = bwg.t();
        Function1 function1E = ttjVarT != null ? ttjVarT.e() : null;
        ttj ttjVarX = bwg.x(ttjVarT);
        try {
            if (!zG) {
                b8eVarZ0 = Z0().e;
                if (b8eVarZ0 != null) {
                }
            }
            b8eVarZ0 = Z0();
            for (b8e b8eVarC12 = c1(zG); b8eVarC12 != null; b8eVarC12 = b8eVarC12.f) {
                if ((b8eVarC12.d & NotificationCompat.FLAG_HIGH_PRIORITY) == 0) {
                    break;
                }
                if ((b8eVarC12.c & NotificationCompat.FLAG_HIGH_PRIORITY) != 0) {
                    i17 i17VarU = b8eVarC12;
                    ?? dfeVar = 0;
                    while (i17VarU != 0) {
                        if (i17VarU instanceof xfd) {
                            ((xfd) i17VarU).a(this.c);
                        } else if ((i17VarU.c & NotificationCompat.FLAG_HIGH_PRIORITY) != 0 && (i17VarU instanceof i17)) {
                            b8e b8eVar = i17VarU.p;
                            int i = 0;
                            i17VarU = i17VarU;
                            dfeVar = dfeVar;
                            while (b8eVar != null) {
                                if ((b8eVar.c & NotificationCompat.FLAG_HIGH_PRIORITY) != 0) {
                                    i++;
                                    dfeVar = dfeVar;
                                    if (i == 1) {
                                        i17VarU = b8eVar;
                                    } else {
                                        if (dfeVar == 0) {
                                            dfeVar = new dfe(new b8e[16]);
                                        }
                                        if (i17VarU != 0) {
                                            dfeVar.c(i17VarU);
                                            i17VarU = 0;
                                        }
                                        dfeVar.c(b8eVar);
                                    }
                                }
                                b8eVar = b8eVar.f;
                                i17VarU = i17VarU;
                                dfeVar = dfeVar;
                            }
                            if (i != 1) {
                            }
                        }
                        i17VarU = ui6.U(dfeVar);
                    }
                }
                if (b8eVarC12 == b8eVarZ0) {
                    break;
                }
            }
        } finally {
            bwg.A(ttjVarT, ttjVarX, function1E);
        }
    }

    @Override // defpackage.b2c
    public final long l(long j) {
        if (!Z0().n) {
            a8b.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        b2c b2cVarV = rm5.v(this);
        v31 v31VarA = p3c.a(this.u);
        v31VarA.I();
        return x(b2cVarV, y8f.d(afd.b(v31VarA.V, j), b2cVarV.U(0L)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [b8e] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [b8e] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [dfe] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [dfe] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void l1() {
        boolean zG = xye.g(4194304);
        b8e b8eVarZ0 = Z0();
        if (zG || (b8eVarZ0 = b8eVarZ0.e) != null) {
            for (b8e b8eVarC1 = c1(zG); b8eVarC1 != null && (b8eVarC1.d & 4194304) != 0; b8eVarC1 = b8eVarC1.f) {
                if ((b8eVarC1.c & 4194304) != 0) {
                    i17 i17VarU = b8eVarC1;
                    ?? dfeVar = 0;
                    while (i17VarU != 0) {
                        if (i17VarU instanceof z1c) {
                            ((z1c) i17VarU).X(this);
                        } else if ((i17VarU.c & 4194304) != 0 && (i17VarU instanceof i17)) {
                            b8e b8eVar = i17VarU.p;
                            int i = 0;
                            i17VarU = i17VarU;
                            dfeVar = dfeVar;
                            while (b8eVar != null) {
                                if ((b8eVar.c & 4194304) != 0) {
                                    i++;
                                    dfeVar = dfeVar;
                                    if (i == 1) {
                                        i17VarU = b8eVar;
                                    } else {
                                        if (dfeVar == 0) {
                                            dfeVar = new dfe(new b8e[16]);
                                        }
                                        if (i17VarU != 0) {
                                            dfeVar.c(i17VarU);
                                            i17VarU = 0;
                                        }
                                        dfeVar.c(b8eVar);
                                    }
                                }
                                b8eVar = b8eVar.f;
                                i17VarU = i17VarU;
                                dfeVar = dfeVar;
                            }
                            if (i != 1) {
                            }
                        }
                        i17VarU = ui6.U(dfeVar);
                    }
                }
                if (b8eVarC1 == b8eVarZ0) {
                    return;
                }
            }
        }
    }

    public final void m1() throws pxb {
        this.x = true;
        this.R.invoke();
        s1();
        if (ybb.a(this.F, 0L)) {
            return;
        }
        this.u.N(this);
    }

    @Override // defpackage.n27
    public final float n0() {
        return this.u.y.n0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [b8e] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [b8e] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [dfe] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [dfe] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void n1() {
        boolean zG = xye.g(1048576);
        b8e b8eVarC1 = c1(zG);
        if (b8eVarC1 == null || (b8eVarC1.a.d & 1048576) == 0) {
            return;
        }
        b8e b8eVarZ0 = Z0();
        if (zG || (b8eVarZ0 = b8eVarZ0.e) != null) {
            for (b8e b8eVarC12 = c1(zG); b8eVarC12 != null && (b8eVarC12.d & 1048576) != 0; b8eVarC12 = b8eVarC12.f) {
                if ((b8eVarC12.c & 1048576) != 0) {
                    i17 i17VarU = b8eVarC12;
                    ?? dfeVar = 0;
                    while (i17VarU != 0) {
                        if (i17VarU instanceof smm) {
                            ((smm) i17VarU).G0();
                        } else if ((i17VarU.c & 1048576) != 0 && (i17VarU instanceof i17)) {
                            b8e b8eVar = i17VarU.p;
                            int i = 0;
                            i17VarU = i17VarU;
                            dfeVar = dfeVar;
                            while (b8eVar != null) {
                                if ((b8eVar.c & 1048576) != 0) {
                                    i++;
                                    dfeVar = dfeVar;
                                    if (i == 1) {
                                        i17VarU = b8eVar;
                                    } else {
                                        if (dfeVar == 0) {
                                            dfeVar = new dfe(new b8e[16]);
                                        }
                                        if (i17VarU != 0) {
                                            dfeVar.c(i17VarU);
                                            i17VarU = 0;
                                        }
                                        dfeVar.c(b8eVar);
                                    }
                                }
                                b8eVar = b8eVar.f;
                                i17VarU = i17VarU;
                                dfeVar = dfeVar;
                            }
                            if (i != 1) {
                            }
                        }
                        i17VarU = ui6.U(dfeVar);
                    }
                }
                if (b8eVarC12 == b8eVarZ0) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d0 A[PHI: r3
      0x01d0: PHI (r3v18 dfe) = (r3v1 dfe), (r3v1 dfe), (r3v20 dfe) binds: [B:56:0x019a, B:58:0x019e, B:72:0x01c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [b8e] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o1(defpackage.b8e r18, defpackage.vye r19, long r20, defpackage.oea r22, int r23, boolean r24, float r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wye.o1(b8e, vye, long, oea, int, boolean, float, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [b8e] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [b8e] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [dfe] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [dfe] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.ifg, defpackage.pfd
    public final Object p() {
        m3c m3cVar = this.u;
        if (!m3cVar.F.w(64)) {
            return null;
        }
        Z0();
        pqh pqhVar = new pqh();
        for (b8e b8eVar = (lbl) m3cVar.F.f; b8eVar != null; b8eVar = b8eVar.e) {
            if ((b8eVar.c & 64) != 0) {
                i17 i17VarU = b8eVar;
                ?? dfeVar = 0;
                while (i17VarU != 0) {
                    if (i17VarU instanceof z0g) {
                        pqhVar.a = ((z0g) i17VarU).l(m3cVar.y, pqhVar.a);
                    } else if ((i17VarU.c & 64) != 0 && (i17VarU instanceof i17)) {
                        b8e b8eVar2 = i17VarU.p;
                        int i = 0;
                        i17VarU = i17VarU;
                        dfeVar = dfeVar;
                        while (b8eVar2 != null) {
                            if ((b8eVar2.c & 64) != 0) {
                                i++;
                                dfeVar = dfeVar;
                                if (i == 1) {
                                    i17VarU = b8eVar2;
                                } else {
                                    if (dfeVar == 0) {
                                        dfeVar = new dfe(new b8e[16]);
                                    }
                                    if (i17VarU != 0) {
                                        dfeVar.c(i17VarU);
                                        i17VarU = 0;
                                    }
                                    dfeVar.c(b8eVar2);
                                }
                            }
                            b8eVar2 = b8eVar2.f;
                            i17VarU = i17VarU;
                            dfeVar = dfeVar;
                        }
                        if (i != 1) {
                        }
                    }
                    i17VarU = ui6.U(dfeVar);
                }
            }
        }
        return pqhVar.a;
    }

    public void p1(sh4 sh4Var, q3a q3aVar) {
        m3c m3cVar = this.u;
        v31 v31VarA = p3c.a(m3cVar);
        dfe dfeVarY = m3cVar.y();
        Object[] objArr = dfeVarY.a;
        int i = dfeVarY.c;
        for (int i2 = 0; i2 < i; i2++) {
            m3c m3cVar2 = (m3c) objArr[i2];
            if (m3cVar2.I()) {
                m3cVar2.i(sh4Var, q3aVar);
            }
        }
        if (v31VarA.n()) {
            zg zgVar = j8b.d0;
            long j = this.c;
            sh4Var.o(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, zgVar);
        }
    }

    public final void q1(long j, float f, Function1 function1) throws pxb {
        z1(false, function1);
        boolean zA = ybb.a(this.F, j);
        m3c m3cVar = this.u;
        if (!zA) {
            p3c.a(m3cVar).U(-4.0f);
            this.F = j;
            evf evfVar = this.T;
            if (evfVar != null) {
                ((s3a) evfVar).d(j);
            } else {
                wye wyeVar = this.w;
                if (wyeVar != null) {
                    wyeVar.h1();
                }
            }
            m3cVar.N(this);
            o1d.K0(this);
            v31 v31Var = m3cVar.n;
            if (v31Var != null) {
                v31Var.C(m3cVar);
            }
        }
        this.G = f;
        if (this == ((wye) m3cVar.F.e) && !this.o) {
            p3c.a(m3cVar).t.g(m3cVar);
        }
        if (this.o) {
            return;
        }
        v0(G0());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r1(defpackage.ree r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wye.r1(ree, boolean, boolean):void");
    }

    public final void s1() throws pxb {
        if (this.T != null) {
            z1(false, null);
            this.u.U(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [b8e] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [b8e] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [dfe] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [dfe] */
    public final void t1(ufd ufdVar) throws pxb {
        wye wyeVar;
        ufd ufdVar2 = this.D;
        if (ufdVar != ufdVar2) {
            this.D = ufdVar;
            m3c m3cVar = this.u;
            int i = 0;
            if (ufdVar2 == null || ufdVar.getWidth() != ufdVar2.getWidth() || ufdVar.getHeight() != ufdVar2.getHeight()) {
                int width = ufdVar.getWidth();
                int height = ufdVar.getHeight();
                evf evfVar = this.T;
                if (evfVar != null) {
                    ((s3a) evfVar).e((width << 32) | (height & 4294967295L));
                } else if (m3cVar.I() && (wyeVar = this.w) != null) {
                    wyeVar.h1();
                }
                f0((width << 32) | (height & 4294967295L));
                if (this.z != null) {
                    A1(false);
                }
                boolean zG = xye.g(4);
                b8e b8eVarZ0 = Z0();
                if (zG || (b8eVarZ0 = b8eVarZ0.e) != null) {
                    for (b8e b8eVarC1 = c1(zG); b8eVarC1 != null && (b8eVarC1.d & 4) != 0; b8eVarC1 = b8eVarC1.f) {
                        if ((b8eVarC1.c & 4) != 0) {
                            i17 i17VarU = b8eVarC1;
                            ?? dfeVar = 0;
                            while (i17VarU != 0) {
                                if (i17VarU instanceof lk7) {
                                    ((lk7) i17VarU).i0();
                                } else if ((i17VarU.c & 4) != 0 && (i17VarU instanceof i17)) {
                                    b8e b8eVar = i17VarU.p;
                                    int i2 = 0;
                                    i17VarU = i17VarU;
                                    dfeVar = dfeVar;
                                    while (b8eVar != null) {
                                        if ((b8eVar.c & 4) != 0) {
                                            i2++;
                                            dfeVar = dfeVar;
                                            if (i2 == 1) {
                                                i17VarU = b8eVar;
                                            } else {
                                                if (dfeVar == 0) {
                                                    dfeVar = new dfe(new b8e[16]);
                                                }
                                                if (i17VarU != 0) {
                                                    dfeVar.c(i17VarU);
                                                    i17VarU = 0;
                                                }
                                                dfeVar.c(b8eVar);
                                            }
                                        }
                                        b8eVar = b8eVar.f;
                                        i17VarU = i17VarU;
                                        dfeVar = dfeVar;
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                i17VarU = ui6.U(dfeVar);
                            }
                        }
                        if (b8eVarC1 == b8eVarZ0) {
                            break;
                        }
                    }
                }
                v31 v31Var = m3cVar.n;
                if (v31Var != null) {
                    v31Var.C(m3cVar);
                }
                m3cVar.N(this);
            }
            zde zdeVar = this.E;
            if ((zdeVar == null || zdeVar.e == 0) && ufdVar.a().isEmpty()) {
                return;
            }
            zde zdeVar2 = this.E;
            Map mapA = ufdVar.a();
            if (zdeVar2 != null && zdeVar2.e == mapA.size()) {
                Object[] objArr = zdeVar2.b;
                int[] iArr = zdeVar2.c;
                long[] jArr = zdeVar2.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = (Integer) mapA.get((sz0) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            m3cVar.G.p.x.f();
            zde zdeVar3 = this.E;
            if (zdeVar3 == null) {
                zde zdeVar4 = n6f.a;
                zdeVar3 = new zde();
                this.E = zdeVar3;
            }
            zdeVar3.a();
            for (Map.Entry entry : ufdVar.a().entrySet()) {
                zdeVar3.g(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    public final void u1(b8e b8eVar, vye vyeVar, long j, oea oeaVar, int i, boolean z, float f) {
        int i2;
        dee deeVar = oeaVar.a;
        if (b8eVar == null) {
            g1(vyeVar, j, oeaVar, i, z);
            return;
        }
        if (!vyeVar.o(b8eVar)) {
            u1(f03.L(b8eVar, vyeVar.c()), vyeVar, j, oeaVar, i, z, f);
            return;
        }
        if (!vyeVar.b(b8eVar)) {
            o1(f03.L(b8eVar, vyeVar.c()), vyeVar, j, oeaVar, i, z, f, false);
            return;
        }
        rde rdeVar = oeaVar.b;
        int i3 = oeaVar.c;
        int i4 = deeVar.b;
        if (i3 != i4 - 1) {
            long jB = oeaVar.b();
            int i5 = oeaVar.c;
            int i6 = deeVar.b;
            int i7 = i6 - 1;
            oeaVar.c = i7;
            oeaVar.c(i6, deeVar.b);
            oeaVar.c++;
            deeVar.a(b8eVar);
            rdeVar.a(wyh.b(f, z, false));
            o1(f03.L(b8eVar, vyeVar.c()), vyeVar, j, oeaVar, i, z, f, false);
            oeaVar.c = i7;
            long jB2 = oeaVar.b();
            if (oeaVar.c + 1 >= deeVar.b - 1 || qyn.p(jB, jB2) <= 0) {
                oeaVar.c(oeaVar.c + 1, deeVar.b);
            } else {
                int i8 = i5 + 1;
                boolean zM = qyn.M(jB2);
                int i9 = oeaVar.c;
                oeaVar.c(i8, zM ? i9 + 2 : i9 + 1);
            }
            oeaVar.c = i5;
            return;
        }
        int i10 = i3 + 1;
        oeaVar.c(i10, i4);
        oeaVar.c++;
        deeVar.a(b8eVar);
        rdeVar.a(wyh.b(f, z, false));
        o1(f03.L(b8eVar, vyeVar.c()), vyeVar, j, oeaVar, i, z, f, false);
        oeaVar.c = i3;
        if (i10 == deeVar.b - 1 || qyn.M(oeaVar.b())) {
            int i11 = oeaVar.c;
            int i12 = i11 + 1;
            deeVar.l(i12);
            if (i12 < 0 || i12 >= (i2 = rdeVar.b)) {
                zwg.u("Index must be between 0 and size");
                throw null;
            }
            long[] jArr = rdeVar.a;
            long j2 = jArr[i12];
            if (i12 != i2 - 1) {
                int i13 = i11 + 2;
                System.arraycopy(jArr, i13, jArr, i12, i2 - i13);
            }
            rdeVar.b--;
        }
    }

    @Override // defpackage.b2c
    public final long v(b2c b2cVar, long j) {
        return x(b2cVar, j);
    }

    @Override // defpackage.b2c
    public final long w(long j) {
        if (!Z0().n) {
            a8b.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return x(rm5.v(this), p3c.a(this.u).N(j));
    }

    public final voh w1() {
        if (Z0().n) {
            b2c b2cVarV = rm5.v(this);
            ree reeVar = this.H;
            if (reeVar == null) {
                reeVar = new ree();
                this.H = reeVar;
            }
            long jQ0 = Q0(Y0());
            float f = a1() ? this.K.a : 0.0f;
            float f2 = a1() ? this.K.b : 0.0f;
            float fY = a1() ? this.K.c : Y();
            float fX = a1() ? this.K.d : X();
            int i = (int) (jQ0 >> 32);
            reeVar.b = f - Float.intBitsToFloat(i);
            int i2 = (int) (jQ0 & 4294967295L);
            reeVar.c = f2 - Float.intBitsToFloat(i2);
            reeVar.d = Float.intBitsToFloat(i) + fY;
            reeVar.e = Float.intBitsToFloat(i2) + fX;
            while (this != b2cVarV) {
                this.r1(reeVar, false, true);
                if (!reeVar.b()) {
                    this = this.w;
                }
            }
            return new voh(reeVar.b, reeVar.c, reeVar.d, reeVar.e);
        }
        return voh.e;
    }

    @Override // defpackage.b2c
    public final long x(b2c b2cVar, long j) {
        if (b2cVar instanceof r1d) {
            r1d r1dVar = (r1d) b2cVar;
            r1dVar.a.u.j1();
            return r1dVar.x(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        wye wyeVarV1 = v1(b2cVar);
        wyeVarV1.j1();
        wye wyeVarV0 = V0(wyeVarV1);
        while (wyeVarV1 != wyeVarV0) {
            evf evfVar = wyeVarV1.T;
            if (evfVar != null) {
                s3a s3aVar = (s3a) evfVar;
                float[] fArrB = s3aVar.b();
                if (!s3aVar.s) {
                    j = afd.b(fArrB, j);
                }
            }
            j = scd.c0(j, wyeVarV1.F);
            wyeVarV1 = wyeVarV1.w;
        }
        return P0(wyeVarV0, j);
    }

    @Override // defpackage.o1d
    public final o1d x0() {
        return this.v;
    }

    public final void x1(wye wyeVar, float[] fArr) {
        float[] fArrA;
        if (Intrinsics.a(wyeVar, this)) {
            return;
        }
        this.w.x1(wyeVar, fArr);
        if (!ybb.a(this.F, 0L)) {
            float[] fArr2 = Y;
            afd.d(fArr2);
            long j = this.F;
            afd.f(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            afd.e(fArr, fArr2);
        }
        evf evfVar = this.T;
        if (evfVar == null || (fArrA = ((s3a) evfVar).a()) == null) {
            return;
        }
        afd.e(fArr, fArrA);
    }

    @Override // defpackage.b2c
    public final voh y(b2c b2cVar, boolean z) {
        if (!Z0().n) {
            a8b.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!b2cVar.f()) {
            a8b.b("LayoutCoordinates " + b2cVar + " is not attached!");
        }
        wye wyeVarV1 = v1(b2cVar);
        wyeVarV1.j1();
        wye wyeVarV0 = V0(wyeVarV1);
        ree reeVar = this.H;
        if (reeVar == null) {
            reeVar = new ree();
            this.H = reeVar;
        }
        reeVar.b = 0.0f;
        reeVar.c = 0.0f;
        reeVar.d = (int) (b2cVar.h() >> 32);
        reeVar.e = (int) (b2cVar.h() & 4294967295L);
        while (wyeVarV1 != wyeVarV0) {
            wyeVarV1.r1(reeVar, z, false);
            if (reeVar.b()) {
                return voh.e;
            }
            wyeVarV1 = wyeVarV1.w;
        }
        O0(wyeVarV0, reeVar, z);
        return new voh(reeVar.b, reeVar.c, reeVar.d, reeVar.e);
    }

    public final void y1(wye wyeVar, float[] fArr) {
        while (!Intrinsics.a(this, wyeVar)) {
            evf evfVar = this.T;
            if (evfVar != null) {
                afd.e(fArr, ((s3a) evfVar).b());
            }
            if (!ybb.a(this.F, 0L)) {
                float[] fArr2 = Y;
                afd.d(fArr2);
                afd.f(fArr2, (int) (r0 >> 32), (int) (r0 & 4294967295L));
                afd.e(fArr, fArr2);
            }
            this = this.w;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pxb */
    public final void z1(boolean z, Function1 function1) throws pxb {
        v31 v31Var;
        dfe dfeVar;
        hda hdaVar;
        dfe dfeVar2;
        Object obj;
        byte b = 0;
        m3c m3cVar = this.u;
        boolean z2 = (!z && this.z == function1 && Intrinsics.a(this.A, m3cVar.y) && this.B == m3cVar.z) ? false : true;
        this.A = m3cVar.y;
        this.B = m3cVar.z;
        boolean zH = m3cVar.H();
        tye tyeVar = this.R;
        if (!zH || function1 == null) {
            this.z = null;
            evf evfVar = this.T;
            if (evfVar != null) {
                s3a s3aVar = (s3a) evfVar;
                if (!p37.S(s3aVar.b())) {
                    m3cVar.N(this);
                }
                s3aVar.d = null;
                s3aVar.e = null;
                s3aVar.g = true;
                s3aVar.f(false);
                a71 a71Var = s3aVar.b;
                if (a71Var != null) {
                    a71Var.b(s3aVar.a);
                    v31 v31Var2 = s3aVar.c;
                    wzg wzgVar = v31Var2.o0;
                    while (true) {
                        Reference referencePoll = ((ReferenceQueue) wzgVar.c).poll();
                        dfeVar = (dfe) wzgVar.b;
                        if (referencePoll == null) {
                            break;
                        } else {
                            dfeVar.k(referencePoll);
                        }
                    }
                    dfeVar.c(new WeakReference(s3aVar, (ReferenceQueue) wzgVar.c));
                    v31Var2.z.k(s3aVar);
                }
                this.T = null;
                m3cVar.J = true;
                tyeVar.invoke();
                if (Z0().n && m3cVar.I() && (v31Var = m3cVar.n) != null) {
                    v31Var.C(m3cVar);
                }
            }
            this.S = false;
            return;
        }
        this.z = function1;
        if (this.T != null) {
            if (z2) {
                A1(true);
                return;
            }
            return;
        }
        v31 v31VarA = p3c.a(m3cVar);
        hda hdaVar2 = this.Q;
        if (hdaVar2 == null) {
            hda hdaVar3 = new hda(this, new tye(this, b), (byte) 14);
            this.Q = hdaVar3;
            hdaVar = hdaVar3;
        } else {
            hdaVar = hdaVar2;
        }
        wzg wzgVar2 = v31VarA.o0;
        while (true) {
            ReferenceQueue referenceQueue = (ReferenceQueue) wzgVar2.c;
            dfeVar2 = (dfe) wzgVar2.b;
            Reference referencePoll2 = referenceQueue.poll();
            if (referencePoll2 == null) {
                break;
            } else {
                dfeVar2.k(referencePoll2);
            }
        }
        while (true) {
            int i = dfeVar2.c;
            if (i == 0) {
                obj = null;
                break;
            } else {
                obj = ((Reference) dfeVar2.l(i - 1)).get();
                if (obj != null) {
                    break;
                }
            }
        }
        evf s3aVar2 = (evf) obj;
        if (s3aVar2 != null) {
            s3a s3aVar3 = (s3a) s3aVar2;
            a71 a71Var2 = s3aVar3.b;
            if (a71Var2 == null) {
                throw vep.q("currently reuse is only supported when we manage the layer lifecycle");
            }
            if (!s3aVar3.a.s) {
                a8b.a("layer should have been released before reuse");
            }
            s3aVar3.a = a71Var2.a();
            s3aVar3.g = false;
            s3aVar3.d = hdaVar;
            s3aVar3.e = tyeVar;
            s3aVar3.q = false;
            s3aVar3.r = false;
            s3aVar3.s = true;
            afd.d(s3aVar3.h);
            float[] fArr = s3aVar3.i;
            if (fArr != null) {
                afd.d(fArr);
            }
            s3aVar3.o = a2m.b;
            s3aVar3.t = false;
            s3aVar3.f = 9223372034707292159L;
            s3aVar3.p = null;
            s3aVar3.n = 0;
        } else {
            s3aVar2 = new s3a(v31VarA.x.a(), v31VarA.x, v31VarA, hdaVar, tyeVar);
        }
        s3a s3aVar4 = (s3a) s3aVar2;
        s3aVar4.e(this.c);
        s3aVar4.d(this.F);
        this.T = s3aVar2;
        A1(true);
        m3cVar.J = true;
        tyeVar.invoke();
    }
}
