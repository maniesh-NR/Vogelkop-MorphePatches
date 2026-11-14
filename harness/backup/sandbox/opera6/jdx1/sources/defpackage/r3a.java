package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lr3a;", "Lh8e;", "Lwkj;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class r3a extends h8e {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final long l;
    public final paj m;
    public final boolean n;
    public final long o;
    public final long p;
    public final int q;
    public final int r;
    public final kh3 s;
    public final v1c t;

    public r3a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, paj pajVar, boolean z, long j2, long j3, int i, int i2, kh3 kh3Var, v1c v1cVar) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = f8;
        this.j = f9;
        this.k = f10;
        this.l = j;
        this.m = pajVar;
        this.n = z;
        this.o = j2;
        this.p = j3;
        this.q = i;
        this.r = i2;
        this.s = kh3Var;
        this.t = v1cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3a)) {
            return false;
        }
        r3a r3aVar = (r3a) obj;
        if (Float.compare(this.b, r3aVar.b) != 0 || Float.compare(this.c, r3aVar.c) != 0 || Float.compare(this.d, r3aVar.d) != 0 || Float.compare(this.e, r3aVar.e) != 0 || Float.compare(this.f, r3aVar.f) != 0 || Float.compare(this.g, r3aVar.g) != 0 || Float.compare(this.h, r3aVar.h) != 0 || Float.compare(this.i, r3aVar.i) != 0 || Float.compare(this.j, r3aVar.j) != 0 || Float.compare(this.k, r3aVar.k) != 0 || !a2m.a(this.l, r3aVar.l) || !Intrinsics.a(this.m, r3aVar.m) || this.n != r3aVar.n) {
            return false;
        }
        long j = r3aVar.o;
        int i = u95.h;
        return jgm.a(this.o, j) && jgm.a(this.p, r3aVar.p) && this.q == r3aVar.q && this.r == r3aVar.r && Intrinsics.a(this.s, r3aVar.s) && Intrinsics.a(this.t, r3aVar.t);
    }

    @Override // defpackage.h8e
    public final b8e f() {
        wkj wkjVar = new wkj();
        wkjVar.o = this.b;
        wkjVar.p = this.c;
        wkjVar.q = this.d;
        wkjVar.r = this.e;
        wkjVar.s = this.f;
        wkjVar.t = this.g;
        wkjVar.u = this.h;
        wkjVar.v = this.i;
        wkjVar.w = this.j;
        wkjVar.x = this.k;
        wkjVar.y = this.l;
        wkjVar.z = this.m;
        wkjVar.A = this.n;
        wkjVar.B = this.o;
        wkjVar.C = this.p;
        wkjVar.D = this.q;
        wkjVar.E = this.r;
        wkjVar.F = this.s;
        wkjVar.G = this.t;
        wkjVar.H = new tji(wkjVar, (byte) 17);
        return wkjVar;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) throws pxb {
        wye wyeVar;
        wkj wkjVar = (wkj) b8eVar;
        wkjVar.o = this.b;
        wkjVar.p = this.c;
        wkjVar.q = this.d;
        wkjVar.r = this.e;
        wkjVar.s = this.f;
        wkjVar.t = this.g;
        wkjVar.u = this.h;
        wkjVar.v = this.i;
        wkjVar.w = this.j;
        wkjVar.x = this.k;
        wkjVar.y = this.l;
        wkjVar.z = this.m;
        wkjVar.A = this.n;
        wkjVar.B = this.o;
        wkjVar.C = this.p;
        wkjVar.D = this.q;
        wkjVar.E = this.r;
        wkjVar.F = this.s;
        wkjVar.G = this.t;
        Function1 function1 = wkjVar.H;
        if (!wkjVar.a.n || (wyeVar = ui6.c0(wkjVar, 2).v) == null) {
            return;
        }
        wyeVar.z1(true, function1);
    }

    public final int hashCode() {
        int iD = sko.d(this.k, sko.d(this.j, sko.d(this.i, sko.d(this.h, sko.d(this.g, sko.d(this.f, sko.d(this.e, sko.d(this.d, sko.d(this.c, Float.hashCode(this.b) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = a2m.c;
        int iK = fki.k((this.m.hashCode() + z1m.e(iD, 31, this.l)) * 31, 961, this.n);
        int i2 = u95.h;
        igm igmVar = jgm.b;
        int iC = rfp.c(this.r, rfp.c(this.q, z1m.e(z1m.e(iK, 31, this.o), 31, this.p), 31), 31);
        kh3 kh3Var = this.s;
        int iHashCode = (iC + (kh3Var == null ? 0 : kh3Var.hashCode())) * 31;
        this.t.getClass();
        return iHashCode;
    }

    public final String toString() {
        String strB = a2m.b(this.l);
        String strH = u95.h(this.o);
        String strH2 = u95.h(this.p);
        String strI = p3p.i(this.q, "CompositingStrategy(value=", ")");
        String strK0 = y9m.k0(this.r);
        StringBuilder sbP = am2.p("GraphicsLayerElement(scaleX=", this.b, ", scaleY=", this.c, ", alpha=");
        sbP.append(this.d);
        sbP.append(", translationX=");
        sbP.append(this.e);
        sbP.append(", translationY=");
        sbP.append(this.f);
        sbP.append(", shadowElevation=");
        sbP.append(this.g);
        sbP.append(", rotationX=");
        sbP.append(this.h);
        sbP.append(", rotationY=");
        sbP.append(this.i);
        sbP.append(", rotationZ=");
        sbP.append(this.j);
        sbP.append(", cameraDistance=");
        sbP.append(this.k);
        sbP.append(", transformOrigin=");
        sbP.append(strB);
        sbP.append(", shape=");
        sbP.append(this.m);
        sbP.append(", clip=");
        z1m.u(sbP, this.n, ", renderEffect=null, ambientShadowColor=", strH, ", spotShadowColor=");
        z1m.t(sbP, strH2, ", compositingStrategy=", strI, ", blendMode=");
        sbP.append(strK0);
        sbP.append(", colorFilter=");
        sbP.append(this.s);
        sbP.append(", outsets=");
        sbP.append(this.t);
        sbP.append(")");
        return sbP.toString();
    }
}
