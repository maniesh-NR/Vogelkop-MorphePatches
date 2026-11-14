package defpackage;

import android.content.Intent;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final /* synthetic */ class u5f implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    public /* synthetic */ u5f(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    public final Object invoke(Object obj) throws Exception {
        if0 if0Var;
        if0 if0Var2;
        if0 if0Var3;
        if0 if0Var4;
        if0 if0Var5;
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 0:
                wu0 wu0Var = (wu0) ((hi0) obj).e.getValue();
                zbe zbeVar = new zbe((byte) 29);
                wu0Var.a.getClass();
                bv0 bv0Var = new bv0(2443, -1, 1);
                vu0 vu0Var = wu0Var.b;
                Map map = (Map) vu0Var.n(2);
                if (map == null || map.isEmpty()) {
                    HashMap map2 = new HashMap();
                    vu0Var.q(2, 1, map2);
                    if0Var = new if0(vu0Var, 2, map2);
                } else {
                    if0Var = new if0(vu0Var, 2, map);
                }
                if0Var.put(str, bv0Var);
                zbeVar.invoke(new cv0(bv0Var));
                return Unit.a;
            case 1:
                t56 t56Var = ((yj0) obj).b;
                Map map3 = (Map) t56Var.n(17);
                if (map3 == null || map3.isEmpty()) {
                    HashMap map4 = new HashMap();
                    t56Var.q(17, 1, map4);
                    if0Var2 = new if0(t56Var, 17, map4);
                } else {
                    if0Var2 = new if0(t56Var, 17, map3);
                }
                if0Var2.put(str, 1L);
                return Unit.a;
            case 2:
                t56 t56Var2 = ((yj0) obj).b;
                Map map5 = (Map) t56Var2.n(15);
                if (map5 == null || map5.isEmpty()) {
                    HashMap map6 = new HashMap();
                    t56Var2.q(15, 1, map6);
                    if0Var3 = new if0(t56Var2, 15, map6);
                } else {
                    if0Var3 = new if0(t56Var2, 15, map5);
                }
                if0Var3.put(str, 1L);
                return Unit.a;
            case 3:
                qf0 qf0Var = ((vf0) ((zj0) obj).c.getValue()).a;
                qf0Var.getClass();
                qf0Var.q(0, str == null ? 0 : 1, str);
                return Unit.a;
            case 4:
                rf0 rf0Var = ((wf0) ((ak0) obj).d.getValue()).a;
                rf0Var.getClass();
                rf0Var.q(0, 1, str);
                return Unit.a;
            case 5:
                bk0 bk0Var = (bk0) obj;
                bk0Var.a.getClass();
                k70 k70Var = new k70(2431, -1, 1);
                w56 w56Var = bk0Var.b;
                Map map7 = (Map) w56Var.n(16);
                if (map7 == null || map7.isEmpty()) {
                    HashMap map8 = new HashMap();
                    w56Var.q(16, 1, map8);
                    if0Var4 = new if0(w56Var, 16, map8);
                } else {
                    if0Var4 = new if0(w56Var, 16, map7);
                }
                if0Var4.put(str, k70Var);
                k70Var.p(0, 1, 1L);
                return Unit.a;
            case 6:
                bk0 bk0Var2 = (bk0) obj;
                bk0Var2.a.getClass();
                se0 se0Var = new se0(2431, -1, 1);
                w56 w56Var2 = bk0Var2.b;
                Map map9 = (Map) w56Var2.n(17);
                if (map9 == null || map9.isEmpty()) {
                    HashMap map10 = new HashMap();
                    w56Var2.q(17, 1, map10);
                    if0Var5 = new if0(w56Var2, 17, map10);
                } else {
                    if0Var5 = new if0(w56Var2, 17, map9);
                }
                if0Var5.put(str, se0Var);
                se0Var.p(0, 1, 1L);
                return Unit.a;
            case 7:
                ((wa1) obj).w(0, str);
                return Unit.a;
            case 8:
                ((wa1) obj).w(0, str);
                return Unit.a;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((wa1) obj).w(0, str);
                return Unit.a;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                o0j.d((q0j) obj, str);
                return Unit.a;
            case 11:
                Intent intent = (Intent) obj;
                intent.putExtra("android.intent.extra.TEXT", str);
                intent.setType("text/plain");
                return Unit.a;
            case 12:
                return StringsKt.d0(str, (IntRange) obj);
            case 13:
                xtb[] xtbVarArr = o0j.a;
                ((q0j) obj).b(n0j.O, str);
                return Unit.a;
            case 14:
                wsk wskVarH = ((osk) obj).h("DELETE FROM activity WHERE url = ?");
                try {
                    wskVarH.h(1, str);
                    wskVarH.n();
                    wskVarH.close();
                    return Unit.a;
                } catch (Throwable th) {
                    wskVarH.close();
                    throw th;
                }
            case 15:
                return Boolean.valueOf(Intrinsics.a(((ldo) obj).a, str));
            default:
                return Boolean.valueOf(Intrinsics.a(((ldo) obj).a, str));
        }
    }
}
