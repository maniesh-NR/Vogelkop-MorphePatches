package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ddl implements Iterable {
    public final ArrayList a = new ArrayList();
    public final fp1 b;

    public ddl(fp1 fp1Var) {
        this.b = fp1Var;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
