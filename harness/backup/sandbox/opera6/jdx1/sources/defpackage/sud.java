package defpackage;

/* loaded from: classes.dex */
public final class sud implements vq5 {
    public final int a;
    public final boolean b;

    public sud(String str, int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.vq5
    public final wp5 a(f3d f3dVar, p2d p2dVar, c73 c73Var) {
        if (f3dVar.j) {
            return new tud(this);
        }
        izc.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MergePaths{mode=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "EXCLUDE_INTERSECTIONS" : "INTERSECT" : "SUBTRACT" : "ADD" : "MERGE");
        sb.append('}');
        return sb.toString();
    }
}
