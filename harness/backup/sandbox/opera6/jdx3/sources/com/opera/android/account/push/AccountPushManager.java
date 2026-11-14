package com.opera.android.account.push;

import J.N;
import android.util.SparseArray;
import defpackage.c3j;
import defpackage.d3j;
import defpackage.e3j;
import defpackage.kze;
import defpackage.mo7;
import defpackage.sb;

/* loaded from: classes.dex */
public final class AccountPushManager implements mo7 {
    public final e3j b;
    public long d;
    public final kze a = new kze(sb.a);
    public final SparseArray c = new SparseArray();

    public AccountPushManager(e3j e3jVar) {
        this.b = e3jVar;
        c4 c4Var = new c4(this, (byte) 3);
        avj avjVar = cak.d;
        avj.g(1, c4Var);
    }

    public final ode a(int i) {
        SparseArray sparseArray = this.c;
        if (sparseArray.indexOfKey(i) >= 0) {
            return (ode) sparseArray.get(i);
        }
        ode odeVar = new ode();
        long j = this.d;
        if (j != 0) {
            odeVar.r(Boolean.valueOf(j == 0 ? false : N.M8mBEqh7(j, i)));
        }
        sparseArray.put(i, odeVar);
        return odeVar;
    }

    @Override // defpackage.mo7
    public final void o(boolean z) {
        c3j c3jVarD = ((d3j) this.b.i()).d(29, false);
        String str = c3jVarD == null ? "" : (String) c3jVarD.d;
        avj avjVar = cak.d;
        if (avj.b(1)) {
            N.Mk$Aqih3(str);
        }
    }

    public final void onDestroyed() {
        this.b.H(this);
        this.d = 0L;
        this.a.r(sb.c);
    }

    public final void onSenderRegistrationStateChanged(int i, boolean z) {
        a(i).r(Boolean.valueOf(z));
    }
}
