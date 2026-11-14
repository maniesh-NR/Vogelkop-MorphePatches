package defpackage;

/* loaded from: classes.dex */
public final class vo2 {
    public final vtk a;

    public vo2(vtk vtkVar) {
        this.a = vtkVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof vo2) && this.a == ((vo2) obj).a;
    }

    public final int hashCode() {
        return (-721379959) ^ this.a.hashCode();
    }

    public final String toString() {
        return "Event{eventCode=0, surfaceOutput=" + this.a + "}";
    }
}
