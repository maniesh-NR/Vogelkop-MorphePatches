package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class meg {
    public final ArrayList a = new ArrayList();
    public final evn b;

    public meg(evn evnVar) {
        this.b = evnVar;
    }

    public final void a() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
        arrayList.clear();
    }
}
