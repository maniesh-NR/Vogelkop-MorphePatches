package defpackage;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ly {
    public final List a;
    public int b;
    public int c;
    public boolean d;
    public final Object e;
    public final /* synthetic */ Object f;

    public ly(i5o i5oVar, List list, r9i r9iVar) {
        this.a = list;
        this.e = r9iVar;
        Objects.requireNonNull(i5oVar);
        this.f = i5oVar;
        this.b = list.size();
    }

    public ly(usg usgVar, List list) {
        this.f = usgVar;
        this.a = list;
        this.e = new List[list.size()];
        if (list.isEmpty()) {
            d8b.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
