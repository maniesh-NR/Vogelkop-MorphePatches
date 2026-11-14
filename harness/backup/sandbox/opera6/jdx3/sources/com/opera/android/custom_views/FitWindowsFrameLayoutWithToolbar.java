package com.opera.android.custom_views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.bm8;
import java.util.WeakHashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/opera/android/custom_views/FitWindowsFrameLayoutWithToolbar;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FitWindowsFrameLayoutWithToolbar extends FrameLayout {
    public static final /* synthetic */ int c = 0;
    public int a;
    public View b;

    public FitWindowsFrameLayoutWithToolbar(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        bm8 bm8Var = new bm8(this, (byte) 6);
        WeakHashMap weakHashMap = r5n.a;
        h5n.c(this, bm8Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = findViewById(2131364795);
        this.b = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setPadding(0, this.a, 0, 0);
        }
    }
}
