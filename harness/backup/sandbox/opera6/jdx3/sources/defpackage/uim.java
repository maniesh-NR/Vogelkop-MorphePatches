package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.opera.android.OperaApplication;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class uim extends aq1 implements rim {
    public tim b;
    public final bxl a = new bxl(this);
    public hjm c = hjm.b;

    public Dialog g0(Bundle bundle) {
        return super.onCreateDialog(bundle);
    }

    public final void h0() {
        this.c = hjm.a;
        dismiss();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.c = hjm.b;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogG0 = g0(bundle);
        u8n.e(dialogG0);
        Context context = dialogG0.getContext();
        String[] strArr = OperaApplication.K;
        ((OperaApplication) context.getApplicationContext()).B().a(dialogG0);
        o0g.N0(dialogG0);
        dialogG0.setOnKeyListener(new sim());
        View decorView = dialogG0.getWindow().getDecorView();
        WeakHashMap weakHashMap = r5n.a;
        m5n.a(decorView, this.a);
        q9n.i(dialogG0.getWindow().getDecorView());
        return dialogG0;
    }

    public void onDestroy() {
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        tim timVar = this.b;
        if (timVar != null) {
            timVar.finish(this.c);
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnKeyListener(null);
            View decorView = dialog.getWindow().getDecorView();
            WeakHashMap weakHashMap = r5n.a;
            m5n.e(decorView, this.a);
        }
    }
}
