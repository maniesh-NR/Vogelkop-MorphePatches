package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.i;

/* loaded from: classes.dex */
public class omd extends i {
    public final boolean a = false;
    public zp1 b;
    public vnd c;

    public omd() {
        setCancelable(true);
    }

    public final void g0() {
        if (this.c == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.c = vnd.b(arguments.getBundle("selector"));
            }
            if (this.c == null) {
                this.c = vnd.c;
            }
        }
    }

    public nmd h0(Context context) {
        return new nmd(context, 0);
    }

    public final void i0(vnd vndVar) {
        if (vndVar == null) {
            qp2.o("selector must not be null");
            return;
        }
        g0();
        if (this.c.equals(vndVar)) {
            return;
        }
        this.c = vndVar;
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBundle("selector", vndVar.a);
        setArguments(arguments);
        zp1 zp1Var = this.b;
        if (zp1Var != null) {
            if (this.a) {
                ((hnd) zp1Var).g(vndVar);
            } else {
                ((nmd) zp1Var).h(vndVar);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        zp1 zp1Var = this.b;
        if (zp1Var == null) {
            return;
        }
        if (!this.a) {
            nmd nmdVar = (nmd) zp1Var;
            nmdVar.getWindow().setLayout(wxe.B(nmdVar.getContext()), -2);
        } else {
            hnd hndVar = (hnd) zp1Var;
            Context context = hndVar.i;
            hndVar.getWindow().setLayout(!context.getResources().getBoolean(2131034127) ? -1 : wxe.B(context), context.getResources().getBoolean(2131034127) ? -2 : -1);
        }
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.a) {
            hnd hndVar = new hnd(getContext());
            this.b = hndVar;
            g0();
            hndVar.g(this.c);
        } else {
            nmd nmdVarH0 = h0(getContext());
            this.b = nmdVarH0;
            g0();
            nmdVarH0.h(this.c);
        }
        return this.b;
    }
}
