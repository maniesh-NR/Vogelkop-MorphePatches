package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class q00 extends k43 {
    public final /* synthetic */ byte k;
    public final /* synthetic */ s00 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0126 A[Catch: Exception -> 0x018e, TryCatch #1 {Exception -> 0x018e, blocks: (B:47:0x0116, B:49:0x0126, B:51:0x0130, B:53:0x0134, B:55:0x013f, B:58:0x014e), top: B:90:0x0116 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018e A[PHI: r1
      0x018e: PHI (r1v7 boolean) = (r1v6 boolean), (r1v17 boolean), (r1v18 boolean), (r1v13 boolean) binds: [B:86:0x018e, B:48:0x0124, B:50:0x012e, B:101:0x018e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q00(defpackage.s00 r20, android.app.Activity r21, defpackage.zy r22, defpackage.dl r23, byte r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q00.<init>(s00, android.app.Activity, zy, dl, byte):void");
    }

    @Override // defpackage.k43
    public void a() throws Resources.NotFoundException {
        byte b = this.k;
        s00 s00Var = this.l;
        switch (b) {
            case 0:
                if (!s00.v) {
                    Context context = s00Var.j;
                    String str = this.c;
                    chb chbVar = new chb(context, str);
                    chbVar.e(new qii());
                    if (!TextUtils.isEmpty(s00Var.t)) {
                        String str2 = s00Var.t;
                        if (!TextUtils.isEmpty(str2) && !str2.equals(g1p.h)) {
                            g1p.h = str2;
                        }
                    }
                    double[] dArrR = s00Var.r();
                    if (dArrR != null) {
                        chbVar.d(dArrR[0], dArrR[1]);
                    }
                    chbVar.r.b = ahb.a;
                    chbVar.q = new l45(this, chbVar, str);
                    chbVar.b = new qe6(chbVar, (byte) 21);
                    pqo pqoVar = chbVar.h;
                    pqoVar.e = (byte) 3;
                    pqoVar.f = false;
                    if (s00Var.m() != null) {
                        Resources resources = s00Var.m().getResources();
                        String string = resources.getString(2132017287);
                        String string2 = resources.getString(2132017288);
                        String string3 = resources.getString(2132017311);
                        String string4 = resources.getString(2132017310);
                        String string5 = resources.getString(2132017308);
                        String string6 = resources.getString(2132017309);
                        String string7 = resources.getString(2132017312);
                        chbVar.k = string;
                        chbVar.l = string2;
                        chbVar.m = string3;
                        ArrayList arrayList = chbVar.n;
                        if (arrayList == null) {
                            chbVar.n = new ArrayList(5);
                        } else {
                            arrayList.clear();
                        }
                        if (!TextUtils.isEmpty(string4)) {
                            chbVar.n.add(new rmo(string4, 1));
                        }
                        if (!TextUtils.isEmpty(string5)) {
                            chbVar.n.add(new rmo(string5, 2));
                        }
                        if (!TextUtils.isEmpty(string6)) {
                            chbVar.n.add(new rmo(string6, 3));
                        }
                        if (!TextUtils.isEmpty(string7)) {
                            chbVar.n.add(new rmo(string7, 4));
                        }
                    }
                    pqo pqoVar2 = new pqo(pqoVar);
                    chbVar.c(pqoVar2).h(pqoVar2, new roj(chbVar, pqoVar2, (byte) 25));
                    break;
                } else {
                    b(false, bqi.n("ads provider not available", s00Var.g), false, v50.k, null);
                    break;
                }
                break;
            default:
                if (!s00.v) {
                    i();
                    break;
                } else {
                    b(false, bqi.n("ads provider not available", s00Var.g), false, null, null);
                    break;
                }
        }
    }

    public void g(cie cieVar) {
        pqo pqoVar = new pqo(cieVar.h);
        cieVar.c(pqoVar).h(pqoVar, new roj(cieVar, pqoVar, (byte) 25));
    }

    public void h(cie cieVar, String str, p00 p00Var) {
        if (cieVar.d.d()) {
            b(false, "Facebook bidding is no longer supported", false, null, null);
        } else {
            j(cieVar, str, p00Var);
        }
    }

    public final void i() {
        p00 p00Var = new p00();
        s00 s00Var = this.l;
        Context context = s00Var.j;
        dro droVar = dro.c;
        String str = this.c;
        cie cieVar = new cie(context, str, droVar);
        cieVar.V = -1;
        cieVar.W = -1.0f;
        cieVar.z0 = z1m.b;
        cieVar.q0 = true;
        cieVar.b = new s9i(this, cieVar, str, p00Var, (byte) 3);
        cieVar.T = y55.a;
        cieVar.e(new ydp((byte) 15));
        double[] dArrR = s00Var.r();
        if (dArrR != null) {
            cieVar.d(dArrR[0], dArrR[1]);
        }
        if (!TextUtils.isEmpty(s00Var.t)) {
            String str2 = s00Var.t;
            if (!TextUtils.isEmpty(str2) && !str2.equals(g1p.h)) {
                g1p.h = str2;
            }
        }
        pqo pqoVar = cieVar.h;
        pqoVar.e = (byte) 3;
        pqoVar.f = false;
        g(cieVar);
    }

    public final void j(cie cieVar, String str, p00 p00Var) {
        int i = s00.w + 1;
        s00.w = i;
        i3j i3jVar = this.l.h;
        ap apVarA = ap.a(cieVar.e);
        String str2 = cieVar.q;
        String[] strArr = aik.a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = cieVar.r;
        String str4 = str3 != null ? str3 : "";
        String str5 = cieVar.p;
        String str6 = cieVar.o;
        StringBuilder sbH = u35.h(str, ",");
        sbH.append(String.valueOf(i));
        d(new w10(str2, str4, str5, str6, sbH.toString(), str, this.d, cieVar.t, cieVar, p00Var, i3jVar, apVarA));
    }
}
