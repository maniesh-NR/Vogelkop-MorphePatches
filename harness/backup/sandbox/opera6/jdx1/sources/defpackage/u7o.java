package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class u7o extends b8e implements e3c {
    public p97 o;
    public boolean p;
    public Function2 q;

    @Override // defpackage.e3c
    public final ufd c(vfd vfdVar, pfd pfdVar, long j) {
        p97 p97Var = this.o;
        p97 p97Var2 = p97.a;
        int iJ = p97Var != p97Var2 ? 0 : yo5.j(j);
        p97 p97Var3 = this.o;
        p97 p97Var4 = p97.b;
        ifg ifgVarN = pfdVar.N(ap5.a(iJ, (this.o == p97Var2 || !this.p) ? yo5.h(j) : Integer.MAX_VALUE, p97Var3 == p97Var4 ? yo5.i(j) : 0, (this.o == p97Var4 || !this.p) ? yo5.g(j) : Integer.MAX_VALUE));
        int iC = djh.c(ifgVarN.a, yo5.j(j), yo5.h(j));
        int iC2 = djh.c(ifgVarN.b, yo5.i(j), yo5.g(j));
        return vfdVar.b0(iC, iC2, n08.a, new n9i(this, iC, ifgVarN, iC2, vfdVar));
    }
}
