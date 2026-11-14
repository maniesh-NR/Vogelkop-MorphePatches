package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class abj implements vq5 {
    public final String a;
    public final List b;
    public final boolean c;

    public abj(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    @Override // defpackage.vq5
    public final wp5 a(f3d f3dVar, p2d p2dVar, c73 c73Var) {
        return new hq5(f3dVar, c73Var, this, p2dVar);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.a + "' Shapes: " + Arrays.toString(this.b.toArray()) + '}';
    }
}
