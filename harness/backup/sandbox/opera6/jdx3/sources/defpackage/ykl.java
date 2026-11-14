package defpackage;

import android.widget.PopupMenu;
import org.chromium.ui.widget.TextViewWithClickableSpans;

/* loaded from: classes.dex */
public final class ykl implements PopupMenu.OnDismissListener {
    public final /* synthetic */ TextViewWithClickableSpans a;

    public ykl(TextViewWithClickableSpans textViewWithClickableSpans) {
        this.a = textViewWithClickableSpans;
    }

    @Override // android.widget.PopupMenu.OnDismissListener
    public final void onDismiss(PopupMenu popupMenu) {
        this.a.h = null;
    }
}
