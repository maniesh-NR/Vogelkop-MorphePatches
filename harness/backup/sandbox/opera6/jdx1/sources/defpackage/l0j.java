package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class l0j {
    public final f0j a;
    public final kde b;

    public l0j(k0j k0jVar, jde jdeVar) {
        this.a = k0jVar.d;
        List listJ = k0j.j(4, k0jVar);
        this.b = new kde(listJ.size());
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            k0j k0jVar2 = (k0j) listJ.get(i);
            if (jdeVar.b(k0jVar2.f)) {
                this.b.a(k0jVar2.f);
            }
        }
    }
}
