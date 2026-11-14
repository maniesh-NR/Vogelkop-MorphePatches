package defpackage;

import J.N;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public abstract class o1e extends uim {
    public ProgressDialog d;
    public boolean e;

    public void i0() {
        l0(getString(2132021736));
    }

    public void j0() {
        if (this.e) {
            return;
        }
        n0();
        l0(getString(2132021775));
    }

    public void k0() {
        if (this.e) {
            return;
        }
        h0();
    }

    public abstract void l0(String str);

    public final void m0(CharSequence charSequence) {
        dxk dxkVar = getActivity().U;
        if (dxkVar == null) {
            dxkVar = null;
        }
        String string = charSequence.toString();
        dxkVar.getClass();
        if (N.MBL1GxRh(string)) {
            ((SharedPreferences) dxkVar.e.b.get()).edit().putInt("account_type", 2).apply();
            k0();
        } else {
            if (this.e) {
                return;
            }
            n0();
            i0();
        }
    }

    public final void n0() {
        ProgressDialog progressDialog = this.d;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.d.dismiss();
        }
        this.d = null;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super/*androidx.fragment.app.i*/.onDismiss(dialogInterface);
        n0();
        this.e = true;
    }
}
