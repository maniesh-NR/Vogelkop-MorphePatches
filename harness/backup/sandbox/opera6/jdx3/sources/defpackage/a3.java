package defpackage;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public final class a3 extends e1g {
    public final Context e;
    public final l08 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(Context context) {
        super(3000);
        d9j[] d9jVarArr = d9j.a;
        this.e = context.getApplicationContext();
        this.f = l08.a;
    }

    @Override // defpackage.e1g, defpackage.t6j
    public final ix4 b(hx4 hx4Var) {
        if (((fom) hom.t(this.e).i()).b == null) {
            hx4Var.b(1);
        }
        return super.b(hx4Var);
    }

    @Override // defpackage.v6j
    public final List d() {
        return this.f;
    }
}
