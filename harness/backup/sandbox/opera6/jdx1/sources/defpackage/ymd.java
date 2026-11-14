package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.i;
import androidx.mediarouter.app.d;

/* loaded from: classes.dex */
public class ymd extends i {
    public final boolean a = false;
    public zp1 b;
    public vnd c;

    public ymd() {
        setCancelable(true);
    }

    public d g0(Context context) {
        return new d(context);
    }

    public final void h0(vnd vndVar) {
        if (vndVar == null) {
            qp2.o("selector must not be null");
            return;
        }
        vnd vndVar2 = this.c;
        if (vndVar2 == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.c = vnd.b(arguments.getBundle("selector"));
            }
            vndVar2 = this.c;
            if (vndVar2 == null) {
                vndVar2 = vnd.c;
                this.c = vndVar2;
            }
        }
        if (vndVar2.equals(vndVar)) {
            return;
        }
        this.c = vndVar;
        Bundle arguments2 = getArguments();
        if (arguments2 == null) {
            arguments2 = new Bundle();
        }
        arguments2.putBundle("selector", vndVar.a);
        setArguments(arguments2);
        zp1 zp1Var = this.b;
        if (zp1Var == null || !this.a) {
            return;
        }
        ((ond) zp1Var).j(vndVar);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws Resources.NotFoundException {
        super.onConfigurationChanged(configuration);
        zp1 zp1Var = this.b;
        if (zp1Var != null) {
            if (this.a) {
                ((ond) zp1Var).k();
            } else {
                ((d) zp1Var).t();
            }
        }
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.a) {
            ond ondVar = new ond(getContext());
            this.b = ondVar;
            ondVar.j(this.c);
        } else {
            this.b = g0(getContext());
        }
        return this.b;
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        zp1 zp1Var = this.b;
        if (zp1Var == null || this.a) {
            return;
        }
        ((d) zp1Var).k(false);
    }
}
