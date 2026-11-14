package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class ja1 implements Function2 {
    public final /* synthetic */ u5n a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ c8e d;
    public final /* synthetic */ k9f e;

    public /* synthetic */ ja1(u5n u5nVar, long j, boolean z, c8e c8eVar, k9f k9fVar) {
        this.a = u5nVar;
        this.b = j;
        this.c = z;
        this.d = c8eVar;
        this.e = k9fVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        vt9 vt9Var = (ih5) obj;
        int iIntValue = ((Integer) obj2).intValue();
        vt9 vt9Var2 = vt9Var;
        if (vt9Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            kfo.c(mi5.t.a(this.a), gyg.P(1260045569, new la1(this.b, this.c, this.d, this.e), vt9Var2), vt9Var2, 56);
        } else {
            vt9Var2.Q();
        }
        return Unit.a;
    }
}
