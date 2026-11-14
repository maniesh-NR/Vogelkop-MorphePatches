package defpackage;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class zz5 extends ca3 implements View.OnFocusChangeListener, TextView.OnEditorActionListener {
    public final /* synthetic */ a06 b;

    public zz5(a06 a06Var) {
        super((byte) 0);
        this.b = a06Var;
    }

    @Override // defpackage.ca3, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        a06 a06Var = this.b;
        a06Var.s.d.setEnabled(a06Var.H0(false));
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6 && (keyEvent == null || keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
            return false;
        }
        a06 a06Var = this.b;
        a06Var.s.d.setEnabled(a06Var.H0(false));
        l5b l5bVar = q9n.c;
        q9n.u(a06Var.getView());
        return true;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            return;
        }
        a06 a06Var = this.b;
        a06Var.s.d.setEnabled(a06Var.H0(false));
    }
}
