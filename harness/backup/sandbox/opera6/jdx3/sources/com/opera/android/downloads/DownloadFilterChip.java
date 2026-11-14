package com.opera.android.downloads;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import com.opera.android.ui.catalog.widget.OperaChip;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/opera/android/downloads/DownloadFilterChip;", "Lcom/opera/android/ui/catalog/widget/OperaChip;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DownloadFilterChip extends OperaChip {
    public DownloadFilterChip(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public final void setChecked(boolean z) {
        super.setChecked(z);
        tx4 tx4Var = ((Chip) this).e;
        if (tx4Var != null) {
            tx4Var.T(z);
        }
        i();
        boolean z2 = !z;
        if (tx4Var != null) {
            tx4Var.Q(z2);
        }
    }
}
