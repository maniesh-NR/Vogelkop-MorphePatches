package com.google.firebase;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.n9a;
import defpackage.qii;
import defpackage.rbe;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lkd5;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @NotNull
    public List<kd5> getComponents() {
        jd5 jd5VarA = kd5.a(new qfh(c03.class, dx5.class));
        jd5VarA.a(new y27(new qfh(c03.class, Executor.class), 1, 0));
        jd5VarA.f = n9a.g;
        kd5 kd5VarB = jd5VarA.b();
        jd5 jd5VarA2 = kd5.a(new qfh(bec.class, dx5.class));
        jd5VarA2.a(new y27(new qfh(bec.class, Executor.class), 1, 0));
        jd5VarA2.f = zpa.e;
        kd5 kd5VarB2 = jd5VarA2.b();
        jd5 jd5VarA3 = kd5.a(new qfh(gk3.class, dx5.class));
        jd5VarA3.a(new y27(new qfh(gk3.class, Executor.class), 1, 0));
        jd5VarA3.f = rbe.s;
        kd5 kd5VarB3 = jd5VarA3.b();
        jd5 jd5VarA4 = kd5.a(new qfh(ljm.class, dx5.class));
        jd5VarA4.a(new y27(new qfh(ljm.class, Executor.class), 1, 0));
        jd5VarA4.f = qii.c;
        return Arrays.asList(kd5VarB, kd5VarB2, kd5VarB3, jd5VarA4.b());
    }
}
