package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class m43 implements az {
    public final dl a;
    public final String b;
    public final byte c;
    public final List d;

    /* JADX WARN: Multi-variable type inference failed */
    public m43(dl dlVar, String str, int i, List list) {
        this.a = dlVar;
        this.b = str;
        this.c = i;
        this.d = list;
    }

    @Override // defpackage.az
    public final dl a() {
        return this.a;
    }

    @Override // defpackage.az
    public final boolean b() {
        return (this.c & 4) != 0;
    }

    @Override // defpackage.az
    public final List c() {
        return this.d;
    }

    @Override // defpackage.az
    public final String d() {
        return this.b;
    }

    @Override // defpackage.az
    public final boolean e() {
        return (this.c & 1) != 0;
    }

    @Override // defpackage.az
    public final boolean f() {
        return (this.c & 2) != 0;
    }
}
