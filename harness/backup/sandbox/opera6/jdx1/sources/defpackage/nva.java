package defpackage;

import android.util.Rational;
import android.util.Size;
import androidx.core.app.NotificationCompat;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class nva implements psm {
    public final /* synthetic */ byte a;
    public final fee b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nva(byte b) {
        this(fee.k(), (byte) 0);
        this.a = b;
        switch (b) {
            case 1:
                this(fee.k(), (byte) 1);
                break;
            case 2:
                this(fee.k(), (byte) 2);
                break;
            default:
                break;
        }
    }

    public nva(fee feeVar, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = feeVar;
                an2 an2Var = fcl.Dp;
                Class cls = (Class) feeVar.b(an2Var, null);
                if (cls != null && !cls.equals(ewa.class)) {
                    kp5.d("Invalid target class configuration for ", this, ": ", cls);
                    throw null;
                }
                feeVar.s(qsm.Sp, ssm.a);
                feeVar.s(an2Var, ewa.class);
                an2 an2Var2 = fcl.Cp;
                if (feeVar.b(an2Var2, null) == null) {
                    feeVar.s(an2Var2, ewa.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            case 2:
                this.b = feeVar;
                an2 an2Var3 = fcl.Dp;
                Class cls2 = (Class) feeVar.b(an2Var3, null);
                if (cls2 != null && !cls2.equals(swg.class)) {
                    kp5.d("Invalid target class configuration for ", this, ": ", cls2);
                    throw null;
                }
                feeVar.s(qsm.Sp, ssm.b);
                feeVar.s(an2Var3, swg.class);
                an2 an2Var4 = fcl.Cp;
                if (feeVar.b(an2Var4, null) == null) {
                    feeVar.s(an2Var4, swg.class.getCanonicalName() + "-" + UUID.randomUUID());
                }
                an2 an2Var5 = hya.op;
                if (((Integer) feeVar.b(an2Var5, -1)).intValue() == -1) {
                    feeVar.s(an2Var5, 2);
                    return;
                }
                return;
            case 3:
                this.b = feeVar;
                if (!feeVar.a.containsKey(j3n.b)) {
                    qp2.o("VideoOutput is required");
                    throw null;
                }
                an2 an2Var6 = fcl.Dp;
                Class cls3 = (Class) feeVar.b(an2Var6, null);
                if (cls3 != null && !cls3.equals(y2n.class)) {
                    kp5.d("Invalid target class configuration for ", this, ": ", cls3);
                    throw null;
                }
                feeVar.s(qsm.Sp, ssm.d);
                feeVar.s(an2Var6, y2n.class);
                an2 an2Var7 = fcl.Cp;
                if (feeVar.b(an2Var7, null) == null) {
                    feeVar.s(an2Var7, y2n.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            default:
                this.b = feeVar;
                an2 an2Var8 = fcl.Dp;
                Class cls4 = (Class) feeVar.b(an2Var8, null);
                if (cls4 != null && !cls4.equals(qva.class)) {
                    kp5.d("Invalid target class configuration for ", this, ": ", cls4);
                    throw null;
                }
                feeVar.s(qsm.Sp, ssm.c);
                feeVar.s(an2Var8, qva.class);
                an2 an2Var9 = fcl.Cp;
                if (feeVar.b(an2Var9, null) == null) {
                    feeVar.s(an2Var9, qva.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public nva(k4n k4nVar) {
        this.a = (byte) 3;
        fee feeVarK = fee.k();
        feeVarK.s(j3n.b, k4nVar);
        feeVarK.s(qsm.Vp, Boolean.valueOf(k4nVar.e()));
        this(feeVarK, (byte) 3);
    }

    public final ewa a() {
        Integer numValueOf = Integer.valueOf(NotificationCompat.FLAG_LOCAL_ONLY);
        an2 an2Var = fwa.e;
        fee feeVar = this.b;
        Integer num = (Integer) feeVar.b(an2Var, null);
        if (num != null) {
            feeVar.s(txa.gp, num);
        } else {
            bwa bwaVar = ewa.D;
            an2 an2Var2 = fwa.f;
            if (Objects.equals(feeVar.b(an2Var2, null), 2)) {
                feeVar.s(txa.gp, 32);
            } else if (Objects.equals(feeVar.b(an2Var2, null), 3)) {
                feeVar.s(txa.gp, 32);
                feeVar.s(txa.hp, numValueOf);
            } else if (Objects.equals(feeVar.b(an2Var2, null), 1)) {
                feeVar.s(txa.gp, 4101);
                feeVar.s(txa.ip, ip7.c);
            } else {
                feeVar.s(txa.gp, numValueOf);
            }
        }
        fwa fwaVar = new fwa(wrf.f(feeVar));
        hya.t(fwaVar);
        ewa ewaVar = new ewa(fwaVar);
        Size size = (Size) feeVar.b(hya.pp, null);
        if (size != null) {
            ewaVar.w = new Rational(size.getWidth(), size.getHeight());
        }
        jpo.m((Executor) feeVar.b(sjb.wp, tjb.a()), "The IO executor can't be null");
        an2 an2Var3 = fwa.c;
        if (feeVar.a.containsKey(an2Var3)) {
            Integer num2 = (Integer) feeVar.i(an2Var3);
            if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                s49.l(num2, "The flash mode is not allowed to set: ");
                return null;
            }
            if (num2.intValue() == 3 && feeVar.b(fwa.j, null) == null) {
                qp2.o("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
                return null;
            }
        }
        return ewaVar;
    }

    @Override // defpackage.gk8
    public final fee i() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // defpackage.psm
    public final qsm v() {
        byte b = this.a;
        fee feeVar = this.b;
        switch (b) {
            case 0:
                return new tva(wrf.f(feeVar));
            case 1:
                return new fwa(wrf.f(feeVar));
            case 2:
                return new twg(wrf.f(feeVar));
            default:
                return new j3n(wrf.f(feeVar));
        }
    }
}
