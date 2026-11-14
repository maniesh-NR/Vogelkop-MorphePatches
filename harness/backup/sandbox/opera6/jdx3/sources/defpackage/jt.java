package defpackage;

import android.view.View;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final class jt implements a5n {
    public final /* synthetic */ byte a;
    public final OperaListItem b;

    public /* synthetic */ jt(OperaListItem operaListItem, byte b) {
        this.a = b;
        this.b = operaListItem;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        byte b = this.a;
        return this.b;
    }
}
