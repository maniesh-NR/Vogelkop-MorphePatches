package defpackage;

import android.widget.AbsListView;
import androidx.appcompat.widget.ListPopupWindow;

/* loaded from: classes.dex */
public final class oic implements AbsListView.OnScrollListener {
    public final /* synthetic */ ListPopupWindow a;

    public oic(ListPopupWindow listPopupWindow) {
        this.a = listPopupWindow;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        ListPopupWindow listPopupWindow = this.a;
        nic nicVar = listPopupWindow.t;
        if (i != 1 || listPopupWindow.B.getInputMethodMode() == 2 || listPopupWindow.B.getContentView() == null) {
            return;
        }
        listPopupWindow.x.removeCallbacks(nicVar);
        nicVar.run();
    }
}
