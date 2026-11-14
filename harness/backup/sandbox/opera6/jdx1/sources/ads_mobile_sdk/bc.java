package ads_mobile_sdk;

import defpackage.hlo;
import defpackage.mip;
import defpackage.tso;
import defpackage.vkp;
import defpackage.w1h;
import defpackage.xf8;
import java.util.Optional;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class bc implements hlo {
    public final tso a;
    public final tso b;
    public final /* synthetic */ byte c;

    public /* synthetic */ bc(tso tsoVar, tso tsoVar2, byte b) {
        this.c = b;
        this.a = tsoVar;
        this.b = tsoVar2;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.c;
        tso tsoVar = this.b;
        tso tsoVar2 = this.a;
        switch (b) {
            case 0:
                return new ac((qr0) tsoVar2.get(), (sb) tsoVar.get());
            case 1:
                j6 j6Var = (j6) tsoVar2.get();
                qr0 qr0Var = (qr0) tsoVar.get();
                j53 j53Var = j53.a;
                o43 o43Var = o43.a;
                n63[] n63VarArr = n63.b;
                j6Var.getClass();
                return new tr(j6Var, w1h.d(qr0Var, lw0.AD_SERVICES_EXTENSION_VERSION), new cfn(0, qr0Var, qr0.class, "attributionReportingEnabled", "attributionReportingEnabled()Z", 0, (byte) 23));
            case 2:
                gu2 gu2Var = (gu2) tsoVar2.get();
                qr0 qr0Var2 = (qr0) tsoVar.get();
                j53 j53Var2 = j53.a;
                o43 o43Var2 = o43.a;
                n63[] n63VarArr2 = n63.b;
                gu2Var.getClass();
                return new w32(gu2Var, j53Var2, o43Var2, w1h.d(qr0Var2, lw0.REQUEST_ID));
            case 3:
                return new am3((nx5) tsoVar2.get(), (vkp) tsoVar.get());
            case 4:
                a13 a13Var = (a13) tsoVar2.get();
                qr0 qr0Var3 = (qr0) tsoVar.get();
                j53 j53Var3 = j53.a;
                o43 o43Var3 = o43.a;
                n63[] n63VarArr3 = n63.b;
                a13Var.getClass();
                return new w32(a13Var, j53Var3, o43Var3, w1h.d(qr0Var3, lw0.SDK_ENV));
            case 5:
                return new dm((nx5) tsoVar.get(), (cy0) tsoVar2.get());
            case 6:
                y13 y13Var = (y13) tsoVar2.get();
                qr0 qr0Var4 = (qr0) tsoVar.get();
                j53 j53Var4 = j53.b;
                o43 o43Var4 = o43.b;
                n63[] n63VarArr4 = n63.b;
                y13Var.getClass();
                return new w32(y13Var, j53Var4, o43Var4, w1h.d(qr0Var4, lw0.SESSION_ID));
            case 7:
                ac acVar = (ac) tsoVar2.get();
                qr0 qr0Var5 = (qr0) tsoVar.get();
                j53 j53Var5 = j53.b;
                o43 o43Var5 = o43.b;
                n63[] n63VarArr5 = n63.b;
                acVar.getClass();
                return new w32(acVar, j53Var5, o43Var5, w1h.d(qr0Var5, lw0.ADAPTER_VERSIONS));
            case 8:
                r23 r23Var = (r23) tsoVar2.get();
                qr0 qr0Var6 = (qr0) tsoVar.get();
                j53 j53Var6 = j53.a;
                o43 o43Var6 = o43.b;
                n63[] n63VarArr6 = n63.b;
                r23Var.getClass();
                return new w32(r23Var, j53Var6, o43Var6, w1h.d(qr0Var6, lw0.CONSENT_STRINGS));
            case 9:
                return new m41((vkp) tsoVar.get(), (ws) tsoVar2.get(), (byte) 3);
            case 10:
                oe oeVar = (oe) tsoVar2.get();
                qr0 qr0Var7 = (qr0) tsoVar.get();
                j53 j53Var7 = j53.b;
                o43 o43Var7 = o43.b;
                n63[] n63VarArr7 = n63.b;
                oeVar.getClass();
                return new w32(oeVar, j53Var7, o43Var7, w1h.d(qr0Var7, lw0.AMAZON_FIRE_AD_ID));
            case 11:
                la3 la3Var = (la3) tsoVar2.get();
                qr0 qr0Var8 = (qr0) tsoVar.get();
                j53 j53Var8 = j53.a;
                o43 o43Var8 = o43.b;
                n63[] n63VarArr8 = n63.b;
                la3Var.getClass();
                return new w32(la3Var, j53Var8, o43Var8, w1h.d(qr0Var8, lw0.STATIC_DEVICE));
            case 12:
                return new m41((yc2) tsoVar2.get(), (ae2) tsoVar.get(), (byte) 4);
            case 13:
                bi biVar = (bi) tsoVar2.get();
                qr0 qr0Var9 = (qr0) tsoVar.get();
                j53 j53Var9 = j53.b;
                o43 o43Var9 = o43.a;
                n63[] n63VarArr9 = n63.b;
                biVar.getClass();
                return new w32(biVar, j53Var9, o43Var9, w1h.d(qr0Var9, lw0.APP_OPEN));
            case 14:
                lg3 lg3Var = (lg3) tsoVar2.get();
                qr0 qr0Var10 = (qr0) tsoVar.get();
                j53 j53Var10 = j53.b;
                o43 o43Var10 = o43.b;
                n63[] n63VarArr10 = n63.b;
                lg3Var.getClass();
                return new w32(lg3Var, j53Var10, o43Var10, w1h.d(qr0Var10, lw0.TOPICS), new cfn(0, qr0Var10, qr0.class, "topicsSignalEnabled", "topicsSignalEnabled()Z", 0, (byte) 24));
            case 15:
                return new kh3((eq2) xf8.N((Optional) tsoVar2.get(), new eq2()), (ih1) xf8.N((Optional) tsoVar.get(), new ih1()), new dt2(), new s8());
            case 16:
                oi oiVar = (oi) tsoVar2.get();
                qr0 qr0Var11 = (qr0) tsoVar.get();
                j53 j53Var11 = j53.b;
                o43 o43Var11 = o43.b;
                n63[] n63VarArr11 = n63.b;
                oiVar.getClass();
                return new w32(oiVar, j53Var11, o43Var11, w1h.d(qr0Var11, lw0.APP_SET_ID));
            case 17:
                return new h3((e3) tsoVar2.get(), (qr0) tsoVar.get());
            case 18:
                gl glVar = (gl) tsoVar2.get();
                qr0 qr0Var12 = (qr0) tsoVar.get();
                j53 j53Var12 = j53.a;
                o43 o43Var12 = o43.a;
                n63[] n63VarArr12 = n63.b;
                glVar.getClass();
                return new tr(glVar, w1h.d(qr0Var12, lw0.AUDIO));
            case 19:
                mp mpVar = (mp) tsoVar2.get();
                qr0 qr0Var13 = (qr0) tsoVar.get();
                j53 j53Var13 = j53.a;
                o43 o43Var13 = o43.a;
                n63[] n63VarArr13 = n63.b;
                mpVar.getClass();
                return new tr(mpVar, w1h.d(qr0Var13, lw0.BATTERY));
            case 20:
                return new jk((qr0) tsoVar.get(), (mip) tsoVar2.get());
            case 21:
                return new k33((CoroutineContext) tsoVar2.get(), (zt1) tsoVar.get());
            case 22:
                e80 e80Var = (e80) tsoVar2.get();
                qr0 qr0Var14 = (qr0) tsoVar.get();
                j53 j53Var14 = j53.a;
                o43 o43Var14 = o43.b;
                n63[] n63VarArr14 = n63.b;
                e80Var.getClass();
                return new w32(e80Var, j53Var14, o43Var14, w1h.d(qr0Var14, lw0.CSRB_ECO_DATA));
            case 23:
                lg0 lg0Var = (lg0) tsoVar2.get();
                qr0 qr0Var15 = (qr0) tsoVar.get();
                j53 j53Var15 = j53.b;
                o43 o43Var15 = o43.a;
                n63[] n63VarArr15 = n63.b;
                lg0Var.getClass();
                return new w32(lg0Var, j53Var15, o43Var15, w1h.d(qr0Var15, lw0.DEBUG_SIGNAL));
            case 24:
                qr0 qr0Var16 = (qr0) tsoVar2.get();
                qr0Var16.getClass();
                if (((Boolean) qr0Var16.a("gads:native_ad_inspector_gesture:enabled", Boolean.FALSE, fo.a)).booleanValue()) {
                    return (hg0) tsoVar.get();
                }
                return null;
            case 25:
                return new ml1((Executor) tsoVar2.get(), (mip) tsoVar.get());
            case 26:
                bj3 bj3Var = (bj3) tsoVar2.get();
                qr0 qr0Var17 = (qr0) tsoVar.get();
                j53 j53Var16 = j53.a;
                o43 o43Var16 = o43.a;
                n63[] n63VarArr16 = n63.b;
                bj3Var.getClass();
                return new tr(bj3Var, w1h.d(qr0Var17, lw0.TRUSTLESS_TOKEN));
            case 27:
                return new n12((qr0) tsoVar2.get(), tsoVar);
            case 28:
                rl0 rl0Var = (rl0) tsoVar2.get();
                qr0 qr0Var18 = (qr0) tsoVar.get();
                j53 j53Var17 = j53.a;
                o43 o43Var17 = o43.a;
                n63[] n63VarArr17 = n63.b;
                rl0Var.getClass();
                return new w32(rl0Var, j53Var17, o43Var17, w1h.d(qr0Var18, lw0.EXPERIMENT_IDS));
            default:
                nn0 nn0Var = (nn0) tsoVar2.get();
                qr0 qr0Var19 = (qr0) tsoVar.get();
                j53 j53Var18 = j53.b;
                o43 o43Var18 = o43.b;
                n63[] n63VarArr18 = n63.b;
                nn0Var.getClass();
                return new w32(nn0Var, j53Var18, o43Var18, w1h.d(qr0Var19, lw0.FIREBASE_ANALYTICS));
        }
    }
}
