package defpackage;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class rsl extends ViewGroup.MarginLayoutParams {
    public int a;
    public byte b;

    public rsl(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }

    public rsl(rsl rslVar) {
        super((ViewGroup.MarginLayoutParams) rslVar);
        this.a = 0;
        this.a = rslVar.a;
    }
}
