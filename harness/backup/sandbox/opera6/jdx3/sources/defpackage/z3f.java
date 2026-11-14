package defpackage;

import android.net.Uri;
import com.opera.android.suggestion.Suggestion;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class z3f implements odb {
    public final x5f a;
    public final esk b;
    public final ghf c;
    public final LinkedHashSet d = new LinkedHashSet();

    public z3f(x5f x5fVar, esk eskVar, ghf ghfVar) {
        this.a = x5fVar;
        this.b = eskVar;
        this.c = ghfVar;
    }

    public final void a(Suggestion suggestion) {
        Object obj = suggestion.k;
        b58 b58Var = obj instanceof b58 ? (b58) obj : null;
        if (b58Var != null) {
            if (this.d.add(new y3f(b58Var.a, b58Var.b))) {
                c(b58Var.g);
            }
        }
    }

    public final void b(Suggestion suggestion) {
        Object obj = suggestion.k;
        b58 b58Var = obj instanceof b58 ? (b58) obj : null;
        if (b58Var == null) {
            return;
        }
        int i = b58Var.a;
        Integer num = b58Var.b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        x5f x5fVar = this.a;
        zpa zpaVar = x5fVar.d;
        x56 x56VarF = zpa.F();
        if0 if0VarC0 = x56VarF.B(zpaVar).C0();
        kq0 kq0VarL = zpa.L();
        kq0VarL.y().add(Long.valueOf(jCurrentTimeMillis));
        kq0VarL.e(5);
        x5fVar.d(if0VarC0, kq0VarL, i, num);
        x5fVar.U0(x56VarF);
        c(b58Var.f);
    }

    public final void c(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            arrayList2.add(this.c.L(((Uri) obj).toString(), p6l.a));
        }
        ArrayList arrayList3 = new ArrayList(k95.o(arrayList2, 10));
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            t9f t9fVar = (t9f) this.b.get();
            fvh fvhVar = new fvh();
            fvhVar.c();
            fvhVar.h((String) obj2);
            arrayList3.add(t9fVar.c(new kvh(fvhVar)));
        }
        int size3 = arrayList3.size();
        while (i < size3) {
            Object obj3 = arrayList3.get(i);
            i++;
            ((v84) obj3).enqueue(new j06((byte) 21));
        }
    }

    public final void reset() {
        LinkedHashSet<y3f> linkedHashSet = this.d;
        for (y3f y3fVar : linkedHashSet) {
            int i = y3fVar.a;
            Integer num = y3fVar.b;
            x5f x5fVar = this.a;
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            if0 if0VarC0 = x56VarF.B(zpaVar).C0();
            kq0 kq0VarL = zpa.L();
            kq0VarL.e(2);
            kq0VarL.e(6);
            x5fVar.d(if0VarC0, kq0VarL, i, num);
            x5fVar.U0(x56VarF);
        }
        linkedHashSet.clear();
    }
}
