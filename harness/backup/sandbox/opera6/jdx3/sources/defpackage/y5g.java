package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class y5g extends dx4 {
    public final /* synthetic */ byte g = 0;
    public final List h;
    public final ex4 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5g(qte qteVar) {
        super(47000);
        d9j[] d9jVarArr = d9j.a;
        this.i = qteVar;
        this.h = Collections.singletonList(qteVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5g(uj ujVar) {
        super(23000);
        d9j[] d9jVarArr = d9j.a;
        this.i = ujVar;
        this.h = Collections.singletonList(ujVar);
    }

    @Override // defpackage.ex4, defpackage.v6j
    public final List d() {
        switch (this.g) {
        }
        return this.h;
    }

    @Override // defpackage.dx4
    public final r6j h(r6j r6jVar, int i) {
        switch (this.g) {
            case 0:
                return r6jVar.a(i, new x6j(jt2.class, new nf8((byte) 28)), 2132020339, 2131232172, true, new o5f(this, (byte) 23));
            default:
                return r6jVar.a(i, new x6j(syl.class, new sul((byte) 3)), 2132021457, 2131232281, true, new qfl(this, (byte) 11));
        }
    }
}
