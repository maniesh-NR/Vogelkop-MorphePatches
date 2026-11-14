package ads_mobile_sdk;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.fq;

/* loaded from: classes.dex */
public final class py2 extends nt5 {
    public sy2 a;
    public Object b;
    public pfe c;
    public /* synthetic */ Object d;
    public final /* synthetic */ sy2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py2(sy2 sy2Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = sy2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return this.e.a((Bundle) null, (Bundle) null, (fq) null, (String) null, (String) null, this);
    }
}
