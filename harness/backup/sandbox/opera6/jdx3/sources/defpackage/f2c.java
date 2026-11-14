package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class f2c extends FrameLayout.LayoutParams implements m2c {
    public final n2c a;

    public f2c() {
        super(-1, -1);
        this.a = new n2c();
    }

    public f2c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new n2c(context, attributeSet);
    }

    public f2c(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = new n2c();
    }

    public f2c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.a = new n2c();
    }

    public f2c(FrameLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = new n2c();
    }

    public f2c(f2c f2cVar) {
        super((FrameLayout.LayoutParams) f2cVar);
        this.a = new n2c(f2cVar.a);
    }

    @Override // defpackage.m2c
    public final void a(View view, k2c k2cVar) {
        this.a.a(view, k2cVar);
    }
}
