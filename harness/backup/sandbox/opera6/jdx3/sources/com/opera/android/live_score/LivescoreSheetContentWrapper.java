package com.opera.android.live_score;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.opera.android.webcore.FastResizeWebViewContainer;
import defpackage.gej;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/opera/android/live_score/LivescoreSheetContentWrapper;", "Lgej;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LivescoreSheetContentWrapper extends gej {
    public LivescoreSheetContentWrapper(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.gej
    public final void a(int i, View view) {
        FastResizeWebViewContainer fastResizeWebViewContainer = (FastResizeWebViewContainer) ((LivescoreSheetLayoutSwitcher) view).getChildAt(0);
        if (i > fastResizeWebViewContainer.h) {
            fastResizeWebViewContainer.h = i;
            zll zllVar = fastResizeWebViewContainer.c;
            if (zllVar != null) {
                p37.l0(i, zllVar);
            }
        }
    }
}
