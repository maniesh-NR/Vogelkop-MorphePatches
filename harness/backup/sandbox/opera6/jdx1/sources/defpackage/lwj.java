package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class lwj implements bi5, Iterable, ptb {
    public final iqj a;
    public final int b;
    public final wsh c;

    public lwj(iqj iqjVar, int i, xt9 xt9Var, wsh wshVar) {
        this.a = iqjVar;
        this.b = i;
        this.c = wshVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lwj)) {
            return false;
        }
        lwj lwjVar = (lwj) obj;
        return lwjVar.b == this.b && lwjVar.a == this.a && lwjVar.c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.a.hashCode() + (this.b * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new kwj(this.a, this.b, null, this.c);
    }
}
