package defpackage;

import com.opera.android.bookmarks.c;
import com.opera.android.bookmarks.h;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class tr8 {
    public final umi a;
    public final ur8 b;
    public final h c;
    public final ode d;
    public final wnm e;

    public tr8(umi umiVar, ur8 ur8Var, h hVar, mdh mdhVar) {
        this.a = umiVar;
        this.b = ur8Var;
        this.c = hVar;
        ode odeVar = new ode();
        this.d = odeVar;
        v08 v08Var = v08.a;
        pjb pjbVar = ur8Var.a.f;
        this.e = xf8.X(v08Var, (pjbVar == null ? null : pjbVar).a(new String[]{"add_favorite_removed_suggestion"}, false, new d58((byte) 7)), odeVar, mdhVar.h, new r31(3, this, tr8.class, "calculateState", "calculateState(Ljava/util/List;Ljava/util/Set;Ljava/util/List;)Ljava/util/Set;", 0, (byte) 3));
        a();
        hVar.a(new dl3(this, (byte) 4));
    }

    public final void a() {
        Set<String> set;
        p4j p4jVar = new p4j();
        c cVarP = this.c.p();
        if (cVarP == null) {
            set = Collections.EMPTY_SET;
        } else {
            HashSet hashSet = new HashSet();
            h.k(hashSet, cVarP);
            set = hashSet;
        }
        for (String str : set) {
            p4jVar.add(str);
            p4jVar.add(z7h.l(str));
        }
        this.d.r(z4j.a(p4jVar));
    }
}
