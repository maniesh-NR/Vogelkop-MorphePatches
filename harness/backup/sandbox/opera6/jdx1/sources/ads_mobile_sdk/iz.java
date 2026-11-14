package ads_mobile_sdk;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class iz extends nt5 {
    public vz a;
    public Object b;
    public pfe c;
    public vz d;
    public Bundle e;
    public boolean f;
    public /* synthetic */ Object g;
    public final /* synthetic */ vz h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz(vz vzVar, nt5 nt5Var) {
        super(nt5Var);
        this.h = vzVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= LinearLayoutManager.INVALID_OFFSET;
        return vz.a(this.h, false, false, (nt5) this);
    }
}
