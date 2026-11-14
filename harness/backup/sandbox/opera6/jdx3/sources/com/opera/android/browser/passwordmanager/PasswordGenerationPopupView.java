package com.opera.android.browser.passwordmanager;

import android.content.Context;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.browser.chromium.ChromiumContent;
import defpackage.b4g;
import defpackage.dkf;
import defpackage.g7f;
import defpackage.h7f;
import defpackage.iz4;
import defpackage.kq2;
import defpackage.nc1;
import defpackage.r9i;

/* loaded from: classes.dex */
public final class PasswordGenerationPopupView {
    public final ChromiumContent a;
    public final huh b;
    public Rect c = new Rect();
    public nc1 d;
    public b4g e;
    public long f;
    public String g;

    public PasswordGenerationPopupView(long j, ChromiumContent chromiumContent) {
        this.a = chromiumContent;
        this.b = chromiumContent.e().g;
        this.f = j;
    }

    public static PasswordGenerationPopupView create(long j, @NonNull ChromiumContent chromiumContent) {
        if (chromiumContent.r) {
            return new PasswordGenerationPopupView(j, chromiumContent);
        }
        return null;
    }

    public final void destroy() {
        this.f = 0L;
    }

    public final void hide() {
        b4g b4gVar = this.e;
        if (b4gVar != null) {
            this.a.S = false;
            this.e = null;
            b4gVar.b();
        }
        nc1 nc1Var = this.d;
        if (nc1Var != null) {
            ((ViewGroup) nc1Var.getParent()).removeView(this.d);
            this.d = null;
        }
    }

    public final void show() {
        if (this.e == null) {
            this.e = new b4g(this);
        }
        nc1 nc1Var = this.d;
        ChromiumContent chromiumContent = this.a;
        if (nc1Var == null) {
            View view = chromiumContent.getView();
            this.d = new nc1(this, view.getContext());
            ((ViewGroup) view.getParent()).addView(this.d, new ViewGroup.LayoutParams(-1, -1));
        }
        View childAt = this.d.getChildAt(0);
        int width = childAt.getWidth();
        b4g b4gVar = this.e;
        if (width > 0) {
            b4gVar.o(childAt);
        } else {
            Context context = childAt.getContext();
            b4gVar.getClass();
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(2130970353, typedValue, true);
            dkf dkfVar = new dkf(context, typedValue.resourceId);
            b4gVar.b = dkfVar;
            b4gVar.a = dkfVar;
            childAt.addOnLayoutChangeListener(new kq2(this, childAt));
        }
        chromiumContent.S = true;
        h7f h7fVar = chromiumContent.C;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((iz4) g7fVarH.next()).h();
        }
    }

    public final void update(int i, int i2, int i3, int i4, @Nullable String str) {
        r9i r9iVarF;
        huh huhVar = this.b;
        float f = huhVar.k;
        float f2 = huhVar.j;
        Rect rect = new Rect((int) (i * f2), (int) ((i2 * f2) + f), (int) Math.ceil((i + i3) * f2), (int) Math.ceil((f2 * (i2 + i4)) + f));
        this.g = str;
        this.c = rect;
        nc1 nc1Var = this.d;
        if (nc1Var != null) {
            nc1Var.requestLayout();
        }
        b4g b4gVar = this.e;
        if (b4gVar == null || (r9iVarF = b4gVar.f()) == null) {
            return;
        }
        b4gVar.q(r9iVarF);
    }
}
