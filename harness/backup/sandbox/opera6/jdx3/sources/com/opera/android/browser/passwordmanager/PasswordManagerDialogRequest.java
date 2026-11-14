package com.opera.android.browser.passwordmanager;

import J.N;
import android.content.Context;
import androidx.annotation.NonNull;
import com.opera.android.OperaApplication;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.browser.dialog.DialogDelegate;
import defpackage.dx3;
import defpackage.eej;
import defpackage.glj;
import defpackage.lld;
import defpackage.qp2;
import defpackage.rxh;
import defpackage.sxh;
import defpackage.v4g;
import defpackage.x56;
import defpackage.x5f;
import defpackage.zpa;

/* loaded from: classes.dex */
public final class PasswordManagerDialogRequest {
    public final Context a;
    public final DialogDelegate b;
    public final eej c;
    public v4g d;
    public long e;

    /* JADX WARN: Multi-variable type inference failed */
    public PasswordManagerDialogRequest(long j, dx3 dx3Var, DialogDelegate dialogDelegate, eej eejVar) {
        this.a = dx3Var.getApplicationContext();
        this.b = dialogDelegate;
        this.c = eejVar;
        this.e = j;
    }

    @NonNull
    public static PasswordManagerDialogRequest create(long j, @NonNull ChromiumContent chromiumContent) {
        dx3 dx3VarC = chromiumContent.c();
        DialogDelegate dialogDelegate = chromiumContent.p;
        eej eejVar = chromiumContent.G;
        if (eejVar != null) {
            return new PasswordManagerDialogRequest(j, dx3VarC, dialogDelegate, eejVar);
        }
        qp2.n("Error");
        return null;
    }

    public final void destroy() {
        v4g v4gVar = this.d;
        if (v4gVar != null) {
            this.d = null;
            v4gVar.finish(hjm.b);
        }
        this.e = 0L;
    }

    public final void showRememberPasswordDialog() {
        String[] strArr = OperaApplication.K;
        Context context = this.a;
        if (((OperaApplication) context.getApplicationContext()).J().i("password_manager_autosave")) {
            this.b.e(new glj(new sxh(2132020322, new Object[]{new rxh(2132017591)}), 2500));
            N.M1EqC_CK(this.e, true);
            return;
        }
        v4g v4gVar = this.d;
        if (v4gVar != null) {
            this.d = null;
            v4gVar.finish(hjm.b);
        }
        this.d = this.c.a(((OperaApplication) context.getApplicationContext()).N(), new lld(this, (byte) 12), false);
        x5f x5fVar = ((OperaApplication) context.getApplicationContext()).L().c;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            x56VarF.H(zpaVar).x(zpaVar).d(0, 1);
            x5fVar.U0(x56VarF);
        }
    }

    public final void showReplacePasswordDialog() {
        v4g v4gVar = this.d;
        if (v4gVar != null) {
            this.d = null;
            v4gVar.finish(hjm.b);
        }
        String[] strArr = OperaApplication.K;
        this.d = this.c.a(((OperaApplication) this.a.getApplicationContext()).N(), new lld(this, (byte) 12), true);
    }
}
