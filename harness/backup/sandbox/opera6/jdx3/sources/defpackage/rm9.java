package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final class rm9 implements a5n {
    public final LinearLayout a;
    public final OperaListItem b;
    public final OperaListItem c;
    public final OperaListItem d;
    public final vs e;
    public final LinearLayout f;

    public rm9(LinearLayout linearLayout, OperaListItem operaListItem, OperaListItem operaListItem2, OperaListItem operaListItem3, vs vsVar, LinearLayout linearLayout2) {
        this.a = linearLayout;
        this.b = operaListItem;
        this.c = operaListItem2;
        this.d = operaListItem3;
        this.e = vsVar;
        this.f = linearLayout2;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        return this.a;
    }
}
