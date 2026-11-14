package defpackage;

import android.content.Context;
import androidx.appcompat.widget.ListPopupWindow;

/* loaded from: classes.dex */
public final class hud extends ListPopupWindow {
    public eme C;

    @Override // androidx.appcompat.widget.ListPopupWindow
    public final im7 n(Context context, boolean z) {
        gud gudVar = new gud(context, z);
        gudVar.o = this;
        return gudVar;
    }
}
