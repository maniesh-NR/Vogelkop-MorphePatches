package defpackage;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class evc extends k1g {
    public final /* synthetic */ byte i = 0;
    public final /* synthetic */ List j;
    public final /* synthetic */ List k;

    public evc(gvc gvcVar, List list, List list2) {
        this.j = list;
        this.k = list2;
        Objects.requireNonNull(gvcVar);
    }

    public evc(List list, List list2) {
        this.j = list;
        this.k = list2;
    }

    public evc(qmj qmjVar, List list, List list2) {
        this.j = list;
        this.k = list2;
        Objects.requireNonNull(qmjVar);
    }

    public final int C() {
        switch (this.i) {
        }
        return this.k.size();
    }

    public final int D() {
        switch (this.i) {
        }
        return this.j.size();
    }

    public final boolean h(int i, int i2) {
        byte b = this.i;
        return true;
    }

    public final boolean i(int i, int i2) {
        switch (this.i) {
            case 0:
                return ((bre) this.j.get(i)).equals(this.k.get(i2));
            case 1:
                return this.j.get(i) == this.k.get(i2);
            default:
                return ((String) this.j.get(i)).equals(this.k.get(i2));
        }
    }
}
