package defpackage;

import android.app.assist.AssistStructure;
import android.os.Parcelable;
import android.view.autofill.AutofillId;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class c39 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c39(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ c39(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        nf2 nf2Var = null;
        Float fValueOf = null;
        fza fzaVar = m3c.S;
        zpa zpaVar = hh5.a;
        int i = 0;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.f;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj7;
                x77 x77Var = (x77) obj6;
                sq2 sq2Var = (sq2) obj4;
                String str = (String) obj3;
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj5;
                AssistStructure.ViewNode viewNode = (AssistStructure.ViewNode) obj;
                String str2 = (String) obj2;
                if (!viewNode.isEnabled() || viewNode.getVisibility() != 0 || viewNode.getAutofillType() != 1) {
                    break;
                } else {
                    AutofillId autofillId = viewNode.getAutofillId();
                    ir5 ir5Var = p09.a;
                    int autofillType = viewNode.getAutofillType();
                    ir5Var.getClass();
                    Parcelable parcelable = autofillType != 1 ? autofillType != 2 ? autofillType != 3 ? autofillType != 4 ? p09.b : p09.d : p09.f : p09.e : p09.c;
                    if (autofillId != null && parcelable != p09.b && !arrayList.contains(autofillId)) {
                        qye[] qyeVarArr = ((rye) x77Var.b).a;
                        int length = qyeVarArr.length;
                        while (true) {
                            if (i < length) {
                                nf2 nf2VarK = qyeVarArr[i].k(viewNode);
                                if (nf2VarK == null) {
                                    i++;
                                } else {
                                    nf2Var = nf2VarK;
                                }
                            }
                        }
                        Object h2gVar = sq2Var != null ? new h2g(str2, sq2Var) : str2 != null ? new i2g(str2, str) : new g2g(str);
                        Object obj8 = linkedHashMap.get(h2gVar);
                        Object obj9 = obj8;
                        if (obj8 == null) {
                            ArrayList arrayList2 = new ArrayList();
                            linkedHashMap.put(h2gVar, arrayList2);
                            obj9 = arrayList2;
                        }
                        ((List) obj9).add(new f39(viewNode, nf2Var));
                        arrayList.add(autofillId);
                        break;
                    } else {
                        break;
                    }
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                ic4.e((ue5) obj7, (ue5) obj6, (ue5) obj4, (ue5) obj3, (ue5) obj5, (ih5) obj, aoh.m(385));
                break;
            case 2:
                ((Integer) obj2).getClass();
                oup.I((g2e) obj7, (jk8) obj6, (Function1) obj4, (Function1) obj3, (c8e) obj5, (ih5) obj, aoh.m(1));
                break;
            case 3:
                c8e c8eVar = (c8e) obj7;
                afe afeVar = (afe) obj6;
                ue5 ue5Var = (ue5) obj4;
                xg5 xg5Var = (xg5) obj3;
                ruj rujVar = (ruj) obj5;
                vt9 vt9Var = (ih5) obj;
                int iIntValue = ((Integer) obj2).intValue();
                vt9 vt9Var2 = vt9Var;
                if (vt9Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objK = vt9Var2.K();
                    Object obj10 = objK;
                    if (objK == zpaVar) {
                        gb1 gb1Var = new gb1(afeVar, (byte) 14);
                        vt9Var2.g0(gb1Var);
                        obj10 = gb1Var;
                    }
                    c8e c8eVarH = na2.H(c8eVar, (Function1) obj10);
                    tfd tfdVarC = nr3.c(rbe.b, false);
                    int iHashCode = Long.hashCode(vt9Var2.T);
                    oag oagVarL = vt9Var2.l();
                    c8e c8eVarP = qyn.P(vt9Var2, c8eVarH);
                    bh5.To.getClass();
                    vt9Var2.a0();
                    if (vt9Var2.S) {
                        vt9Var2.k(fzaVar);
                    } else {
                        vt9Var2.j0();
                    }
                    y4h.o(vt9Var2, tfdVarC, ujp.f);
                    y4h.o(vt9Var2, oagVarL, ujp.e);
                    y4h.o(vt9Var2, Integer.valueOf(iHashCode), ujp.g);
                    y4h.m(vt9Var2);
                    y4h.o(vt9Var2, c8eVarP, ujp.d);
                    ue5Var.invoke(vt9Var2, 0);
                    aof aofVar = (aof) ((t0g) xg5Var.a.b).getValue();
                    if (aofVar != null) {
                        vt9Var2.W(-1427232958);
                        voh vohVar = (voh) afeVar.getValue();
                        cuj cujVar = rujVar.d;
                        float f = 0.0f;
                        if (vohVar != null && !cujVar.a.isEmpty()) {
                            u39 u39Var = new u39(y1j.c(new d82(cujVar, (byte) 1), new o5f(vohVar, (byte) 12)));
                            if (u39Var.hasNext()) {
                                float fMin = ((voh) u39Var.next()).b;
                                while (u39Var.hasNext()) {
                                    fMin = Math.min(fMin, ((voh) u39Var.next()).b);
                                }
                                fValueOf = Float.valueOf(fMin);
                            }
                            if (fValueOf != null) {
                                float fFloatValue = vohVar.d - fValueOf.floatValue();
                                if (fFloatValue >= 0.0f) {
                                    f = fFloatValue;
                                }
                            }
                        }
                        ic4.b(xg5Var.a, aofVar, a26.b0(as3.a.a(z7e.b, rbe.i), 0.0f, 0.0f, 0.0f, ((n27) vt9Var2.j(mi5.h)).k0(f), 7), vt9Var2, 0);
                        vt9Var2.p(false);
                    } else {
                        vt9Var2.W(-1426709213);
                        vt9Var2.p(false);
                    }
                    vt9Var2.p(true);
                } else {
                    vt9Var2.Q();
                }
                break;
            case 4:
                break;
            case 5:
                c8e c8eVar2 = (c8e) obj7;
                afe afeVar2 = (afe) obj6;
                ue5 ue5Var2 = (ue5) obj4;
                fb3 fb3Var = (fb3) obj3;
                Function0 function0 = (Function0) obj5;
                vt9 vt9Var3 = (ih5) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                vt9 vt9Var4 = vt9Var3;
                if (vt9Var4.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objK2 = vt9Var4.K();
                    Object obj11 = objK2;
                    if (objK2 == zpaVar) {
                        gb1 gb1Var2 = new gb1(afeVar2, (byte) 15);
                        vt9Var4.g0(gb1Var2);
                        obj11 = gb1Var2;
                    }
                    c8e c8eVarH2 = na2.H(c8eVar2, (Function1) obj11);
                    tfd tfdVarC2 = nr3.c(rbe.b, true);
                    int iHashCode2 = Long.hashCode(vt9Var4.T);
                    oag oagVarL2 = vt9Var4.l();
                    c8e c8eVarP2 = qyn.P(vt9Var4, c8eVarH2);
                    bh5.To.getClass();
                    vt9Var4.a0();
                    if (vt9Var4.S) {
                        vt9Var4.k(fzaVar);
                    } else {
                        vt9Var4.j0();
                    }
                    y4h.o(vt9Var4, tfdVarC2, ujp.f);
                    y4h.o(vt9Var4, oagVarL2, ujp.e);
                    y4h.o(vt9Var4, Integer.valueOf(iHashCode2), ujp.g);
                    y4h.m(vt9Var4);
                    y4h.o(vt9Var4, c8eVarP2, ujp.d);
                    ue5Var2.invoke(vt9Var4, 0);
                    fb3Var.b(function0, vt9Var4, 6);
                    vt9Var4.p(true);
                } else {
                    vt9Var4.Q();
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                r9h.d((msi) obj7, (Function0) obj6, (Function1) obj4, (Function0) obj3, (Function0) obj5, (ih5) obj, aoh.m(9));
                break;
            default:
                ((Integer) obj2).getClass();
                r9h.k((b3m) obj7, (w2m) obj6, this.d, this.e, (h49) obj5, (ih5) obj, aoh.m(1));
                break;
        }
        return Unit.a;
    }
}
