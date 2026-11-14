package com.opera.android.ui.catalog.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/opera/android/ui/catalog/widget/OperaChip;", "Lcom/google/android/material/chip/Chip;", "catalog"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public class OperaChip extends Chip {
    public OperaChip(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public OperaChip(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, (i & 2) != 0 ? null : attributeSet, 2130969035);
    }
}
