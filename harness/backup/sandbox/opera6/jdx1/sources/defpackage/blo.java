package defpackage;

import ads_mobile_sdk.h83;
import ads_mobile_sdk.pd;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class blo extends h83 {
    @Override // ads_mobile_sdk.h83
    public final void a(Method method, k3p k3pVar) {
        synchronized (k3pVar) {
            k3pVar.b$1();
            ((pd) k3pVar.b).j("E");
            k3pVar.b$1();
            pd pdVar = (pd) k3pVar.b;
            pdVar.bitField1_ |= 32;
            pdVar.cpuSignal_ = 0L;
            k3pVar.b$1();
            ((pd) k3pVar.b).g("D");
        }
        Object[] objArr = (Object[]) method.invoke("", null);
        objArr.getClass();
        synchronized (k3pVar) {
            String str = (String) objArr[0];
            k3pVar.b$1();
            ((pd) k3pVar.b).j(str);
            long jLongValue = ((Long) objArr[1]).longValue();
            k3pVar.b$1();
            pd pdVar2 = (pd) k3pVar.b;
            pdVar2.bitField1_ |= 32;
            pdVar2.cpuSignal_ = jLongValue;
            String str2 = (String) objArr[2];
            k3pVar.b$1();
            ((pd) k3pVar.b).g(str2);
        }
    }
}
