package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class dcf implements OnBackAnimationCallback {
    public final /* synthetic */ ecf a;

    public dcf(ecf ecfVar) {
        this.a = ecfVar;
    }

    public final void onBackCancelled() {
        this.a.a();
    }

    public final void onBackInvoked() {
        this.a.b();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        this.a.c(u8.a(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        wje wjeVarA = u8.a(backEvent);
        ecf ecfVar = this.a;
        xje xjeVar = ecfVar.a;
        if (xjeVar == null) {
            qp2.n("This input is not added to any dispatcher.");
        } else {
            if (ecfVar.b) {
                return;
            }
            xjeVar.d(ecfVar, wjeVarA);
            ecfVar.b = true;
        }
    }
}
