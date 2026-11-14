package defpackage;

import android.view.View;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class i8n implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        c8n c8nVar = (c8n) ((View) obj).getLayoutParams();
        c8n c8nVar2 = (c8n) ((View) obj2).getLayoutParams();
        boolean z = c8nVar.a;
        return z != c8nVar2.a ? z ? 1 : -1 : c8nVar.e - c8nVar2.e;
    }
}
