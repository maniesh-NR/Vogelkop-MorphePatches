package defpackage;

import android.util.Size;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class zn6 implements h28 {
    public final xd4 c;
    public final List d;
    public final v3n e;
    public final zyk f = z4c.b(new r94(this, (byte) 20));
    public final LinkedHashMap g = new LinkedHashMap();

    public zn6(xd4 xd4Var, List list, v3n v3nVar) {
        this.c = xd4Var;
        this.d = list;
        this.e = v3nVar;
    }

    public static hn2 c(zn6 zn6Var, int i, int i2, int i3) {
        return new hn2(2, "video/avc", i3, 30, i, i2, -1, 8, 0, 0);
    }

    @Override // defpackage.h28
    public final boolean a(int i) {
        return d(i) != null;
    }

    @Override // defpackage.h28
    public final j28 b(int i) {
        return d(i);
    }

    public final j28 d(int i) {
        int i2;
        Object next;
        hn2 hn2VarC;
        int i3;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.g;
        if (linkedHashMap.containsKey(numValueOf)) {
            return (j28) linkedHashMap.get(Integer.valueOf(i));
        }
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                i2 = i;
                next = null;
                break;
            }
            next = it.next();
            i2 = i;
            if (((mo2) next).a == i2) {
                break;
            }
        }
        mo2 mo2Var = next instanceof mo2 ? (mo2) next : null;
        if (mo2Var != null) {
            for (Size size : mo2Var.d) {
                if (((List) this.f.getValue()).contains(size)) {
                    int width = size.getWidth();
                    int height = size.getHeight();
                    if (mo2Var.equals(mo2.h)) {
                        i3 = 40000000;
                    } else if (mo2Var.equals(mo2.g)) {
                        i3 = 10000000;
                    } else if (mo2Var.equals(mo2.f)) {
                        i3 = 4000000;
                    } else {
                        if (!mo2Var.equals(mo2.e)) {
                            s49.l(mo2Var, "Undefined bitrate for quality: ");
                            return null;
                        }
                        i3 = 2000000;
                    }
                    hn2VarC = c(this, width, height, i3);
                    this.e.getClass();
                    u3n u3nVarA = v3n.a("video/avc");
                    if (u3nVarA == null || !u3nVarA.o(width, height)) {
                        hn2VarC = null;
                    } else {
                        Integer num = (Integer) u3nVarA.r().clamp(Integer.valueOf(i3));
                        if (num == null || num.intValue() != i3) {
                            hn2VarC = c(this, width, height, num.intValue());
                        }
                    }
                    if (hn2VarC != null) {
                        break;
                    }
                }
            }
            hn2VarC = null;
        } else {
            hn2VarC = null;
        }
        gn2 gn2VarE = hn2VarC != null ? gn2.e(Collections.singletonList(new fn2("audio/mp4a-latm", 3, 96000, 44100, 1, 2)), Collections.singletonList(hn2VarC), 60, 2) : null;
        linkedHashMap.put(Integer.valueOf(i2), gn2VarE);
        return gn2VarE;
    }
}
