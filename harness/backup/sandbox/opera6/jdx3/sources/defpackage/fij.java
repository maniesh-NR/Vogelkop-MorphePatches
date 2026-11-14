package defpackage;

import com.opera.android.BrowserActivity;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class fij implements cdb {
    public final BrowserActivity a;
    public final String b;
    public final int c;
    public final ltg d;

    static {
        int i = BrowserActivity.E1;
    }

    public fij(BrowserActivity browserActivity, String str, int i, ltg ltgVar) {
        this.a = browserActivity;
        this.b = str;
        this.c = i;
        this.d = ltgVar;
    }

    @Override // defpackage.cdb
    public final void execute() {
        if (this.b.equals("DEFAULT")) {
            na2.B(cqp.V(this.a.getLifecycle()), (CoroutineContext) null, (rx5) null, new agb((byte) 25, null, this), 3);
        }
    }
}
