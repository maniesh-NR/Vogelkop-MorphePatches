package defpackage;

import android.util.Pair;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final /* synthetic */ class dc9 implements n5o, jr9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pc9 b;

    public /* synthetic */ dc9(pc9 pc9Var, byte b) {
        this.a = b;
        this.b = pc9Var;
    }

    public final Object apply(Object obj) {
        byte[] bArr = (byte[]) obj;
        SecretKeySpec secretKeySpecX = this.b.c.x();
        if (secretKeySpecX == null) {
            return null;
        }
        return p36.a(1, secretKeySpecX, bArr, true);
    }

    public final Object g(Object obj) {
        byte b = this.a;
        pc9 pc9Var = this.b;
        switch (b) {
            case 0:
                Integer num = (Integer) obj;
                if (num != null) {
                    pc9Var.h(0, num.intValue());
                    break;
                }
                break;
            case 1:
                Pair pair = (Pair) obj;
                pc9Var.getClass();
                if (pair != null) {
                    pc9Var.g(((Integer) pair.first).intValue(), Collections.singletonList((hb9) pair.second));
                    break;
                }
                break;
            case 2:
            default:
                Pair pair2 = (Pair) obj;
                if (pair2 != null) {
                    pc9Var.g(((Integer) pair2.first).intValue(), Collections.singletonList((hb9) pair2.second));
                    break;
                }
                break;
            case 3:
                Pair pair3 = (Pair) obj;
                if (pair3 != null) {
                    int iIntValue = ((Integer) pair3.first).intValue();
                    hb9 hb9Var = (hb9) pair3.second;
                    Set set = pc9Var.e;
                    if (!set.isEmpty()) {
                        Iterator it = new HashSet(set).iterator();
                        while (it.hasNext()) {
                            sc9 sc9Var = (sc9) it.next();
                            if (!pc9Var.f.contains(sc9Var) && set.contains(sc9Var)) {
                                rc9 rc9Var = ((qc9) sc9Var).a;
                                rc9Var.c.set(iIntValue, hb9Var);
                                h7f h7fVar = rc9Var.d;
                                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                                while (g7fVarH.hasNext()) {
                                    ((mb9) g7fVarH.next()).m(iIntValue);
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 4:
                Integer num2 = (Integer) obj;
                if (num2 != null) {
                    pc9Var.h(num2.intValue(), 1);
                    break;
                }
                break;
            case 5:
                Pair pair4 = (Pair) obj;
                if (pair4 != null) {
                    if (((Integer) pair4.first).intValue() > 0) {
                        pc9Var.h(0, ((Integer) pair4.first).intValue());
                    }
                    if (!((List) pair4.second).isEmpty()) {
                        pc9Var.g(0, (List) pair4.second);
                        break;
                    }
                }
                break;
        }
        return null;
    }
}
