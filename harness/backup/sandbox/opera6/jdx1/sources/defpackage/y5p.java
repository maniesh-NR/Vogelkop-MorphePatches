package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class y5p {
    public static final y5p c;
    public static final y5p d;
    public static final y5p e;
    public static final /* synthetic */ y5p[] f;
    public final String a;
    public final List b;

    static {
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{"1.5.3"}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        c = new y5p(0, "OMSDK", "omsdk", Collections.unmodifiableList(arrayList));
        ArrayList arrayList2 = new ArrayList(1);
        Object obj2 = new Object[]{"v1"}[0];
        Objects.requireNonNull(obj2);
        arrayList2.add(obj2);
        d = new y5p(1, "CACHE", "cache", Collections.unmodifiableList(arrayList2));
        ArrayList arrayList3 = new ArrayList(1);
        Object obj3 = new Object[]{"vast"}[0];
        Objects.requireNonNull(obj3);
        arrayList3.add(obj3);
        e = new y5p(2, "VIDEO", "video", Collections.unmodifiableList(arrayList3));
        Object[] objArr = {"mrect", "mraid2"};
        ArrayList arrayList4 = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            Object obj4 = objArr[i];
            Objects.requireNonNull(obj4);
            arrayList4.add(obj4);
        }
        f = new y5p[]{c, d, e, new y5p(3, "DISPLAY", "display", Collections.unmodifiableList(arrayList4))};
    }

    public y5p(int i, String str, String str2, List list) {
        this.a = str2;
        this.b = list;
    }

    public static y5p valueOf(String str) {
        return (y5p) Enum.valueOf(y5p.class, str);
    }

    public static y5p[] values() {
        return (y5p[]) f.clone();
    }
}
