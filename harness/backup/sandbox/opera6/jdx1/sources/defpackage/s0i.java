package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class s0i implements z2a {
    public final Function1 a;
    public final Integer b;
    public final Long c;
    public final cd5 d;
    public volatile ho9 e;
    public volatile Long f;
    public pwh g;

    public s0i(Map map) {
        this(new w37(map, (byte) 3), null, null);
    }

    public s0i(Function1 function1, Integer num, Long l) {
        this.a = function1;
        this.b = num;
        this.c = l;
        this.d = new cd5();
    }

    @Override // defpackage.z2a
    public final void a() {
        this.d.j0(new r0i(3, null));
    }

    @Override // defpackage.z2a
    public final void b() {
        this.d.j0(new r0i(3, null));
    }

    @Override // defpackage.z2a
    public final void c() {
        this.d.j0(new r0i(3, null));
    }
}
