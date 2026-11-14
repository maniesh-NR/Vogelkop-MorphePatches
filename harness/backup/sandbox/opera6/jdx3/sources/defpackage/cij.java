package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class cij {
    public final List a;
    public final View b;

    public cij(View view, ArrayList arrayList) {
        this.a = Collections.unmodifiableList(arrayList);
        this.b = view;
    }
}
