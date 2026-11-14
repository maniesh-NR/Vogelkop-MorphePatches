package defpackage;

import java.util.Collections;
import java.util.EnumSet;
import java.util.SortedSet;
import java.util.TreeSet;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class dl {
    public final int a;
    public final q50 b;
    public final String c;
    public final SortedSet d;
    public final SortedSet e;
    public final iq f;

    public dl(int i, q50 q50Var, String str, TreeSet treeSet, TreeSet treeSet2, iq iqVar) {
        this.a = i;
        this.b = q50Var;
        this.c = str;
        this.d = treeSet == null ? null : Collections.unmodifiableSortedSet(treeSet);
        this.e = treeSet2 != null ? Collections.unmodifiableSortedSet(treeSet2) : null;
        this.f = iqVar;
    }

    public static TreeSet a(orb orbVar) throws JSONException {
        EnumSet enumSetOf;
        vpb vpbVarH = orbVar.h("fallback-formats");
        if (vpbVarH == null) {
            enumSetOf = EnumSet.of(rm.h);
        } else {
            EnumSet enumSetNoneOf = EnumSet.noneOf(rm.class);
            int i = 0;
            while (true) {
                if (i >= vpbVarH.a.length()) {
                    break;
                }
                String strD = vpbVarH.d(i);
                if ("*".equals(strD)) {
                    enumSetNoneOf.addAll(rm.i);
                    break;
                }
                try {
                    enumSetNoneOf.add(rm.d(strD));
                } catch (IllegalArgumentException unused) {
                }
                i++;
            }
            enumSetOf = enumSetNoneOf;
        }
        EnumSet enumSetComplementOf = EnumSet.complementOf(enumSetOf);
        if (enumSetComplementOf.isEmpty()) {
            return null;
        }
        return new TreeSet(enumSetComplementOf);
    }

    public static TreeSet b(orb orbVar) throws JSONException {
        vpb vpbVarH = orbVar.h("fallback-provider-blacklist");
        if (vpbVarH == null) {
            return null;
        }
        JSONArray jSONArray = vpbVarH.a;
        if (jSONArray.length() == 0) {
            return null;
        }
        TreeSet treeSet = new TreeSet();
        int i = 0;
        while (true) {
            if (i >= jSONArray.length()) {
                break;
            }
            String strD = vpbVarH.d(i);
            if ("*".equals(strD)) {
                treeSet.addAll(yo.h);
                break;
            }
            try {
                treeSet.add(yo.d(strD));
            } catch (IllegalArgumentException unused) {
            }
            i++;
        }
        return treeSet;
    }
}
