package ads_mobile_sdk;

import android.content.Context;
import defpackage.k3p;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class qk2 extends h83 {
    public final Object f;
    public final /* synthetic */ byte k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk2(k3p k3pVar, rp1 rp1Var, l7 l7Var, th3 th3Var) {
        super("lk2M40aDCQVE1PniBXExEN4rsdExdX/OR55hoOsKh12DCVQ+eDAF3razZ7KSgOSq", "4hbv0YVcD1R5lKxYgI+whW6NQ8mIZFYSKt+2ooXXD+0=", k3pVar, rp1Var, th3Var.a(fl0.EVENT_ID_ENV_VERSION_SIGNALS_TASK));
        this.k = (byte) 2;
        this.f = l7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk2(k3p k3pVar, rp1 rp1Var, Context context, th3 th3Var, byte b) {
        super("d6SJyweUOXsjsi4aee6h6AAdieq+jqRoZfr9biT0bL0UclMoo9mI2gDnl4h6MJeY", "1NxUkpAFhaaVn5V2bAXZA+C2b2LfoxxmH7kOIwJoWjw=", k3pVar, rp1Var, th3Var.a(fl0.EVENT_ID_PROCESS_INFO_SIGNALS_TASK));
        this.k = b;
        switch (b) {
            case 1:
                super("aLUX/dMFntePVq3QIx1WET/bS9p4xlVnd2kC6rxQEHnrSSa5XvJ2HDIzxEARka7Z", "hktcy+P+GCzQWpCatbgRVno/M8IlfKh6+qufDLwVHGc=", k3pVar, rp1Var, th3Var.a(fl0.EVENT_ID_DYNAMIC_DEVICE_SIGNALS_TASK));
                this.f = context;
                break;
            default:
                this.f = context;
                break;
        }
    }

    @Override // ads_mobile_sdk.h83
    public final void a(Method method, k3p k3pVar) {
        switch (this.k) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", (Context) this.f);
                objArr.getClass();
                synchronized (k3pVar) {
                    long jLongValue = ((Long) objArr[0]).longValue();
                    k3pVar.b$1();
                    pd pdVar = (pd) k3pVar.b;
                    pdVar.bitField0_ |= 4;
                    pdVar.atvSignal_ = jLongValue;
                    long jLongValue2 = ((Long) objArr[1]).longValue();
                    k3pVar.b$1();
                    pd pdVar2 = (pd) k3pVar.b;
                    pdVar2.bitField1_ |= 4194304;
                    pdVar2.processImportanceSignal_ = jLongValue2;
                }
                return;
            case 1:
                Object[] objArr2 = (Object[]) method.invoke("", (Context) this.f);
                objArr2.getClass();
                synchronized (k3pVar) {
                    long jIntValue = ((Integer) objArr2[0]).intValue();
                    k3pVar.b$1();
                    pd pdVar3 = (pd) k3pVar.b;
                    pdVar3.bitField1_ |= 2097152;
                    pdVar3.batteryTemperatureSignal_ = jIntValue;
                    long jIntValue2 = ((Integer) objArr2[1]).intValue();
                    k3pVar.b$1();
                    pd pdVar4 = (pd) k3pVar.b;
                    pdVar4.bitField0_ |= 16;
                    pdVar4.btsSignal_ = jIntValue2;
                    long jIntValue3 = ((Integer) objArr2[2]).intValue();
                    k3pVar.b$1();
                    pd pdVar5 = (pd) k3pVar.b;
                    pdVar5.bitField0_ |= 32;
                    pdVar5.btlSignal_ = jIntValue3;
                    long jIntValue4 = ((Integer) objArr2[3]).intValue();
                    k3pVar.b$1();
                    pd pdVar6 = (pd) k3pVar.b;
                    pdVar6.bitField2_ |= 8388608;
                    pdVar6.bootCountSignal_ = jIntValue4;
                    Boolean bool = (Boolean) objArr2[4];
                    if (bool == null) {
                        k3pVar.b$1();
                        pd pdVar7 = (pd) k3pVar.b;
                        pdVar7.getClass();
                        pdVar7.adbEnabledSignal_ = sko.a(3);
                        pdVar7.bitField1_ |= 2048;
                    } else {
                        int i = bool.booleanValue() ? 2 : 1;
                        k3pVar.b$1();
                        pd pdVar8 = (pd) k3pVar.b;
                        pdVar8.getClass();
                        pdVar8.adbEnabledSignal_ = sko.a(i);
                        pdVar8.bitField1_ |= 2048;
                    }
                    Boolean bool2 = (Boolean) objArr2[5];
                    if (bool2 == null) {
                        k3pVar.b$1();
                        pd pdVar9 = (pd) k3pVar.b;
                        pdVar9.getClass();
                        pdVar9.usbConnectedSignal_ = sko.a(3);
                        pdVar9.bitField1_ |= 1024;
                    } else {
                        int i2 = bool2.booleanValue() ? 2 : 1;
                        k3pVar.b$1();
                        pd pdVar10 = (pd) k3pVar.b;
                        pdVar10.getClass();
                        pdVar10.usbConnectedSignal_ = sko.a(i2);
                        pdVar10.bitField1_ |= 1024;
                    }
                }
                return;
            default:
                Object[] objArr3 = (Object[]) method.invoke("", ((l7) this.f).D());
                objArr3.getClass();
                synchronized (k3pVar) {
                    String str = (String) objArr3[0];
                    k3pVar.b$1();
                    ((pd) k3pVar.b).d(str);
                    String str2 = (String) objArr3[1];
                    k3pVar.b$1();
                    ((pd) k3pVar.b).c(str2);
                }
                return;
        }
    }
}
