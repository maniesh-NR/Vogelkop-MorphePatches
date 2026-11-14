package defpackage;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.textclassifier.TextClassification;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class f9 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f9(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ f9(Function1 function1, afe afeVar, afe afeVar2) {
        this.a = (byte) 11;
        this.c = function1;
        this.b = afeVar;
        this.d = afeVar2;
    }

    public /* synthetic */ f9(mq5 mq5Var, vnm vnmVar, unb unbVar, qpi qpiVar) {
        this.a = (byte) 24;
        this.b = mq5Var;
        this.c = unbVar;
        this.d = qpiVar;
    }

    public /* synthetic */ f9(mqh mqhVar, opi opiVar, mqh mqhVar2, sp6 sp6Var) {
        this.a = (byte) 26;
        this.b = mqhVar;
        this.c = opiVar;
        this.d = mqhVar2;
    }

    public /* synthetic */ f9(sf1 sf1Var, Function0 function0, c61 c61Var) {
        this.a = (byte) 28;
        this.b = sf1Var;
        this.d = function0;
        this.c = c61Var;
    }

    private final Object a(Object obj) {
        gbc gbcVar = (gbc) this.b;
        long j = ((mil) this.c).b;
        i9f i9fVar = (i9f) this.d;
        mk7 mk7Var = (mk7) obj;
        ojl ojlVarD = gbcVar.d();
        if (ojlVarD != null) {
            sh4 sh4VarA = mk7Var.s0().A();
            long j2 = ((xjl) gbcVar.A.getValue()).a;
            long j3 = ((xjl) gbcVar.B.getValue()).a;
            njl njlVar = ojlVarD.a;
            mjl mjlVar = njlVar.a;
            xbe xbeVar = njlVar.b;
            zg zgVar = gbcVar.y;
            long j4 = gbcVar.z;
            if (!xjl.c(j2)) {
                zgVar.D(j4);
                int i = i9fVar.i(xjl.f(j2));
                int i2 = i9fVar.i(xjl.e(j2));
                if (i != i2) {
                    sh4VarA.q(njlVar.i(i, i2), zgVar);
                }
            } else if (!xjl.c(j3)) {
                long jB = mjlVar.b.b();
                u95 u95Var = new u95(jB);
                if (jB == 16) {
                    u95Var = null;
                }
                long j5 = u95Var != null ? u95Var.a : u95.b;
                zgVar.D(u95.b(j5, u95.c(j5) * 0.2f));
                int i3 = i9fVar.i(xjl.f(j3));
                int i4 = i9fVar.i(xjl.e(j3));
                if (i3 != i4) {
                    sh4VarA.q(njlVar.i(i3, i4), zgVar);
                }
            } else if (!xjl.c(j)) {
                zgVar.D(j4);
                int i5 = i9fVar.i(xjl.f(j));
                int i6 = i9fVar.i(xjl.e(j));
                if (i5 != i6) {
                    sh4VarA.q(njlVar.i(i5, i6), zgVar);
                }
            }
            long j6 = njlVar.c;
            boolean z = ((((float) ((int) (j6 >> 32))) > xbeVar.d ? 1 : (((float) ((int) (j6 >> 32))) == xbeVar.d ? 0 : -1)) < 0 || xbeVar.c || (((float) ((int) (j6 & 4294967295L))) > xbeVar.e ? 1 : (((float) ((int) (j6 & 4294967295L))) == xbeVar.e ? 0 : -1)) < 0) && mjlVar.f != 3;
            if (z) {
                voh vohVarA = bwg.a(0L, (Float.floatToRawIntBits((int) (j6 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j6 & 4294967295L)) & 4294967295L));
                sh4VarA.j();
                sh4.r(sh4VarA, vohVarA);
            }
            rwj rwjVar = mjlVar.b.a;
            bgl bglVar = rwjVar.m;
            oil oilVar = rwjVar.a;
            if (bglVar == null) {
                bglVar = bgl.b;
            }
            bgl bglVar2 = bglVar;
            jaj jajVar = rwjVar.n;
            if (jajVar == null) {
                jajVar = jaj.d;
            }
            jaj jajVar2 = jajVar;
            a39 a39Var = rwjVar.p;
            if (a39Var == null) {
                a39Var = a39.a;
            }
            a39 a39Var2 = a39Var;
            try {
                dz3 dz3VarC = oilVar.c();
                oil oilVar2 = oil.a;
                if (dz3VarC != null) {
                    xbe.j(xbeVar, sh4VarA, dz3VarC, oilVar != oilVar2 ? oilVar.b() : 1.0f, jajVar2, bglVar2, a39Var2);
                } else {
                    xbe.i(xbeVar, sh4VarA, oilVar != oilVar2 ? oilVar.a() : u95.b, jajVar2, bglVar2, a39Var2);
                }
                if (z) {
                    sh4VarA.f();
                }
            } finally {
            }
        }
        return Unit.a;
    }

    private final Object b(Object obj) {
        mqh mqhVar = (mqh) this.b;
        opi opiVar = (opi) this.c;
        mqh mqhVar2 = (mqh) this.d;
        ve1 ve1Var = (ve1) obj;
        float fFloatValue = ((Number) ve1Var.e.getValue()).floatValue() - mqhVar.a;
        float fA = opiVar.a(fFloatValue);
        mqhVar.a = ((Number) ve1Var.e.getValue()).floatValue();
        mqhVar2.a = ((Number) ve1Var.a.b.invoke(ve1Var.f)).floatValue();
        if (Math.abs(fFloatValue - fA) > 0.5f) {
            ve1Var.a();
        }
        return Unit.a;
    }

    private final Object c(Object obj) {
        kfl kflVar = (kfl) this.b;
        Context context = (Context) this.c;
        xfl xflVar = (xfl) this.d;
        rs5 rs5Var = (rs5) obj;
        List list = kflVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sfl sflVar = (jfl) list.get(i);
            if (sflVar instanceof sfl) {
                sfl sflVar2 = sflVar;
                rs5.b(rs5Var, new whf(sflVar2, (byte) 18), sflVar2.c != 0 ? new ue5(-1930700965, new kx4(sflVar2, (byte) 1), true) : null, new gb3(sflVar2, xflVar, (byte) 21), 6);
            } else if (sflVar instanceof yfl) {
                yfl yflVar = (yfl) sflVar;
                if (context != null) {
                    int i2 = yflVar.c;
                    TextClassification textClassification = yflVar.b;
                    Drawable drawable = yflVar.d;
                    if (i2 < 0) {
                        byte b = 13;
                        rs5.b(rs5Var, new nqi(textClassification, b), drawable != null ? new ue5(-1123224187, new rfl(drawable, (byte) 0), true) : null, new eek(context, textClassification, b), 6);
                    } else {
                        RemoteAction remoteAction = textClassification.getActions().get(i2);
                        rs5.b(rs5Var, new nqi((Object) remoteAction, (byte) 14), drawable != null ? new ue5(1106162332, new rfl(drawable, (byte) 1), true) : null, new p7l((Object) remoteAction, (byte) 3), 6);
                    }
                }
            } else if (sflVar instanceof wfl) {
                rs5Var.a.add(f03.d);
            }
        }
        return Unit.a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x044d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 3090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f9.invoke(java.lang.Object):java.lang.Object");
    }
}
