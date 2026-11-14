package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class w3c extends j3c {
    public final /* synthetic */ z3c b;
    public final /* synthetic */ Function2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3c(z3c z3cVar, Function2 function2, String str) {
        super(str);
        this.b = z3cVar;
        this.c = function2;
    }

    @Override // defpackage.tfd
    public final ufd b(vfd vfdVar, List list, long j) {
        z3c z3cVar = this.b;
        u3c u3cVar = z3cVar.h;
        u3cVar.a = vfdVar.getLayoutDirection();
        u3cVar.b = vfdVar.b();
        u3cVar.c = vfdVar.n0();
        boolean zF = vfdVar.F();
        Function2 function2 = this.c;
        if (zF || z3cVar.a.h == null) {
            z3cVar.d = 0;
            ufd ufdVar = (ufd) function2.invoke(u3cVar, new yo5(j));
            return new v3c(ufdVar, z3cVar, z3cVar.d, ufdVar, (byte) 1);
        }
        z3cVar.e = 0;
        ufd ufdVar2 = (ufd) function2.invoke(z3cVar.i, new yo5(j));
        return new v3c(ufdVar2, z3cVar, z3cVar.e, ufdVar2, (byte) 0);
    }
}
