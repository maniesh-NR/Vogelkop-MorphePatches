package defpackage;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class aud implements Iterator, ptb {
    public int a;
    final /* synthetic */ Menu b;

    public aud(itd itdVar) {
        this.b = itdVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Menu menu = this.b;
        int i = this.a;
        this.a = i + 1;
        MenuItem item = menu.getItem(i);
        if (item != null) {
            return item;
        }
        t3p.t();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        Menu menu = this.b;
        int i = this.a - 1;
        this.a = i;
        MenuItem item = menu.getItem(i);
        if (item != null) {
            menu.removeItem(item.getItemId());
        } else {
            t3p.t();
        }
    }
}
