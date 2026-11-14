package defpackage;

import androidx.appcompat.widget.ActionBarContextView;

/* loaded from: classes.dex */
public final class e3 implements o8n {
    public boolean a = false;
    public byte b;
    public final /* synthetic */ ActionBarContextView c;

    public e3(ActionBarContextView actionBarContextView) {
        this.c = actionBarContextView;
    }

    public final void d() {
        this.a = true;
    }

    public final void f() {
        super/*android.view.View*/.setVisibility(0);
        this.a = false;
    }

    public final void g() {
        if (this.a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.c;
        actionBarContextView.f = null;
        super/*android.view.View*/.setVisibility(this.b);
    }
}
