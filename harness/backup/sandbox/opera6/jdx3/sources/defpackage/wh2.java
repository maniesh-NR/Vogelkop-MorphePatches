package defpackage;

import android.content.Context;
import com.opera.android.autofill.AutofillManager;

/* loaded from: classes.dex */
public final class wh2 extends lj2 {
    public final hjf i;
    public final AutofillManager j;

    public wh2(hjf hjfVar, AutofillManager autofillManager) {
        this.i = hjfVar;
        this.j = autofillManager;
    }

    @Override // defpackage.lj2
    public final void c(Context context, zy9 zy9Var, Runnable runnable) {
        this.j.e(new ab(new a32((Object) context, (Object) zy9Var, (Object) runnable, (byte) 1), (byte) 20));
    }
}
