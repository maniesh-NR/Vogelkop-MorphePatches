package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ts2 extends nt5 {
    public vs2 a;
    public Function1 b;
    public pfe c;
    public /* synthetic */ Object d;
    public final /* synthetic */ vs2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts2(vs2 vs2Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = vs2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return this.e.a$1(null, this);
    }
}
