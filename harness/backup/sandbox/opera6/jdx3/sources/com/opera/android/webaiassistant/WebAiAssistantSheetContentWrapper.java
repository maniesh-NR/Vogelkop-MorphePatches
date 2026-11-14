package com.opera.android.webaiassistant;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.opera.android.webcore.FastResizeWebViewContainer;
import defpackage.aqn;
import defpackage.g7f;
import defpackage.gej;
import defpackage.i7f;
import defpackage.w6f;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/opera/android/webaiassistant/WebAiAssistantSheetContentWrapper;", "Lgej;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WebAiAssistantSheetContentWrapper extends gej implements w6f {
    public final i7f c;
    public int d;

    public WebAiAssistantSheetContentWrapper(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new i7f();
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        this.c.b((aqn) obj);
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        this.c.c((aqn) obj);
    }

    @Override // defpackage.gej
    public final void a(int i, View view) {
        FastResizeWebViewContainer fastResizeWebViewContainer = (FastResizeWebViewContainer) ((WebAiAssistantLayoutSwitcher) view).getChildAt(0);
        if (i > fastResizeWebViewContainer.h) {
            fastResizeWebViewContainer.h = i;
            zll zllVar = fastResizeWebViewContainer.c;
            if (zllVar != null) {
                p37.l0(i, zllVar);
            }
        }
    }

    @Override // defpackage.gej
    public final int b() {
        return getChildAt(0).getMeasuredHeight();
    }

    @Override // defpackage.gej
    public final void f(int i) {
        getChildAt(0).layout(0, 0, getChildAt(0).getMeasuredWidth(), getChildAt(0).getMeasuredHeight());
        getChildAt(2).layout(0, i - getChildAt(2).getMeasuredHeight(), getChildAt(2).getMeasuredWidth(), i);
    }

    @Override // defpackage.gej
    public final void g(int i) {
        getChildAt(0).measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), 0);
        getChildAt(2).measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), 0);
        int measuredHeight = getChildAt(2).getMeasuredHeight();
        if (measuredHeight != this.d) {
            this.d = measuredHeight;
            i7f i7fVar = this.c;
            g7f g7fVarC = u35.c(i7fVar, i7fVar);
            while (g7fVarC.hasNext()) {
                ((aqn) g7fVarC.next()).a(measuredHeight);
            }
        }
    }
}
