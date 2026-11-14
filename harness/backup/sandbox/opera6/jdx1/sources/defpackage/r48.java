package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class r48 extends ozb implements Function1 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ s48 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r48(s48 s48Var, byte b) {
        super(1);
        this.i = b;
        this.j = s48Var;
    }

    public final Object invoke(Object obj) {
        ypj ypjVar;
        byte b = this.i;
        s48 s48Var = this.j;
        switch (b) {
            case 0:
                u2m u2mVar = (u2m) obj;
                e48 e48Var = e48.a;
                e48 e48Var2 = e48.b;
                Object obj2 = null;
                if (u2mVar.c(e48Var, e48Var2)) {
                    mr4 mr4Var = s48Var.t.a.c;
                    if (mr4Var != null) {
                        obj2 = mr4Var.c;
                    }
                } else if (u2mVar.c(e48Var2, e48.c)) {
                    mr4 mr4Var2 = s48Var.u.a.c;
                    if (mr4Var2 != null) {
                        obj2 = mr4Var2.c;
                    }
                } else {
                    obj2 = o48.e;
                }
                return obj2 == null ? o48.e : obj2;
            default:
                u2m u2mVar2 = (u2m) obj;
                e48 e48Var3 = e48.a;
                e48 e48Var4 = e48.b;
                if (u2mVar2.c(e48Var3, e48Var4)) {
                    ypj ypjVar2 = s48Var.t.a.b;
                    return ypjVar2 != null ? ypjVar2.b : o48.d;
                }
                if (u2mVar2.c(e48Var4, e48.c) && (ypjVar = s48Var.u.a.b) != null) {
                    return ypjVar.b;
                }
                return o48.d;
        }
    }
}
