package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.w;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class cm9 implements bm9 {
    public final String a;
    public final int b;
    public final boolean c;
    public final /* synthetic */ w d;

    /* JADX WARN: Multi-variable type inference failed */
    public cm9(w wVar, String str, int i, int i2) {
        this.d = wVar;
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.bm9
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        Fragment fragment = this.d.A;
        if (fragment != null && this.b < 0 && this.a == null && fragment.getChildFragmentManager().X()) {
            return false;
        }
        return this.d.Z(arrayList, arrayList2, this.a, this.b, this.c ? 1 : 0);
    }
}
