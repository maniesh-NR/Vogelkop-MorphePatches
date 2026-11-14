package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class drd extends e1g {
    public final boolean e;
    public final l08 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drd(boolean z) {
        super(52000);
        d9j[] d9jVarArr = d9j.a;
        this.e = z;
        this.f = l08.a;
    }

    @Override // defpackage.e1g, defpackage.t6j
    public final ix4 b(hx4 hx4Var) {
        if (!this.e) {
            hx4Var.b(3);
        }
        return super.b(hx4Var);
    }

    @Override // defpackage.v6j
    public final List d() {
        return this.f;
    }

    @Override // defpackage.e1g
    public final r6j g(int i) {
        return new r6j(i, new x6j(d8j.class, new nf8((byte) 14)), 2132021261, 2132021264, 2131232133, false, (Function1) new uvc((byte) 7), 96);
    }
}
