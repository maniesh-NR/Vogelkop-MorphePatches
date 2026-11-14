package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t64 {
    public ArrayList a = null;
    public int b = 0;

    public final void a() {
        this.b += 1000;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append((u64) obj);
            sb.append(' ');
        }
        sb.append('[');
        return fki.s(sb, this.b, ']');
    }
}
