package defpackage;

import android.content.Context;
import android.util.ArraySet;
import com.opera.android.favorites.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class cul {
    public boolean d;
    public HashSet e;
    public final i32 h;
    public final ArraySet a = new ArraySet();
    public final ArrayList b = new ArrayList();
    public final HashMap c = new HashMap();
    public final ArrayList f = new ArrayList();
    public final h7f g = new h7f();

    public cul(Context context, umi umiVar) {
        i32 i32Var = new i32(this, context, umiVar);
        this.h = i32Var;
        i32Var.h();
    }

    public final boolean a(int i, String str) {
        ArrayList arrayList;
        int i2 = 0;
        while (true) {
            arrayList = this.b;
            if (i2 < arrayList.size()) {
                bul bulVar = (bul) this.c.get(arrayList.get(i2));
                if (i > (bulVar != null ? bulVar.b.get() : 0)) {
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        if (i2 >= 5) {
            return false;
        }
        arrayList.add(i2, str);
        while (arrayList.size() > 5) {
            arrayList.remove(arrayList.size() - 1);
        }
        return true;
    }

    public final void b() {
        h7f h7fVar = this.g;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        if (g7fVarH.hasNext()) {
            throw am2.j(g7fVarH);
        }
    }

    public final void c(hq8 hq8Var) {
        String strC = hq8Var.c();
        HashMap map = this.c;
        bul bulVar = (bul) map.get(strC);
        if (bulVar == null) {
            bulVar = new bul(strC);
            map.put(strC, bulVar);
        }
        AtomicInteger atomicInteger = bulVar.b;
        atomicInteger.incrementAndGet();
        bulVar.c.set(System.currentTimeMillis());
        d();
        this.b.remove(strC);
        if (a(atomicInteger.get(), strC)) {
            b();
        }
    }

    public final void d() {
        if (this.d) {
            this.h.g(new ArrayList(this.c.values()));
        }
    }

    public final void e() {
        ArrayList arrayList = this.b;
        arrayList.clear();
        for (bul bulVar : this.c.values()) {
            a(bulVar.b.get(), bulVar.a);
        }
        if (arrayList.size() < 5) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                g6e g6eVar = (g6e) it.next();
                aul aulVar = new aul(this, (byte) 0);
                byte b = g6eVar.a;
                Object obj = g6eVar.b;
                switch (b) {
                    case 0:
                        e eVar = (e) obj;
                        eVar.f(new hpd(eVar, aulVar, (byte) 11));
                        break;
                    default:
                        l08 l08Var = (List) ((mdh) obj).h.g();
                        if (l08Var == null) {
                            l08Var = l08.a;
                        }
                        aulVar.run(l08Var);
                        break;
                }
            }
        }
        b();
    }
}
