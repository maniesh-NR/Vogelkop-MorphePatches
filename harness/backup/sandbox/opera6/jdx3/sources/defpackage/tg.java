package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class tg implements f7f {
    public boolean a;
    public boolean b;
    public Object c;
    public final /* synthetic */ f7f d;

    public tg(f7f f7fVar) {
        this.d = f7fVar;
    }

    public final void d0(Object obj) {
        if (this.b && this.a && Intrinsics.a(obj, this.c)) {
            return;
        }
        this.c = obj;
        this.b = true;
        this.d.d0(obj);
    }
}
