package ads_mobile_sdk;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.cs5;
import defpackage.iap;
import defpackage.k3p;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes.dex */
public final class d03 extends h83 {
    public final Object f;
    public final Object g;
    public final Map h;
    public final /* synthetic */ byte k = 0;

    public d03(k3p k3pVar, rp1 rp1Var, ga3 ga3Var, Context context, Map map, th3 th3Var) {
        super("+WjzebUp9O+QeVe9sbyi7I17QSWBSrVnDBWJFSc/zWOeUVG23wfwTV5OksHaGN5b", "FfXlM/pO94ZSvey9yAFafYrgUWzew4mCeSewfwPSAGc=", k3pVar, rp1Var, th3Var.a(fl0.EVENT_ID_SCREEN_SIGNALS_TASK));
        this.f = ga3Var;
        this.g = context;
        this.h = map;
    }

    public d03(k3p k3pVar, rp1 rp1Var, Map map, DisplayMetrics displayMetrics, th3 th3Var) {
        super("AmCDGlYUx8QbmZLPnXYxhv06vZOHtwtR2lWKdexpdQNMpIZfy20ers8uu8GCqPS8", "bxo4Cynng2w4BOuRqh97929m9VqvhzDmXf6G9N3UDWM=", k3pVar, rp1Var, th3Var.a(fl0.EVENT_ID_TOUCH_SIGNALS_TASK));
        this.f = rp1Var;
        this.h = map;
        this.g = displayMetrics;
    }

    public final void a(iap iapVar) {
        DisplayMetrics displayMetrics = (DisplayMetrics) this.g;
        Map map = this.h;
        w61 w61Var = (w61) map.get("oe");
        if (w61Var == null || w61Var.a == 0 || displayMetrics == null) {
            return;
        }
        float f = displayMetrics.density;
        if (f != 0.0f) {
            long jRound = Math.round(w61Var.g / f);
            iapVar.b$1();
            md mdVar = (md) iapVar.b;
            mdVar.bitField0_ |= 4096;
            mdVar.pathDistanceSignal_ = jRound;
            long jRound2 = Math.round((w61Var.j - w61Var.h) / displayMetrics.density);
            iapVar.b$1();
            md mdVar2 = (md) iapVar.b;
            mdVar2.bitField0_ |= 8192;
            mdVar2.viewXSignal_ = jRound2;
            long jRound3 = Math.round((w61Var.k - w61Var.i) / displayMetrics.density);
            iapVar.b$1();
            md mdVar3 = (md) iapVar.b;
            mdVar3.bitField0_ |= 16384;
            mdVar3.viewYSignal_ = jRound3;
            long jRound4 = Math.round(w61Var.h / displayMetrics.density);
            iapVar.b$1();
            md mdVar4 = (md) iapVar.b;
            mdVar4.bitField0_ |= 131072;
            mdVar4.tcxDownSignal_ = jRound4;
            long jRound5 = Math.round(w61Var.i / displayMetrics.density);
            iapVar.b$1();
            md mdVar5 = (md) iapVar.b;
            mdVar5.bitField0_ |= 262144;
            mdVar5.tcyDownSignal_ = jRound5;
            if (((MotionEvent) map.get("nv")) != null) {
                long jRound6 = Math.round(((r9.getRawX() + (w61Var.h - w61Var.j)) - r9.getX()) / displayMetrics.density);
                if (jRound6 != 0) {
                    iapVar.b$1();
                    md mdVar6 = (md) iapVar.b;
                    mdVar6.bitField0_ |= 32768;
                    mdVar6.viewDxSignal_ = jRound6;
                }
                long jRound7 = Math.round(((r9.getRawY() + (w61Var.i - w61Var.k)) - r9.getY()) / displayMetrics.density);
                if (jRound7 != 0) {
                    iapVar.b$1();
                    md mdVar7 = (md) iapVar.b;
                    mdVar7.bitField0_ |= 65536;
                    mdVar7.viewDySignal_ = jRound7;
                }
            }
        }
    }

    @Override // ads_mobile_sdk.h83
    public final void a(Method method, k3p k3pVar) {
        switch (this.k) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", Integer.valueOf(((ga3) this.f).ordinal()), (Context) this.g, cs5.G(this.h.get("up"), Boolean.TRUE));
                objArr.getClass();
                synchronized (k3pVar) {
                    if (((ga3) this.f) == ga3.a) {
                        long jLongValue = ((Long) cs5.G(objArr[0], -1L)).longValue();
                        k3pVar.b$1();
                        pd pdVar = (pd) k3pVar.b;
                        pdVar.bitField0_ |= 33554432;
                        pdVar.uwSignal_ = jLongValue;
                        long jLongValue2 = ((Long) cs5.G(objArr[1], -1L)).longValue();
                        k3pVar.b$1();
                        pd pdVar2 = (pd) k3pVar.b;
                        pdVar2.bitField0_ |= 67108864;
                        pdVar2.uhSignal_ = jLongValue2;
                    }
                    long jLongValue3 = ((Long) objArr[2]).longValue();
                    k3pVar.b$1();
                    pd pdVar3 = (pd) k3pVar.b;
                    pdVar3.bitField0_ |= 2048;
                    pdVar3.ornSignal_ = jLongValue3;
                    long jLongValue4 = ((Long) objArr[3]).longValue();
                    k3pVar.b$1();
                    pd pdVar4 = (pd) k3pVar.b;
                    pdVar4.bitField1_ |= 8388608;
                    pdVar4.screenStateSignal_ = jLongValue4;
                }
                return;
            default:
                MotionEvent motionEvent = (MotionEvent) this.h.get("nv");
                try {
                    Object[] objArr2 = (Object[]) method.invoke("", motionEvent, (DisplayMetrics) this.g);
                    objArr2.getClass();
                    iap iapVarO = md.o();
                    Object obj = objArr2[0];
                    if (obj != null && objArr2[1] != null) {
                        long jLongValue5 = ((Long) obj).longValue();
                        iapVarO.b$1();
                        md mdVar = (md) iapVarO.b;
                        mdVar.bitField0_ |= 1;
                        mdVar.tcxSignal_ = jLongValue5;
                        long jLongValue6 = ((Long) objArr2[1]).longValue();
                        iapVarO.b$1();
                        md mdVar2 = (md) iapVarO.b;
                        mdVar2.bitField0_ |= 2;
                        mdVar2.tcySignal_ = jLongValue6;
                    }
                    Object obj2 = objArr2[2];
                    if (obj2 != null) {
                        long jLongValue7 = ((Long) obj2).longValue();
                        iapVarO.b$1();
                        md mdVar3 = (md) iapVarO.b;
                        mdVar3.bitField0_ |= NotificationCompat.FLAG_HIGH_PRIORITY;
                        mdVar3.tctMs_ = jLongValue7;
                    }
                    Object obj3 = objArr2[3];
                    if (obj3 != null) {
                        long jLongValue8 = ((Long) obj3).longValue();
                        iapVarO.b$1();
                        md mdVar4 = (md) iapVarO.b;
                        mdVar4.bitField0_ |= 16;
                        mdVar4.tcp_ = jLongValue8;
                    }
                    Object obj4 = objArr2[4];
                    if (obj4 != null) {
                        long jLongValue9 = ((Long) obj4).longValue();
                        iapVarO.b$1();
                        md mdVar5 = (md) iapVarO.b;
                        mdVar5.bitField0_ |= 4;
                        mdVar5.tcd_ = jLongValue9;
                    }
                    Object obj5 = objArr2[5];
                    if (obj5 != null) {
                        int i = ((Long) obj5).longValue() != 0 ? 2 : 1;
                        iapVarO.b$1();
                        md mdVar6 = (md) iapVarO.b;
                        mdVar6.getClass();
                        mdVar6.obscured_ = sko.a(i);
                        mdVar6.bitField0_ |= 64;
                    }
                    Object obj6 = objArr2[6];
                    if (obj6 != null) {
                        long jLongValue10 = ((Long) obj6).longValue();
                        iapVarO.b$1();
                        md mdVar7 = (md) iapVarO.b;
                        mdVar7.bitField0_ |= NotificationCompat.FLAG_GROUP_SUMMARY;
                        mdVar7.source_ = jLongValue10;
                    }
                    Object obj7 = objArr2[7];
                    if (obj7 != null) {
                        long jLongValue11 = ((Long) obj7).longValue();
                        iapVarO.b$1();
                        md mdVar8 = (md) iapVarO.b;
                        mdVar8.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
                        mdVar8.toolType_ = jLongValue11;
                    }
                    Object obj8 = objArr2[8];
                    if (obj8 != null) {
                        int i2 = ((Long) obj8).longValue() != 0 ? 2 : 1;
                        iapVarO.b$1();
                        md mdVar9 = (md) iapVarO.b;
                        mdVar9.getClass();
                        mdVar9.isPhysicalTouch_ = sko.a(i2);
                        mdVar9.bitField0_ |= 1024;
                    }
                    synchronized (k3pVar) {
                        a(k3pVar);
                        w61 w61Var = (w61) this.h.get("oe");
                        if (w61Var != null) {
                            long j = w61Var.a;
                            if (j > 0) {
                                k3pVar.b$1();
                                pd pdVar5 = (pd) k3pVar.b;
                                pdVar5.bitField1_ |= 8;
                                pdVar5.tcdnSignal_ = j;
                            }
                            long j2 = w61Var.b;
                            if (j2 > 0) {
                                k3pVar.b$1();
                                pd pdVar6 = (pd) k3pVar.b;
                                pdVar6.bitField1_ |= 4;
                                pdVar6.tcmSignal_ = j2;
                            }
                            long j3 = w61Var.c;
                            if (j3 > 0) {
                                k3pVar.b$1();
                                pd pdVar7 = (pd) k3pVar.b;
                                pdVar7.bitField1_ |= 2;
                                pdVar7.tcuSignal_ = j3;
                            }
                            long j4 = w61Var.d;
                            if (j4 > 0) {
                                k3pVar.b$1();
                                pd pdVar8 = (pd) k3pVar.b;
                                pdVar8.bitField1_ |= 16;
                                pdVar8.tccSignal_ = j4;
                            }
                        }
                        a(iapVarO);
                        k3pVar.b$1();
                        ((pd) k3pVar.b).b((md) iapVarO.a());
                        b(k3pVar);
                    }
                    if (motionEvent != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (motionEvent != null) {
                        motionEvent.recycle();
                    }
                }
        }
    }

    public final void a(k3p k3pVar) {
        Method methodA = ((rp1) this.f).a("qz70LvEMWwA/oESn2omLoGWX+s/H2a0b13zhMi7X4CPkcTh//Th6SuwIqjIRsue1", "kjQA84n6DyJsYsBofiQuDEkTPi4LyN53TbhS5Rux4VQ=");
        methodA.getClass();
        Object[] objArr = (Object[]) methodA.invoke("", (MotionEvent) this.h.get("nv"), (DisplayMetrics) this.g);
        objArr.getClass();
        Object obj = objArr[0];
        if (obj != null) {
            long jLongValue = ((Long) obj).longValue();
            k3pVar.b$1();
            pd pdVar = (pd) k3pVar.b;
            pdVar.bitField0_ |= 8192;
            pdVar.tcxSignal_ = jLongValue;
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            long jLongValue2 = ((Long) obj2).longValue();
            k3pVar.b$1();
            pd pdVar2 = (pd) k3pVar.b;
            pdVar2.bitField0_ |= 16384;
            pdVar2.tcySignal_ = jLongValue2;
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            long jLongValue3 = ((Long) obj3).longValue();
            k3pVar.b$1();
            pd pdVar3 = (pd) k3pVar.b;
            pdVar3.bitField0_ |= 32768;
            pdVar3.tctSignal_ = jLongValue3;
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            long jLongValue4 = ((Long) obj4).longValue();
            k3pVar.b$1();
            pd pdVar4 = (pd) k3pVar.b;
            pdVar4.bitField0_ |= 1073741824;
            pdVar4.tcpSignal_ = jLongValue4;
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            long jLongValue5 = ((Long) obj5).longValue();
            k3pVar.b$1();
            pd pdVar5 = (pd) k3pVar.b;
            pdVar5.bitField0_ |= LinearLayoutManager.INVALID_OFFSET;
            pdVar5.tcdSignal_ = jLongValue5;
        }
    }

    public final void b(k3p k3pVar) {
        DisplayMetrics displayMetrics = (DisplayMetrics) this.g;
        x61[] x61VarArr = (x61[]) this.h.get("ro");
        if (x61VarArr == null || displayMetrics == null || displayMetrics.density == 0.0f) {
            return;
        }
        for (int i = 0; i <= x61VarArr.length - 2; i++) {
            x61 x61Var = x61VarArr[i];
            iap iapVarO = md.o();
            long jRound = Math.round(x61Var.a / displayMetrics.density);
            iapVarO.b$1();
            md mdVar = (md) iapVarO.b;
            mdVar.bitField0_ |= 1;
            mdVar.tcxSignal_ = jRound;
            long jRound2 = Math.round(x61Var.b / displayMetrics.density);
            iapVarO.b$1();
            md mdVar2 = (md) iapVarO.b;
            mdVar2.bitField0_ |= 2;
            mdVar2.tcySignal_ = jRound2;
            md mdVar3 = (md) iapVarO.a();
            k3pVar.b$1();
            ((pd) k3pVar.b).a(mdVar3);
        }
    }
}
