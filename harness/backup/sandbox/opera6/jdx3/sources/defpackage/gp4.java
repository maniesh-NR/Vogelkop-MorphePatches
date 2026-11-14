package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class gp4 extends lze {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ HashSet d;
    public final /* synthetic */ ip4 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp4(ip4 ip4Var, ip4 ip4Var2, ArrayList arrayList, HashSet hashSet) {
        super(ip4Var2);
        this.c = arrayList;
        this.d = hashSet;
        Objects.requireNonNull(ip4Var);
        this.e = ip4Var;
    }

    @Override // defpackage.lze
    public final void b(Object obj) {
        fp4 fp4Var = (fp4) obj;
        ip4 ip4Var = this.e;
        if (ip4Var.n == this) {
            ip4Var.n = null;
            List list = fp4Var.e;
            List list2 = fp4Var.f;
            ArrayList arrayList = this.c;
            boolean zEquals = list.equals(arrayList);
            HashSet hashSet = this.d;
            if (zEquals && list2.size() == hashSet.size() && list2.containsAll(hashSet)) {
                return;
            }
            ta7 ta7Var = ip4Var.j;
            i16 i16Var = (i16) ta7Var.b;
            i16Var.getClass();
            if (hashSet.isEmpty()) {
                hashSet = new HashSet(Collections.singleton(yqe.d));
            }
            int i = 0;
            ArrayList arrayListT = i16Var.t(false, false);
            HashSet hashSet2 = new HashSet(i16Var.t(true, false));
            ArrayList arrayList2 = new ArrayList(arrayListT.size());
            int size = arrayListT.size();
            while (i < size) {
                Object obj2 = arrayListT.get(i);
                i++;
                yqe yqeVar = (yqe) obj2;
                arrayList2.add(new op4(yqeVar, hashSet2.contains(yqeVar), hashSet.contains(yqeVar), arrayList.indexOf(yqeVar)));
            }
            Collections.sort(arrayList2, new yg9((byte) 16));
            i16Var.c = arrayList2;
            ((i32) i16Var.b).g(arrayList2);
            ta7Var.m = null;
            ta7Var.h = null;
            ip4Var.c();
        }
    }
}
