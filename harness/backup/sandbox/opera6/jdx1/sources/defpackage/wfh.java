package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class wfh {
    public static final wfh c = new wfh(Collections.EMPTY_LIST, on2.c);
    public final List a;
    public final on2 b;

    public wfh(List list, on2 on2Var) {
        this.a = Collections.unmodifiableList(new ArrayList(list));
        this.b = on2Var;
    }

    public static wfh a(List list, on2 on2Var) {
        jpo.m(list, "qualities cannot be null");
        jpo.m(on2Var, "fallbackStrategy cannot be null");
        jpo.i("qualities cannot be empty", !list.isEmpty());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mo2 mo2Var = (mo2) it.next();
            jpo.i("qualities contain invalid quality: " + mo2Var, mo2.l.contains(mo2Var));
        }
        return new wfh(list, on2Var);
    }

    public final String toString() {
        return "QualitySelector{preferredQualities=" + this.a + ", fallbackStrategy=" + this.b + "}";
    }
}
