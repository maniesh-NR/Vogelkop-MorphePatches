package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final class pl9 implements a5n {
    public final LinearLayout a;
    public final OperaListItem b;
    public final OperaListItem c;
    public final OperaListItem d;
    public final OperaListItem e;

    public pl9(LinearLayout linearLayout, OperaListItem operaListItem, OperaListItem operaListItem2, OperaListItem operaListItem3, OperaListItem operaListItem4) {
        this.a = linearLayout;
        this.b = operaListItem;
        this.c = operaListItem2;
        this.d = operaListItem3;
        this.e = operaListItem4;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        return this.a;
    }
}
