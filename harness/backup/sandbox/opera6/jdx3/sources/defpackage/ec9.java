package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final /* synthetic */ class ec9 implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pc9 b;

    public /* synthetic */ ec9(pc9 pc9Var, byte b) {
        this.a = b;
        this.b = pc9Var;
    }

    public final Object get() {
        byte b = this.a;
        pc9 pc9Var = this.b;
        int i = 0;
        switch (b) {
            case 0:
                List list = (List) kfo.Y(pc9Var.c().a, true, false, new uvc((byte) 9));
                ArrayList arrayList = new ArrayList(list.size());
                bf9 bf9Var = pc9Var.c;
                SecretKeySpec secretKeySpecX = bf9Var.x();
                if (secretKeySpecX != null) {
                    pc9.b(list, secretKeySpecX, bf9Var.a.u(), arrayList);
                }
                if (pc9Var.j == null) {
                    pc9Var.j = new jc9((byte) 0);
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        pc9Var.j.a(((hb9) obj).b);
                    }
                }
                return arrayList;
            case 1:
                return (Long) kfo.Y(pc9Var.c().a, true, false, new uvc((byte) 11));
            case 2:
                bf9 bf9Var2 = pc9Var.c;
                jc9 jc9Var = pc9Var.j;
                if (jc9Var == null) {
                    return null;
                }
                int size2 = jc9Var.a.size();
                HashMap map = pc9Var.j.a;
                map.size();
                map.clear();
                List list2 = (List) kfo.Y(pc9Var.c().a, true, false, new uvc((byte) 9));
                ArrayList arrayList2 = new ArrayList(list2.size());
                SecretKeySpec secretKeySpecX2 = bf9Var2.x();
                if (secretKeySpecX2 != null) {
                    pc9.b(list2, secretKeySpecX2, bf9Var2.a.u(), arrayList2);
                }
                int size3 = arrayList2.size();
                while (i < size3) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    pc9Var.j.a(((hb9) obj2).b);
                }
                return new Pair(Integer.valueOf(size2), arrayList2);
            default:
                kfo.Y(pc9Var.c().a, false, true, new uvc((byte) 10));
                jc9 jc9Var2 = pc9Var.j;
                if (jc9Var2 == null) {
                    return null;
                }
                HashMap map2 = jc9Var2.a;
                int size4 = map2.size();
                map2.clear();
                if (size4 > 0) {
                    return Integer.valueOf(size4);
                }
                return null;
        }
    }
}
