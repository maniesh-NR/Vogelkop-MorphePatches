package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* loaded from: classes.dex */
public final class qm2 {
    public final itk a;
    public final int b;
    public final Size c;
    public final ip7 d;
    public final List e;
    public final tj5 f;
    public final int g;
    public final Range h;
    public final boolean i;
    public final int j;

    public qm2(itk itkVar, int i, Size size, ip7 ip7Var, List list, tj5 tj5Var, int i2, Range range, boolean z, int i3) {
        this.a = itkVar;
        this.b = i;
        if (size == null) {
            t3p.q("Null size");
            throw null;
        }
        this.c = size;
        if (ip7Var == null) {
            t3p.q("Null dynamicRange");
            throw null;
        }
        this.d = ip7Var;
        if (list == null) {
            t3p.q("Null captureTypes");
            throw null;
        }
        this.e = list;
        this.f = tj5Var;
        this.g = i2;
        if (range == null) {
            t3p.q("Null targetFrameRate");
            throw null;
        }
        this.h = range;
        this.i = z;
        this.j = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qm2)) {
            return false;
        }
        qm2 qm2Var = (qm2) obj;
        if (!this.a.equals(qm2Var.a) || this.b != qm2Var.b || !this.c.equals(qm2Var.c) || !this.d.equals(qm2Var.d) || !this.e.equals(qm2Var.e)) {
            return false;
        }
        tj5 tj5Var = qm2Var.f;
        tj5 tj5Var2 = this.f;
        if (tj5Var2 == null) {
            if (tj5Var != null) {
                return false;
            }
        } else if (!tj5Var2.equals(tj5Var)) {
            return false;
        }
        return this.g == qm2Var.g && this.h.equals(qm2Var.h) && this.i == qm2Var.i && this.j == qm2Var.j;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        tj5 tj5Var = this.f;
        return ((((((((iHashCode ^ (tj5Var == null ? 0 : tj5Var.hashCode())) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (this.i ? 1231 : 1237)) * 1000003) ^ this.j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachedSurfaceInfo{surfaceConfig=");
        sb.append(this.a);
        sb.append(", imageFormat=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append(this.c);
        sb.append(", dynamicRange=");
        sb.append(this.d);
        sb.append(", captureTypes=");
        sb.append(this.e);
        sb.append(", implementationOptions=");
        sb.append(this.f);
        sb.append(", sessionType=");
        sb.append(this.g);
        sb.append(", targetFrameRate=");
        sb.append(this.h);
        sb.append(", strictFrameRateRequired=");
        sb.append(this.i);
        sb.append(", customMaxFrameRate=");
        return p3p.k(this.j, "}", sb);
    }
}
