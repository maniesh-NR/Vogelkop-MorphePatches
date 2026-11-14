package defpackage;

import android.content.SharedPreferences;
import android.view.View;

/* loaded from: classes.dex */
public final class den implements kz3 {
    public boolean a = true;
    public final /* synthetic */ View b;
    public final /* synthetic */ een c;

    public den(een eenVar, View view) {
        this.b = view;
        this.c = eenVar;
    }

    @Override // defpackage.kz3
    public final void b(hjm hjmVar) {
        if (hjmVar == hjm.a) {
            nv6 nv6VarB = ru9.c(this.b.getContext()).b();
            SharedPreferences.Editor editor = (SharedPreferences.Editor) nv6VarB.a;
            editor.putBoolean("vpn.tooltip_premium.change_location_closed", true);
            editor.putLong("vpn.tooltip_premium.change_location_closed_timestamp", System.currentTimeMillis());
            nv6VarB.w();
            if (this.a) {
                dbf dbfVar = this.c.d.d.m;
                if (dbf.u(dbfVar.m)) {
                    return;
                }
                dbfVar.z(new s14(dbfVar.q, dbfVar.f, dbfVar.i, true, dbfVar.e));
            }
        }
    }

    @Override // defpackage.kz3
    public final void d() {
        this.a = false;
    }

    @Override // defpackage.kz3
    public final void g(lz3 lz3Var) {
        fen fenVar = this.c.d;
        fenVar.getClass();
        fenVar.g();
    }
}
