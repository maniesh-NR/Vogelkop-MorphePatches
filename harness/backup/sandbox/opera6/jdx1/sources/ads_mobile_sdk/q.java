package ads_mobile_sdk;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.View;
import defpackage.cs5;
import defpackage.k3p;
import defpackage.mcp;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class q extends h83 {
    public final Object f;
    public final Object g;
    public final /* synthetic */ byte k = 2;

    public q(k3p k3pVar, rp1 rp1Var, ga3 ga3Var, Map map, th3 th3Var) {
        super("1aWNFX04tKhc9VIvlot9bFvnZP9TrVbjwzpBa5LcHsvZwVyrZSukSCZTs3sAlGxM", "lGADz81RjuurPxepkevIYHaRz29hyiQMzn/cHz2iiSI=", k3pVar, rp1Var, th3Var.a(fl0.EVENT_ID_TIME_SIGNALS_TASK));
        this.f = map;
        this.g = ga3Var;
    }

    public q(k3p k3pVar, rp1 rp1Var, DisplayMetrics displayMetrics, View view, th3 th3Var) {
        super("v4sv91b6hPwyqnl6oWqgV5IvfBfKUzYsCSRI7X43aaF1Ugm6ElQCi/hAMP8GQGeS", "S/bnGM9lvXgLYN9+iI1s6H/IFmyt2HDF4gMdveMKH+I=", k3pVar, rp1Var, th3Var.a(fl0.EVENT_ID_VIEW_SIGNALS_TASK));
        this.f = displayMetrics;
        this.g = view;
    }

    public q(k3p k3pVar, rp1 rp1Var, View view, Activity activity, th3 th3Var) {
        super("liL+8OEeIGGPzaVgOHCmbw9xPNICi+/u1sHxRjeFm7VZ9ZZVA86XfYrEDJW52OqQ", "9Nnuh5aXL/R20p8Jw4UcAGpdSMZw1/MlRG58ae9XCgA=", k3pVar, rp1Var, th3Var.a(fl0.EVENT_ID_ACTIVITY_SIGNALS_TASK));
        this.g = view;
        this.f = activity;
    }

    @Override // ads_mobile_sdk.h83
    public final void a(Method method, k3p k3pVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.k) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", (View) this.g, (Activity) this.f);
                objArr.getClass();
                synchronized (k3pVar) {
                    long jLongValue = ((Long) objArr[0]).longValue();
                    k3pVar.b$1();
                    pd pdVar = (pd) k3pVar.b;
                    pdVar.bitField1_ |= 67108864;
                    pdVar.activityIntentSignal_ = jLongValue;
                    long jLongValue2 = ((Long) objArr[1]).longValue();
                    k3pVar.b$1();
                    pd pdVar2 = (pd) k3pVar.b;
                    pdVar2.bitField1_ |= 134217728;
                    pdVar2.activityStackSizeSignal_ = jLongValue2;
                    String str = (String) objArr[2];
                    k3pVar.b$1();
                    ((pd) k3pVar.b).b(str);
                }
                return;
            case 1:
                View view = (View) this.g;
                if (view != null) {
                    Object objInvoke = method.invoke("", (DisplayMetrics) this.f, view);
                    objInvoke.getClass();
                    Long[] lArr = (Long[]) objInvoke;
                    mcp mcpVarO = od.o();
                    long jLongValue3 = lArr[2].longValue();
                    mcpVarO.b$1();
                    od odVar = (od) mcpVarO.b;
                    odVar.bitField0_ |= 4;
                    odVar.minAlphaSignal_ = jLongValue3;
                    long jLongValue4 = lArr[1].longValue();
                    mcpVarO.b$1();
                    od odVar2 = (od) mcpVarO.b;
                    odVar2.bitField0_ |= 8;
                    odVar2.viewHeight_ = jLongValue4;
                    long jLongValue5 = lArr[0].longValue();
                    mcpVarO.b$1();
                    od odVar3 = (od) mcpVarO.b;
                    odVar3.bitField0_ |= 16;
                    odVar3.viewWidth_ = jLongValue5;
                    long jLongValue6 = lArr[3].longValue();
                    mcpVarO.b$1();
                    od odVar4 = (od) mcpVarO.b;
                    odVar4.bitField0_ |= 1;
                    odVar4.percentAdOnScreen_ = jLongValue6;
                    long jLongValue7 = lArr[4].longValue();
                    mcpVarO.b$1();
                    od odVar5 = (od) mcpVarO.b;
                    odVar5.bitField0_ |= 32;
                    odVar5.displayDensity_ = jLongValue7;
                    synchronized (k3pVar) {
                        od odVar6 = (od) mcpVarO.a();
                        k3pVar.b$1();
                        ((pd) k3pVar.b).a(odVar6);
                    }
                    return;
                }
                return;
            default:
                Long[] lArr2 = new Long[9];
                Arrays.fill((Object[]) lArr2, (Object) (-1L));
                lArr2[0] = (Long) cs5.G((Long) ((Map) this.f).get("tcq"), -1L);
                lArr2[1] = (Long) cs5.G((Long) ((Map) this.f).get("tpq"), -1L);
                lArr2[2] = (Long) cs5.G((Long) ((Map) this.f).get("tcv"), -1L);
                lArr2[3] = (Long) cs5.G((Long) ((Map) this.f).get("tpv"), -1L);
                lArr2[4] = (Long) cs5.G((Long) ((Map) this.f).get("tchv"), -1L);
                lArr2[5] = (Long) cs5.G((Long) ((Map) this.f).get("tphv"), -1L);
                lArr2[6] = (Long) cs5.G((Long) ((Map) this.f).get("tcc"), -1L);
                lArr2[7] = (Long) cs5.G((Long) ((Map) this.f).get("tpc"), -1L);
                lArr2[8] = (Long) cs5.G((Long) ((Map) this.f).get("tst"), -1L);
                for (int i = 0; i < 9; i++) {
                    if (lArr2[i] == null) {
                        lArr2[i] = -1L;
                    }
                }
                Long[] lArr3 = (Long[]) method.invoke("", lArr2, Integer.valueOf(((ga3) this.g).ordinal()));
                lArr3.getClass();
                synchronized (k3pVar) {
                    long jLongValue8 = lArr3[0].longValue();
                    k3pVar.b$1();
                    pd pdVar3 = (pd) k3pVar.b;
                    pdVar3.bitField3_ |= 32;
                    pdVar3.evtTime_ = jLongValue8;
                    long jLongValue9 = lArr3[1].longValue();
                    k3pVar.b$1();
                    pd pdVar4 = (pd) k3pVar.b;
                    pdVar4.bitField0_ |= 134217728;
                    pdVar4.utzSignal_ = jLongValue9;
                    long jLongValue10 = lArr3[2].longValue();
                    k3pVar.b$1();
                    pd pdVar5 = (pd) k3pVar.b;
                    pdVar5.bitField0_ |= 2097152;
                    pdVar5.usgSignal_ = jLongValue10;
                    long jLongValue11 = lArr3[3].longValue();
                    k3pVar.b$1();
                    pd pdVar6 = (pd) k3pVar.b;
                    pdVar6.bitField0_ |= 65536;
                    pdVar6.uptSignal_ = jLongValue11;
                    long jLongValue12 = lArr3[4].longValue();
                    k3pVar.b$1();
                    pd pdVar7 = (pd) k3pVar.b;
                    pdVar7.bitField2_ |= 8192;
                    pdVar7.impressionDurationMs_ = jLongValue12;
                    long jLongValue13 = lArr3[5].longValue();
                    k3pVar.b$1();
                    pd pdVar8 = (pd) k3pVar.b;
                    pdVar8.bitField2_ |= 16384;
                    pdVar8.impressionDurationHighAttentionMs_ = jLongValue13;
                    long jLongValue14 = lArr3[6].longValue();
                    k3pVar.b$1();
                    pd pdVar9 = (pd) k3pVar.b;
                    pdVar9.bitField1_ |= 4096;
                    pdVar9.deviceElapsedRealTimeSignal_ = jLongValue14;
                    long jLongValue15 = lArr3[7].longValue();
                    k3pVar.b$1();
                    pd pdVar10 = (pd) k3pVar.b;
                    pdVar10.bitField1_ |= 8192;
                    pdVar10.deviceUptimeSignal_ = jLongValue15;
                }
                return;
        }
    }
}
