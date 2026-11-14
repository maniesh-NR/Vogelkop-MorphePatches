package defpackage;

import android.content.ContextWrapper;
import android.content.Intent;
import android.webkit.ValueCallback;
import com.opera.android.FullscreenWebActivity;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class hda implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hda(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ hda(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public final Object invoke(Object obj, Object obj2) throws oye {
        x4l x4lVar;
        gpk i9cVar;
        x4l x4lVar2;
        byte b = this.a;
        byte b2 = 12;
        Object obj3 = this.b;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                y9m.a((n01) obj4, (c8e) obj3, (ih5) obj, aoh.m(49));
                break;
            case 1:
                ((Integer) obj2).getClass();
                y9m.e((hca) obj4, (c8e) obj3, (ih5) obj, aoh.m(1));
                break;
            case 2:
                s3c s3cVar = (s3c) obj4;
                Function2 function2 = (Function2) obj3;
                ih5 ih5Var = (ih5) obj;
                int iIntValue = ((Integer) obj2).intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Boolean bool = (Boolean) s3cVar.g.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    vt9Var.Z(bool);
                    boolean zG = vt9Var.g(zBooleanValue);
                    if (zBooleanValue) {
                        function2.invoke(vt9Var, 0);
                    } else {
                        if (vt9Var.l != 0) {
                            mh5.a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!vt9Var.S) {
                            if (zG) {
                                hqj hqjVar = vt9Var.G;
                                int i = hqjVar.g;
                                int i2 = hqjVar.h;
                                jh5 jh5Var = vt9Var.M;
                                jh5Var.getClass();
                                jh5Var.d(false);
                                jh5Var.b.l.J0(zpf.d);
                                gyg.R(vt9Var.s, i, i2);
                                vt9Var.G.t();
                            } else {
                                vt9Var.P();
                            }
                        }
                    }
                    if (vt9Var.y && vt9Var.G.i == vt9Var.z) {
                        vt9Var.z = -1;
                        vt9Var.y = false;
                    }
                    vt9Var.p(false);
                } else {
                    vt9Var.Q();
                }
                break;
            case 3:
                j5c j5cVar = (j5c) obj4;
                i5c i5cVar = (i5c) obj3;
                ih5 ih5Var2 = (ih5) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                vt9 vt9Var2 = (vt9) ih5Var2;
                if (vt9Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    k5c k5cVar = (k5c) j5cVar.b.invoke();
                    int iC = i5cVar.c;
                    Object obj5 = i5cVar.a;
                    if ((iC >= k5cVar.getItemCount() || !k5cVar.d(iC).equals(obj5)) && (iC = k5cVar.c(obj5)) != -1) {
                        i5cVar.c = iC;
                    }
                    int i3 = iC;
                    if (i3 != -1) {
                        vt9Var2.W(-1664741271);
                        x7d.c(k5cVar, j5cVar.a, i3, i5cVar.a, vt9Var2, 0);
                        vt9Var2.p(false);
                    } else {
                        vt9Var2.W(-1664505826);
                        vt9Var2.p(false);
                    }
                    boolean zH = vt9Var2.h(i5cVar);
                    Object objK = vt9Var2.K();
                    if (zH || objK == hh5.a) {
                        objK = new nna((Object) i5cVar, (byte) 14);
                        vt9Var2.g0(objK);
                    }
                    rm5.b(obj5, (Function1) objK, vt9Var2);
                } else {
                    vt9Var2.Q();
                }
                break;
            case 4:
                break;
            case 5:
                ue5 ue5Var = (ue5) obj4;
                z6c z6cVar = (z6c) obj3;
                ih5 ih5Var3 = (ih5) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                vt9 vt9Var3 = (vt9) ih5Var3;
                if (vt9Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ue5Var.invoke(z6cVar, vt9Var3, 0);
                } else {
                    vt9Var3.Q();
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                f8c.i((m7c) obj4, (c8e) obj3, (ih5) obj, aoh.m(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                f8c.l((vol) obj4, (c8e) obj3, (ih5) obj, aoh.m(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                f8c.b((p7c) obj4, (c8e) obj3, (ih5) obj, aoh.m(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                f8c.e((Function0) obj4, (c8e) obj3, (ih5) obj, aoh.m(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                alo.c((jbc) obj4, (c8e) obj3, (ih5) obj, aoh.m(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                ui6.e((gcc) obj4, (c8e) obj3, (ih5) obj, aoh.m(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                qbe.e((u5d) obj4, (c8e) obj3, (ih5) obj, aoh.m(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                mkh.c((c2e) obj4, (Function0) obj3, (ih5) obj, aoh.m(1));
                break;
            case 14:
                wye wyeVar = (wye) obj4;
                tye tyeVar = (tye) obj3;
                sh4 sh4Var = (sh4) obj;
                q3a q3aVar = (q3a) obj2;
                m3c m3cVar = wyeVar.u;
                if (m3cVar.I()) {
                    wyeVar.P = sh4Var;
                    wyeVar.O = q3aVar;
                    ((tuj) p3c.a(m3cVar).K.a).e(wyeVar, wye.V, tyeVar);
                    wyeVar.S = false;
                } else {
                    wyeVar.S = true;
                }
                break;
            case 15:
                dkf dkfVar = (dkf) obj4;
                ue5 ue5Var2 = (ue5) obj3;
                ih5 ih5Var4 = (ih5) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                vt9 vt9Var4 = (vt9) ih5Var4;
                if (vt9Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    kfo.c(j41.b.a(dkfVar), ue5Var2, vt9Var4, 0);
                } else {
                    vt9Var4.Q();
                }
                break;
            case 16:
                ((Integer) obj2).getClass();
                fr3.e((g7j) obj4, (ue5) obj3, (ih5) obj, aoh.m(49));
                break;
            case 17:
                ((Integer) obj2).getClass();
                phj.q((fff) obj4, (c8e) obj3, (ih5) obj, aoh.m(49));
                break;
            case 18:
                zx1 zx1Var = (zx1) obj4;
                ContextWrapper contextWrapper = (ContextWrapper) obj3;
                String str = (String) obj;
                lqm lqmVar = (lqm) obj2;
                if (zx1Var == null || !zx1Var.test(str)) {
                    ac8.b(new ay3(ay3.a(str, lqmVar, false)));
                } else {
                    FullscreenWebActivity.z0(contextWrapper, str, new qxh(""));
                }
                break;
            case 19:
                nmf nmfVar = (nmf) obj4;
                rhc rhcVar = (rhc) obj3;
                ih5 ih5Var5 = (ih5) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                vt9 vt9Var5 = (vt9) ih5Var5;
                if (vt9Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    hyf hyfVar = nmfVar.b;
                    u95 u95Var = nmfVar.c;
                    wta.b(hyfVar, null, mpj.h(z7e.b, nmfVar.d), u95Var != null ? u95Var.a : rhcVar.c, vt9Var5, 56, 0);
                } else {
                    vt9Var5.Q();
                }
                break;
            case 20:
                Function0 function0 = (Function0) obj4;
                bsj bsjVar = (bsj) obj3;
                ih5 ih5Var6 = (ih5) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                vt9 vt9Var6 = (vt9) ih5Var6;
                if (vt9Var6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    zvf zvfVar = b24.a;
                    yi4.k(function0, (c8e) null, false, (paj) null, b24.g(((sa5) vt9Var6.j(ua5.a)).e, vt9Var6), (zvf) null, gyg.P(1478119361, new j04(bsjVar, (byte) 12), vt9Var6), vt9Var6, 805306368, 494);
                } else {
                    vt9Var6.Q();
                }
                break;
            case 21:
                ue5 ue5Var3 = (ue5) obj4;
                afe afeVar = (afe) obj3;
                ih5 ih5Var7 = (ih5) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                vt9 vt9Var7 = (vt9) ih5Var7;
                if (vt9Var7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    rof.b(((oof) afeVar.getValue()).a, ((oof) afeVar.getValue()).b, ue5Var3, vt9Var7, 384);
                } else {
                    vt9Var7.Q();
                }
                break;
            case 22:
                mqh mqhVar = (mqh) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                mqhVar.a += ((o6c) obj3).b.a(fFloatValue - mqhVar.a);
                break;
            case 23:
                ((Integer) obj2).getClass();
                ((reg) obj4).content((wf5) obj3, (ih5) obj, aoh.m(1));
                break;
            case 24:
                v8g v8gVar = (v8g) obj4;
                b9d b9dVar = (b9d) obj3;
                ValueCallback valueCallback = (ValueCallback) obj;
                Intent intent = (Intent) obj2;
                ValueCallback valueCallback2 = v8gVar.a;
                if (valueCallback2 != null) {
                    valueCallback2.onReceiveValue(null);
                }
                v8gVar.a = valueCallback;
                b9dVar.a(intent, null);
                break;
            case 25:
                fsl fslVar = (fsl) obj4;
                Function0 function02 = (Function0) obj3;
                ih5 ih5Var8 = (ih5) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                vt9 vt9Var8 = (vt9) ih5Var8;
                if (vt9Var8.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    na2.c(gyg.P(-932581186, new a7b(fslVar, (byte) 24), vt9Var8), gyg.P(1646787519, new is1(function02, b2), vt9Var8), null, null, vt9Var8, 54, 12);
                } else {
                    vt9Var8.Q();
                }
                break;
            case 26:
                ((Integer) obj2).getClass();
                mkh.d((bng) obj4, (c8e) obj3, (ih5) obj, aoh.m(1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                jpo.g((t2i) obj4, (c8e) obj3, (ih5) obj, aoh.m(1));
                break;
            case 28:
                mqh mqhVar2 = (mqh) obj4;
                float fFloatValue2 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                float f = mqhVar2.a;
                mqhVar2.a = ((toi) obj3).a(fFloatValue2 - f) + f;
                break;
            default:
                ynj ynjVar = (ynj) obj4;
                doj dojVar = ynjVar.a;
                eoj eojVar = (eoj) obj3;
                int iIntValue9 = ((Integer) obj).intValue();
                int iIntValue10 = ((Integer) obj2).intValue();
                ynjVar.f = null;
                if (iIntValue9 <= 1 || iIntValue10 != 1) {
                    a5l a5lVar = ynjVar.k.b;
                    String str2 = dojVar.a;
                    p6l p6lVar = dojVar.b;
                    xnj xnjVar = new xnj(ynjVar, (byte) 0);
                    a5lVar.getClass();
                    int iOrdinal = p6lVar.ordinal();
                    if (iOrdinal == 0) {
                        x4lVar = (x4l) ((LinkedHashMap) a5lVar.c.b).get(str2);
                    } else if (iOrdinal != 1) {
                        h9o.p();
                        break;
                    } else {
                        x4lVar = (x4l) ((LinkedHashMap) a5lVar.d.b).get(str2);
                    }
                    if (x4lVar == null || x4lVar.b()) {
                        i9cVar = new i9c(a5lVar, str2, p6lVar, xnjVar);
                    } else {
                        xnjVar.invoke(x4lVar);
                        i9cVar = a5l.l;
                    }
                    ynjVar.g = i9cVar;
                } else {
                    ynjVar.a(aoj.a);
                    a5l a5lVar2 = eojVar.b;
                    String str3 = dojVar.a;
                    p6l p6lVar2 = dojVar.b;
                    bli bliVar = new bli((byte) 25);
                    a5lVar2.getClass();
                    int iOrdinal2 = p6lVar2.ordinal();
                    if (iOrdinal2 == 0) {
                        x4lVar2 = (x4l) ((LinkedHashMap) a5lVar2.c.b).get(str3);
                    } else if (iOrdinal2 != 1) {
                        h9o.p();
                        break;
                    } else {
                        x4lVar2 = (x4l) ((LinkedHashMap) a5lVar2.d.b).get(str3);
                    }
                    if (x4lVar2 == null || x4lVar2.b()) {
                        new i9c(a5lVar2, str3, p6lVar2, bliVar);
                    } else {
                        bliVar.invoke(x4lVar2);
                        gpk gpkVar = a5l.l;
                    }
                }
                break;
        }
        return Unit.a;
    }
}
