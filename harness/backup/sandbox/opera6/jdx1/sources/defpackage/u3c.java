package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class u3c implements ikk {
    public d2c a = d2c.b;
    public float b;
    public float c;
    public final /* synthetic */ z3c d;

    public u3c(z3c z3cVar) {
        this.d = z3cVar;
    }

    @Override // defpackage.vfd
    public final ufd A(int i, int i2, Map map, z3 z3Var, Function1 function1) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            a8b.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new t3c(i, i2, map, z3Var, this, this.d, function1);
    }

    @Override // defpackage.shb
    public final boolean F() {
        i3c i3cVar = this.d.a.G.d;
        return i3cVar == i3c.d || i3cVar == i3c.b;
    }

    @Override // defpackage.n27
    public final float b() {
        return this.b;
    }

    @Override // defpackage.shb
    public final d2c getLayoutDirection() {
        return this.a;
    }

    @Override // defpackage.ikk
    public final List i(Object obj, Function2 function2) throws pxb {
        z3c z3cVar = this.d;
        z3cVar.h();
        m3c m3cVar = z3cVar.a;
        i3c i3cVar = m3cVar.G.d;
        i3c i3cVar2 = i3c.a;
        if (i3cVar != i3cVar2 && i3cVar != i3c.c && i3cVar != i3c.b && i3cVar != i3c.d) {
            a8b.b("subcompose can only be used inside the measure or layout blocks");
        }
        see seeVar = z3cVar.g;
        Object objG = seeVar.g(obj);
        if (objG == null) {
            objG = (m3c) z3cVar.j.k(obj);
            if (objG != null) {
                if (z3cVar.o <= 0) {
                    a8b.b("Check failed.");
                }
                z3cVar.o--;
            } else {
                objG = z3cVar.n(obj);
                if (objG == null) {
                    int i = z3cVar.d;
                    m3c m3cVar2 = new m3c(2);
                    m3cVar.q = true;
                    m3cVar.B(i, m3cVar2);
                    m3cVar.q = false;
                    objG = m3cVar2;
                }
            }
            seeVar.m(obj, objG);
        }
        m3c m3cVar3 = (m3c) objG;
        if (CollectionsKt.M(z3cVar.d, m3cVar.o()) != m3cVar3) {
            int iJ = ((dfe) ((bee) m3cVar.o()).b).j(m3cVar3);
            if (iJ < z3cVar.d) {
                a8b.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i2 = z3cVar.d;
            if (i2 != iJ) {
                z3cVar.j(iJ, i2);
            }
        }
        z3cVar.d++;
        z3cVar.m(m3cVar3, obj, false, function2);
        return (i3cVar == i3cVar2 || i3cVar == i3c.c) ? m3cVar3.m() : m3cVar3.l();
    }

    @Override // defpackage.n27
    public final float n0() {
        return this.c;
    }
}
