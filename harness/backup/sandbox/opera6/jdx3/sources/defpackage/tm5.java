package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.chromium.net.NetworkChangeNotifier;

/* loaded from: classes.dex */
public final class tm5 implements NetworkChangeNotifier.ConnectionTypeObserver {
    public boolean a;
    public boolean b;
    public rle c;
    public HashSet d;
    public Set e;

    public final void onConnectionTypeChanged(int i) {
        boolean z = this.a;
        boolean zD = sle.d();
        this.a = zD;
        if (zD != z) {
            Iterator it = new HashSet(this.d).iterator();
            while (it.hasNext()) {
                ((sm5) it.next()).a(!z);
            }
        }
    }
}
