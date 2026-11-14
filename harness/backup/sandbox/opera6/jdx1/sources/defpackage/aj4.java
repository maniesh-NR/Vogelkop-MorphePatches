package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes.dex */
public final class aj4 implements xb4 {
    public final /* synthetic */ rj4 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public aj4(rj4 rj4Var, int i, int i2) {
        this.a = rj4Var;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.xb4
    public final ListenableFuture a() {
        rj4 rj4Var = this.a;
        a64 a64Var = rj4Var.e.a;
        int i = this.b;
        int i2 = this.c;
        l94 l94Var = new l94();
        l94Var.c = new byh();
        o94 o94Var = new o94(l94Var);
        l94Var.b = o94Var;
        l94Var.a = zi4.class;
        try {
            l94Var.a = na2.B(a64Var, null, null, new xi4(l94Var, null, rj4Var, i, i2, (byte) 1), 3);
            return o94Var;
        } catch (Exception e) {
            o94Var.a(e);
            return o94Var;
        }
    }

    @Override // defpackage.xb4
    public final ListenableFuture b() {
        rj4 rj4Var = this.a;
        a64 a64Var = rj4Var.e.a;
        int i = this.b;
        int i2 = this.c;
        l94 l94Var = new l94();
        l94Var.c = new byh();
        o94 o94Var = new o94(l94Var);
        l94Var.b = o94Var;
        l94Var.a = yi4.class;
        try {
            l94Var.a = na2.B(a64Var, null, null, new xi4(l94Var, null, rj4Var, i, i2, (byte) 0), 3);
            return o94Var;
        } catch (Exception e) {
            o94Var.a(e);
            return o94Var;
        }
    }
}
