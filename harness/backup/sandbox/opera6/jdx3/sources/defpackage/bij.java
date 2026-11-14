package defpackage;

import com.opera.android.BrowserActivity;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class bij implements cdb {
    public static final /* synthetic */ int b = 0;
    public final BrowserActivity a;

    static {
        int i = BrowserActivity.E1;
    }

    public bij(BrowserActivity browserActivity) {
        this.a = browserActivity;
    }

    @Override // defpackage.cdb
    public final void execute() {
        na2.B(cqp.V(this.a.getLifecycle()), (CoroutineContext) null, (rx5) null, new agb((byte) 24, null, this), 3);
    }
}
