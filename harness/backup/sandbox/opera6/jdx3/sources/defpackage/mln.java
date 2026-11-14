package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class mln {
    public static final mln d;
    public final List a;
    public final List b;
    public final Set c;

    static {
        List list = Collections.EMPTY_LIST;
        d = new mln(list, list, Collections.EMPTY_SET);
    }

    public mln(List list, List list2, Set set) {
        this.a = list;
        this.b = list2;
        this.c = set;
    }
}
