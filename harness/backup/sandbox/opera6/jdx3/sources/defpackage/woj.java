package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class woj extends dx4 {
    public final int g;
    public final int h;
    public final Function2 i;

    public woj(int i, int i2, int i3, Function2 function2) {
        super(i);
        this.g = i2;
        this.h = i3;
        this.i = function2;
    }

    @Override // defpackage.dx4
    public final r6j h(r6j r6jVar, int i) {
        return r6j.b(r6jVar, i, new x6j(qoj.class, this.i), this.g, this.h, null, 32);
    }
}
