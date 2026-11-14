package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class uz {
    public final String a;
    public final String b;
    public final String c;

    public uz(vo voVar) {
        this.a = voVar.a;
        this.b = voVar.b;
        this.c = voVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uz.class != obj.getClass()) {
            return false;
        }
        uz uzVar = (uz) obj;
        return this.a.equals(uzVar.a) && this.b.equals(uzVar.b) && this.c.equals(uzVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }
}
