package defpackage;

import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.ui.catalog.widget.OperaTextView;

/* loaded from: classes.dex */
public final class dmf extends bpd {
    public final /* synthetic */ OperaListItem e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmf(OperaListItem operaListItem, OperaTextView operaTextView) {
        super((byte) 28, operaListItem, operaTextView, false);
        this.e = operaListItem;
    }

    public final void V(pxh pxhVar) {
        super.V(pxhVar);
        int visibility = ((OperaTextView) ((bpd) this).b).getVisibility();
        OperaListItem operaListItem = this.e;
        if (visibility == 0) {
            OperaListItem.H(operaListItem, 1, 0, 2);
        } else {
            OperaListItem.H(operaListItem, 0, 1, 1);
        }
    }
}
