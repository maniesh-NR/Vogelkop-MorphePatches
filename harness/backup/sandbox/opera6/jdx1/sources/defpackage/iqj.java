package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class iqj implements bi5, Iterable, ptb {
    public int b;
    public int d;
    public int e;
    public boolean g;
    public int h;
    public HashMap j;
    public jde k;
    public int[] a = new int[0];
    public Object[] c = new Object[0];
    public final Object f = new Object();
    public ArrayList i = new ArrayList();

    public final int b(qt9 qt9Var) {
        if (this.g) {
            mh5.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!qt9Var.a()) {
            bpg.a("Anchor refers to a group that was removed");
        }
        return qt9Var.a;
    }

    public final void c() {
        this.j = new HashMap();
    }

    public final hqj d() {
        if (this.g) {
            qp2.n("Cannot read while a writer is pending");
            return null;
        }
        this.e++;
        return new hqj(this);
    }

    public final lqj e() {
        if (this.g) {
            mh5.a("Cannot start a writer when another writer is pending");
        }
        if (this.e > 0) {
            mh5.a("Cannot start a writer when a reader is pending");
        }
        this.g = true;
        this.h++;
        return new lqj(this);
    }

    public final boolean f(qt9 qt9Var) {
        int iC;
        return qt9Var.a() && (iC = kqj.c(this.i, qt9Var.a, this.b)) >= 0 && Intrinsics.a(this.i.get(iC), qt9Var);
    }

    public final xt9 g(int i) {
        int i2;
        ArrayList arrayList;
        int iC;
        HashMap map = this.j;
        if (map != null) {
            if (this.g) {
                mh5.a("use active SlotWriter to crate an anchor for location instead");
            }
            qt9 qt9Var = (i < 0 || i >= (i2 = this.b) || (iC = kqj.c((arrayList = this.i), i, i2)) < 0) ? null : (qt9) arrayList.get(iC);
            if (qt9Var != null) {
                return (xt9) map.get(qt9Var);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new f5a(this, 0, this.b);
    }
}
