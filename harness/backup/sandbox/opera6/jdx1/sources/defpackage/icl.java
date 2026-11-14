package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class icl implements kdc {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.kdc
    public final void onDestroy() {
        ArrayList arrayListY = rm5.y(this.a);
        int size = arrayListY.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListY.get(i);
            i++;
            ((zbl) obj).onDestroy();
        }
    }

    @Override // defpackage.kdc
    public final void onStart() {
        ArrayList arrayListY = rm5.y(this.a);
        int size = arrayListY.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListY.get(i);
            i++;
            ((zbl) obj).onStart();
        }
    }

    @Override // defpackage.kdc
    public final void onStop() {
        ArrayList arrayListY = rm5.y(this.a);
        int size = arrayListY.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListY.get(i);
            i++;
            ((zbl) obj).onStop();
        }
    }
}
