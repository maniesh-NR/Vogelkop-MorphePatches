package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class stm extends t7j {
    public final ta7 j;
    public final s9i k;
    public final g93 l;
    public final Context m;
    public final x5f n;
    public final x5f o;

    public stm(Context context, ta7 ta7Var, tm5 tm5Var, s9i s9iVar, g93 g93Var, x5f x5fVar, x5f x5fVar2) {
        super(tm5Var);
        this.m = context.getApplicationContext();
        this.j = ta7Var;
        this.k = s9iVar;
        this.l = g93Var;
        this.n = x5fVar;
        this.o = x5fVar2;
    }

    @Override // defpackage.t7j
    public final k7j a(isd isdVar) {
        return new rtm(this, isdVar);
    }
}
