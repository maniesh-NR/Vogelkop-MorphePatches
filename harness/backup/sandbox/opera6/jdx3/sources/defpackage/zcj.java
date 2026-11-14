package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zcj {
    public final Context a;
    public final umi b;
    public final qie c = new qie((byte) 19);
    public final oji d;

    public zcj(Context context, umi umiVar) {
        this.a = context;
        this.b = umiVar;
        this.d = new oji(context, (byte) 4);
    }

    public static Pair a(String str) {
        ArrayList arrayListR = aik.r(true, str, ':');
        if (arrayListR.size() != 2) {
            return null;
        }
        return Pair.create((String) arrayListR.get(0), (String) arrayListR.get(1));
    }

    public static HashMap d(ArrayList arrayList) {
        HashMap map = new HashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            an8 an8Var = (an8) obj;
            map.put(an8Var.getId(), an8Var);
        }
        return map;
    }

    public final void b(Intent intent, HashMap map) {
        try {
            Iterator<ResolveInfo> it = this.a.getPackageManager().queryIntentActivities(intent, 0).iterator();
            while (it.hasNext()) {
                idb idbVar = new idb(intent, it.next(), this);
                map.put(idbVar.getId(), idbVar);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList c(android.content.Intent r6, defpackage.b2l r7) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            if (r7 == 0) goto L3f
            r2 = r7
            d7l r2 = (defpackage.d7l) r2
            e7l r3 = r2.j
            org.chromium.ui.base.WindowAndroid r3 = r3.a0()
            if (r3 == 0) goto L3f
            e7l r3 = r2.j
            org.chromium.ui.base.WindowAndroid r3 = r3.a0()
            lyg r3 = defpackage.lyg.c(r3)
            boolean r4 = r2.o0()
            if (r4 != 0) goto L3f
            e7l r4 = r2.j
            boolean r4 = r4.r()
            if (r4 != 0) goto L3f
            e7l r2 = r2.j
            boolean r2 = r2.c0()
            if (r2 != 0) goto L3f
            boolean r2 = r3.d()
            if (r2 != 0) goto L3f
            kyg r2 = new kyg
            r2.<init>(r5, r7)
            goto L40
        L3f:
            r2 = r1
        L40:
            if (r2 == 0) goto L45
            r0.add(r2)
        L45:
            java.lang.String r7 = ocp.j(r6)
            if (r7 == 0) goto L59
            java.lang.String[] r2 = defpackage.wqm.a
            int r7 = J.N.Mhbidx2d(r7)
            r2 = 3
            if (r7 != r2) goto L59
            ofh r1 = new ofh
            r1.<init>(r5, r6)
        L59:
            if (r1 == 0) goto L5e
            r0.add(r1)
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zcj.c(android.content.Intent, b2l):java.util.ArrayList");
    }

    public final void e(String str) {
        this.c.n(new oml(this.b.c(new jri(this, str, (byte) 8))), null);
    }
}
