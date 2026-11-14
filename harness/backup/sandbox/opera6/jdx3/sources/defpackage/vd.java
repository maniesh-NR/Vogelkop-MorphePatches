package defpackage;

import android.graphics.drawable.LayerDrawable;

/* loaded from: classes.dex */
public final class vd extends fe {
    public final m4l a;
    public final LayerDrawable b;
    public final mxh c;
    public final pxh d;

    public vd(m4l m4lVar, LayerDrawable layerDrawable) {
        this.a = m4lVar;
        this.b = layerDrawable;
        this.c = new mxh(layerDrawable);
        this.d = m4lVar.c();
    }

    @Override // defpackage.fe
    public final b8h a() {
        return this.c;
    }

    @Override // defpackage.fe
    public final pxh b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd)) {
            return false;
        }
        vd vdVar = (vd) obj;
        return this.a.equals(vdVar.a) && this.b.equals(vdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
