package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class uje implements View.OnClickListener, View.OnLongClickListener {
    public final /* synthetic */ ua7 a;

    public uje(ua7 ua7Var) {
        this.a = ua7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        new zp3((nwf) this.a.b, view.getId() == 2131362109, (byte) 2);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        new aq3((nwf) this.a.b, view, view.getId() == 2131362109, (byte) 2);
        return true;
    }
}
