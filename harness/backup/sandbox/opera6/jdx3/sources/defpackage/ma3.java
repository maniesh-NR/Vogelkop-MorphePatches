package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class ma3 implements View.OnTouchListener {
    public final /* synthetic */ byte a;

    public /* synthetic */ ma3(byte b) {
        this.a = b;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
            case 1:
                return true;
            default:
                if (motionEvent.getAction() != 1) {
                    return false;
                }
                q9n.u(view);
                return false;
        }
    }
}
