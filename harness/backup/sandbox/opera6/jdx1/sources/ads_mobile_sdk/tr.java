package ads_mobile_sdk;

import defpackage.wdp;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class tr extends q63 {
    public final sr f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tr(sr srVar, long j) {
        this(srVar, j, null);
        n63[] n63VarArr = n63.b;
        o43 o43Var = o43.a;
        j53 j53Var = j53.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public tr(sr srVar, long j, Function0 function0) {
        o43 o43Var = o43.b;
        n63[] n63VarArr = n63.b;
        super(j53.b, o43Var, j, function0);
        this.f = srVar;
    }

    @Override // ads_mobile_sdk.q63
    public final wdp b() {
        return this.f;
    }
}
