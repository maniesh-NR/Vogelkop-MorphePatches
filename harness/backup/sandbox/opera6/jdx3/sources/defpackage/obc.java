package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import com.leanplum.utils.SizeUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class obc extends nr9 implements Function0 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ obc(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    public final Object invoke() throws JSONException {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        byte b = this.a;
        vt0 vt0Var = vt0.b;
        ijm ijmVar = ijm.b;
        int i = 0;
        int i2 = 1;
        switch (b) {
            case 0:
                ((jbc) ((z84) this).receiver).c.a.invoke(bwg.G("https://www.opera.com/legal/privacy"), cc.b);
                break;
            case 1:
                ((jbc) ((z84) this).receiver).c.b.invoke();
                break;
            case 2:
                ((u5d) ((z84) this).receiver).d.a.invoke();
                break;
            case 3:
                r6d r6dVar = (u5d) ((z84) this).receiver;
                nak nakVar = r6dVar.f;
                if (!((Boolean) nakVar.getValue()).booleanValue()) {
                    do {
                        value = nakVar.getValue();
                        ((Boolean) value).getClass();
                    } while (!nakVar.h(value, Boolean.TRUE));
                    na2.B(o0g.Q(r6dVar), (CoroutineContext) null, (rx5) null, new a6d(r6dVar, (mt5) null, (byte) 4), 3).s(new x5d(r6dVar, (byte) 0));
                }
                break;
            case 4:
                nak nakVar2 = ((u5d) ((z84) this).receiver).v;
                do {
                    value2 = nakVar2.getValue();
                    ((Boolean) value2).getClass();
                } while (!nakVar2.h(value2, Boolean.FALSE));
            case 5:
                nak nakVar3 = ((u5d) ((z84) this).receiver).t;
                nakVar3.getClass();
                nakVar3.k((Object) null, yjm.a);
                break;
            case 6:
                ((u5d) ((z84) this).receiver).d.b.invoke();
                break;
            case 7:
                ((u5d) ((z84) this).receiver).d.c.invoke();
                break;
            case 8:
                ((u5d) ((z84) this).receiver).d.g.invoke();
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                r6d r6dVar2 = (u5d) ((z84) this).receiver;
                qn4 qn4Var = (rn4) r6dVar2.l.a.getValue();
                if (qn4Var instanceof qn4) {
                    List list = qn4Var.a;
                    g1b g1bVar = ((utm) r6dVar2.j.a.getValue()).b;
                    if (fr3.g(list, g1bVar).isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            om4 om4Var = (om4) obj;
                            if (!g1bVar.isEmpty()) {
                                Iterator it = g1bVar.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    if (((n01) it.next()).a == om4Var.a) {
                                        arrayList.add(obj);
                                    }
                                }
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
                        int size = arrayList.size();
                        while (i < size) {
                            Object obj2 = arrayList.get(i);
                            i++;
                            arrayList2.add(((om4) obj2).b);
                        }
                        g1b g1bVarU = rm5.U(arrayList2);
                        nak nakVar4 = r6dVar2.t;
                        zjm zjmVar = new zjm(g1bVarU);
                        nakVar4.getClass();
                        nakVar4.k((Object) null, zjmVar);
                    } else {
                        r6dVar2.d.f.invoke();
                    }
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((u5d) ((z84) this).receiver).d.h.invoke();
                break;
            case 11:
                nak nakVar5 = ((u5d) ((z84) this).receiver).v;
                do {
                    value3 = nakVar5.getValue();
                    ((Boolean) value3).getClass();
                } while (!nakVar5.h(value3, Boolean.TRUE));
            case 12:
                ((i8d) ((z84) this).receiver).g0();
                break;
            case 13:
                ((a9d) ((z84) this).receiver).getClass();
                vx3 vx3VarA = ay3.a("https://support-vpn-pro.opera.com/", lqm.d, false);
                vx3VarA.b = 3;
                o18.t(vx3VarA, true, vx3VarA);
                break;
            case 14:
                a9d a9dVar = (a9d) ((z84) this).receiver;
                ((x5f) a9dVar.h).Q0(vt0.e);
                fmk fmkVar = a9dVar.f;
                fmkVar.d.add(new w8d(a9dVar, i2));
                fmkVar.b();
                break;
            case 15:
                a9d a9dVar2 = (a9d) ((z84) this).receiver;
                ((x5f) a9dVar2.h).Q0(vt0.c);
                z77 z77Var = a9dVar2.i;
                int i3 = 0;
                int i4 = 0;
                Class<a9d> cls = a9d.class;
                pf5 pf5Var = new pf5(new obc(i4, a9dVar2, cls, "onSwitchToFreeDialogConfirmed", "onSwitchToFreeDialogConfirmed()V", i3, (byte) 20), new obc(i4, a9dVar2, cls, "onSwitchToFreeDialogClosed", "onSwitchToFreeDialogClosed()V", i3, (byte) 19), new obc(i4, a9dVar2, cls, "onSwitchToFreeDialogDismissed", "onSwitchToFreeDialogDismissed()V", i3, (byte) 21), 2132021717, 2132018564, 2132018111, new mf5((byte) 7));
                z77Var.getClass();
                z77Var.b(pf5Var, ijmVar);
                break;
            case 16:
                a9d a9dVar3 = (a9d) ((z84) this).receiver;
                ((x5f) a9dVar3.h).Q0(vt0.d);
                nv6 nv6VarB = a9dVar3.g.b();
                ((SharedPreferences.Editor) nv6VarB.a).putBoolean("vpn_pro.kill_switch.on", false);
                nv6VarB.w();
                nak nakVar6 = a9dVar3.p;
                Boolean bool = Boolean.FALSE;
                nakVar6.getClass();
                nakVar6.k((Object) null, bool);
                ysj ysjVar = a9dVar3.j;
                glj gljVar = new glj(new rxh(2132022250), 2500);
                ysjVar.getClass();
                ysjVar.b(gljVar, ijmVar);
                break;
            case 17:
                a9d a9dVar4 = (a9d) ((z84) this).receiver;
                u8d u8dVar = (u8d) a9dVar4.n.getValue();
                if (u8dVar == null || u8dVar.a != 3) {
                    fmk fmkVar2 = a9dVar4.f;
                    fmkVar2.d.add(new w8d(a9dVar4, i));
                    fmkVar2.b();
                } else {
                    ((x5f) a9dVar4.h).Q0(vt0Var);
                    yug.c(a9dVar4.k, 12, null, 6);
                }
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                a9d a9dVar5 = (a9d) ((z84) this).receiver;
                ((x5f) a9dVar5.h).Q0(vt0Var);
                yug.c(a9dVar5.k, 12, null, 6);
                break;
            case 19:
                ((x5f) ((a9d) ((z84) this).receiver).h).L(6, wb0.c, null);
                break;
            case SizeUtil.textSize0 /* 20 */:
                a9d a9dVar6 = (a9d) ((z84) this).receiver;
                ((x5f) a9dVar6.h).L(6, wb0.b, null);
                nv6 nv6VarB2 = a9dVar6.g.b();
                ((SharedPreferences.Editor) nv6VarB2.a).putBoolean("vpn_pro.kill_switch.on", true);
                nv6VarB2.w();
                nak nakVar7 = a9dVar6.p;
                Boolean bool2 = Boolean.TRUE;
                nakVar7.getClass();
                nakVar7.k((Object) null, bool2);
                ysj ysjVar2 = a9dVar6.j;
                glj gljVar2 = new glj(new rxh(2132019156), 2500);
                ysjVar2.getClass();
                ysjVar2.b(gljVar2, ijmVar);
                break;
            case 21:
                ((x5f) ((a9d) ((z84) this).receiver).h).L(6, wb0.d, null);
                break;
            case SizeUtil.textSize1 /* 22 */:
                ((crd) ((z84) this).receiver).g0();
                break;
            case 23:
                ((g8j) ((frd) ((z84) this).receiver).c).h();
                break;
            case SizeUtil.textSize2 /* 24 */:
                ((frd) ((z84) this).receiver).d.a(2132020583, lag.d);
                break;
            case 25:
                crd crdVar = (crd) ((z84) this).receiver;
                Context contextRequireContext = crdVar.requireContext();
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.parse("package:" + contextRequireContext.getPackageName()));
                intent.addCategory("android.intent.category.DEFAULT");
                crdVar.startActivity(intent);
                break;
            case 26:
                m0e m0eVar = (m0e) ((z84) this).receiver;
                if (Intrinsics.a(m0eVar.a.g(), ng.a)) {
                    m0eVar.b();
                }
                break;
            case 27:
                nak nakVar8 = ((i2e) ((z84) this).receiver).k;
                do {
                    value4 = nakVar8.getValue();
                } while (!nakVar8.h(value4, (Object) null));
            case 28:
                q2e q2eVar = (i2e) ((z84) this).receiver;
                w6j w6jVar = q2eVar.i;
                nek nekVar = (nek) ((nak) w6jVar.c).getValue();
                if (nekVar == null || (nekVar instanceof lek)) {
                    d3k d3kVar = (d3k) w6jVar.d;
                    if (d3kVar == null || !d3kVar.isActive()) {
                        ((nak) w6jVar.c).j((Object) null);
                        w6jVar.e = null;
                    }
                } else {
                    nak nakVar9 = q2eVar.l;
                    Boolean bool3 = Boolean.TRUE;
                    nakVar9.getClass();
                    nakVar9.k((Object) null, bool3);
                }
                break;
            default:
                ((i2e) ((z84) this).receiver).i.q();
                break;
        }
        return Unit.a;
    }
}
