package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class i48 extends ozb implements Function1 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ x48 j;
    public final /* synthetic */ vh8 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i48(x48 x48Var, vh8 vh8Var, byte b) {
        super(1);
        this.i = b;
        this.j = x48Var;
        this.k = vh8Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.i;
        vh8 vh8Var = this.k;
        x48 x48Var = this.j;
        switch (b) {
            case 0:
                u2m u2mVar = (u2m) obj;
                e48 e48Var = e48.a;
                e48 e48Var2 = e48.b;
                if (!u2mVar.c(e48Var, e48Var2)) {
                    if (!u2mVar.c(e48Var2, e48.c)) {
                        break;
                    } else {
                        co8 co8Var = vh8Var.a.a;
                        if (co8Var == null || (r3 = co8Var.b) == null) {
                            break;
                        }
                    }
                } else {
                    co8 co8Var2 = x48Var.a.a;
                    if (co8Var2 == null || (r3 = co8Var2.b) == null) {
                        break;
                    }
                }
                break;
            default:
                u2m u2mVar2 = (u2m) obj;
                e48 e48Var3 = e48.a;
                e48 e48Var4 = e48.b;
                if (!u2mVar2.c(e48Var3, e48Var4)) {
                    if (u2mVar2.c(e48Var4, e48.c) && (r3 = vh8Var.a.d) != null) {
                        break;
                    }
                } else {
                    mli mliVar = x48Var.a.d;
                    if (mliVar == null) {
                        break;
                    } else {
                        break;
                    }
                }
                break;
        }
        return o48.b;
    }
}
