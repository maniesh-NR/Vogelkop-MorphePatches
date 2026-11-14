package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class vfe implements View.OnTouchListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ GestureDetector b;

    public /* synthetic */ vfe(GestureDetector gestureDetector, byte b) {
        this.a = b;
        this.b = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        byte b = this.a;
        GestureDetector gestureDetector = this.b;
        switch (b) {
            case 0:
                return gestureDetector.onTouchEvent(motionEvent);
            case 1:
                return gestureDetector.onTouchEvent(motionEvent);
            default:
                gestureDetector.onTouchEvent(motionEvent);
                return false;
        }
    }
}
