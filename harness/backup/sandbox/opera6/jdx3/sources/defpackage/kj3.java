package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import org.chromium.net.NetworkChangeNotifier;

/* loaded from: classes.dex */
public final class kj3 implements sm5 {
    public final /* synthetic */ lj3 a;

    public kj3(lj3 lj3Var) {
        this.a = lj3Var;
    }

    @Override // defpackage.sm5
    public final void a(boolean z) {
        rle rleVar;
        if (z) {
            lj3 lj3Var = this.a;
            tm5 tm5Var = lj3Var.b;
            HashSet hashSet = tm5Var.d;
            hashSet.remove(this);
            if (hashSet.isEmpty() && (rleVar = tm5Var.c) != null) {
                NetworkChangeNotifier.removeConnectionTypeObserver(rleVar.a);
                tm5Var.c = null;
            }
            ArrayList arrayList = lj3Var.e;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                jj3 jj3Var = (jj3) obj;
                lj3Var.a(jj3Var.a, jj3Var.b, jj3Var.c);
            }
            arrayList.clear();
        }
    }
}
