package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class iei extends hfi implements ffi {
    public ArrayList h = new ArrayList();
    public Boolean i;
    public Matrix j;
    public int k;
    public String l;

    @Override // defpackage.ffi
    public final void f(jfi jfiVar) throws jgi {
        if (jfiVar instanceof afi) {
            this.h.add(jfiVar);
            return;
        }
        throw new jgi("Gradient elements cannot contain " + jfiVar + " elements.");
    }

    @Override // defpackage.ffi
    public final List h() {
        return this.h;
    }
}
