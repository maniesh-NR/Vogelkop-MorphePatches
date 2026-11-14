package defpackage;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class s5n implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d4 b;

    public /* synthetic */ s5n(d4 d4Var, byte b) {
        this.a = b;
        this.b = d4Var;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        byte b = this.a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        byte b = this.a;
        d4 d4Var = this.b;
        switch (b) {
            case 0:
                d4Var.e();
                break;
            default:
                ViewParent parent = d4Var.getParent();
                for (Object obj : parent == null ? u08.a : new ec7(new j3i(parent, (byte) 16), h7n.a, (byte) 1)) {
                    if (obj instanceof View) {
                        Object tag = ((View) obj).getTag(2131363235);
                        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                        if (bool != null ? bool.booleanValue() : false) {
                            break;
                        }
                    }
                }
                d4Var.e();
                break;
        }
    }
}
