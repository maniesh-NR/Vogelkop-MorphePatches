package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class srm {
    public final Function1 a;
    public final o3a b;
    public final w3j c;
    public final zyk d;

    public srm(Function1 function1, o3a o3aVar, w3j w3jVar, zyk zykVar) {
        this.a = function1;
        this.b = o3aVar;
        this.c = w3jVar;
        this.d = zykVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!srm.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        srm srmVar = (srm) obj;
        return this.c == srmVar.c && this.b == srmVar.b;
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.c.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "UseCaseCameraConfig(cameraGraphFactory=" + this.a + ", graphStateToCameraStateAdapter=" + this.b + ", sessionConfigAdapter=" + this.c + ", sessionProcessor=null, lazyCreationResult=" + this.d + ')';
    }
}
