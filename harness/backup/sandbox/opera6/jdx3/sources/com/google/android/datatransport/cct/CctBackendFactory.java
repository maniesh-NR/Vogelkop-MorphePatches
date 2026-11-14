package com.google.android.datatransport.cct;

import android.content.Context;
import androidx.annotation.Keep;
import defpackage.bn2;
import defpackage.c06;
import defpackage.o5m;
import defpackage.vp4;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory {
    public o5m create(c06 c06Var) {
        Context context = ((bn2) c06Var).a;
        bn2 bn2Var = (bn2) c06Var;
        return new vp4(context, bn2Var.b, bn2Var.c);
    }
}
