package defpackage;

import android.os.Trace;
import android.view.MotionEvent;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class n31 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v31 b;

    public /* synthetic */ n31(v31 v31Var, byte b) {
        this.a = b;
        this.b = v31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        v31 v31Var = this.b;
        switch (b) {
            case 0:
                i72 i72Var = v31Var.h;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!i72Var.isEmpty()) {
                    try {
                        ((Function0) i72Var.removeLast()).invoke();
                    } finally {
                        Trace.endSection();
                    }
                }
                return;
            case 1:
                v31Var.w0 = false;
                MotionEvent motionEvent = v31Var.m0;
                if (motionEvent.getActionMasked() == 10) {
                    v31Var.O(motionEvent);
                    return;
                } else {
                    qp2.n("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 2:
                v31.q(v31Var.r);
                return;
            default:
                v31.q(v31Var.r);
                return;
        }
    }
}
