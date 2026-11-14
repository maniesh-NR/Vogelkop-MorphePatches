package com.opera.android.suggestion;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import defpackage.lb4;
import defpackage.pvb;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/opera/android/suggestion/SuggestionButtonTargetView;", "Lpvb;", "Lcom/google/android/material/button/MaterialButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuggestionButtonTargetView extends MaterialButton implements pvb {
    public lb4 R;

    public SuggestionButtonTargetView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.pvb
    public final String c() {
        return "";
    }

    @Override // defpackage.pvb
    public final void f() {
        lb4 lb4Var = this.R;
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
