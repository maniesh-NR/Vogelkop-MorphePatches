package com.opera.android.leanplum;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.opera.android.widget.LottieAnimationView;
import defpackage.ks3;
import defpackage.sko;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/opera/android/leanplum/ErrorReportingLottieAnimationView;", "Lcom/opera/android/widget/LottieAnimationView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ErrorReportingLottieAnimationView extends LottieAnimationView {
    public boolean t;

    public ErrorReportingLottieAnimationView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.opera.android.widget.LottieAnimationView
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Exception e) {
            if (this.t) {
                return;
            }
            this.t = true;
            ks3.B(sko.j("Lottie draw exception: ", e.getMessage()), "composition: " + ((n2d) this).m);
        }
    }
}
