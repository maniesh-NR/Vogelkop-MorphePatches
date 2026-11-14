package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class xk extends dx4 {
    public final uj g;
    public final uj h;
    public final List i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk(uj ujVar, uj ujVar2) {
        super(25000);
        d9j[] d9jVarArr = d9j.a;
        this.g = ujVar;
        this.h = ujVar2;
        this.i = Arrays.asList(ujVar, ujVar2);
    }

    @Override // defpackage.ex4, defpackage.v6j
    public final List d() {
        return this.i;
    }
}
