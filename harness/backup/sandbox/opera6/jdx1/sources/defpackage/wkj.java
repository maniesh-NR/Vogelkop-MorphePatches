package defpackage;

/* loaded from: classes.dex */
public final class wkj extends b8e implements e3c, i0j {
    public boolean A;
    public long B;
    public long C;
    public int D;
    public int E;
    public kh3 F;
    public v1c G;
    public tji H;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public long y;
    public paj z;

    @Override // defpackage.b8e
    public final boolean I0() {
        return false;
    }

    @Override // defpackage.i0j
    public final void R(q0j q0jVar) {
        if (this.A) {
            o0j.i(q0jVar, this.z);
        }
    }

    @Override // defpackage.e3c
    public final ufd c(vfd vfdVar, pfd pfdVar, long j) {
        ifg ifgVarN = pfdVar.N(j);
        return vfdVar.b0(ifgVarN.a, ifgVarN.b, n08.a, new vvf(ifgVarN, this));
    }

    @Override // defpackage.i0j
    public final boolean g() {
        return false;
    }

    public final String toString() {
        float f = this.o;
        float f2 = this.p;
        float f3 = this.q;
        float f4 = this.r;
        float f5 = this.s;
        float f6 = this.t;
        float f7 = this.u;
        float f8 = this.v;
        float f9 = this.w;
        float f10 = this.x;
        String strB = a2m.b(this.y);
        paj pajVar = this.z;
        boolean z = this.A;
        String strH = u95.h(this.B);
        String strH2 = u95.h(this.C);
        String strI = p3p.i(this.D, "CompositingStrategy(value=", ")");
        String strK0 = y9m.k0(this.E);
        kh3 kh3Var = this.F;
        v1c v1cVar = this.G;
        StringBuilder sbP = am2.p("SimpleGraphicsLayerModifier(scaleX=", f, ", scaleY=", f2, ", alpha = ");
        sbP.append(f3);
        sbP.append(", translationX=");
        sbP.append(f4);
        sbP.append(", translationY=");
        sbP.append(f5);
        sbP.append(", shadowElevation=");
        sbP.append(f6);
        sbP.append(", rotationX=");
        sbP.append(f7);
        sbP.append(", rotationY=");
        sbP.append(f8);
        sbP.append(", rotationZ=");
        sbP.append(f9);
        sbP.append(", cameraDistance=");
        sbP.append(f10);
        sbP.append(", transformOrigin=");
        sbP.append(strB);
        sbP.append(", shape=");
        sbP.append(pajVar);
        sbP.append(", clip=");
        z1m.u(sbP, z, ", renderEffect=null, ambientShadowColor=", strH, ", spotShadowColor=");
        z1m.t(sbP, strH2, ", compositingStrategy=", strI, ", blendMode=");
        sbP.append(strK0);
        sbP.append(", colorFilter=");
        sbP.append(kh3Var);
        sbP.append("outsets=");
        sbP.append(v1cVar);
        sbP.append(")");
        return sbP.toString();
    }
}
