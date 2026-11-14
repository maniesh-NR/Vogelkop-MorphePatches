package defpackage;

import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class y12 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b22 b;

    public /* synthetic */ y12(b22 b22Var, byte b) {
        this.a = b;
        this.b = b22Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        b22 b22Var = this.b;
        switch (b) {
            case 0:
                b22Var.l.h(((tsn) obj).b);
                break;
            default:
                b22Var.v.startActivity((Intent) obj);
                break;
        }
        return Unit.a;
    }
}
