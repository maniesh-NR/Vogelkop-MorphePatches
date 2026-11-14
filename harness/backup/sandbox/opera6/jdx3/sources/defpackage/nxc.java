package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class nxc extends ja2 {
    public final fdn b;

    public nxc(fdn fdnVar) {
        this.b = fdnVar;
    }

    public static nxc e(fdn fdnVar) {
        if (!fdnVar.b()) {
            return new jxc(fdnVar.f, fdnVar);
        }
        List listUnmodifiableList = Collections.unmodifiableList(fdnVar.g);
        return listUnmodifiableList.size() <= 1 ? new kxc(fdnVar) : new ixc(fdnVar, listUnmodifiableList);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            return this.b.equals(((nxc) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
