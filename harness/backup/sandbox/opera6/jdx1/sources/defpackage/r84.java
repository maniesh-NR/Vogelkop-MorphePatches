package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r84 {
    public final LinkedHashSet a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final fgk f;
    public final qrm g;
    public final HashMap h;
    public final hgk i;
    public final hgk j;

    public r84(LinkedHashSet linkedHashSet, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, fgk fgkVar, qrm qrmVar, HashMap map, hgk hgkVar, hgk hgkVar2) {
        this.a = linkedHashSet;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = arrayList4;
        this.f = fgkVar;
        this.g = qrmVar;
        this.h = map;
        this.i = hgkVar;
        this.j = hgkVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r84)) {
            return false;
        }
        r84 r84Var = (r84) obj;
        return this.a.equals(r84Var.a) && this.b.equals(r84Var.b) && this.c.equals(r84Var.c) && this.d.equals(r84Var.d) && this.e.equals(r84Var.e) && Intrinsics.a(this.f, r84Var.f) && Intrinsics.a(this.g, r84Var.g) && this.h.equals(r84Var.h) && Intrinsics.a(this.i, r84Var.i) && Intrinsics.a(this.j, r84Var.j);
    }

    public final int hashCode() {
        int iG = z1m.g(this.e, z1m.g(this.d, z1m.g(this.c, z1m.g(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
        fgk fgkVar = this.f;
        int iHashCode = (iG + (fgkVar == null ? 0 : fgkVar.hashCode())) * 31;
        qrm qrmVar = this.g;
        int iHashCode2 = (this.i.hashCode() + ((this.h.hashCode() + ((iHashCode + (qrmVar == null ? 0 : qrmVar.hashCode())) * 31)) * 31)) * 31;
        hgk hgkVar = this.j;
        return iHashCode2 + (hgkVar != null ? hgkVar.hashCode() : 0);
    }

    public final String toString() {
        return "CalculatedUseCaseInfo(appUseCases=" + this.a + ", cameraUseCases=" + this.b + ", cameraUseCasesToAttach=" + this.c + ", cameraUseCasesToKeep=" + this.d + ", cameraUseCasesToDetach=" + this.e + ", streamSharing=" + this.f + ", placeholderForExtensions=" + this.g + ", useCaseConfigs=" + this.h + ", primaryStreamSpecResult=" + this.i + ", secondaryStreamSpecResult=" + this.j + ')';
    }
}
