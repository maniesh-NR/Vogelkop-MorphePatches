package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class qf1 implements Appendable {
    public final StringBuilder a;
    public final ArrayList b;
    public final ArrayList c;

    public qf1() {
        this.a = new StringBuilder(16);
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public qf1(sf1 sf1Var) {
        this();
        a(sf1Var);
    }

    public final void a(sf1 sf1Var) {
        StringBuilder sb = this.a;
        int length = sb.length();
        sb.append(sf1Var.b);
        List list = sf1Var.a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                rf1 rf1Var = (rf1) list.get(i);
                Object obj = rf1Var.a;
                this.c.add(new pf1(rf1Var.d, rf1Var.b + length, rf1Var.c + length, obj));
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.a.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof sf1) {
            a((sf1) charSequence);
            return this;
        }
        this.a.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        boolean z = charSequence instanceof sf1;
        StringBuilder sb = this.a;
        if (!z) {
            sb.append(charSequence, i, i2);
            return this;
        }
        sf1 sf1Var = (sf1) charSequence;
        int length = sb.length();
        sb.append((CharSequence) sf1Var.b, i, i2);
        List listA = tf1.a(sf1Var, i, i2, null);
        if (listA != null) {
            int size = listA.size();
            for (int i3 = 0; i3 < size; i3++) {
                rf1 rf1Var = (rf1) listA.get(i3);
                Object obj = rf1Var.a;
                this.c.add(new pf1(rf1Var.d, rf1Var.b + length, rf1Var.c + length, obj));
            }
        }
        return this;
    }

    public final void b(String str) {
        this.a.append(str);
    }

    public final void c() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            b8b.b("Nothing to pop.");
        }
        ((pf1) vep.r(1, arrayList)).c = this.a.length();
    }

    public final void d(int i) {
        ArrayList arrayList = this.b;
        if (i >= arrayList.size()) {
            b8b.b(i + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i) {
            c();
        }
    }

    public final int e(pfc pfcVar) {
        pf1 pf1Var = new pf1(pfcVar, this.a.length(), 0, 12);
        this.b.add(pf1Var);
        this.c.add(pf1Var);
        return r5.size() - 1;
    }

    public final void f(String str) {
        pf1 pf1Var = new pf1(new ehk(str), this.a.length(), 0, 4);
        ArrayList arrayList = this.b;
        arrayList.add(pf1Var);
        this.c.add(pf1Var);
        arrayList.size();
    }

    public final int g(rwj rwjVar) {
        pf1 pf1Var = new pf1(rwjVar, this.a.length(), 0, 12);
        this.b.add(pf1Var);
        this.c.add(pf1Var);
        return r5.size() - 1;
    }

    public final sf1 h() {
        StringBuilder sb = this.a;
        String string = sb.toString();
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((pf1) arrayList.get(i)).a(sb.length()));
        }
        return new sf1(string, arrayList2);
    }
}
