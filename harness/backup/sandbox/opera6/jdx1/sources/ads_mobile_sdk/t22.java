package ads_mobile_sdk;

/* loaded from: classes.dex */
public final class t22 {
    public final u22 a;

    public t22(u22 u22Var) {
        this.a = u22Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof t22) && this.a.equals(((t22) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NetworkPingConfig(networkPingStrategy=" + this.a + ")";
    }
}
