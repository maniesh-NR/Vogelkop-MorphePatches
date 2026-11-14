package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class agi implements uei {
    public final ArrayList a;
    public float b;
    public float c;
    public bgi d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;

    public agi(igi igiVar, i1 i1Var) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.d = null;
        this.e = false;
        this.f = true;
        this.g = -1;
        if (i1Var != null) {
            i1Var.s(this);
            if (this.h) {
                this.d.b((bgi) arrayList.get(this.g));
                arrayList.set(this.g, this.d);
                this.h = false;
            }
            bgi bgiVar = this.d;
            if (bgiVar != null) {
                arrayList.add(bgiVar);
            }
        }
    }

    public final void a(float f, float f2, float f3, float f4) {
        this.d.a(f, f2);
        this.a.add(this.d);
        this.d = new bgi(f3, f4, f3 - f, f4 - f2);
        this.h = false;
    }

    public final void b(float f, float f2) {
        boolean z = this.h;
        ArrayList arrayList = this.a;
        if (z) {
            this.d.b((bgi) arrayList.get(this.g));
            arrayList.set(this.g, this.d);
            this.h = false;
        }
        bgi bgiVar = this.d;
        if (bgiVar != null) {
            arrayList.add(bgiVar);
        }
        this.b = f;
        this.c = f2;
        this.d = new bgi(f, f2, 0.0f, 0.0f);
        this.g = arrayList.size();
    }

    public final void c(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.f || this.e) {
            this.d.a(f, f2);
            this.a.add(this.d);
            this.e = false;
        }
        this.d = new bgi(f5, f6, f5 - f3, f6 - f4);
        this.h = false;
    }

    public final void close() {
        this.a.add(this.d);
        e(this.b, this.c);
        this.h = true;
    }

    public final void d(float f, float f2, boolean z, boolean z2, float f3, float f4, float f5) {
        this.e = true;
        this.f = false;
        bgi bgiVar = this.d;
        igi.e(bgiVar.a, bgiVar.b, f, f2, f3, z, z2, f4, f5, this);
        this.f = true;
        this.h = false;
    }

    public final void e(float f, float f2) {
        this.d.a(f, f2);
        this.a.add(this.d);
        bgi bgiVar = this.d;
        this.d = new bgi(f, f2, f - bgiVar.a, f2 - bgiVar.b);
        this.h = false;
    }
}
