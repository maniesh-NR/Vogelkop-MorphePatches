package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class tm9 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;

    public /* synthetic */ tm9(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        byte b = this.a;
        View view2 = this.b;
        switch (b) {
            case 0:
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = r5n.a;
                view2.requestApplyInsets();
                break;
            default:
                view2.requestApplyInsets();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        byte b = this.a;
    }
}
