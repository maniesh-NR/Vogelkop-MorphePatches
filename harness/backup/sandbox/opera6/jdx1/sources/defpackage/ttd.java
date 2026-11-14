package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class ttd extends FrameLayout implements j85 {
    public final CollapsibleActionView a;

    /* JADX WARN: Multi-variable type inference failed */
    public ttd(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // defpackage.j85
    public final void onActionViewCollapsed() {
        this.a.onActionViewCollapsed();
    }

    @Override // defpackage.j85
    public final void onActionViewExpanded() {
        this.a.onActionViewExpanded();
    }
}
