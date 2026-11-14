package defpackage;

/* loaded from: classes.dex */
public final class amk {
    public final zsk a;
    public final nsh b;
    public final xlk c;
    public final float d;
    public final float e;

    public amk(zsk zskVar, nsh nshVar, xlk xlkVar) {
        this.a = zskVar;
        this.b = nshVar;
        this.c = xlkVar;
        wlk wlkVar = xlkVar.c;
        this.d = wlkVar.d / zskVar.c;
        wlk wlkVar2 = xlkVar.b;
        this.e = wlkVar2 == null ? a(wlkVar) : Math.min(a(wlkVar), a(wlkVar2));
    }

    public static float a(wlk wlkVar) {
        o9g o9gVar = wlkVar.c;
        int i = (o9gVar.a * 12) + o9gVar.b;
        if (i <= 0) {
            return Float.MAX_VALUE;
        }
        return wlkVar.d / i;
    }
}
