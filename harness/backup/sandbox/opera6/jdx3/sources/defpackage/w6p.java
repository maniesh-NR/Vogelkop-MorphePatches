package defpackage;

import android.view.View;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class w6p implements View.OnAttachStateChangeListener {
    public boolean a;
    public final /* synthetic */ o7p b;

    public w6p(o7p o7pVar) {
        this.b = o7pVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        p7p p7pVar;
        if (!this.a) {
            this.a = true;
            if (this.b.e.d && (p7pVar = this.b.i) != null) {
                LinkedHashSet linkedHashSet = p7p.c;
                p7pVar.g(1019, null);
            }
        }
        this.b.i(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.i(false);
    }
}
