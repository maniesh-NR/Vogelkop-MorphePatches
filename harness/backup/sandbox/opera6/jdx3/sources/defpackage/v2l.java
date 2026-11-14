package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class v2l implements m2l {
    public final int a;
    public final boolean b;
    public final ArrayList c = new ArrayList();

    public v2l(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final List a() {
        ehc ehcVarB = a.b();
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            m2l m2lVar = (m2l) obj;
            if (m2lVar != null) {
                if (m2lVar instanceof u2l) {
                    ehcVarB.add(((u2l) m2lVar).a);
                } else if (m2lVar instanceof v2l) {
                    ehcVarB.addAll(((v2l) m2lVar).a());
                }
            }
        }
        return a.a(ehcVarB);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2l)) {
            return false;
        }
        v2l v2lVar = (v2l) obj;
        return this.a == v2lVar.a && this.b == v2lVar.b;
    }

    @Override // defpackage.m2l
    public final long getId() {
        throw new IllegalStateException("not called");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
