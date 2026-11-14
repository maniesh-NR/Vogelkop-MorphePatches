package com.opera.android.freedom;

import J.N;
import androidx.annotation.NonNull;
import defpackage.b2l;
import defpackage.dx3;
import defpackage.mp9;
import defpackage.qim;
import java.util.Objects;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class FreedomResourceThrottle {
    public static void requestDialog(long j, @NonNull WebContents webContents, @NonNull String str) {
        dx3 dx3VarL = dx3.L(webContents);
        if (dx3VarL == null) {
            N.M89iwLkI(j, false);
            return;
        }
        b2l b2lVarV = dx3VarL.V(webContents);
        if (b2lVarV == null) {
            N.M89iwLkI(j, false);
            return;
        }
        qim qimVar = dx3VarL.o;
        Objects.requireNonNull(qimVar);
        qimVar.f.Q(new mp9(j, str), b2lVarV);
    }
}
