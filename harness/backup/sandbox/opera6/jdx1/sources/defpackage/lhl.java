package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class lhl implements Function2 {
    public final /* synthetic */ c8e a;
    public final /* synthetic */ sgl b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ikl g;
    public final /* synthetic */ rvb h;
    public final /* synthetic */ ovb i;
    public final /* synthetic */ int j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ uac l;
    public final /* synthetic */ lde m;
    public final /* synthetic */ ue5 n;
    public final /* synthetic */ ue5 o;
    public final /* synthetic */ ue5 p;
    public final /* synthetic */ ue5 q;
    public final /* synthetic */ paj r;

    /* JADX WARN: Multi-variable type inference failed */
    public lhl(c8e c8eVar, sgl sglVar, String str, Function1 function1, boolean z, boolean z2, ikl iklVar, rvb rvbVar, ovb ovbVar, int i, int i2, uac uacVar, lde ldeVar, ue5 ue5Var, ue5 ue5Var2, ue5 ue5Var3, ue5 ue5Var4, paj pajVar) {
        this.a = c8eVar;
        this.b = sglVar;
        this.c = str;
        this.d = function1;
        this.e = z;
        this.f = z2;
        this.g = iklVar;
        this.h = rvbVar;
        this.i = ovbVar;
        this.j = i;
        this.k = i2;
        this.l = uacVar;
        this.m = ldeVar;
        this.n = ue5Var;
        this.o = ue5Var2;
        this.p = ue5Var3;
        this.q = ue5Var4;
        this.r = pajVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        ih5 ih5Var = (ih5) obj;
        int iIntValue = ((Number) obj2).intValue();
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            a4h.g(vt9Var, 2132018526);
            c8e c8eVarA = mpj.a(this.a, 280.0f, 56.0f);
            sgl sglVar = this.b;
            nvj nvjVar = new nvj(sglVar.i);
            ue5 ue5Var = this.q;
            paj pajVar = this.r;
            String str = this.c;
            boolean z = this.e;
            uac uacVar = this.l;
            lde ldeVar = this.m;
            x7d.a(str, this.d, c8eVarA, z, this.f, this.g, this.h, this.i, false, this.j, this.k ? 1 : 0, uacVar, null, ldeVar, nvjVar, gyg.P(1451491557, new khl(str, z, uacVar, ldeVar, this.n, this.o, this.p, ue5Var, pajVar, sglVar), vt9Var), vt9Var, 0);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }
}
