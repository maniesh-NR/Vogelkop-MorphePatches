package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class olc extends nt5 {
    public wlc t;
    public ArrayList u;
    public /* synthetic */ Object v;
    public final /* synthetic */ wlc w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olc(wlc wlcVar, mt5 mt5Var) {
        super(mt5Var);
        this.w = wlcVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return wlc.a(this.w, null, this);
    }
}
