package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class r4o {
    public final x4o a;
    public final String b;
    public final List c;
    public final ArrayList d;
    public final ArrayList e = new ArrayList();
    public boolean f;
    public zpa g;

    static {
        qs7.B("WorkContinuationImpl");
    }

    public r4o(x4o x4oVar, String str, List list) {
        this.a = x4oVar;
        this.b = str;
        this.c = list;
        this.d = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            String string = ((off) list.get(i)).a.toString();
            this.d.add(string);
            this.e.add(string);
        }
    }

    public static HashSet b(r4o r4oVar) {
        HashSet hashSet = new HashSet();
        r4oVar.getClass();
        return hashSet;
    }

    public final zpa a() {
        if (this.f) {
            qs7 qs7VarX = qs7.x();
            TextUtils.join(", ", this.d);
            qs7VarX.getClass();
        } else {
            x4o x4oVar = this.a;
            this.g = a26.O(x4oVar.b.j, "EnqueueRunnable_KEEP", x4oVar.d.a, new m2n(this, (byte) 13));
        }
        return this.g;
    }
}
