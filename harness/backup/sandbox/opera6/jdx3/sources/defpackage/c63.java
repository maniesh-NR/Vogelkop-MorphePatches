package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.i;

/* loaded from: classes.dex */
public abstract class c63 extends i {
    public final gjm a;
    public final qcf b;
    public Object c;
    public Object d;

    public c63(gjm gjmVar, qcf qcfVar, Object obj) {
        this.a = gjmVar;
        this.b = qcfVar;
        this.c = obj;
    }

    public abstract Dialog g0(Bundle bundle);

    public abstract Class h0();

    public void i0(boolean z) {
    }

    public final void j0(Object obj) {
        if (this.d != null) {
            return;
        }
        this.d = obj;
        this.a.h(h0(), obj);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super/*androidx.fragment.app.Fragment*/.onConfigurationChanged(configuration);
        Dialog dialog = getDialog();
        if (dialog != null) {
            i0(dialog.getContext().getResources().getConfiguration().screenHeightDp >= 500);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogG0 = g0(bundle);
        this.b.a(dialogG0);
        dialogG0.setOnShowListener(new kz0(this, dialogG0, (byte) 1));
        return dialogG0;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        j0(this.c);
    }
}
