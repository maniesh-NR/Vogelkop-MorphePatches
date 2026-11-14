package defpackage;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ai4 {
    public static final an2 f = new an2("camerax.core.captureConfig.rotation", Integer.TYPE, null);
    public static final an2 g = new an2("camerax.core.captureConfig.jpegQuality", Integer.class, null);
    public static final an2 h = new an2("camerax.core.captureConfig.resolvedFrameRate", Range.class, null);
    public final ArrayList a;
    public final wrf b;
    public final int c;
    public final List d;
    public final hbl e;

    public ai4(ArrayList arrayList, wrf wrfVar, int i, ArrayList arrayList2, hbl hblVar) {
        this.a = arrayList;
        this.b = wrfVar;
        this.c = i;
        this.d = Collections.unmodifiableList(arrayList2);
        this.e = hblVar;
    }

    public final Range a() {
        Range range = (Range) this.b.b(h, to2.h);
        Objects.requireNonNull(range);
        return range;
    }
}
