package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class k62 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s62 b;

    public /* synthetic */ k62(s62 s62Var, byte b) {
        this.a = b;
        this.b = s62Var;
    }

    public final Object invoke() {
        byte b = this.a;
        s62 s62Var = this.b;
        switch (b) {
            case 0:
                return s62Var.f();
            case 1:
                return s62Var.f();
            case 2:
                return new uyj(s62Var.b.c(), vml.d);
            case 3:
                return b8h.d(xf8.Y((Object) null, s62Var.s, s62Var.t, new ve5(s62Var)));
            default:
                return new rni(s62Var.b.c(), s62Var.o);
        }
    }
}
