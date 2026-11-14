package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class lc2 extends nt5 {
    public sc2 a;
    public Pair b;
    public pfe c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ sc2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc2(sc2 sc2Var, nt5 nt5Var) {
        super(nt5Var);
        this.f = sc2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return sc2.a(this.f, (Pair) null, this);
    }
}
