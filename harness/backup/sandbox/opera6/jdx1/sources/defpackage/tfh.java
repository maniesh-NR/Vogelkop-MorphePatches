package defpackage;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class tfh implements h28 {
    public final h28 c;
    public final HashMap d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    public tfh(h28 h28Var, ygh yghVar, xd4 xd4Var, v3n v3nVar) {
        List listB;
        this.c = h28Var;
        ArrayList arrayListC = yghVar.c(ExtraSupportedQualityQuirk.class);
        if (arrayListC.isEmpty()) {
            return;
        }
        ?? map = 0;
        map = 0;
        map = 0;
        jpo.n((String) null, arrayListC.size() == 1);
        ((ExtraSupportedQualityQuirk) arrayListC.get(0)).getClass();
        if (!"motorola".equalsIgnoreCase(Build.BRAND) || !"moto c".equalsIgnoreCase(Build.MODEL)) {
            map = Collections.EMPTY_MAP;
        } else if ("1".equals(xd4Var.e()) && !h28Var.a(4)) {
            j28 j28VarB = h28Var.b(1);
            hn2 hn2Var = (j28VarB == null || (listB = j28VarB.b()) == null) ? null : (hn2) CollectionsKt.firstOrNull(listB);
            if (hn2Var != null) {
                String str = hn2Var.b;
                v3nVar.getClass();
                u3n u3nVarA = v3n.a(str);
                Range rangeR = u3nVarA != null ? u3nVarA.r() : Range.create(0, Integer.MAX_VALUE);
                Size size = qpj.d;
                gn2 gn2VarE = gn2.e(j28VarB.d(), Collections.singletonList(mkh.r(hn2Var, size, rangeR)), j28VarB.a(), j28VarB.c());
                map = new HashMap();
                map.put(4, gn2VarE);
                Size sizeA = hn2Var.a();
                if (size.getHeight() * size.getWidth() > sizeA.getHeight() * sizeA.getWidth()) {
                    map.put(1, gn2VarE);
                }
            }
        }
        if (map != 0) {
            this.d = new HashMap((Map) map);
        }
    }

    @Override // defpackage.h28
    public final boolean a(int i) {
        return c(i) != null;
    }

    @Override // defpackage.h28
    public final j28 b(int i) {
        return c(i);
    }

    public final j28 c(int i) {
        HashMap map = this.d;
        return (map == null || !map.containsKey(Integer.valueOf(i))) ? this.c.b(i) : (j28) map.get(Integer.valueOf(i));
    }
}
