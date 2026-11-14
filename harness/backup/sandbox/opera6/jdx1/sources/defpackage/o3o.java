package defpackage;

import androidx.core.app.NotificationCompat;

/* loaded from: classes.dex */
public abstract class o3o {
    public static final jde a;
    public static final m3o[] b;

    static {
        jde jdeVar = new jde(8);
        m3o.a.getClass();
        n3o n3oVar = l3o.g;
        jdeVar.i(1, n3oVar);
        n3o n3oVar2 = l3o.f;
        jdeVar.i(2, n3oVar2);
        n3o n3oVar3 = l3o.b;
        jdeVar.i(4, n3oVar3);
        n3o n3oVar4 = l3o.d;
        jdeVar.i(8, n3oVar4);
        n3o n3oVar5 = l3o.h;
        jdeVar.i(16, n3oVar5);
        n3o n3oVar6 = l3o.e;
        jdeVar.i(32, n3oVar6);
        n3o n3oVar7 = l3o.i;
        jdeVar.i(64, n3oVar7);
        n3o n3oVar8 = l3o.c;
        jdeVar.i(NotificationCompat.FLAG_HIGH_PRIORITY, n3oVar8);
        a = jdeVar;
        b = new m3o[]{n3oVar, n3oVar2, n3oVar3, n3oVar7, n3oVar5, n3oVar6, n3oVar4, l3o.j, n3oVar8};
    }

    public static final void a(m1d m1dVar, k8b k8bVar, long j, int i, int i2) {
        if (mzg.f(j, -1L)) {
            return;
        }
        m1dVar.a(k8bVar.b, (int) ((j >>> 48) & 65535));
        m1dVar.a(k8bVar.c, (int) ((j >>> 32) & 65535));
        m1dVar.a(k8bVar.d, i - ((int) ((j >>> 16) & 65535)));
        m1dVar.a(k8bVar.e, i2 - ((int) (j & 65535)));
    }
}
