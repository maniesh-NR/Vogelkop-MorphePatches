package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.opera.android.InputFilterFrameLayout;

/* loaded from: classes.dex */
public final /* synthetic */ class v8b implements View.OnGenericMotionListener {
    @Override // android.view.View.OnGenericMotionListener
    public final boolean onGenericMotion(View view, MotionEvent motionEvent) {
        return InputFilterFrameLayout.d(motionEvent);
    }
}
