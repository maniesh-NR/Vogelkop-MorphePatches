package defpackage;

import androidx.collection.ArrayMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class lyh implements ac6, xb6 {
    public final cj6 a;
    public final bj6 b;
    public int c;
    public int d = -1;
    public hub e;
    public List f;
    public int g;
    public volatile u7e h;
    public File i;
    public myh j;

    public lyh(bj6 bj6Var, cj6 cj6Var) {
        this.b = bj6Var;
        this.a = cj6Var;
    }

    @Override // defpackage.ac6
    public final boolean c() {
        List list;
        boolean z;
        List list2;
        boolean z2;
        ArrayList arrayListC;
        ArrayList arrayListA = this.b.a();
        if (arrayListA.isEmpty()) {
            return false;
        }
        bj6 bj6Var = this.b;
        tah tahVar = bj6Var.c.b;
        Class<?> cls = bj6Var.d.getClass();
        Class cls2 = bj6Var.g;
        Class cls3 = bj6Var.k;
        f1p f1pVar = (f1p) tahVar.i;
        lbe lbeVar = (lbe) ((AtomicReference) f1pVar.a).getAndSet(null);
        if (lbeVar == null) {
            lbeVar = new lbe(cls, cls2, cls3);
        } else {
            lbeVar.a = cls;
            lbeVar.b = cls2;
            lbeVar.c = cls3;
        }
        synchronized (((ArrayMap) f1pVar.b)) {
            list = (List) ((ArrayMap) f1pVar.b).get(lbeVar);
        }
        ((AtomicReference) f1pVar.a).set(lbeVar);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            k5o k5oVar = (k5o) tahVar.c;
            synchronized (k5oVar) {
                arrayListC = ((d5o) k5oVar.b).C(cls);
            }
            int size = arrayListC.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListC.get(i);
                i++;
                ArrayList arrayListJ = ((mgh) tahVar.b).j((Class) obj, cls2);
                int size2 = arrayListJ.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayListJ.get(i2);
                    i2++;
                    Class cls4 = (Class) obj2;
                    if (!((vk) tahVar.g).a(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            z = false;
            f1p f1pVar2 = (f1p) tahVar.i;
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            synchronized (((ArrayMap) f1pVar2.b)) {
                ((ArrayMap) f1pVar2.b).put(new lbe(cls, cls2, cls3), listUnmodifiableList);
            }
            list2 = arrayList;
        } else {
            z = false;
            list2 = list;
        }
        if (list2.isEmpty()) {
            if (File.class.equals(this.b.k)) {
                return z;
            }
            StringBuilder sb = new StringBuilder("Failed to find any load path from ");
            sb.append(this.b.d.getClass());
            t14.g(sb, " to ", this.b.k);
            return z;
        }
        while (true) {
            List list3 = this.f;
            if (list3 != null && this.g < list3.size()) {
                this.h = null;
                while (!z && this.g < this.f.size()) {
                    List list4 = this.f;
                    int i3 = this.g;
                    this.g = i3 + 1;
                    v7e v7eVar = (v7e) list4.get(i3);
                    File file = this.i;
                    bj6 bj6Var2 = this.b;
                    this.h = v7eVar.a(file, bj6Var2.e, bj6Var2.f, bj6Var2.i);
                    if (this.h != null && this.b.c(this.h.c.a()) != null) {
                        this.h.c.e(this.b.o, this);
                        z = true;
                    }
                }
                return z;
            }
            int i4 = this.d + 1;
            this.d = i4;
            if (i4 >= list2.size()) {
                int i5 = this.c + 1;
                this.c = i5;
                if (i5 >= arrayListA.size()) {
                    return z;
                }
                this.d = z ? 1 : 0;
            }
            hub hubVar = (hub) arrayListA.get(this.c);
            Class cls5 = (Class) list2.get(this.d);
            f2m f2mVarE = this.b.e(cls5);
            bj6 bj6Var3 = this.b;
            this.j = new myh(bj6Var3.c.a, hubVar, bj6Var3.n, bj6Var3.e, bj6Var3.f, f2mVarE, cls5, bj6Var3.i);
            File fileC = bj6Var3.h.a().c(this.j);
            this.i = fileC;
            if (fileC != null) {
                this.e = hubVar;
                this.f = this.b.c.b.u(fileC);
                z2 = false;
                this.g = 0;
            } else {
                z2 = false;
            }
            z = z2;
        }
    }

    @Override // defpackage.ac6
    public final void cancel() {
        u7e u7eVar = this.h;
        if (u7eVar != null) {
            u7eVar.c.cancel();
        }
    }

    @Override // defpackage.xb6
    public final void d(Exception exc) {
        this.a.b(this.j, exc, this.h.c, 4);
    }

    @Override // defpackage.xb6
    public final void g(Object obj) {
        this.a.a(this.e, obj, this.h.c, 4, this.j);
    }
}
