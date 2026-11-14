package defpackage;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class zp1 extends ce5 implements kp1 {
    public xp1 e;
    public final yp1 f;

    public zp1(Context context, int i) {
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(2130969525, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        super(context, i2);
        this.f = new yp1(this);
        pp1 pp1VarD = d();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(2130969525, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((xp1) pp1VarD).S = i;
        pp1VarD.d();
    }

    @Override // defpackage.ce5, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        xp1 xp1Var = (xp1) d();
        xp1Var.w();
        ((ViewGroup) xp1Var.A.findViewById(R.id.content)).addView(view, layoutParams);
        xp1Var.m.a(xp1Var.l.getCallback());
    }

    public final pp1 d() {
        xp1 xp1Var = this.e;
        if (xp1Var != null) {
            return xp1Var;
        }
        op1 op1Var = pp1.a;
        xp1 xp1Var2 = new xp1(getContext(), getWindow(), this, this);
        this.e = xp1Var2;
        return xp1Var2;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        d().e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        yp1 yp1Var = this.f;
        if (yp1Var == null) {
            return false;
        }
        return yp1Var.a.e(keyEvent);
    }

    public final boolean e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        xp1 xp1Var = (xp1) d();
        xp1Var.w();
        return xp1Var.l.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        d().b();
    }

    @Override // defpackage.ce5, android.app.Dialog
    public void onCreate(Bundle bundle) {
        xp1 xp1Var = (xp1) d();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(xp1Var.k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(xp1Var);
        } else {
            layoutInflaterFrom.getFactory2();
        }
        super.onCreate(bundle);
        d().d();
    }

    @Override // defpackage.ce5, android.app.Dialog
    public void onStop() {
        super.onStop();
        xp1 xp1Var = (xp1) d();
        xp1Var.B();
        gc gcVar = xp1Var.o;
        if (gcVar != null) {
            gcVar.q(false);
        }
    }

    @Override // defpackage.kp1
    public final void onSupportActionModeFinished(se seVar) {
    }

    @Override // defpackage.kp1
    public final void onSupportActionModeStarted(se seVar) {
    }

    @Override // defpackage.kp1
    public final se onWindowStartingSupportActionMode(re reVar) {
        return null;
    }

    @Override // defpackage.ce5, android.app.Dialog
    public void setContentView(int i) {
        b();
        d().h(i);
    }

    @Override // defpackage.ce5, android.app.Dialog
    public void setContentView(View view) {
        b();
        d().i(view);
    }

    @Override // defpackage.ce5, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        d().j(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        d().k(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().k(charSequence);
    }
}
