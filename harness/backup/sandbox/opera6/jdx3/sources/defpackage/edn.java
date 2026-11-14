package defpackage;

import android.content.Context;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public final class edn extends cej implements ddn {
    public final int a;
    public final tvk b;

    public edn(int i, tvk tvkVar) {
        this.a = i;
        this.b = tvkVar;
    }

    @Override // defpackage.ddn
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ddn
    public final void cancel() {
        finish(hjm.b);
    }

    @Override // defpackage.cej
    public final dej createSheet(mej mejVar, b2l b2lVar) {
        pxh rxhVar;
        pxh sxhVar;
        rxh rxhVar2;
        rxh rxhVar3;
        zu5 zu5Var;
        boolean z;
        pxh pxhVar;
        t5d t5dVar;
        rxh rxhVar4;
        pxh sxhVar2;
        zu5 zu5Var2;
        Context context = mejVar.getContext();
        String[] strArr = OperaApplication.K;
        ydn ydnVarR = ((OperaApplication) context.getApplicationContext()).R();
        pxh rxhVar5 = new rxh(2132022260);
        kw0 kw0Var = new kw0(context);
        rxh rxhVar6 = new rxh(2132020040);
        rxh rxhVar7 = new rxh(2132022130);
        zu5 zu5Var3 = new zu5((Object) ydnVarR, (Object) b2lVar, (byte) 9);
        if (o18.h(context, rxhVar7) == 0) {
            rxhVar7 = null;
            zu5Var3 = null;
        }
        int iA = vep.A(this.a);
        byte b = 2;
        boolean z2 = true;
        if (iA == 1) {
            rxhVar = new rxh(2132022141);
        } else if (iA == 2) {
            rxhVar = new rxh(2132022142);
        } else {
            if (iA != 3) {
                if (iA != 4) {
                    rxhVar2 = rxhVar6;
                    rxhVar3 = rxhVar7;
                    zu5Var = zu5Var3;
                    z = false;
                    sxhVar = null;
                    pxhVar = rxhVar5;
                    return new qf(mejVar, new gua(kw0Var, null, null, null, pxhVar, sxhVar, null, rxhVar2, null, rxhVar3, zu5Var, z, null, false, null), b);
                }
                rxh rxhVar8 = new rxh(2132017591);
                gom gomVarA = mom.a(context);
                if (gomVarA.a == lom.a) {
                    sxhVar2 = new sxh(2132022061, new Object[]{rxhVar8});
                    rxhVar4 = new rxh(2132020155);
                    rxhVar6 = null;
                    zu5Var2 = null;
                } else {
                    try {
                        t5dVar = (t5d) q9n.l(context, t5d.class);
                    } catch (IllegalArgumentException unused) {
                        t5dVar = null;
                    }
                    pxh sxhVar3 = new sxh(2132022057, new Object[]{rxhVar8});
                    rxh rxhVar9 = new rxh(2132022056);
                    zu5 zu5Var4 = new zu5((Object) t5dVar, (Object) gomVarA, (byte) 10);
                    if (o18.h(context, rxhVar9) == 0) {
                        rxhVar9 = null;
                        zu5Var4 = null;
                    }
                    rxhVar4 = rxhVar9;
                    sxhVar2 = sxhVar3;
                    z2 = false;
                    zu5Var2 = zu5Var4;
                }
                sxhVar = new sxh(2132022144, new Object[]{rxhVar8});
                pxhVar = sxhVar2;
                rxhVar2 = rxhVar6;
                rxhVar3 = rxhVar4;
                zu5Var = zu5Var2;
                z = z2;
                return new qf(mejVar, new gua(kw0Var, null, null, null, pxhVar, sxhVar, null, rxhVar2, null, rxhVar3, zu5Var, z, null, false, null), b);
            }
            rxhVar = new rxh(2132022143);
        }
        sxhVar = rxhVar;
        rxhVar2 = rxhVar6;
        rxhVar3 = rxhVar7;
        zu5Var = zu5Var3;
        z = false;
        pxhVar = rxhVar5;
        return new qf(mejVar, new gua(kw0Var, null, null, null, pxhVar, sxhVar, null, rxhVar2, null, rxhVar3, zu5Var, z, null, false, null), b);
    }

    @Override // defpackage.cej
    public final void onFinished(hjm hjmVar) {
        ((cdn) this.b.a).o = null;
    }
}
