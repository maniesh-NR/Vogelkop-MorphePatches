package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class t3c implements ufd {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ z3 d;
    public final /* synthetic */ u3c e;
    public final /* synthetic */ z3c f;
    public final /* synthetic */ Function1 g;

    public t3c(int i, int i2, Map map, z3 z3Var, u3c u3cVar, z3c z3cVar, Function1 function1) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = z3Var;
        this.e = u3cVar;
        this.f = z3cVar;
        this.g = function1;
    }

    @Override // defpackage.ufd
    public final Map a() {
        return this.c;
    }

    @Override // defpackage.ufd
    public final void b() {
        i8b i8bVar;
        m3c m3cVar = this.f.a;
        boolean zF = this.e.F();
        Function1 function1 = this.g;
        if (!zF || (i8bVar = ((j8b) m3cVar.F.b).c0) == null) {
            function1.invoke(((j8b) m3cVar.F.b).p);
        } else {
            function1.invoke(i8bVar.p);
        }
    }

    @Override // defpackage.ufd
    public final Function1 e() {
        return this.d;
    }

    @Override // defpackage.ufd
    public final int getHeight() {
        return this.b;
    }

    @Override // defpackage.ufd
    public final int getWidth() {
        return this.a;
    }
}
