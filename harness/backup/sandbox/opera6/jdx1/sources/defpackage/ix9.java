package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ix9 {
    public final ArrayList a;
    public final List b;

    public ix9(ArrayList arrayList, List list) {
        this.a = arrayList;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix9)) {
            return false;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        ix9 ix9Var = (ix9) obj;
        List list = ix9Var.b;
        ArrayList arrayList2 = ix9Var.a;
        if (size != arrayList2.size()) {
            return false;
        }
        List list2 = this.b;
        return list2.size() == list.size() && new HashSet(arrayList).equals(new HashSet(arrayList2)) && new HashSet(list2).equals(new HashSet(list));
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return "GetTopicsResponse: Topics=" + this.a + ", EncryptedTopics=" + this.b;
    }
}
