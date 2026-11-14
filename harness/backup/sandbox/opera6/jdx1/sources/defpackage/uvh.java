package defpackage;

import android.content.Context;
import androidx.collection.ArrayMap;
import com.bumptech.glide.a;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class uvh extends u83 {
    public final Context p;
    public final kwh q;
    public final Class r;
    public final ry9 s;
    public rv9 t;
    public Object u;
    public boolean v;

    static {
    }

    public uvh(a aVar, kwh kwhVar, Class cls, Context context) {
        rwh rwhVar;
        this.q = kwhVar;
        this.r = cls;
        this.p = context;
        ArrayMap arrayMap = kwhVar.a.c.e;
        rv9 rv9Var = (rv9) arrayMap.get(cls);
        if (rv9Var == null) {
            for (Map.Entry entry : arrayMap.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    rv9Var = (rv9) entry.getValue();
                }
            }
        }
        this.t = rv9Var == null ? ry9.i : rv9Var;
        this.s = aVar.c;
        Iterator it = kwhVar.j.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                h9o.t();
                throw null;
            }
        }
        synchronized (kwhVar) {
            rwhVar = kwhVar.k;
        }
        b(rwhVar);
    }

    @Override // defpackage.u83
    /* renamed from: c */
    public final u83 clone() {
        uvh uvhVar = (uvh) super.clone();
        uvhVar.t = uvhVar.t.clone();
        return uvhVar;
    }

    @Override // defpackage.u83
    public final Object clone() {
        uvh uvhVar = (uvh) super.clone();
        uvhVar.t = uvhVar.t.clone();
        return uvhVar;
    }

    @Override // defpackage.u83
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final uvh b(u83 u83Var) {
        qyn.k(u83Var);
        return (uvh) super.b(u83Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(defpackage.zbl r18) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uvh.t(zbl):void");
    }
}
