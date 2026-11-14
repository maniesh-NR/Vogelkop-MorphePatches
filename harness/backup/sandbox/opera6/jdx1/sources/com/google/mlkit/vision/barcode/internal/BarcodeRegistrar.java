package com.google.mlkit.vision.barcode.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcs;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.atp;
import defpackage.cpj;
import defpackage.drj;
import java.util.List;

@KeepForSdk
/* loaded from: classes.dex */
public class BarcodeRegistrar implements ComponentRegistrar {
    public final List getComponents() {
        jd5 jd5VarB = kd5.b(atp.class);
        jd5VarB.a(y27.a(k3e.class));
        jd5VarB.f = new cpj((byte) 18);
        kd5 kd5VarB = jd5VarB.b();
        jd5 jd5VarB2 = kd5.b(qsp.class);
        jd5VarB2.a(y27.a(atp.class));
        jd5VarB2.a(y27.a(mg8.class));
        jd5VarB2.a(y27.a(k3e.class));
        jd5VarB2.f = new drj((byte) 18);
        return zzcs.zzh(kd5VarB, jd5VarB2.b());
    }
}
