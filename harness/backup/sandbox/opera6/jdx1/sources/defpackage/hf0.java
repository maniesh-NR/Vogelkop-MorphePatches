package defpackage;

import ads_mobile_sdk.qb1;
import j$.util.Collection;
import java.util.AbstractList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class hf0 extends AbstractList implements Collection {
    public final /* synthetic */ byte a = 1;
    public final List b;
    public final Object c;

    public hf0(gip gipVar, djp djpVar) {
        this.b = gipVar;
        this.c = djpVar;
    }

    public hf0(jf0 jf0Var, int i, List list) {
        Objects.requireNonNull(jf0Var);
        this.c = jf0Var;
        this.b = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        switch (this.a) {
            case 0:
                this.b.add(i, obj);
                ((jf0) this.c).getClass();
                break;
            default:
                super.add(i, obj);
                break;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        byte b = this.a;
        List list = this.b;
        switch (b) {
            case 0:
                return list.get(i);
            default:
                djp djpVar = (djp) this.c;
                qb1 qb1Var = (qb1) ((gip) list);
                qb1Var.d(i);
                return djpVar.a(qb1Var.b[i]);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        switch (this.a) {
            case 0:
                Object objRemove = this.b.remove(i);
                ((jf0) this.c).getClass();
                return objRemove;
            default:
                return super.remove(i);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        switch (this.a) {
            case 0:
                Object obj2 = this.b.set(i, obj);
                ((jf0) this.c).getClass();
                return obj2;
            default:
                return super.set(i, obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.a) {
            case 0:
                return this.b.size();
            default:
                return ((qb1) ((gip) this.b)).c;
        }
    }
}
