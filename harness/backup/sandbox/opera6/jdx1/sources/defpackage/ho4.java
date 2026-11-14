package defpackage;

import J.N;
import android.view.KeyEvent;
import android.view.View;
import java.util.UUID;
import org.chromium.media.MediaDrmBridge;

/* loaded from: classes.dex */
public final /* synthetic */ class ho4 implements fjc, q5n, vid {
    public final /* synthetic */ byte a;

    public final void invoke(Object obj) {
        ((eig) obj).h(this.a);
    }

    @Override // defpackage.q5n
    public final boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
        return c37.r().l(this.a, keyEvent);
    }

    public final void run(long j) {
        UUID uuid = MediaDrmBridge.n;
        N.MnFVjzn2(j, this.a);
    }
}
