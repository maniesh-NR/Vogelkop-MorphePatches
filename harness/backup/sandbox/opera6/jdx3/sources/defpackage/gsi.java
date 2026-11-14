package defpackage;

import android.content.res.Resources;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class gsi implements u3l {
    public final esi d;
    public final u4l e;
    public final Resources f;
    public final int g;
    public final LinkedHashMap h = new LinkedHashMap();

    public gsi(esi esiVar, u4l u4lVar, Resources resources) {
        this.d = esiVar;
        this.e = u4lVar;
        this.f = resources;
        this.g = u4lVar.a;
    }

    @Override // defpackage.u3l
    public final boolean a(b2l b2lVar) {
        int i = ((d7l) b2lVar).j.a().d;
        if (i == 0) {
            return false;
        }
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.h;
        Object objValueOf = linkedHashMap.get(numValueOf);
        if (objValueOf == null) {
            objValueOf = Boolean.valueOf(this.d.a(this.e.a(i).c().a(this.f).toString()) != -1);
            linkedHashMap.put(numValueOf, objValueOf);
        }
        return ((Boolean) objValueOf).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsi)) {
            return false;
        }
        gsi gsiVar = (gsi) obj;
        return this.g == gsiVar.g && this.d.equals(gsiVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.g * 31);
    }
}
