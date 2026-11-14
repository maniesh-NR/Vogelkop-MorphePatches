package com.opera.android.suggestion.adapter;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.pvb;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/opera/android/suggestion/adapter/SuggestionListActionItem;", "Landroid/widget/FrameLayout;", "Lpvb;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuggestionListActionItem extends FrameLayout implements pvb {
    public static final int[] b = {R.attr.state_focused};
    public boolean a;

    public SuggestionListActionItem(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
    }

    @Override // defpackage.pvb
    public final boolean a() {
        return false;
    }

    @Override // defpackage.pvb
    public final String c() {
        return "";
    }

    @Override // defpackage.pvb
    public final void f() {
        performClick();
    }

    @Override // defpackage.pvb
    public final View getView() {
        return this;
    }

    @Override // defpackage.pvb
    public final void h(boolean z) {
        setSelected(z);
    }

    @Override // defpackage.pvb
    /* renamed from: j, reason: from getter */
    public final boolean getA() {
        return this.a;
    }

    @Override // defpackage.pvb
    public final i1 m() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return isSelected() ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), b) : super.onCreateDrawableState(i);
    }
}
