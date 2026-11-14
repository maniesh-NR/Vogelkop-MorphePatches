package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class fwi implements View.OnTouchListener {
    public final boolean a;
    public final jv b;

    public fwi(boolean z, jv jvVar) {
        this.a = z;
        this.b = jvVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int flags = motionEvent.getFlags() & 1;
        jv jvVar = this.b;
        if (flags != 0) {
            if (motionEvent.getAction() == 0) {
                jvVar.run();
                return true;
            }
        } else {
            if (!this.a || (motionEvent.getFlags() & 2) == 0) {
                return false;
            }
            if (motionEvent.getAction() == 0) {
                jvVar.run();
            }
        }
        return true;
    }
}
