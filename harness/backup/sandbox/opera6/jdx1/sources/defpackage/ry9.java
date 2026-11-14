package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.collection.ArrayMap;
import java.util.List;

/* loaded from: classes.dex */
public final class ry9 extends ContextWrapper {
    public static final rv9 i = new rv9();
    public final jl6 a;
    public final tah b;
    public final wu5 c;
    public final List d;
    public final ArrayMap e;
    public final f38 f;
    public final byte g;
    public rwh h;

    public ry9(Context context, jl6 jl6Var, tah tahVar, wu5 wu5Var, ArrayMap arrayMap, List list, f38 f38Var) {
        super(context.getApplicationContext());
        this.a = jl6Var;
        this.b = tahVar;
        this.c = wu5Var;
        this.d = list;
        this.e = arrayMap;
        this.f = f38Var;
        this.g = (byte) 4;
    }
}
