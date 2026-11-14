package com.opera.android.suggestion;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.ui.catalog.widget.OperaChip;
import defpackage.lb4;
import defpackage.pvb;

/* loaded from: classes.dex */
public class CompactSuggestionChip extends OperaChip implements pvb {
    public lb4 A;

    public CompactSuggestionChip(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pvb
    public final String c() {
        return getText().toString();
    }

    @Override // defpackage.pvb
    public final void f() {
        lb4 lb4Var = this.A;
        if (lb4Var != null) {
            lb4Var.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pvb
    public final View getView() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pvb
    /* renamed from: j */
    public final boolean getA() {
        return getVisibility() == 0;
    }

    @Override // defpackage.pvb
    public final i1 m() {
        return null;
    }
}
