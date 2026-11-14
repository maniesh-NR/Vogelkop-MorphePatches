package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class c4i implements Function1 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ g1b b;

    public c4i(g1b g1bVar) {
        this.b = g1bVar;
    }

    public c4i(u4h u4hVar, g1b g1bVar) {
        this.b = g1bVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        g1b g1bVar = this.b;
        switch (b) {
            case 0:
                return ((c2i) g1bVar.get(((Number) obj).intValue())).j;
            default:
                g1bVar.get(((Number) obj).intValue());
                return null;
        }
    }
}
