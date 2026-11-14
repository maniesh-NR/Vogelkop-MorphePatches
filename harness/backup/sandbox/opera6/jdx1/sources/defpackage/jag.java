package defpackage;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class jag {
    public EnumMap a;

    public jag() {
        this.a = new EnumMap(lag.class);
    }

    public jag(jag jagVar) {
        this.a = new EnumMap(jagVar.a);
    }

    public final kag a(lag lagVar, kag kagVar) {
        iag iagVar = (iag) this.a.get(lagVar);
        return iagVar == null ? kagVar : iagVar.a;
    }

    public final Boolean b(lag lagVar) {
        iag iagVar = (iag) this.a.get(lagVar);
        if (iagVar == null) {
            return null;
        }
        return Boolean.valueOf(iagVar.b);
    }

    public final void c(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(1);
        EnumMap enumMap = this.a;
        objectOutputStream.writeInt(enumMap.size());
        for (Map.Entry entry : enumMap.entrySet()) {
            objectOutputStream.writeObject(((lag) entry.getKey()).name());
            objectOutputStream.writeObject(((iag) entry.getValue()).a.name());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jag.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((jag) obj).a);
    }

    public final int hashCode() {
        EnumMap enumMap = this.a;
        if (enumMap != null) {
            return enumMap.hashCode();
        }
        return 0;
    }
}
