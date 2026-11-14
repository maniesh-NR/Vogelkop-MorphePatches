package com.google.mlkit.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.auj;
import defpackage.avj;
import defpackage.drj;
import defpackage.dvj;
import defpackage.ioj;
import defpackage.m3e;
import defpackage.r7e;
import defpackage.vth;
import java.util.List;

@KeepForSdk
/* loaded from: classes.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    public final List getComponents() {
        kd5 kd5Var = qdj.b;
        jd5 jd5VarB = kd5.b(r7e.class);
        jd5VarB.a(y27.a(k3e.class));
        jd5VarB.f = new drj((byte) 17);
        kd5 kd5VarB = jd5VarB.b();
        jd5 jd5VarB2 = kd5.b(m3e.class);
        jd5VarB2.f = new avj((byte) 17);
        kd5 kd5VarB2 = jd5VarB2.b();
        jd5 jd5VarB3 = kd5.b(wth.class);
        jd5VarB3.a(new y27(vth.class, 2, 0));
        jd5VarB3.f = new ioj((byte) 18);
        kd5 kd5VarB3 = jd5VarB3.b();
        jd5 jd5VarB4 = kd5.b(mg8.class);
        jd5VarB4.a(new y27(m3e.class, 1, 1));
        jd5VarB4.f = new dpj((byte) 18);
        kd5 kd5VarB4 = jd5VarB4.b();
        jd5 jd5VarB5 = kd5.b(d25.class);
        jd5VarB5.f = new auj((byte) 18);
        kd5 kd5VarB5 = jd5VarB5.b();
        jd5 jd5VarB6 = kd5.b(y55.class);
        jd5VarB6.a(y27.a(d25.class));
        jd5VarB6.f = new avj((byte) 18);
        kd5 kd5VarB6 = jd5VarB6.b();
        jd5 jd5VarB7 = kd5.b(psp.class);
        jd5VarB7.a(y27.a(k3e.class));
        jd5VarB7.f = new dvj((byte) 18);
        kd5 kd5VarB7 = jd5VarB7.b();
        jd5 jd5VarB8 = kd5.b(vth.class);
        jd5VarB8.e = true;
        jd5VarB8.a(new y27(psp.class, 1, 1));
        jd5VarB8.f = new ioj((byte) 19);
        return zzaf.zzi(kd5Var, kd5VarB, kd5VarB2, kd5VarB3, kd5VarB4, kd5VarB5, kd5VarB6, kd5VarB7, jd5VarB8.b());
    }
}
