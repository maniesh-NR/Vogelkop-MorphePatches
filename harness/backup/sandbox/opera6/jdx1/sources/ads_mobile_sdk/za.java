package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Set;

/* loaded from: classes.dex */
public final class za extends nt5 {
    public sb a;
    public Set b;
    public pfe c;
    public /* synthetic */ Object d;
    public final /* synthetic */ sb e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(sb sbVar, nt5 nt5Var) {
        super(nt5Var);
        this.e = sbVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return sb.a(this.e, (Set) null, this);
    }
}
