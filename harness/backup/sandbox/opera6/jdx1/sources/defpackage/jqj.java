package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class jqj implements bi5, Iterable, ptb {
    public final iqj a;
    public final int b;
    public final int c;

    public jqj(iqj iqjVar, int i, int i2) {
        this.a = iqjVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jqj)) {
            return false;
        }
        jqj jqjVar = (jqj) obj;
        return jqjVar.b == this.b && jqjVar.c == this.c && jqjVar.a == this.a;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        iqj iqjVar = this.a;
        if (iqjVar.h != this.c) {
            kqj.e();
        }
        int i = this.b;
        iqjVar.g(i);
        return new f5a(iqjVar, i + 1, iqjVar.a[(i * 5) + 3] + i);
    }
}
