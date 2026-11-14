package com.google.mlkit.vision.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_common.zzp;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.qbe;
import defpackage.rbe;
import java.util.List;

@KeepForSdk
/* loaded from: classes.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    public final List getComponents() {
        jd5 jd5VarB = kd5.b(rbe.class);
        jd5VarB.a(new y27(qbe.class, 2, 0));
        jd5VarB.f = psp.m;
        return zzp.zzi(jd5VarB.b());
    }
}
