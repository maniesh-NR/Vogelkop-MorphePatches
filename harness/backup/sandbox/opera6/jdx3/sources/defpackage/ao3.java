package defpackage;

import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class ao3 implements Function1 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ao3(long j, long j2, String str, String str2) {
        this.d = str;
        this.e = str2;
        this.b = j;
        this.c = j2;
    }

    public /* synthetic */ ao3(nvj nvjVar, long j, long j2, nk7 nk7Var) {
        this.d = nvjVar;
        this.b = j;
        this.c = j2;
        this.e = nk7Var;
    }

    public final Object invoke(Object obj) {
        if0 if0Var;
        if0 if0Var2;
        byte b = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                o3c o3cVar = (o3c) obj;
                o3cVar.a();
                mk7.E0(o3cVar, (nvj) obj3, this.b, this.c, 0.0f, (nk7) obj2, 104);
                break;
            default:
                String str = (String) obj3;
                String str2 = (String) obj2;
                hi0 hi0Var = (hi0) obj;
                hi0Var.a.getClass();
                on0 on0Var = new on0(2443, -1, 1);
                fi0 fi0Var = hi0Var.b;
                Map map = (Map) fi0Var.n(44);
                if (map == null || map.isEmpty()) {
                    HashMap map2 = new HashMap();
                    fi0Var.q(44, 1, map2);
                    if0Var = new if0(fi0Var, 44, map2);
                } else {
                    if0Var = new if0(fi0Var, 44, map);
                }
                if0Var.put(str, on0Var);
                pn0 pn0Var = new pn0(2443, -1, 2);
                Map map3 = (Map) on0Var.n(0);
                if (map3 == null || map3.isEmpty()) {
                    HashMap map4 = new HashMap();
                    on0Var.q(0, 1, map4);
                    if0Var2 = new if0(on0Var, 0, map4);
                } else {
                    if0Var2 = new if0(on0Var, 0, map3);
                }
                if0Var2.put(str2, pn0Var);
                pn0Var.p(0, 1, this.b);
                pn0Var.p(1, 1, this.c);
                break;
        }
        return Unit.a;
    }
}
