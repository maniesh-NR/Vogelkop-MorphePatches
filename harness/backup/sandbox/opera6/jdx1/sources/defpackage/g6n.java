package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.sequences.Sequence;

/* loaded from: classes.dex */
public final class g6n implements Sequence {
    final /* synthetic */ ViewGroup a;

    public g6n(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public final Iterator iterator() {
        return new h6n(this.a);
    }
}
