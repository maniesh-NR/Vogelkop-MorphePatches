package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class g93 extends t7j {
    public final Context j;
    public final ta7 k;
    public final s9i l;
    public final p1c m;
    public final fue n;
    public final vx o;
    public final jtg p;
    public final esk q;
    public final oue r;
    public boolean s;

    public g93(Context context, fue fueVar, ta7 ta7Var, tm5 tm5Var, s9i s9iVar, p1c p1cVar, vx vxVar, jtg jtgVar, esk eskVar, oue oueVar) {
        super(tm5Var);
        this.j = context.getApplicationContext();
        this.n = fueVar;
        this.k = ta7Var;
        this.l = s9iVar;
        this.m = p1cVar;
        this.o = vxVar;
        this.p = jtgVar;
        this.q = eskVar;
        this.r = oueVar;
    }

    @Override // defpackage.t7j
    public final k7j a(isd isdVar) {
        return new f93(this, isdVar);
    }
}
