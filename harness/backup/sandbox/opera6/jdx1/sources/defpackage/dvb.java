package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class dvb {
    public static final dvb c = new dvb("COMPOSITION");
    public final List a;
    public evb b;

    public dvb(dvb dvbVar) {
        this.a = new ArrayList(dvbVar.a);
        this.b = dvbVar.b;
    }

    public dvb(String... strArr) {
        this.a = Arrays.asList(strArr);
    }

    public final boolean a(int i, String str) {
        List list = this.a;
        if (i < list.size()) {
            boolean z = i == list.size() - 1;
            String str2 = (String) list.get(i);
            if (str2.equals("**")) {
                if (!z) {
                    if (!((String) list.get(i + 1)).equals(str)) {
                        int i2 = i + 1;
                        if (i2 >= list.size() - 1) {
                            return ((String) list.get(i2)).equals(str);
                        }
                    } else if (i == list.size() - 2 || (i == list.size() - 3 && ((String) am2.l(1, list)).equals("**"))) {
                    }
                }
                return true;
            }
            boolean z2 = str2.equals(str) || str2.equals("*");
            if ((z || (i == list.size() - 2 && ((String) am2.l(1, list)).equals("**"))) && z2) {
                return true;
            }
        }
        return false;
    }

    public final int b(int i, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List list = this.a;
        if (((String) list.get(i)).equals("**")) {
            return (i != list.size() - 1 && ((String) list.get(i + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final boolean c(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.a;
        if (i >= list.size()) {
            return false;
        }
        return ((String) list.get(i)).equals(str) || ((String) list.get(i)).equals("**") || ((String) list.get(i)).equals("*");
    }

    public final boolean d(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.a;
        return i < list.size() - 1 || ((String) list.get(i)).equals("**");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dvb.class == obj.getClass()) {
            dvb dvbVar = (dvb) obj;
            if (!this.a.equals(dvbVar.a)) {
                return false;
            }
            evb evbVar = this.b;
            evb evbVar2 = dvbVar.b;
            if (evbVar != null) {
                return evbVar.equals(evbVar2);
            }
            if (evbVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        evb evbVar = this.b;
        return iHashCode + (evbVar != null ? evbVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.a);
        sb.append(",resolved=");
        sb.append(this.b != null);
        sb.append('}');
        return sb.toString();
    }
}
