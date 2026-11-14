package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class iib implements ufd {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ z3 d;

    public iib(int i, int i2, Map map, z3 z3Var) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = z3Var;
    }

    @Override // defpackage.ufd
    public final Map a() {
        return this.c;
    }

    @Override // defpackage.ufd
    public final void b() {
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
