package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class can {
    public static final Rect c = new Rect();
    public final ArrayList a = new ArrayList();
    public boolean b;

    public final void a(View view) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ban banVar = (ban) it.next();
            if (banVar.a.equals(view)) {
                it.remove();
                View view2 = banVar.a;
                view2.removeOnLayoutChangeListener(banVar);
                view2.removeOnAttachStateChangeListener(banVar);
            }
        }
    }

    public final void b(boolean z) {
        if (this.b != z) {
            this.b = z;
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ban banVar = (ban) obj;
                boolean z2 = this.b;
                if (banVar.e != z2) {
                    banVar.e = z2;
                    banVar.a();
                }
            }
        }
    }

    public final void c(View view, y9n y9nVar) {
        this.a.add(new ban(view, this.b, y9nVar));
    }

    public final void d() {
        if (this.b) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((ban) obj).a();
            }
        }
    }
}
