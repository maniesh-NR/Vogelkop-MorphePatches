package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class zlb extends ff9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Iterable b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zlb(Iterable iterable, Object obj, byte b) {
        this.a = b;
        this.b = iterable;
        this.c = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.a;
        Object obj = this.c;
        Iterable iterable = this.b;
        switch (b) {
            case 0:
                Iterator it = iterable.iterator();
                it.getClass();
                return new bmb(it, (srg) obj);
            default:
                return new cmb(iterable.iterator(), (xq9) obj);
        }
    }
}
