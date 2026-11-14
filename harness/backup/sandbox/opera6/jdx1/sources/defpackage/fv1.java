package defpackage;

import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class fv1 {
    public ArrayList a;

    public fv1(byte b) {
        switch (b) {
            case 2:
                this.a = new ArrayList(9);
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    public final void a(pj9 pj9Var) {
        ArrayList arrayList = this.a;
        if (pj9Var instanceof eze) {
            arrayList.add(pj9Var);
            return;
        }
        if (!(pj9Var instanceof aj5)) {
            h9o.p();
            return;
        }
        ArrayList arrayList2 = ((aj5) pj9Var).a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add((eze) obj);
        }
    }

    public final void b(Object obj) {
        ArrayList arrayList = this.a;
        if (obj != null) {
            arrayList.add(obj);
        } else {
            t3p.q("Set contributions cannot be null");
        }
    }

    public final void c(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            if (str == null) {
                qp2.o("category must not be null");
                return;
            }
            ArrayList arrayList2 = this.a;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                this.a = arrayList2;
            }
            if (!arrayList2.contains(str)) {
                this.a.add(str);
            }
        }
    }

    public final vnd d() {
        if (this.a == null) {
            return vnd.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.a);
        return new vnd(bundle, this.a);
    }
}
