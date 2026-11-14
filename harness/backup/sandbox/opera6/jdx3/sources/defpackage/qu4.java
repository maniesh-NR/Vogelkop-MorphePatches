package defpackage;

import com.leanplum.internal.Constants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class qu4 {
    public final boolean a;
    public final List b;
    public final List c;

    public qu4(List list, List list2, boolean z) {
        this.a = z;
        this.b = list;
        this.c = list2;
    }

    public final orb a() throws JSONException {
        orb orbVar = new orb();
        orbVar.r("thinkHarder", this.a);
        vpb vpbVar = new vpb();
        for (spj spjVar : this.b) {
            spjVar.getClass();
            orb orbVar2 = new orb();
            orbVar2.p(spjVar.a, Constants.Params.NAME);
            orbVar2.p(spjVar.b, "description");
            orbVar2.p(spjVar.c, "prompt");
            vpbVar.a(orbVar2);
        }
        orbVar.p(vpbVar, "skills");
        vpb vpbVar2 = new vpb();
        for (vfb vfbVar : this.c) {
            vfbVar.getClass();
            orb orbVar3 = new orb();
            orbVar3.p(vfbVar.a, "id");
            vpbVar2.a(orbVar3);
        }
        orbVar.p(vpbVar2, "webpageContext");
        return orbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu4)) {
            return false;
        }
        qu4 qu4Var = (qu4) obj;
        return this.a == qu4Var.a && Intrinsics.a(this.b, qu4Var.b) && Intrinsics.a(this.c, qu4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rfp.f(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "ChatModifiers(thinkHarder=" + this.a + ", skills=" + this.b + ", webpageContext=" + this.c + ")";
    }
}
