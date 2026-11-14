package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class v13 extends l43 {
    public final fq j;
    public final List k;
    public ukh l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v13(String str, fq fqVar) {
        super(str);
        List listSingletonList = Collections.singletonList(fqVar);
        this.j = fqVar;
        this.k = listSingletonList;
    }

    @Override // defpackage.s83
    public final s83 b() {
        return this;
    }

    public final w13 e() {
        String str = this.a;
        if (str == null) {
            qp2.o("Ad unit ID cannot be null.");
            return null;
        }
        return new w13(str, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, false);
    }
}
