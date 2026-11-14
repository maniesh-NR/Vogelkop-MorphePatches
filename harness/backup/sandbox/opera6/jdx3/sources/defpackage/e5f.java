package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class e5f implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ e5f(String str, String str2, byte b) {
        this.a = b;
        this.b = str;
        this.c = str2;
    }

    public final Object invoke(Object obj) {
        hf0 hf0Var;
        hf0 hf0Var2;
        if0 if0Var;
        byte b = this.a;
        String str = this.c;
        String str2 = this.b;
        switch (b) {
            case 0:
                ((jk0) obj).a(str2, new tx0(str, (byte) 25));
                break;
            case 1:
                ((jk0) obj).a(str2, new tx0(str, (byte) 26));
                break;
            case 2:
                ((jk0) obj).a(str2, new tx0(str, (byte) 24));
                break;
            case 3:
                af0 af0Var = (af0) ((ck0) obj).d().d.getValue();
                af0Var.a.getClass();
                bf0 bf0Var = new bf0(2443, -1, 2);
                ze0 ze0Var = af0Var.b;
                List list = (List) ze0Var.n(0);
                if (list == null || list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ze0Var.q(0, 1, arrayList);
                    hf0Var = new hf0(ze0Var, 0, arrayList);
                } else {
                    hf0Var = new hf0(ze0Var, 0, list);
                }
                hf0Var.add(bf0Var);
                if (str2 != null) {
                    bf0Var.x(0, str2);
                }
                bf0Var.x(1, str);
                break;
            case 4:
                tb0 tb0VarC = ((ck0) obj).c();
                e5f e5fVar = new e5f(str2, str, (byte) 5);
                tb0VarC.a.getClass();
                kt0 kt0Var = new kt0(2443, -1, 3);
                q56 q56Var = tb0VarC.b;
                List list2 = (List) q56Var.n(13);
                if (list2 == null || list2.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    q56Var.q(13, 1, arrayList2);
                    hf0Var2 = new hf0(q56Var, 13, arrayList2);
                } else {
                    hf0Var2 = new hf0(q56Var, 13, list2);
                }
                hf0Var2.add(kt0Var);
                e5fVar.invoke(new lt0(kt0Var));
                break;
            case 5:
                lt0 lt0Var = (lt0) obj;
                lt0Var.a.x(0, str2);
                kt0 kt0Var2 = lt0Var.a;
                kt0Var2.x(1, str);
                kt0Var2.x(2, "2.32.0");
                break;
            case 6:
                ms0 ms0Var = (ms0) ((ak0) obj).g.getValue();
                ms0Var.a.x(0, str2);
                ms0Var.a.x(1, str);
                break;
            case 7:
                tn0 tn0Var = (tn0) ((bk0) obj).c.getValue();
                if (str2 != null) {
                    tn0Var.a.x(2, str2);
                }
                if (str != null) {
                    tn0Var.a.x(3, str);
                }
                break;
            case 8:
                tn0 tn0Var2 = (tn0) ((bk0) obj).c.getValue();
                if (str2 != null) {
                    tn0Var2.a.x(9, str2);
                }
                if (str != null) {
                    tn0Var2.a.x(6, str);
                }
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                List listSingletonList = Collections.singletonList(str);
                zp0 zp0Var = ((aq0) obj).a;
                Map map = (Map) zp0Var.n(2);
                if (map == null || map.isEmpty()) {
                    HashMap map2 = new HashMap();
                    zp0Var.q(2, 1, map2);
                    if0Var = new if0(zp0Var, 2, map2);
                } else {
                    if0Var = new if0(zp0Var, 2, map);
                }
                if0Var.put(str2, listSingletonList);
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                Intent intent = (Intent) obj;
                intent.putExtra("android.intent.extra.TEXT", str2);
                intent.putExtra("android.intent.extra.SUBJECT", str);
                intent.putExtra("android.intent.extra.TITLE", str);
                intent.setType("text/plain");
                break;
            default:
                wa1 wa1Var = (wa1) obj;
                wa1Var.w(0, str2);
                wa1Var.w(1, str);
                break;
        }
        return Unit.a;
    }
}
