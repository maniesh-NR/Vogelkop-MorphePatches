package defpackage;

import android.content.Context;
import android.util.Pair;
import com.opera.android.OperaApplication;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class aco implements gfn, idc {
    public final Context a;
    public final z4k b;
    public final zv9 c;
    public final jg8 d;
    public gfn e;
    public int f;
    public zbo g;
    public byte h;
    public boolean i;
    public tcc j;
    public final /* synthetic */ w7j k;

    public aco(w7j w7jVar, Context context, z4k z4kVar, zv9 zv9Var, jg8 jg8Var) {
        this.k = w7jVar;
        this.a = context;
        this.b = z4kVar;
        this.c = zv9Var;
        this.d = jg8Var;
    }

    public final void E(ndc ndcVar, occ occVar) {
        if (occVar == occ.ON_DESTROY) {
            o(null);
        } else if (occVar == occ.ON_RESUME && this.h == 1) {
            n();
        }
    }

    @Override // defpackage.gfn
    public final gfn a(long j, String str, String str2) {
        gfn gfnVar = this.e;
        if (gfnVar != null) {
            gfnVar.a(j, str, str2);
            return this;
        }
        this.g = new zbo(str, str2, j);
        return this;
    }

    @Override // defpackage.gfn
    public final gfn b(bnk bnkVar, String str) {
        gfn gfnVar = this.e;
        if (gfnVar != null) {
            gfnVar.b(bnkVar, str);
        }
        return this;
    }

    @Override // defpackage.gfn
    public final gfn c(int i) {
        gfn gfnVar = this.e;
        if (gfnVar != null) {
            gfnVar.c(this.f);
            return this;
        }
        this.f = i;
        return this;
    }

    @Override // defpackage.gfn
    public final void d() {
        gfn gfnVar = this.e;
        if (gfnVar != null) {
            gfnVar.d();
        }
    }

    @Override // defpackage.gfn
    public final efn e() {
        gfn gfnVar = this.e;
        if (gfnVar != null) {
            return gfnVar.e();
        }
        return null;
    }

    @Override // defpackage.gfn
    public final String f(List list) {
        gfn gfnVar = this.e;
        if (gfnVar != null) {
            return gfnVar.f(list);
        }
        return null;
    }

    @Override // defpackage.gfn
    public final void g(Callback callback) {
        gfn gfnVar = this.e;
        if (gfnVar == null) {
            callback.run(null);
        } else {
            gfnVar.g(callback);
        }
    }

    @Override // defpackage.gfn
    public final int getProtocol() {
        gfn gfnVar = this.e;
        return gfnVar != null ? gfnVar.getProtocol() : this.f;
    }

    @Override // defpackage.gfn
    public final Pair h(List list) {
        gfn gfnVar = this.e;
        if (gfnVar == null) {
            return null;
        }
        return gfnVar.h(list);
    }

    @Override // defpackage.gfn
    public final void i() {
        gfn gfnVar = this.e;
        if (gfnVar != null) {
            gfnVar.i();
        }
    }

    @Override // defpackage.gfn
    public final boolean isEnabled() {
        gfn gfnVar = this.e;
        return gfnVar != null && gfnVar.isEnabled();
    }

    @Override // defpackage.gfn
    public final boolean j() {
        gfn gfnVar = this.e;
        return gfnVar != null && gfnVar.j();
    }

    @Override // defpackage.gfn
    public final Map k() {
        gfn gfnVar = this.e;
        if (gfnVar != null) {
            return gfnVar.k();
        }
        return null;
    }

    @Override // defpackage.gfn
    public final boolean l() {
        gfn gfnVar = this.e;
        return gfnVar != null ? gfnVar.l() : this.g != null;
    }

    public final void m(Integer num, boolean z) {
        byte b;
        if (z) {
            this.h = (byte) 3;
            o(null);
            return;
        }
        if ((num == null || num.intValue() != -5) && ((num == null || num.intValue() != -14) && (num == null || num.intValue() != -15))) {
            b = 1;
        } else {
            o(null);
            b = 4;
        }
        this.h = b;
    }

    public final void n() {
        if (this.h >= 2) {
            return;
        }
        qdc qdcVar = this.j;
        if ((qdcVar != null ? qdcVar.i : null) != qcc.e) {
            this.h = (byte) 1;
            return;
        }
        this.h = (byte) 2;
        String[] strArr = OperaApplication.K;
        r0k r0kVarK = ((OperaApplication) this.a.getApplicationContext()).K();
        wci wciVar = new wci();
        ((ArrayList) wciVar.b).add("nord_vpn");
        r0kVarK.i(new n9h(wciVar)).addOnSuccessListener(new vdi(this, r0kVarK, this.k, (byte) 16)).addOnFailureListener(new r2n((Object) this, (byte) 26));
    }

    public final void o(tcc tccVar) {
        tcc tccVar2 = this.j;
        if (tccVar2 != null) {
            tccVar2.b(this);
        }
        this.j = tccVar;
        if (tccVar != null) {
            tccVar.a(this);
        }
    }

    public final void p(Throwable th) {
        this.b.g(new ifn(hfn.FAILED_TO_INSTALL, th, true), false);
    }

    @Override // defpackage.gfn
    public final gfn setEnabled(boolean z) {
        gfn gfnVar = this.e;
        if (gfnVar != null) {
            gfnVar.setEnabled(z);
            return this;
        }
        this.i = z;
        if (z) {
            n();
        }
        return this;
    }
}
