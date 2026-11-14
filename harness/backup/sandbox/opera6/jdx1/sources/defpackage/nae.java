package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class nae implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p04 b;

    public /* synthetic */ nae(p04 p04Var, byte b) {
        this.a = b;
        this.b = p04Var;
    }

    public final Object invoke() {
        byte b = this.a;
        p04 p04Var = this.b;
        switch (b) {
            case 0:
                return (oae) os4.a(p04Var.v());
            default:
                return (bzl) os4.a(p04Var.v());
        }
    }
}
