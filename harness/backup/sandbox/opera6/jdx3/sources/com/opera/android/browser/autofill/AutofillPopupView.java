package com.opera.android.browser.autofill;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.browser.chromium.ChromiumContent;
import defpackage.g7f;
import defpackage.h7f;
import defpackage.iz4;
import defpackage.iz9;
import defpackage.nq2;
import defpackage.pu2;
import defpackage.qu2;
import defpackage.rq2;
import defpackage.ru2;
import defpackage.ts2;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class AutofillPopupView {
    public long a;
    public final ChromiumContent b;
    public final qu2 c;
    public final pu2 d = new pu2(this);
    public ArrayList e = new ArrayList();
    public int f;

    public AutofillPopupView(long j, ChromiumContent chromiumContent, qu2 qu2Var) {
        this.a = j;
        this.b = chromiumContent;
        this.c = qu2Var;
    }

    @Nullable
    public static AutofillPopupView create(long j, @NonNull ChromiumContent chromiumContent, int i, boolean z, int i2, int i3) {
        if (!chromiumContent.r) {
            return null;
        }
        iz9 iz9Var = new iz9(i2, i3);
        return new AutofillPopupView(j, chromiumContent, (z && (i == 5 || i == 3)) ? new rq2(chromiumContent, chromiumContent.c(), i, iz9Var) : new ts2(chromiumContent, i, iz9Var));
    }

    public final void continueUpdate(@NonNull String str, @NonNull String str2, int i, int i2, boolean z, @Nullable String str3) {
        this.e.add(new ru2(this.f, z, str, i, str2, i2, str3));
        this.f++;
    }

    public final void finishUpdate() {
        this.c.w(this.e);
    }

    public final boolean isShowingBottomSheet() {
        nq2 nq2Var;
        qu2 qu2Var = this.c;
        if (!(qu2Var instanceof rq2) || (nq2Var = ((rq2) qu2Var).h) == null) {
            return false;
        }
        return nq2Var.f;
    }

    public final void onNativeDestroyed() {
        this.a = 0L;
        pu2 pu2Var = this.d;
        qu2 qu2Var = this.c;
        qu2Var.H(pu2Var);
        qu2Var.d();
    }

    public final void show() {
        pu2 pu2Var = this.d;
        qu2 qu2Var = this.c;
        qu2Var.F(pu2Var);
        qu2Var.show();
        ChromiumContent chromiumContent = this.b;
        chromiumContent.S = true;
        h7f h7fVar = chromiumContent.C;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((iz4) g7fVarH.next()).h();
        }
    }

    public final void startUpdate(int i, int i2, int i3, int i4, int i5) {
        this.f = 0;
        this.e = new ArrayList();
        this.c.getClass();
    }
}
