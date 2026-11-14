package com.opera.android.browser.autofill;

import android.content.Context;
import androidx.annotation.NonNull;
import com.opera.android.OperaApplication;
import com.opera.android.autofill.Address;
import com.opera.android.browser.chromium.ChromiumContent;
import defpackage.eej;
import defpackage.ijm;
import defpackage.nej;
import defpackage.qp2;
import defpackage.qq8;
import defpackage.x5f;
import defpackage.xq3;

/* loaded from: classes.dex */
public final class SaveProfileDialog {
    public static void showDialog(@NonNull ChromiumContent chromiumContent, @NonNull Address address, long j) {
        Context context = t8.a;
        String[] strArr = OperaApplication.K;
        x5f x5fVar = ((OperaApplication) context.getApplicationContext()).L().c;
        eej eejVar = chromiumContent.G;
        if (eejVar == null) {
            qp2.n("Error");
            return;
        }
        qq8 qq8Var = new qq8(j, x5fVar, chromiumContent);
        nej nejVar = eejVar.a;
        xq3 xq3Var = new xq3(address, qq8Var, (byte) 10);
        nejVar.getClass();
        nejVar.b(xq3Var, ijm.b);
    }
}
