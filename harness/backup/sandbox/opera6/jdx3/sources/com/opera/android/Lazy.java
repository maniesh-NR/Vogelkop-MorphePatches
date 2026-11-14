package com.opera.android;

import com.opera.api.Callback;
import defpackage.bg1;
import defpackage.sz5;
import defpackage.umi;
import defpackage.vx;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class Lazy implements esk {
    public static final sz5 c = new sz5(2);
    public static final Object d = new Object();
    public final ArrayList a = new ArrayList();
    public volatile Object b = d;

    public static void e(Lazy lazy, umi umiVar) {
        if (lazy.c()) {
            return;
        }
        umiVar.b(new vx(lazy, (byte) 20)).a(null);
    }

    public void a(bg1 bg1Var) {
        if (c()) {
            bg1Var.run(get());
            return;
        }
        synchronized (this.a) {
            if (!c()) {
                ArrayList arrayList = this.a;
                if (arrayList.size() != 1 || arrayList.get(0) != c) {
                    this.a.add(bg1Var);
                    return;
                }
            }
            bg1Var.run(get());
        }
    }

    public void b(bg1 bg1Var) {
        synchronized (this.a) {
            this.a.remove(bg1Var);
        }
    }

    public boolean c() {
        return this.b != d;
    }

    public abstract Object d();

    public final Object f() {
        if (c()) {
            return get();
        }
        return null;
    }

    public void g(Object obj) {
    }

    public final Object get() {
        int i;
        boolean z;
        ArrayList arrayList;
        Object obj = this.b;
        Object obj2 = d;
        if (obj != obj2) {
            return this.b;
        }
        synchronized (this) {
            i = 0;
            if (this.b == obj2) {
                this.b = d();
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            Object obj3 = this.b;
            g(obj3);
            synchronized (this.a) {
                arrayList = new ArrayList(this.a);
                this.a.clear();
                this.a.add(c);
            }
            int size = arrayList.size();
            while (i < size) {
                Object obj4 = arrayList.get(i);
                i++;
                ((Callback) obj4).run(obj3);
            }
        }
        return this.b;
    }
}
