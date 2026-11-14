package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class n1d implements ufd {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ z3 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ o1d f;

    public n1d(int i, int i2, Map map, z3 z3Var, Function1 function1, o1d o1dVar) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = z3Var;
        this.e = function1;
        this.f = o1dVar;
    }

    @Override // defpackage.ufd
    public final Map a() {
        return this.c;
    }

    @Override // defpackage.ufd
    public final void b() {
        this.e.invoke(this.f.p);
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
