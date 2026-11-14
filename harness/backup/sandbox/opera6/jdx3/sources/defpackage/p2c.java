package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class p2c extends ViewGroup.MarginLayoutParams implements m2c {
    public final n2c a;

    public p2c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new n2c(context, attributeSet);
    }

    @Override // defpackage.m2c
    public final void a(View view, k2c k2cVar) {
        this.a.a(view, k2cVar);
    }
}
