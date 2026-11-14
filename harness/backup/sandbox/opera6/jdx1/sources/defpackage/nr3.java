package defpackage;

/* loaded from: classes.dex */
public abstract class nr3 {
    public static final see a = b(true);
    public static final see b = b(false);
    public static final m51 c = m51.e;

    public static final void a(c8e c8eVar, ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-211209833);
        int i2 = (vt9Var.f(c8eVar) ? 4 : 2) | i;
        byte b2 = 0;
        if (vt9Var.N(i2 & 1, (i2 & 3) != 2)) {
            int iHashCode = Long.hashCode(vt9Var.T);
            c8e c8eVarP = qyn.P(vt9Var, c8eVar);
            oag oagVarL = vt9Var.l();
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, c, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new lr3(c8eVar, i, b2);
        }
    }

    public static final see b(boolean z) {
        see seeVar = new see(9);
        td3 td3Var = rbe.b;
        seeVar.m(td3Var, new qr3(td3Var, z));
        td3 td3Var2 = rbe.c;
        seeVar.m(td3Var2, new qr3(td3Var2, z));
        td3 td3Var3 = rbe.d;
        seeVar.m(td3Var3, new qr3(td3Var3, z));
        td3 td3Var4 = rbe.e;
        seeVar.m(td3Var4, new qr3(td3Var4, z));
        td3 td3Var5 = rbe.f;
        seeVar.m(td3Var5, new qr3(td3Var5, z));
        td3 td3Var6 = rbe.g;
        seeVar.m(td3Var6, new qr3(td3Var6, z));
        td3 td3Var7 = rbe.h;
        seeVar.m(td3Var7, new qr3(td3Var7, z));
        td3 td3Var8 = rbe.i;
        seeVar.m(td3Var8, new qr3(td3Var8, z));
        td3 td3Var9 = rbe.j;
        seeVar.m(td3Var9, new qr3(td3Var9, z));
        return seeVar;
    }

    public static final tfd c(td3 td3Var, boolean z) {
        tfd tfdVar = (tfd) (z ? a : b).g(td3Var);
        return tfdVar == null ? new qr3(td3Var, z) : tfdVar;
    }

    public static final void d(p1d p1dVar, ifg ifgVar, pfd pfdVar, d2c d2cVar, int i, int i2, td3 td3Var) {
        td3 td3Var2;
        Object objP = pfdVar.p();
        kr3 kr3Var = objP instanceof kr3 ? (kr3) objP : null;
        p1d.g(p1dVar, ifgVar, ((kr3Var == null || (td3Var2 = kr3Var.o) == null) ? td3Var : td3Var2).a((ifgVar.a << 32) | (ifgVar.b & 4294967295L), (i << 32) | (i2 & 4294967295L), d2cVar));
    }
}
