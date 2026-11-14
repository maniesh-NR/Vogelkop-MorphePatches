package com.opera.android.webaiassistant;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import defpackage.b98;
import defpackage.jrc;
import defpackage.nrn;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/opera/android/webaiassistant/WebAiAssistantLayoutSwitcher;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "nrn", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WebAiAssistantLayoutSwitcher extends FrameLayout {
    public nrn a;

    public WebAiAssistantLayoutSwitcher(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = nrn.a;
    }

    public final jrc a() {
        View childAt = getChildAt(3);
        MaterialButton materialButtonJ = w1h.j(2131364080, childAt);
        if (materialButtonJ != null) {
            return new jrc((LinearLayout) childAt, materialButtonJ, (byte) 1);
        }
        t3p.q("Missing required view with ID: ".concat(childAt.getResources().getResourceName(2131364080)));
        return null;
    }

    public final b98 b() {
        View childAt = getChildAt(2);
        if (w1h.j(2131364525, childAt) != null) {
            return new b98((FrameLayout) childAt, (byte) 6);
        }
        t3p.q("Missing required view with ID: ".concat(childAt.getResources().getResourceName(2131364525)));
        return null;
    }

    public final jrc c() {
        View childAt = getChildAt(1);
        MaterialButton materialButtonJ = w1h.j(2131364954, childAt);
        if (materialButtonJ != null) {
            return new jrc((LinearLayout) childAt, materialButtonJ, (byte) 2);
        }
        t3p.q("Missing required view with ID: ".concat(childAt.getResources().getResourceName(2131364954)));
        return null;
    }

    public final void d(nrn nrnVar) {
        if (this.a != nrnVar) {
            this.a = nrnVar;
            c().b.setVisibility(8);
            b().b.setVisibility(8);
            a().b.setVisibility(8);
            int iOrdinal = nrnVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    c().b.setVisibility(0);
                    return;
                }
                if (iOrdinal == 2) {
                    b().b.setVisibility(0);
                } else if (iOrdinal == 3) {
                    a().b.setVisibility(0);
                } else {
                    h9o.p();
                }
            }
        }
    }
}
