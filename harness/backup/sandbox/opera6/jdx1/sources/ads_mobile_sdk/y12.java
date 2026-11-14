package ads_mobile_sdk;

import android.net.NetworkCapabilities;
import defpackage.k3p;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class y12 extends h83 {
    public final Map f;
    public final /* synthetic */ byte k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y12(k3p k3pVar, rp1 rp1Var, Map map, th3 th3Var, byte b) {
        super("S4AR3OeuN/Yo69kGM4HOqEHHfZaTMYg+jcDsGiFRwDcioI1BR0L1HkqYT3mECLzx", "RM+moMh3DHLW8TUhlphDanXPS8nJKX54iOjQmirmtWY=", k3pVar, rp1Var, th3Var.a(fl0.EVENT_ID_NAVIGATION_SIGNALS_TASK));
        this.k = b;
        switch (b) {
            case 1:
                super("fk3bZnxQs3kvmUZ6PwIEInYsE7wLWgMA8HVLohg8a6PaG7nYidSNhFnU0XHcvcWN", "K+dU9veFn53Mwjja7ceHVSTp3ysL12pn3klSDAgEo4o=", k3pVar, rp1Var, th3Var.a(fl0.EVENT_ID_NETWORK_SIGNALS_TASK));
                this.f = map;
                break;
            default:
                this.f = map;
                break;
        }
    }

    @Override // ads_mobile_sdk.h83
    public final void a(Method method, k3p k3pVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object obj;
        int i = 2;
        switch (this.k) {
            case 0:
                List list = (List) this.f.get("vst");
                if (list != null) {
                    Object objInvoke = method.invoke("", list);
                    objInvoke.getClass();
                    Long l = (Long) objInvoke;
                    synchronized (k3pVar) {
                        int i_a = sko._a(l.intValue());
                        if (i_a == 0) {
                            throw null;
                        }
                        k3pVar.b$1();
                        pd pdVar = (pd) k3pVar.b;
                        pdVar.getClass();
                        switch (i_a) {
                            case 1:
                                i = 0;
                                break;
                            case 2:
                                i = 1;
                                break;
                            case 3:
                                break;
                            case 4:
                                i = 3;
                                break;
                            case 5:
                                i = 4;
                                break;
                            case 6:
                                i = 5;
                                break;
                            case 7:
                                i = 6;
                                break;
                            case 8:
                                i = 7;
                                break;
                            case 9:
                                i = 8;
                                break;
                            case 10:
                                i = 9;
                                break;
                            case 11:
                                i = 10;
                                break;
                            case 12:
                                i = 11;
                                break;
                            case 13:
                                i = 12;
                                break;
                            case 14:
                                i = 13;
                                break;
                            default:
                                throw null;
                        }
                        pdVar.navigationTriggerType_ = i;
                        pdVar.bitField2_ |= 16777216;
                    }
                    return;
                }
                return;
            default:
                Object[] objArr = (Object[]) method.invoke("", (NetworkCapabilities) this.f.get("ntc"), (Long) this.f.get("vs"), (Long) this.f.get("vf"));
                objArr.getClass();
                synchronized (k3pVar) {
                    long jLongValue = ((Long) objArr[0]).longValue();
                    k3pVar.b$1();
                    pd pdVar2 = (pd) k3pVar.b;
                    pdVar2.bitField0_ |= 1024;
                    pdVar2.netSignal_ = jLongValue;
                    long jLongValue2 = ((Long) objArr[1]).longValue();
                    if (jLongValue2 >= 0) {
                        k3pVar.b$1();
                        pd pdVar3 = (pd) k3pVar.b;
                        pdVar3.bitField2_ |= 2048;
                        pdVar3.timeSinceVpnOnMs_ = jLongValue2;
                    }
                    long jLongValue3 = ((Long) objArr[2]).longValue();
                    if (jLongValue3 >= 0) {
                        k3pVar.b$1();
                        pd pdVar4 = (pd) k3pVar.b;
                        pdVar4.bitField2_ |= 4096;
                        pdVar4.adeventToVpnOffMs_ = jLongValue3;
                    }
                    if (objArr.length > 3 && (obj = objArr[3]) != null) {
                        int i_a$1 = sko._a$1(((Long) obj).intValue());
                        if (i_a$1 == 0) {
                            throw null;
                        }
                        k3pVar.b$1();
                        pd pdVar5 = (pd) k3pVar.b;
                        pdVar5.getClass();
                        pdVar5.proxyDetectedSignal_ = sko.a(i_a$1);
                        pdVar5.bitField2_ |= 16;
                    }
                }
                return;
        }
    }
}
