package com.opera.android.bar;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.dll;
import defpackage.iec;
import defpackage.lzb;
import defpackage.q9n;
import defpackage.u43;
import defpackage.u8n;

/* loaded from: classes.dex */
public class LimitedSideActionsAppbar extends u43 {
    public static final /* synthetic */ int e = 0;
    public final iec d;

    public LimitedSideActionsAppbar(@NonNull Context context, @Nullable AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(2131165311);
        setPaddingRelative(getPaddingStart(), dimensionPixelSize, getPaddingEnd(), dimensionPixelSize);
        setWillNotDraw(false);
        iec iecVar = new iec(this, resources);
        this.d = iecVar;
        if (isInEditMode()) {
            return;
        }
        setBackground(iecVar);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        lzb lzbVar = new lzb(this, (byte) 2);
        dll dllVarS = q9n.s(this);
        if (dllVarS != null) {
            u8n.b(dllVarS, this, lzbVar);
        }
        lzbVar.a(this);
    }
}
