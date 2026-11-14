package ads_mobile_sdk;

import defpackage.hlo;
import defpackage.oap;
import defpackage.tso;
import defpackage.w1h;

/* loaded from: classes.dex */
public final class fh implements hlo {
    public final tso a;
    public final hlo b;
    public final /* synthetic */ byte c;

    public /* synthetic */ fh(hlo hloVar, tso tsoVar, byte b) {
        this.c = b;
        this.b = hloVar;
        this.a = tsoVar;
    }

    public /* synthetic */ fh(tso tsoVar, hlo hloVar, byte b) {
        this.c = b;
        this.a = tsoVar;
        this.b = hloVar;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.c;
        hlo hloVar = this.b;
        tso tsoVar = this.a;
        switch (b) {
            case 0:
                return new eh((jd1) tsoVar.get(), (oap) ((az1) hloVar).get());
            case 1:
                return new zx1((z2) ((ah0) tsoVar).get(), (uv2) ((a3) hloVar).get());
            case 2:
                f8 f8Var = (f8) ((g8) hloVar).get();
                qr0 qr0Var = (qr0) tsoVar.get();
                j53 j53Var = j53.a;
                o43 o43Var = o43.a;
                n63[] n63VarArr = n63.b;
                return new w32(f8Var, j53Var, o43Var, w1h.d(qr0Var, lw0.AD_SIZE));
            case 3:
                ee0 ee0Var = (ee0) ((h0) hloVar).get();
                qr0 qr0Var2 = (qr0) tsoVar.get();
                j53 j53Var2 = j53.b;
                o43 o43Var2 = o43.b;
                n63[] n63VarArr2 = n63.b;
                return new w32(ee0Var, j53Var2, o43Var2, w1h.d(qr0Var2, lw0.RTB_SIGNAL));
            case 4:
                e7 e7Var = (e7) ((o8) hloVar).get();
                qr0 qr0Var3 = (qr0) tsoVar.get();
                j53 j53Var3 = j53.a;
                o43 o43Var3 = o43.b;
                n63[] n63VarArr3 = n63.b;
                return new w32(e7Var, j53Var3, o43Var3, w1h.d(qr0Var3, lw0.AD_SPAM));
            case 5:
                w8 w8Var = (w8) ((b7) hloVar).get();
                qr0 qr0Var4 = (qr0) tsoVar.get();
                j53 j53Var4 = j53.a;
                o43 o43Var4 = o43.a;
                n63[] n63VarArr4 = n63.b;
                return new w32(w8Var, j53Var4, o43Var4, w1h.d(qr0Var4, lw0.AD_TYPE));
            case 6:
                at atVar = (at) ((bt) hloVar).get();
                qr0 qr0Var5 = (qr0) tsoVar.get();
                j53 j53Var5 = j53.b;
                o43 o43Var5 = o43.b;
                n63[] n63VarArr5 = n63.b;
                return new w32(atVar, j53Var5, o43Var5, w1h.d(qr0Var5, lw0.CLD));
            case 7:
                defpackage.pr prVar = (defpackage.pr) ((hl) hloVar).get();
                qr0 qr0Var6 = (qr0) tsoVar.get();
                j53 j53Var6 = j53.a;
                o43 o43Var6 = o43.b;
                n63[] n63VarArr6 = n63.b;
                return new w32(prVar, j53Var6, o43Var6, w1h.d(qr0Var6, lw0.NATIVE_AD));
            case 8:
                e7 e7Var2 = (e7) ((am) hloVar).get();
                qr0 qr0Var7 = (qr0) tsoVar.get();
                j53 j53Var7 = j53.b;
                o43 o43Var7 = o43.b;
                n63[] n63VarArr7 = n63.b;
                return new w32(e7Var2, j53Var7, o43Var7, w1h.d(qr0Var7, lw0.DEVICE_TIER));
            case 9:
                e7 e7Var3 = (e7) ((e6) hloVar).get();
                qr0 qr0Var8 = (qr0) tsoVar.get();
                j53 j53Var8 = j53.a;
                o43 o43Var8 = o43.a;
                n63[] n63VarArr8 = n63.b;
                return new w32(e7Var3, j53Var8, o43Var8, w1h.d(qr0Var8, lw0.ICON_AD));
            case 10:
                pb1 pb1Var = (pb1) ((e6) hloVar).get();
                qr0 qr0Var9 = (qr0) tsoVar.get();
                j53 j53Var9 = j53.b;
                o43 o43Var9 = o43.b;
                n63[] n63VarArr9 = n63.b;
                return new w32(pb1Var, j53Var9, o43Var9, w1h.d(qr0Var9, lw0.DISPLAY_COUNT));
            case 11:
                return new ql3((vz) ((ah0) tsoVar).get(), (ah3) ((ah0) hloVar).get());
            case 12:
                e7 e7Var4 = (e7) ((da) hloVar).get();
                qr0 qr0Var10 = (qr0) tsoVar.get();
                j53 j53Var10 = j53.b;
                o43 o43Var10 = o43.b;
                n63[] n63VarArr10 = n63.b;
                return new w32(e7Var4, j53Var10, o43Var10, w1h.d(qr0Var10, lw0.INSPECTOR_SIGNAL));
            default:
                qr0 qr0Var11 = (qr0) tsoVar.get();
                e7 e7Var5 = (e7) ((hf) hloVar).get();
                j53 j53Var11 = j53.b;
                o43 o43Var11 = o43.b;
                n63[] n63VarArr11 = n63.b;
                return new w32(e7Var5, j53Var11, o43Var11, w1h.d(qr0Var11, lw0.MEMORY));
        }
    }
}
