package defpackage;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final /* synthetic */ class e9g implements vlf, la {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ e9g(Object obj, int i) {
        this.b = obj;
        this.a = i;
    }

    public final boolean k(View view) {
        ((SideSheetBehavior) this.b).x(this.a);
        return true;
    }

    @Override // defpackage.vlf
    public final void u(OperaListItem operaListItem, boolean z) {
        String str = (String) this.b;
        byte b = this.a;
        if (z) {
            hj.b(b, 0, str, false);
        } else {
            hj.b(0, b, str, false);
        }
    }
}
