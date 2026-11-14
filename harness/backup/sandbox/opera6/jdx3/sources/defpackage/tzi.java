package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class tzi {
    public final e5d a;
    public final szi b;
    public final h7f c;
    public final h7f d;
    public xph e;
    public int f;
    public boolean g;
    public boolean h;

    public tzi() {
        e5d e5dVar = new e5d((byte) 3);
        this.a = e5dVar;
        this.b = new szi(this);
        this.c = new h7f();
        this.d = new h7f();
        ((h7f) e5dVar.b).b(new rzi(this));
    }

    public final void a() {
        h7f h7fVar = this.d;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            yyi yyiVar = (yyi) g7fVarH.next();
            yyiVar.getClass();
            vml.c(new mni(yyiVar, (byte) 4));
        }
    }

    public final void b(xph xphVar) {
        xph xphVar2 = this.e;
        szi sziVar = this.b;
        if (xphVar2 != null) {
            ((h7f) xphVar2.b.b).c(sziVar);
        }
        this.e = xphVar;
        if (xphVar != null) {
            ((h7f) xphVar.b.b).b(sziVar);
            e();
        }
    }

    public final void c() {
        if (this.g) {
            return;
        }
        this.g = true;
        h7f h7fVar = this.c;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((qzi) g7fVarH.next()).W(this.g);
        }
    }

    public final void d() {
        if (this.g) {
            this.g = false;
            this.a.clear();
            h7f h7fVar = this.c;
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                ((qzi) g7fVarH.next()).W(this.g);
            }
        }
    }

    public final void e() {
        int itemCount = this.e.a.getItemCount();
        ArrayList arrayList = new ArrayList(itemCount);
        for (int i = 0; i < itemCount; i++) {
            if (this.e.a(i)) {
                arrayList.add(Long.valueOf(this.e.a.getItemId(i)));
            }
        }
        e5d e5dVar = this.a;
        if (((LinkedHashSet) e5dVar.c).retainAll(arrayList) && ((LinkedHashSet) e5dVar.c).isEmpty()) {
            d();
        }
        if (arrayList.size() != this.f) {
            this.f = arrayList.size();
            a();
        }
    }
}
