package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zh2 extends nt5 {
    public Object a;
    public ArrayList b;
    public pfe c;
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ xj2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh2(xj2 xj2Var, nt5 nt5Var) {
        super(nt5Var);
        this.f = xj2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return xj2.d(this.f, 0L, this);
    }
}
