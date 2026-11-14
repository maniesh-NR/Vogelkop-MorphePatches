package defpackage;

import com.leanplum.internal.Constants;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class p7p {
    public static final LinkedHashSet c = new LinkedHashSet();
    public static final LinkedHashSet d = new LinkedHashSet();
    public final voo a;
    public final LinkedHashSet b = new LinkedHashSet();

    public p7p(voo vooVar) {
        this.a = vooVar;
    }

    public static void c(String str, List list, LinkedHashSet linkedHashSet) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (linkedHashSet.add(str + ":ping_trackers")) {
            vbp vbpVar = vbp.b;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                dap dapVar = dap.a;
                dap.c(str2, p9p.j, new p9p((byte) 11, 1), vbpVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(defpackage.p8p r3, java.util.List r4, java.util.LinkedHashSet r5) {
        /*
            boolean r0 = r3 instanceof defpackage.r5p
            r1 = 58
            if (r0 == 0) goto L20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r3.a
            r0.append(r2)
            r0.append(r1)
            r1 = r3
            r5p r1 = (defpackage.r5p) r1
            int r1 = r1.l
        L18:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L38
        L20:
            boolean r0 = r3 instanceof defpackage.ebp
            java.lang.String r2 = r3.a
            if (r0 == 0) goto L37
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r1)
            r1 = r3
            ebp r1 = (defpackage.ebp) r1
            int r1 = r1.l
            goto L18
        L37:
            r0 = r2
        L38:
            boolean r1 = r5.add(r0)
            if (r1 == 0) goto L41
            defpackage.p8p.a(r3)
        L41:
            c(r0, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p7p.e(p8p, java.util.List, java.util.LinkedHashSet):void");
    }

    public final void a(int i) {
        voo vooVar = this.a;
        e(new ebp(i, vooVar.l, Double.valueOf(vooVar.k), vooVar.c, vooVar.b.a, vooVar.j), null, this.b);
    }

    public final void b(Integer num, Long l, Long l2) {
        voo vooVar = this.a;
        e(new wfp(vooVar.c, vooVar.b.a, vooVar.j, vooVar.l, d1p.e().a(), Boolean.valueOf(d1p.e().c), Double.valueOf(vooVar.k), num, l, l2), vooVar.d(), this.b);
    }

    public final void d(String str, Map map) {
        u9d u9dVar = new u9d();
        u9dVar.putAll(map);
        voo vooVar = this.a;
        u9dVar.put(Constants.Params.REQUEST_ID, vooVar.c);
        u9dVar.put("placementId", vooVar.b.a);
        u9dVar.put("crId", vooVar.j);
        u9dVar.put("connectionType", d1p.e().a());
        u9dVar.put("b.vpn", String.valueOf(d1p.e().c));
        u9d u9dVarG = u9dVar.g();
        p8p.Companion.getClass();
        String string = StringsKt.l0(str).toString();
        if (string.length() <= 0) {
            string = null;
        }
        n8p n8pVar = string != null ? new n8p(string, u9dVarG) : null;
        if (n8pVar != null) {
            p8p.a(n8pVar);
        }
    }

    public final void f() {
        voo vooVar = this.a;
        e(new xjo(vooVar.c, vooVar.b.a, vooVar.j, vooVar.l), null, this.b);
    }

    public final void g(int i, String str) {
        pfp.c(new xz3(this, i, str));
    }
}
