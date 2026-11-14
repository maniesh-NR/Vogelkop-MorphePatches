package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class g1n extends ozb implements Function1 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ h1n j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1n(h1n h1nVar, byte b) {
        super(1);
        this.i = b;
        this.j = h1nVar;
    }

    public final Object invoke(Object obj) {
        long j;
        byte b = this.i;
        h1n h1nVar = this.j;
        switch (b) {
            case 0:
                u2m u2mVar = (u2m) obj;
                e48 e48Var = e48.a;
                e48 e48Var2 = e48.b;
                if (u2mVar.c(e48Var, e48Var2)) {
                    a3m a3mVar = h1nVar.p.a;
                    return o48.c;
                }
                if (!u2mVar.c(e48Var2, e48.c)) {
                    return o48.c;
                }
                a3m a3mVar2 = h1nVar.q.a;
                return o48.c;
            default:
                int iOrdinal = ((e48) obj).ordinal();
                if (iOrdinal == 0) {
                    a3m a3mVar3 = h1nVar.p.a;
                    j = u95.f;
                } else if (iOrdinal == 1) {
                    a3m a3mVar4 = h1nVar.p.a;
                    a3m a3mVar5 = h1nVar.q.a;
                    j = u95.f;
                } else {
                    if (iOrdinal != 2) {
                        h9o.p();
                        return null;
                    }
                    a3m a3mVar6 = h1nVar.q.a;
                    j = h1nVar.r.e;
                }
                return new u95(j);
        }
    }
}
