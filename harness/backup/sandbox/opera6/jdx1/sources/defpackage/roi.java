package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class roi extends b8e implements e3c, i0j {
    public voi o;
    public boolean p;

    @Override // defpackage.e3c
    public final int E(o1d o1dVar, pfd pfdVar, int i) {
        if (!this.p) {
            i = Integer.MAX_VALUE;
        }
        return pfdVar.c(i);
    }

    @Override // defpackage.e3c
    public final int N(o1d o1dVar, pfd pfdVar, int i) {
        if (this.p) {
            i = Integer.MAX_VALUE;
        }
        return pfdVar.E(i);
    }

    @Override // defpackage.i0j
    public final void R(q0j q0jVar) {
        o0j.k(q0jVar);
        final byte b = 0;
        final byte b2 = 1;
        eoi eoiVar = new eoi(new Function0(this) { // from class: qoi
            public final /* synthetic */ roi b;

            {
                this.b = this;
            }

            public final Object invoke() {
                int iH;
                byte b3 = b;
                roi roiVar = this.b;
                switch (b3) {
                    case 0:
                        iH = roiVar.o.a.h();
                        break;
                    default:
                        iH = roiVar.o.f.h();
                        break;
                }
                return Float.valueOf(iH);
            }
        }, new Function0(this) { // from class: qoi
            public final /* synthetic */ roi b;

            {
                this.b = this;
            }

            public final Object invoke() {
                int iH;
                byte b3 = b2;
                roi roiVar = this.b;
                switch (b3) {
                    case 0:
                        iH = roiVar.o.a.h();
                        break;
                    default:
                        iH = roiVar.o.f.h();
                        break;
                }
                return Float.valueOf(iH);
            }
        });
        if (this.p) {
            p0j p0jVar = n0j.w;
            xtb xtbVar = o0j.a[13];
            p0jVar.getClass();
            q0jVar.b(p0jVar, eoiVar);
            return;
        }
        p0j p0jVar2 = n0j.v;
        xtb xtbVar2 = o0j.a[12];
        p0jVar2.getClass();
        q0jVar.b(p0jVar2, eoiVar);
    }

    @Override // defpackage.e3c
    public final ufd c(vfd vfdVar, pfd pfdVar, long j) {
        wxe.o(j, this.p ? fsf.a : fsf.b);
        ifg ifgVarN = pfdVar.N(yo5.a(0, this.p ? yo5.h(j) : Integer.MAX_VALUE, 0, this.p ? Integer.MAX_VALUE : yo5.g(j), 5, j));
        int i = ifgVarN.a;
        int iH = yo5.h(j);
        if (i > iH) {
            i = iH;
        }
        int i2 = ifgVarN.b;
        int iG = yo5.g(j);
        if (i2 > iG) {
            i2 = iG;
        }
        int i3 = ifgVarN.b - i2;
        int i4 = ifgVarN.a - i;
        if (!this.p) {
            i3 = i4;
        }
        voi voiVar = this.o;
        q0g q0gVar = voiVar.f;
        q0g q0gVar2 = voiVar.a;
        q0gVar.i(i3);
        ttj ttjVarT = bwg.t();
        Function1 function1E = ttjVarT != null ? ttjVarT.e() : null;
        ttj ttjVarX = bwg.x(ttjVarT);
        try {
            if (q0gVar2.h() > i3) {
                q0gVar2.i(i3);
            }
            bwg.A(ttjVarT, ttjVarX, function1E);
            this.o.b.i(this.p ? i2 : i);
            this.o.c.i(this.p ? ifgVarN.b : ifgVarN.a);
            this.o.d.setValue(Boolean.FALSE);
            return vfdVar.b0(i, i2, n08.a, new bl3(this, i3, ifgVarN, (byte) 2));
        } catch (Throwable th) {
            bwg.A(ttjVarT, ttjVarX, function1E);
            throw th;
        }
    }

    @Override // defpackage.e3c
    public final int f(o1d o1dVar, pfd pfdVar, int i) {
        if (this.p) {
            i = Integer.MAX_VALUE;
        }
        return pfdVar.J(i);
    }

    @Override // defpackage.e3c
    public final int r0(o1d o1dVar, pfd pfdVar, int i) {
        if (!this.p) {
            i = Integer.MAX_VALUE;
        }
        return pfdVar.z(i);
    }
}
