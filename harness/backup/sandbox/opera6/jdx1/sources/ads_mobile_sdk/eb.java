package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.on;
import java.io.Closeable;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class eb extends nt5 {
    public sb a;
    public Object b;
    public Object c;
    public Closeable d;
    public Object e;
    public Serializable f;
    public Object g;
    public pfe h;
    public /* synthetic */ Object k;
    public final /* synthetic */ sb l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(sb sbVar, nt5 nt5Var) {
        super(nt5Var);
        this.l = sbVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= LinearLayoutManager.INVALID_OFFSET;
        return sb.a(this.l, (on) null, this);
    }
}
