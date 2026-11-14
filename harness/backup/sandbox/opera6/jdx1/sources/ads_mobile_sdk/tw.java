package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.prb;

/* loaded from: classes.dex */
public final class tw extends nt5 {
    public lx a;
    public prb b;
    public pfe c;
    public /* synthetic */ Object d;
    public final /* synthetic */ lx e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw(lx lxVar, nt5 nt5Var) {
        super(nt5Var);
        this.e = lxVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return this.e.a$1(null, this);
    }
}
